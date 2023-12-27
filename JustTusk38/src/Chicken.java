public class Chicken {
    Integer age;
    String name;

    public Chicken (int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer calculateProductPerDay(){
        if(age == 1){
            return 0;
        }
        else if (2 <= age && age <= 9) {
            return 5;
        }
        else {
            return 1;
        }
    }

    public String showInfo(){
        return "Chicken " + name + " (age " + age + ")" + " can produce " + calculateProductPerDay() + " egg`s" + " per week";
    }
}
