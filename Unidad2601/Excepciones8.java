
package com.mycompany.excepciones8;

public class Excepciones8 {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();
        
        try {
            Car car = (Car) vehicle; // Intentamos convertir un objeto de tipo Vehicle a tipo Car
            System.out.println("El coche tiene " + car.getWheels() + " ruedas.");
        } catch (ClassCastException e) {
            System.out.println("¡Error: No se puede convertir el objeto a tipo Car!");
        }
    }
}

class Vehicle {
    // Implementación de la clase Vehicle
}

class Car extends Vehicle {
    private int wheels;
    
    public Car(int wheels) {
        this.wheels = wheels;
    }
    
    public int getWheels() {
        return wheels;
    }
}

class Bicycle extends Vehicle {
    // Implementación de la clase Bicycle
}
