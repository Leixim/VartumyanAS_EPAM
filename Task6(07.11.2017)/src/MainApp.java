import Entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Vehicle[] vehiclesArray = new Vehicle[50];
        for (int i = 0; i < vehiclesArray.length; i++) {
            vehiclesArray[i] = generateVehicle();
        }
        menuFace();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value");
        int menuValue = Integer.parseInt(reader.readLine());
        menu(menuValue, vehiclesArray);

    }

    public static void menu(int value, Vehicle[] vehicles) {

        switch (value) {
            case 1:
                int minPrice = getMinPrice(vehicles);
                int maxSpeed = getMaxSpeed(vehicles);
                for (int i = 0; i < vehicles.length; i++) {
                    if (vehicles[i].getPrice() == minPrice) {
                        System.out.println("Vehicle with min price is " + vehicles[i]);
                    }
                    if (vehicles[i].getSpeed() == maxSpeed) {
                        System.out.println("Vehicle with max speed is " + vehicles[i]);
                    }
                    if (vehicles[i].getYear() > 2012) {
                        System.out.println("Vehicle with year > 2012: " + vehicles[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < vehicles.length; i++) {
                    if (vehicles[i] instanceof Plane && vehicles[i].getYear() > 2000) {
                        Plane plane = (Plane) vehicles[i];
                        if (plane.getFlightAltitude() > 5000) {
                            System.out.println("Plane with flightAltitude > 5000 and year > 2000: " + plane);
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < vehicles.length; i++) {
                    if (vehicles[i].getSpeed() < 500 && vehicles[i].getSpeed() > 200 && !(vehicles[i] instanceof Plane)) {
                        System.out.println("Vehicle with speed 200-500 and not Plane: " + vehicles[i]);
                    }
                }
                break;
            case 4:
                for (int i = 0; i <vehicles.length ; i++) {
                    System.out.println(vehicles[i]);
                }
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }

    public static void menuFace() {
        System.out.println("*************************************");
        System.out.println("1 - Vehicles with min price. Vehicles with max speed. Vehicles with year > 2012");
        System.out.println("2 - Plane with flightAltitude > 5000 and year > 2000: ");
        System.out.println("3 - Vehicle with speed 200-500 and not Plane");
        System.out.println("4 - Print all vehicles");
        System.out.println("*************************************");


    }


    public static int getMinPrice(Vehicle[] vehicles) {
        int minPrice = vehicles[0].getPrice();
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getPrice() < minPrice) {
                minPrice = vehicles[i].getPrice();
            }
        }
        System.out.println("Min price: " + minPrice);
        return minPrice;
    }

    public static int getMaxPrice(Vehicle[] vehicles) {
        int maxPrice = vehicles[0].getPrice();
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getPrice() > maxPrice) {
                maxPrice = vehicles[i].getPrice();
            }
        }
        System.out.println("Max price: " + maxPrice);
        return maxPrice;
    }

    public static int getMinSpeed(Vehicle[] vehicles) {
        int minSpeed = vehicles[0].getSpeed();
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getSpeed() < minSpeed) {
                minSpeed = vehicles[i].getSpeed();
            }
        }
        System.out.println("Min speed: " + minSpeed);
        return minSpeed;
    }

    public static int getMaxSpeed(Vehicle[] vehicles) {
        int maxSpeed = vehicles[0].getSpeed();
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getSpeed() > maxSpeed) {
                maxSpeed = vehicles[i].getSpeed();
            }
        }
        System.out.println("Max speed: " + maxSpeed);
        return maxSpeed;
    }

    public static Vehicle generateVehicle() {
        Random randomType = new Random();
        Random randomPrice = new Random();
        Random randomYear = new Random();
        Random randomSpeed = new Random();
        Random randomPassengers = new Random();
        Random randomFlightAltitude = new Random();
        switch (randomType.nextInt(5)) {
            case 0:
                return new AmphibianCar(randomYear.nextInt(28) + 1990, randomSpeed.nextInt(250), randomPrice.nextInt(10000) + 1000);
            case 1:
                return new BatmanCar(randomYear.nextInt(28) + 1990, randomSpeed.nextInt(250), randomPrice.nextInt(10000) + 1000);
            case 2:
                return new Car(randomYear.nextInt(28) + 1990, randomSpeed.nextInt(250), randomPrice.nextInt(10000) + 1000);
            case 3:
                return new Plane(randomYear.nextInt(28) + 1990, randomSpeed.nextInt(1000), randomPrice.nextInt(30000) + 40000, randomFlightAltitude.nextInt(5000) + 10000, randomPassengers.nextInt(400) + 200);
            case 4:
                return new Ship(randomYear.nextInt(28) + 1990, randomSpeed.nextInt(100), randomPrice.nextInt(30000) + 40000, "Port" + randomYear.nextInt(10), randomPassengers.nextInt(1000));
            default:
                return null;
        }
    }
}
