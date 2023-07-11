package Model;

public class Processo {
    
    private int id;
    private int tempoExecucao;
    private int prioridade;
    private int ticket;
    
    public Processo (int id, int tempoExecucao, int prioridade){
        this.id=id;
        this.tempoExecucao=tempoExecucao;
        this.prioridade=prioridade;
    }
    
    public int getId() {
        return id;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    public int getTicket() {
        return ticket;
    }
    
    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }
    
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    public void setTicket (int ticket ) {
        this.ticket = ticket;
    }
}