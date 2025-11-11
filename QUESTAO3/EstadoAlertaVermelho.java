package QUESTAO3;

public class EstadoAlertaVermelho implements EstadoUsina {

    public void executar(ContextoUsina contexto) {

        if (contexto.isModoManutencao()) {
            System.out.println("Usina em manutenção - Alerta vermelho pausado");
            return;

        }

        System.out.println("ALERTA VERMELHO! Verificando sistema de resfriamento...");

        if (!contexto.isSistemaResfriamentoOk()) {

            System.out.println("Falha no sistema de resfriamento! Entrando em estado de EMERGÊNCIA!");

            contexto.setEstado(new EstadoEmergencia());

        } else if (contexto.getTemperatura() < 350) {

            System.out.println("Temperatura sob controle. Retornando para ALERTA AMARELO.");
            contexto.setEstado(new EstadoAlertaAmarelo());

        }
    }
}

