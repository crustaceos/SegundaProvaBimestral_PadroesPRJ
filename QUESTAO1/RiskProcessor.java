package QUESTAO1;

class RiskProcessor {

    private RiskCalculator calculadora;

    public RiskProcessor(RiskCalculator calculadora) {

        this.calculadora = calculadora;

    }

    public void setCalculadora(RiskCalculator calculadora) {

        this.calculadora = calculadora;

    }

    public String processar(RiskContext contexto) {

        return calculadora.calcular(contexto);
        
    }
}
