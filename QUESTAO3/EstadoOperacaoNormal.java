package QUESTAO3;

public class EstadoOperacaoNormal implements EstadoUsina {

    public void executar(ContextoUsina contexto) {

        if (contexto.isModoManutencao()) {

            System.out.println("Usina em manutenção - Operações normais pausadas");
            return;

        }

        System.out.println("Usina em operação normal - Temperatura: " + contexto.getTemperatura() + "°C");

        if (contexto.getTemperatura() > 300) {

            System.out.println("Temperatura acima de 300°C! Entrando em ALERTA AMARELO");
            contexto.setEstado(new EstadoAlertaAmarelo());

        }
    }
}

