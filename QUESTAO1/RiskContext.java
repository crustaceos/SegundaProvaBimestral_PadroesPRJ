package QUESTAO1;

class RiskContext {

    private double receita;
    private double despesas;
    private double investimentos;
    private double volatilidade;

    public RiskContext(double receita, double despesas, double investimentos, double volatilidade) {

        this.receita = receita;
        this.despesas = despesas;
        this.investimentos = investimentos;
        this.volatilidade = volatilidade;

    }

    public double getReceita() {

        return receita;

    }

    public double getDespesas() {

        return despesas;

    }

    public double getInvestimentos() {

        return investimentos;

    }

    public double getVolatilidade() {

        return volatilidade;
        
    }
}


