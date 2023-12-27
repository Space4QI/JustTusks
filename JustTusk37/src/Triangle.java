public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle (double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter(){
        return sideA + sideB + sideC;
    }

    public double calculateArea(){
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA)*(s - sideB)*(s - sideC));
    }

    public boolean isValid(){
        return sideA > 0 && sideB > 0 && sideC > 0;
    }

    public boolean isTriangle(){
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}
