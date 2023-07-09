package Main;

import Interface.*;
import Model.*;

public class Main {
    
    public static Memoria memoria;
    public static CPU cpu;
    
    public static void main(String[] args) {

        memoria = new Memoria();
        cpu = new CPU();
        
        JFramePrincipal jFramePrincipal = new JFramePrincipal();
        jFramePrincipal.setLocationRelativeTo(null);
        jFramePrincipal.setVisible(true);
    }
}
