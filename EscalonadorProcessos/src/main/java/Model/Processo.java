package Model;

public class Processo {
    
    private byte id;
    private boolean status;
    private int tempoExecução;
    
    private Temporizador temporizador;
    
    public byte getId() {
        return id;
    }

    public boolean isBlocked() {
        return status;
    }

    public int getTempoExecução() {
        return tempoExecução;
    }

    public Temporizador getTemporizador() {
        return temporizador;
    }
    
    public void setId(byte id) {
        this.id = id;
    }

    public void setTemporizador(Temporizador temporizador) {
        this.temporizador = temporizador;
    }

    public void setTempoExecução(int tempoExecução) {
        this.tempoExecução = tempoExecução;
    }
   
    public void setBlocked(){
        this.status = false;
    }
    public void setRunning() {
        this.status = true;
    }
    
    
    
}
