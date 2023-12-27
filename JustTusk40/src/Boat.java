public class Boat extends Vehicle{
    int oarsCount;

    public Boat(int oarsCount){
        this.oarsCount = oarsCount;
    }

    public Boat(){

    }

    public String isBoat(int passengers, int oarsCount){
        return "In a Boat " + passengers + " passengers " +
                "\n" + "With " + oarsCount + " oars.";
    }
}
