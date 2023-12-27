public class Polygon {
    protected int[] sides;

    protected int sidesCount;

    protected double perimeter;

    public Polygon(int[] sides, int sidesCount, double perimeter) {
        this.sides = sides;
        this.sidesCount = sidesCount;
        this.perimeter = perimeter;
    }

    public Polygon() {

    }

    public String createPolygon(int[] sides) {
        int numSides = sides.length;
        if (numSides < 3) {
            System.out.println("Invalid value to sides number");
            return null;
        }

        for (int side : sides) {
            if (side <= 0) {
                System.out.println("Negative value to side length" + side);
                return null;
            }
        }
        return null;
    }


}
