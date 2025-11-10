package QUESTAO1;

class StressTestingCalculator implements RiskCalculator {

    public String calcular(RiskContext contexto) {
        //Lógica ficticía apenas para possibilidade de cálculos diferentes em cada calculadora 
        double impacto = (contexto.getReceita() - contexto.getDespesas()) * (100 + contexto.getVolatilidade());

        return "Impacto em cenário extremo = " + impacto;

    }
}


