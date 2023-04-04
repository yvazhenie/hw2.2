public class StudentGriffindor extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    @Override
    public String toString() {
        return "StudentGriffindor: "
                + "magic = "+getMagickPower()+
                ", transgeneratePower = " + getTransgeneratePower()+
                ", name = " + getName() +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery
                ;
    }

    public StudentGriffindor(String name, int magickPower, int transgeneratePower, int nobility, int honor, int bravery) {
        super(name, magickPower, transgeneratePower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int sumPowerGriffindor() {
        return nobility + honor + bravery;
    }
    public void compareGriffindorStudent (StudentGriffindor studentGriffindor) {
        if (sumPowerGriffindor() > studentGriffindor.sumPowerGriffindor()) {
            System.out.println(getName() + "лучший Гриффиндорец, чем" + studentGriffindor.getName());
        } else if (sumPowerGriffindor() < studentGriffindor.sumPowerGriffindor()) {
            System.out.println(getName() + "хуже Гриффиндорец, чем" + studentGriffindor.getName());
        } else {
            System.out.println(getName() + "и " + studentGriffindor.getName()+ " равны");
        }
    }
}


