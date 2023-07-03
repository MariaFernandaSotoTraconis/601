
package com.mycompany.excepciones7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Excepciones7 {

    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("Contenido del archivo: " + scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡Error: Archivo no encontrado!");
        }
    }
}
