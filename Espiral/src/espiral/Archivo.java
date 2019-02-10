/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espiral;
import java.io.*;
/**
 *
 * @author JulianFO
 */
public class Archivo {
      public void leer(String Archivo){  
      try {
         
           FileReader r=new FileReader(Archivo);
           BufferedReader buffer=new BufferedReader(r);
           String matriz[][] = new String[3][3];
           int numlinea=0;
         
           String temp=" ";
           System.out.println("MATRIZ");
           while( temp!= null){
               temp=buffer.readLine();
               String x;
               x = temp;
               String []vector;
               vector = x.split("  ");
                  for(int i=0;i<vector.length;i++){
                     matriz[numlinea][i] = vector[i];
                  }
                numlinea++;
                 for(int filas=0; filas<matriz.length;filas++) 
                {
                  for(int colum = 0; colum < matriz[filas].length; colum++) 
                  {
                    System.out.print(matriz[filas][colum]+" ");
                  }
                System.out.println();   
                }  
                
           }
              
      
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
 }
}
