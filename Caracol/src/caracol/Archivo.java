
package caracol;

import java.io.*;

public class Archivo {

   public void leer(String Archivo){
         
       try {
           
           FileReader r=new FileReader(Archivo);
           BufferedReader buffer=new BufferedReader(r);
           
           String temp=" ";
           while(temp!=null){
               temp=buffer.readLine();
               String x;
               x = temp;
               String []vector;
               vector = x.split("  ");
                  for(int i=0;i<vector.length;i++){
                      System.out.println(""+vector[i]);
                  }
                  
                  if(temp==null);
                  
           }
       
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
        }
    
}
