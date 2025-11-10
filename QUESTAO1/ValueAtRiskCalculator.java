package QUESTAO1;

class ValueAtRiskCalculator implements RiskCalculator {

    public String calcular(RiskContext contexto) {
        //Realizando calculo de risco se baseando em investimento - as despesas * a volatilidade - Lógica Fictícia
        double valorRisco = (contexto.getInvestimentos() - contexto.getDespesas()) * contexto.getVolatilidade();

        return "Risco estimado = " + valorRisco;

    }
}


