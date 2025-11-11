package QUESTAO3;

public class EstadoAlertaAmarelo implements EstadoUsina {
    public void executar(ContextoUsina contexto) {

        if (contexto.isModoManutencao()) {

            System.out.println("Usina em manutenção - Alerta amarelo pausado");
            return;

        }

        System.out.println("Estado de ALERTA AMARELO - Realizando monitoramento de temperatura");

        if (contexto.getTemperatura() > 400) {
            //Fixando que, caso a temperatura seja maior que 400 graus ele vai acabar passando dos 30 segundos de propósito, para visualização do estado de alerta vermelho
            contexto.aumentarTempoAcima400(35); 

        }

        if (contexto.getTempoAcima400() > 30) {

            System.out.println("Temperatura maior que 400°C por mais de 30s. Mudando para ALERTA VERMELHO");

            contexto.setEstado(new EstadoAlertaVermelho());

        } else if (contexto.getTemperatura() <= 300) {

            System.out.println("Temperatura resfriando - Voltando às operações normais");

            contexto.setEstado(new EstadoOperacaoNormal());

        }
    }
}

