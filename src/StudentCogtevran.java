public class StudentCogtevran extends HogwartsStudent{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    @Override
    public String toString() {
        return "StudentCogtevran: " +
                "magic = "+getMagickPower()+
                ", transgeneratePower = " + getTransgeneratePower()+
                ", name = " + getName() +
                ", smart = " + smart +
                ", wise = " + wise +
                ", witty = " + witty +
                ", creativity = " + creativity
                ;
    }

    public StudentCogtevran(String name, int magickPower, int transgeneratePower, int smart, int wise, int witty, int creativity) {
        super(name, magickPower, transgeneratePower);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    private int sumPowerCogtevran() {
        return smart + wise + witty + creativity;
    }

    public void compareSumCogtevran(StudentCogtevran studentCogtevran) {
        if (sumPowerCogtevran()> studentCogtevran.sumPowerCogtevran()) {
            System.out.println(getName() + " лучше в Когтревране, чем " +studentCogtevran.getName() );
        } else if (sumPowerCogtevran() < studentCogtevran.sumPowerCogtevran()) {
            System.out.println(getName() + " хуже в Когтевране, чем " + studentCogtevran.getName());
        } else {
            System.out.println( getName()+ "и " + studentCogtevran.getName() + " равны");
        }
    }
}
