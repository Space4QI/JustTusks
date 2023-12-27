public class Car {
    public String make;
    public String model;
    public int horsePower;

    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;

    }
    public String getInfo() {
        return "The car is: " + make + " " + model + " - " + horsePower + " HP.";
    }
}
