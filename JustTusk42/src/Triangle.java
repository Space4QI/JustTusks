public class Triangle extends Polygon {

    public int a;

    public int b;

    public int c;

    public Double radius(int[] sides){
        return Math.sqrt((-a + b + c) * (a - b + c) * (a - b + c)) / (4 * (a + b + c));
    }
}
