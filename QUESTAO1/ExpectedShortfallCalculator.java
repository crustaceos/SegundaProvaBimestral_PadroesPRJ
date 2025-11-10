package QUESTAO1;

class ExpectedShortfallCalculator implements RiskCalculator {

    public String calcular(RiskContext contexto) {
        //Lógica ficticía apenas para possibilidade de cálculos diferentes em cada calculadora 
        double perdaEsperada = (contexto.getInvestimentos() * 0.1) + (contexto.getVolatilidade() * 1000);

        return "Perda média esperada = " + perdaEsperada;

    }
}


