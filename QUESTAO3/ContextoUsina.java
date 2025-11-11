package QUESTAO3;

public class ContextoUsina {

    private EstadoUsina estadoAtual;
    private boolean sistemaResfriamentoOk = true;
    private double temperatura = 0.0;
    private boolean modoManutencao = false;
    private int tempoAcima400 = 0;

    //Estado incial da usina
    public ContextoUsina() {

        this.estadoAtual = new EstadoDesligada();

    }

    public void setEstado(EstadoUsina estado) {

        this.estadoAtual = estado;

    }

    public EstadoUsina getEstado() {

        return estadoAtual;

    }

    public void setTemperatura(double temperatura) {

        this.temperatura = temperatura;

    }

    public double getTemperatura() {

        return temperatura;

    }

    public void setSistemaResfriamentoOk(boolean ok) {

        this.sistemaResfriamentoOk = ok;

    }

    public boolean isSistemaResfriamentoOk() {

        return sistemaResfriamentoOk;

    }

    public void ativarModoManutencao() {

        this.modoManutencao = true;
        System.out.println("Ativando modo de manutenção");

    }

    public void desativarModoManutencao() {

        this.modoManutencao = false;
        System.out.println("Desativando modo de manutenção");

    }

    //Pra verificar se está no modo de manutenção ou não
    public boolean isModoManutencao() {

        return modoManutencao;

    }

    public void aumentarTempoAcima400(int segundos) {

        this.tempoAcima400 += segundos;

    }

    public int getTempoAcima400() {

        return tempoAcima400;

    }

    public void executar() {

        estadoAtual.executar(this);

    }
    
}

