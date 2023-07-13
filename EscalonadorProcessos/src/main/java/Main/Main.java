package Main;

import Interface.*;
import Model.*;
import tempo.CalculadorTempo;

public class Main {
    
    public static Memoria memoria;
    public static CPU cpu;
    public static Escalonador escalonador;
    public static boolean start;
    public static CalculadorTempo calculadorTempo;
    
    public static void main(String[] args) {
        calculadorTempo = new CalculadorTempo();
        memoria = new Memoria();
        cpu = new CPU();
        escalonador = new Escalonador();
        start=false;
        
        for( Processo pr : Main.memoria.processos )
            System.out.print(Integer.toString(pr.getTempoExecucao()) + "\t"); 
        
        JFramePrincipal jFramePrincipal = new JFramePrincipal();
        jFramePrincipal.setLocationRelativeTo(null);
        jFramePrincipal.setVisible(true);
    }
      
}
