package QUESTAO1;

public class Main {
    public static void main(String[] args) {
        
        RiskContext contexto = new RiskContext(50000, 20000, 100000, 0.25);

        RiskProcessor processador = new RiskProcessor(new ValueAtRiskCalculator());
        System.out.println(processador.processar(contexto));

        processador.setCalculadora(new ExpectedShortfallCalculator());
        System.out.println(processador.processar(contexto));

        processador.setCalculadora(new StressTestingCalculator());
        System.out.println(processador.processar(contexto));
    }
}


