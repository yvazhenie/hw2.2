public class StudentSuffenduy  extends HogwartsStudent{
    private int hardworking;
    private int loyal;
    private int honest;

    public StudentSuffenduy(String name, int magickPower, int transgeneratePower, int hardworking, int loyal, int honest) {
        super(name, magickPower, transgeneratePower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    private int sumPowerSuffenduy () {
        return hardworking + loyal + honest;
    }

    @Override
    public String toString() {
        return "StudentSuffenduy: " +
                "magic = "+getMagickPower()+
                ", transgeneratePower = " + getTransgeneratePower()+
                ", name = " + getName() +
                ", hardworking = " + hardworking +
                ", loyal = " + loyal +
                ", honest = " + honest
                ;
    }

    public void compareSuffenduyStudent(StudentSuffenduy studentSuffenduy) {
        if (sumPowerSuffenduy() > studentSuffenduy.sumPowerSuffenduy()) {
            System.out.println(getName()+" лучше Пуфендуец, чем " + studentSuffenduy.getName());
        } else if (sumPowerSuffenduy() < studentSuffenduy.sumPowerSuffenduy()) {
            System.out.println(getName() + " хуже Пуфендуец, чем " + studentSuffenduy.getName());
        } else {
            System.out.println(getName() +"и " + studentSuffenduy.getName() + " равны");
        }
    }
}
