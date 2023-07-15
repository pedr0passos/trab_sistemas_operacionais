package tempo;
import Model.Processo;


public class CalculadorTempo {
    private int processosFinalizadosInicio;
    private int tempoTotalFilaSegundos;
    private final long tempoUnixInicialSegundos;
    private long tempoUsoCPU;
    
    public CalculadorTempo() {
        processosFinalizadosInicio = 0;
        tempoTotalFilaSegundos = 0;
        tempoUsoCPU = 0;
        tempoUnixInicialSegundos = System.currentTimeMillis() / 1000;
    }
    
    public double calcularTempoVazao() {
        int tempoExecucaoPrograma = getTempoExecucaoCriacao();
        double tempoVazao = (double) processosFinalizadosInicio / (double) tempoExecucaoPrograma;
        return tempoVazao;
    }
    
    public void adicionarProcessoFinalizado() {
        processosFinalizadosInicio++;
    }
    
    public void adicionarTempoDeFilaDeProcessoSegundos( Processo processo ) {
        tempoTotalFilaSegundos += (System.currentTimeMillis() - processo.getTempoUnixDesdeCriacaoMilissegundos()) / 1000;
    }
    
    public double calcularTempoMedioDeFilaSegundos() {
        if(processosFinalizadosInicio == 0)
            return 0.0;        
        
        double tempoMedioDeFilaSegundos = (double) tempoTotalFilaSegundos / (double) processosFinalizadosInicio;
        return tempoMedioDeFilaSegundos;
    }
    
    public int getTempoExecucaoCriacao() {
        long tempoUnixAtualSegundos = System.currentTimeMillis() / 1000;        
        int tempoExecucaoPrograma = (int)(tempoUnixAtualSegundos - tempoUnixInicialSegundos);
        return tempoExecucaoPrograma;
    }
    
    public double getTempoTotalFilaSegundos() {
        return tempoTotalFilaSegundos;
    }
    
    public void adicionarTempoUsoCPU(double tempo) {
        tempoUsoCPU += tempo;
    }
    
    public double getTempoUsoCPU(){
        return tempoUsoCPU;
    }
}
