package Model;

public class Processo {
    
    private int id;
    private int tempoExecucao;
    private double prioridade;
    private int ticket;
    private int idUsuarioDono;
    private long tempoUnixDesdeCriacaoMilissegundos;
    
    public Processo () {
        super();
    }
    
    public Processo (int id, int tempoExecucao, double prioridade, int idUsuarioDono, int ticket){
        this.id=id;
        this.tempoExecucao=tempoExecucao;
        this.prioridade=prioridade;
        this.idUsuarioDono = idUsuarioDono;
        this.tempoUnixDesdeCriacaoMilissegundos = System.currentTimeMillis();
        this.ticket = ticket;
    }
    
    public int getId() {
        return id;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
    
    public double getPrioridade() {
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
    
    public void setPrioridade(double prioridade) {
        this.prioridade = prioridade;
    }
    
    public void setTicket (int ticket ) {
        this.ticket = ticket;
    }
    
    public int getIdUsuarioDono()
    {
        return this.idUsuarioDono;
    }
    
    public long getTempoUnixDesdeCriacaoMilissegundos()
    {
        return tempoUnixDesdeCriacaoMilissegundos;
    }
}