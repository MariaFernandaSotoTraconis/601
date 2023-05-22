
package pkg2.v1trifriv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V1TRIFRIV {
    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       int numero;
       float mult3;
       float mult5;
   
       System.out.println("Ingresa el número");
       numero = Integer.parseInt(bufEntrada.readLine()); //Esta leyendo una cadena de caracteres
      
       mult3=numero%3; //El módulo 
       mult5=numero%5;
       
       if(mult3==0){
           System.out.println("TRI");
       }
       
       if(mult5==0){
           System.out.println("FIV");
       }
       
       if(mult3==0 && mult5==0){
           System.out.println("TRIFIV");
       }
    }
}
