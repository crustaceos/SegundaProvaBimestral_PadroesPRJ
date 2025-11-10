package QUESTAO2;

public class Main {
    public static void main(String[] args) {

        SistemaBancarioLegado sistemaLegado = new SistemaBancarioLegado();
        ProcessadorTransacoes processador = new AdaptadorProcessadorLegado(sistemaLegado);

        //Teste funcional
        String resposta1 = processador.autorizar("1234-5678-9012-3456", 250.75, "USD");
        System.out.println(resposta1);

        //Teste com moeda não cadastrada
        String resposta2 = processador.autorizar("9999-1111-2222-3333", 500.00, "JPY");
        System.out.println(resposta2);
    }
}

