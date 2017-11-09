package Entity;

import IVehicle.MoveAble;

public class Car extends Vehicle implements MoveAble {
    public Car(int year, int speed, int price) {
        super(year, speed, price);
    }

    public Car() {
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" + super.toString();
    }
}
