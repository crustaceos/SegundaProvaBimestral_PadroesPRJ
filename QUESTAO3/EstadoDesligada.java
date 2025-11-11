package QUESTAO3;

public class EstadoDesligada implements EstadoUsina {

    public void executar(ContextoUsina contexto) {

        if (contexto.isModoManutencao()) {

            System.out.println("Usina em manutenção");
            return;

        }

        System.out.println("Iniciando operação normal");
        contexto.setEstado(new EstadoOperacaoNormal());

    }
}

