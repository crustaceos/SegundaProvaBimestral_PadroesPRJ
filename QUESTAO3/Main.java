package QUESTAO3;

public class Main {
    public static void main(String[] args) {

        ContextoUsina usina = new ContextoUsina();

        //Iniciando a usina no estado inicial, desligada
        usina.executar();

        usina.setTemperatura(320);
        usina.executar();

        usina.setTemperatura(420);
        usina.executar();

        usina.setSistemaResfriamentoOk(false);
        usina.executar();

        //usina.ativarModoManutencao();
        usina.executar();

    }
}

