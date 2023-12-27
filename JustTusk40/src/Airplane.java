public class Airplane extends Vehicle{
    int wingsCount;
    int enginesNumber;
    boolean isHydroplane;

    public Airplane(int wingsCount, int enginesNumber, boolean isHydroplane){
        this.wingsCount = wingsCount;
        this.enginesNumber = enginesNumber;
        this.isHydroplane = isHydroplane;
    }

    public Airplane(){

    }

    public String isAirplane(int passengers, int wingsCount, int enginesNumber, boolean isHydroplane) {
        if (isHydroplane) {
            return "In a Hydroplane " + passengers + " passengers " +
                    "\n" + "With " + wingsCount + " wings " + " and " + enginesNumber + " engines.";
        } else {
            return "In a Airplane " + passengers + " passengers " +
                    "\n" + "With " + wingsCount + " wings " + " and " + enginesNumber + " engines.";
        }
    }
}
