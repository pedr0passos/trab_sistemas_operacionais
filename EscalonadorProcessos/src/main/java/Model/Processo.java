package Model;

public class Processo {
    
    private int id;
    private int tempoExecucao;
    private int prioridade;
    private int ticket;
    private int idUsuarioDono;
    
    
    public Processo (int id, int tempoExecucao, int prioridade, int idUsuarioDono){
        this.id=id;
        this.tempoExecucao=tempoExecucao;
        this.prioridade=prioridade;
        this.idUsuarioDono = idUsuarioDono;
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
    
    public int getIdUsuarioDono()
    {
        return this.idUsuarioDono;
    }
}