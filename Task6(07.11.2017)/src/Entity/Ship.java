package Entity;

import IVehicle.SwimAble;

public class Ship extends Vehicle implements SwimAble {
    private String homePort;
    private int passengers;

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Ship(int year, int speed, int price, String homePort, int passengers) {
        super(year, speed, price);
        this.homePort = homePort;
        this.passengers = passengers;
    }

    public Ship() {
    }


    @Override
    public void swim() {
        System.out.println("Ship is swimming");
    }

    @Override
    public String toString() {
        return "Ship{" + "price="+ Ship.super.getPrice()+ ", speed="+ Ship.super.getSpeed()+ ", year="+ Ship.super.getYear()+
                ", homePort='" + homePort + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
