
package com.mycompany.excepciones9;

public class Excepciones9 {
    public static void main(String[] args) {
        String str = null;
        
        try {
            int length = str.length(); // Intentamos acceder a la longitud de una cadena nula
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("¡Error: Referencia nula!");
        }
    }
}
