package J044;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void speedUp(){
        this.speed++;
    }
    public int speedUp(int speed){
        this.speed += speed;
        return speed;
    }

    public Car(String brand, String model, String color, int year, int speed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public Car(String color){
        this.color = color;
    }

    public Car(){
    }

    @Override
    public String toString(){
        return brand + " " + model + " " + color + " " + year + " " + speed;
    }
}
