package Entity;

import IVehicle.SwimAble;

public class AmphibianCar extends Car implements SwimAble {

    public AmphibianCar(int year, int speed, int price) {
        super(year, speed, price);
    }

    public AmphibianCar() {
    }

    @Override
    public void swim() {
        System.out.println("AmphibianCar is swimming");
    }

    @Override
    public String toString() {
        return "AmphibianCar{" + AmphibianCar.super.getPrice() + ", speed=" + AmphibianCar.super.getSpeed() + ", year=" + AmphibianCar.super.getYear() + "}";
    }
}
