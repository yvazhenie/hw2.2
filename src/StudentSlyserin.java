public class StudentSlyserin extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    @Override
    public String toString() {
        return "StudentSlyserin: " +
                "magic = "+getMagickPower()+
                ", transgeneratePower = " + getTransgeneratePower()+
                ", name = " + getName() +
                ", cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", thirstForPower = " + thirstForPower
                ;
    }

    public void printSlyserin(){
        System.out.println(this);
    }

    public StudentSlyserin(String name, int magickPower, int transgeneratePower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magickPower, transgeneratePower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    private int sumPowerSlyserin() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void compareSlyserinStudent(StudentSlyserin studentSlyserin) {
        if (sumPowerSlyserin()> studentSlyserin.sumPowerSlyserin()) {
            System.out.println(getName() +"лучше в Слизерин, чем " + studentSlyserin.getName());
        } else if (sumPowerSlyserin() < studentSlyserin.sumPowerSlyserin()) {
            System.out.println(getName() + "хуже в Слизерин, чем " +studentSlyserin.getName());
        } else {
            System.out.println(getName()+ "и " + studentSlyserin.getName() + " раввны");
        }
    }
}
