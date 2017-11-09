package Entity;

import IVehicle.FlyAble;

public class Plane extends Vehicle implements FlyAble {
    private int flightAltitude;
    private int passengers;

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Plane(int year, int speed, int price, int flightAltitude, int passengers) {
        super(year, speed, price);
        this.flightAltitude = flightAltitude;
        this.passengers = passengers;
    }

    public Plane() {
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public String toString() {
        return "Plane{" + "price=" + Plane.super.getPrice() + ", speed=" + Plane.super.getSpeed() + ", year=" + Plane.super.getYear() +
                ", flightAltitude=" + flightAltitude +
                ", passengers=" + passengers +
                '}';
    }
}
