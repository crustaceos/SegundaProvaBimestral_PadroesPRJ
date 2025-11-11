package QUESTAO3;

public class EstadoEmergencia implements EstadoUsina {

    public void executar(ContextoUsina contexto) {

        if (contexto.isModoManutencao()) {

            System.out.println("Usina em manutenção - Estado de emergência suspenso");
            return;

        }

        System.out.println("EMERGÊNCIA!!!");
        System.out.println("Iminente explosão do núcleo do reator!");
        //Reinicia o estado caso a emergencia for "resolvida"
        contexto.setEstado(new EstadoDesligada()); 

    }
}

