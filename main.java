import java.util.ArrayList;
import java.util.Scanner;

public class MainCarShowroom {
    public static void main(String[] args) {
        // Creating a car showroom
        CarShowroom showroom = new CarShowroom();
        Scanner scanner = new Scanner(System.in);

        // Adding sample cars to the showroom
        showroom.addCar(new Sedan("Toyota", "Camry", 2022, 5));
        showroom.addCar(new SUV("Jeep", "Wrangler", 2023, true));
        showroom.addCar(new SportsCar("Porsche", "911", 2024, 200));
        showroom.addCar(new Sedan("Honda", "Accord", 2022, 5));
        showroom.addCar(new SUV("Ford", "Explorer", 2023, true));
        showroom.addCar(new SportsCar("BMW", "M3", 2024, 180));
        showroom.addCar(new Sedan("Hyundai", "Sonata", 2022, 5));
        showroom.addCar(new SUV("Chevrolet", "Tahoe", 2023, true));

        // Displaying all cars in the showroom
        showroom.displayCars();

        // Prompting the user to retrieve a car
        System.out.println("Enter the index of the car you want to retrieve:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Retrieving and displaying the requested car
        Car retrievedCar = showroom.retrieveCar(index);
        if (retrievedCar != null) {
            System.out.println("Car details:");
            System.out.println(retrievedCar);
        } else {
            System.out.println("Invalid index. Car not found in the showroom.");
        }

        // Prompting the user to remove a car
        System.out.println("Enter the index of the car you want to remove:");
        int removeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Removing the car from the showroom
        boolean removed = showroom.removeCar(removeIndex);
        if (removed) {
            System.out.println("Car removed successfully.");
        } else {
            System.out.println("Invalid index. Car not found in the showroom.");
        }

        // Displaying all cars in the showroom after removal
        showroom.displayCars();

        scanner.close();
    }
}

class Car {
    protected String make;
    protected String model;
    protected int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

class Sedan extends Car {
    private int numSeats;

    public Sedan(String make, String model, int year, int numSeats) {
        super(make, model, year);
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Sedan, NumSeats: " + numSeats;
    }
}

class SUV extends Car {
    private boolean fourWheelDrive;

    public SUV(String make, String model, int year, boolean fourWheelDrive) {
        super(make, model, year);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: SUV, FourWheelDrive: " + fourWheelDrive;
    }
}

class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String make, String model, int year, int topSpeed) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Sports Car, TopSpeed: " + topSpeed + " mph";
    }
}

class CarShowroom {
    private ArrayList<Car> cars;

    public CarShowroom() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car retrieveCar(int index) {
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);
        } else {
            return null;
        }
    }

    public boolean removeCar(int index) {
        if (index >= 0 && index < cars.size()) {
            cars.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void displayCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ": " + cars.get(i));
        }
    }
}
