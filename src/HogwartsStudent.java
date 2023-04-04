public class HogwartsStudent {
    private int magickPower;
    private int transgeneratePower;
    private final String name;

    @Override
    public String toString() {
        return "HogwartsStudent" +
                "magickPower=" + magickPower +
                ", transgeneratePower=" + transgeneratePower +
                ", name='" + name
                ;
    }
    public void print(){
        System.out.println(this);
    }

    public String fff(HogwartsStudent hogwartsStudent) {
        return hogwartsStudent.toString();
    }

    public HogwartsStudent(String name, int magickPower, int transgeneratePower) {
        this.name = name;
        this.magickPower = magickPower;
        this.transgeneratePower = transgeneratePower;
    }
    public String getName() {
        return name;
    }

    public int getMagickPower() {
        return magickPower;
    }

    public int getTransgeneratePower() {
        return transgeneratePower;
    }
    private int calculatePower (){
        return magickPower + transgeneratePower;
    }
    public void compareHogwartsPower (HogwartsStudent hogwartsStudent) {
        if (calculatePower() > hogwartsStudent.calculatePower()) {
            System.out.println(getName()+ "Лучше ученик в Хогвартсе, чем " + hogwartsStudent.getName());
        } else if (calculatePower() < hogwartsStudent.calculatePower()) {
            System.out.println( getName()+ "Хуже ученик в Хогвартсе, чем " +hogwartsStudent.getName());
        } else {
            System.out.println(getName() + "и " + hogwartsStudent.getName() + " равны");
        }

    }
    }

