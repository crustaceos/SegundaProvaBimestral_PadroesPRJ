package QUESTAO4;

import java.util.ArrayList;

class ValidadorBanco implements Validador {

    static ArrayList<String> banco = new ArrayList<>();

    public Resultado validar(DocumentoFiscal doc, Contexto ctx) {

        if (banco.contains(doc.numero)) return Resultado.erro("Duplicidade detectada!");
        banco.add(doc.numero);
        doc.inseridoNoBanco = true;
        return Resultado.ok("Inserido no banco.");

    }

    public String getNome() { return "Banco"; }

    public boolean suportaRollback() { return true; }

    public void rollback(DocumentoFiscal doc, DocumentoFiscal snap) {

        if (doc.inseridoNoBanco) {
            banco.remove(doc.numero);
            doc.inseridoNoBanco = false;
            System.out.println("ROLLBACK - Registro removido do banco.");
        }
    }

}

