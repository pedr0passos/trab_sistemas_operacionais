package Model;

public class Processo {
    // propriedades
    int id;
    boolean status;
    int tempoExecução;
    // metodos
    public void setBlocked(){
        this.status = false;
    }
    public void setRunning() {
        this.status = true;
    }
}
