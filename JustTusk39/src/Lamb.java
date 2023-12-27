import java.util.ArrayList;
class Lamb {
    private String name;

    private static int count =0;

    public Lamb(String name) {
        this.name = name;
        count++;
    }

    public static Lamb createLamb(String name) {
        if (name.length() >= 5){
            return new Lamb(name);
        }
        return null;
    }

    public static void printCount() {
        System.out.println(count + " lamb's");
    }
}