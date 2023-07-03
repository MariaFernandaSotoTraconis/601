
package com.mycompany.excepciones6;
public class Excepciones6 {
    public static void main(String[] args) {
        String[] names = {"Maria", "Fernanda", "Traconis"};
        
        try {
            for (int i = 0; i <= names.length; i++) {
                System.out.println(names[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error: Índice fuera de los límites del arreglo!");
        }
    }
}
