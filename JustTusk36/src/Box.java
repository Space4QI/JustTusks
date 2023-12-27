import java.text.DecimalFormat;

public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String calculateSurfaceArea() {
        double csa = 2 * length * width + 2 * length * height + 2 * width * height;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(csa);
    }

    public String calculateLateralSurfaceArea() {
        double clsa = 2 * length * height + 2 * width * height;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(clsa);
    }

    public String calculateVolume() {
        double cv = length * width * height;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(cv);
    }

    public boolean isValid() {
        return length > 0 && width > 0 && height > 0;
    }
}
