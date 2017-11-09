package Entity;

public abstract class Vehicle {

    private int longitude;
    private int latitude;
    private int year;
    private int speed;
    private int price;

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle() {
    }



    public Vehicle(int year, int speed, int price) {
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "year=" + year +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
