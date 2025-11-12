package QUESTAO4;

import java.util.*;

class ExecutorValidadores {

    Validador[] validadores;
    Contexto ctx = new Contexto();

    ExecutorValidadores(Validador... validadores) {

        this.validadores = validadores;

    }

    Resultado executar(DocumentoFiscal doc) {

        List<Validador> modificadores = new ArrayList<>();
        List<DocumentoFiscal> snapshots = new ArrayList<>();

        for (Validador v : validadores) {

            if (ctx.circuitBreaker) return Resultado.erro("Circuit breaker ativado!");

            DocumentoFiscal snap = doc.clonar();
            Resultado r = v.validar(doc, ctx);
            System.out.println(v.getNome() + ": " + r.msg);

            if (!r.ok) {

                ctx.registrarFalha();
                //Caso certifcado falhe, ele não vai permitir seguir com as outras validações
                if (v.getNome().equals("Certificado")) ctx.deveExecutarValidador3e5 = false;

                //For que passa do ultimo modificado, para o primeiro, "desfazendo" as mudanças - pegando o documento atual novamente e o passando para o rollback
                for (int i = modificadores.size() - 1; i >= 0; i--)
                    modificadores.get(i).rollback(doc, snapshots.get(i));

                return r;

            }

            if (v.suportaRollback()) {

                modificadores.add(v);
                snapshots.add(snap);

            }
        }

        return Resultado.ok("Todos validadores executados com sucesso");

    }

}

