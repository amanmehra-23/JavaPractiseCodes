/*A. Implement Dynamic method dispatch in an Automobile System
1. Vehicle (Superclass):
• Properties: make, model
• Methods: startEngine(), stopEngine(), displayInfo()
2. Car (Subclass):
• Properties: numDoors
• Methods: accelerate(), brake()
3. Motorcycle (Subclass):
• Properties: hasSidecar
• Methods: wheelie()
Create objects of both the Car and Motorcycle classes and refer to them
using a common Vehicle reference. Invoke overridden methods based on the actual object type, such as calling displayInfo() to display specific information about a car or a motorcycle.*/

import java.util.Scanner;

class Vehicle {
    String model = "Vehicle gen";
    int make = 2000;

    void startEngine() {
        System.out.println("Vehicle Starts");
    }

    void stopEngine() {
        System.out.println("Engine Stops");
    }

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    Car(int make, String model) {
        this.make = make;
        this.model = model;
    }

    void accelerate() {
        System.out.println("55 torque");
    }

    void brake() {
        System.out.println("Hydraulic");
    }

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Motorcycle extends Vehicle {
    String hasSideCar;

    Motorcycle(int make, String model, String hasSideCar) {
        this.make = make;
        this.model = model;
        this.hasSideCar = hasSideCar;
    }

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Sidecar: " + hasSideCar);
    }

    void wheelie() {
        if (hasSideCar.equalsIgnoreCase("true")) {
            System.out.println("No wheelie");
        } else {
            System.out.println("Yes wheelie");
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();
        v.startEngine();
        v.displayInfo();
        v.stopEngine();

        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Car make year: ");
        int make = sc.nextInt();

        Vehicle car = new Car(make, model);
        Car c = new Car(make, model);
        c.accelerate();
        c.brake();
        car.displayInfo();

        sc.nextLine(); // Consume newline character

        System.out.print("Bike model: ");
        model = sc.nextLine();
        System.out.print("Bike make year: ");
        make = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Has sidecar (true/false): ");
        String hasSideCar = sc.nextLine();

        Vehicle motorcycle = new Motorcycle(make, model, hasSideCar);
        Motorcycle m = new Motorcycle(make, model, hasSideCar);
        motorcycle.displayInfo();
        m.wheelie();

        sc.close();
    }
}
