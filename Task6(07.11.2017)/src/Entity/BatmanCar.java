package Entity;

import IVehicle.FlyAble;

public class BatmanCar extends Car implements FlyAble {
    public BatmanCar(int year, int speed, int price) {
        super(year, speed, price);
    }

    public BatmanCar() {
    }

    @Override
    public void fly() {
        System.out.println("BatmanCar is flying");
    }

    @Override
    public String toString() {
        return "BatmanCar{" + "price=" + BatmanCar.super.getPrice() + ", speed=" + BatmanCar.super.getSpeed() + ", year=" + BatmanCar.super.getYear() + "}";
    }
}
