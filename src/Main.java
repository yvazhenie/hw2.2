public class Main {
    public static void main(String[] args) {
        StudentGriffindor potter = new StudentGriffindor("Гарри Поттер ", 10, 20, 80, 70, 55);
        StudentGriffindor germiona = new StudentGriffindor("Гермиона Грейнджер ", 90, 10, 80, 70, 55);
        StudentGriffindor ron = new StudentGriffindor("Рон Уизли ", 11, 25, 30, 100, 80);
        StudentSlyserin drako = new StudentSlyserin("Драко Малфой", 20, 30, 40, 50, 60, 19, 20);
        StudentSlyserin graham = new StudentSlyserin("Грэхэм Монтегю ", 22, 35, 10, 1, 0, 20, 15);
        StudentSlyserin geargi = new StudentSlyserin("Грегори Гойл ", 27, 10, 80, 50, 100, 22, 17);
        StudentCogtevran chang = new StudentCogtevran("Чжоу Чанг ", 77, 80, 10, 24, 12, 13);
        StudentCogtevran padma = new StudentCogtevran("Падма Патил ", 20, 20, 17, 23, 12, 28);
        StudentCogtevran markus = new StudentCogtevran("Маркус Белби ", 10, 50, 12, 0, 17, 77);
        StudentSuffenduy smith = new StudentSuffenduy("Захария Смит ", 87, 19, 11, 22, 33);
        StudentSuffenduy finch = new StudentSuffenduy("Джастин Финч-Флетчли ", 88, 57, 61, 92, 43);
        StudentSuffenduy sedrik = new StudentSuffenduy("Захария Смит ", 66, 99, 19, 21, 34);
        ron.print();
        drako.print();
        markus.print();
        smith.print();
        chang.compareSumCogtevran(padma);
        germiona.compareGriffindorStudent(potter);
        graham.compareSlyserinStudent(geargi);
        finch.compareSuffenduyStudent(sedrik);
        finch.compareHogwartsPower(drako);
    }


    }

