package Enum;

public enum EstadoProcesso {
    
    BLOQUEADO("bloqueado"),
    EXECUTANDO("executando"),
    ESPERA("espera");
    
    private String estado;
    
    EstadoProcesso (String estado){
        this.estado = estado;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
}
