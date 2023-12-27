public class Car extends Vehicle {
    int horsePower;
    String model;

    public Car(int horsePower, String model){
        this.horsePower = horsePower;
        this.model = model;
    }

    public Car(){

    }

    public String isCar(int passengers, int horsePower, String model){
        return "In a Car " + passengers + " passengers " +
                "\n" + "With " + horsePower + " horsePower " + " and " + model + " model.";
    }
}
