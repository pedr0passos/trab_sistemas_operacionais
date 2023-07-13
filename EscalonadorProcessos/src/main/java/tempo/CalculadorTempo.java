/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tempo;
import java.lang.System;

/**
 *
 * @author pedro
 */
public class CalculadorTempo {
    private int processosFinalizadosInicio;
    private long tempoUnixInicialSegundos;
    
    public CalculadorTempo()
    {
        processosFinalizadosInicio = 0;
        tempoUnixInicialSegundos = System.currentTimeMillis() / 1000;
    }
    
    public double calcularTempoVazao()
    {
        long tempoUnixAtualSegundos = System.currentTimeMillis() / 1000;
        
        int tempoExecucaoPrograma = (int)(tempoUnixAtualSegundos - tempoUnixInicialSegundos);
        
        double tempoVazao = (double) processosFinalizadosInicio / (double) tempoExecucaoPrograma;
        return tempoVazao;
    }
    
    public void adicionarProcessoFinalizado()
    {
        processosFinalizadosInicio++;
    }
}
