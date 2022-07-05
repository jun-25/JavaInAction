public class Car {
    private final Brand brand;
    private final int maxSpeed;


    public Car(Brand brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public int getSpeed() {
        return this.maxSpeed;
    }
}
