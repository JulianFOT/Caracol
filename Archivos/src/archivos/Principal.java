/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.IOException;

/**
 *
 * @author JulianFO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Archivo archi = new Archivo();
        archi.leer("Archivo.txt");      
    }
    
}
