package Model;

public class Processo {
    
    private byte id;
    private int tempoExecucao;
    private int prioridade;
    
    public Processo (byte id, int tempoExecucao, int prioridade){
        this.id=id;
        this.tempoExecucao=tempoExecucao;
        this.prioridade=prioridade;
    }
    
    public byte getId() {
        return id;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    // setters
    public void setId(byte id) {
        this.id = id;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }
    
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}