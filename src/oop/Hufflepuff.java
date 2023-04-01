package oop;

public class Hufflepuff extends HogwartsSchool {
    private int industriousness;//трудолюбие
    private int loyalty;//верность
    private int honesty;//чесность

    public Hufflepuff(String family, String name, int powerMagic, int rangeMagic, int industriousness, int loyalty, int honesty) {
        super(family, name, powerMagic, rangeMagic);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int abilyty() {
        return industriousness + loyalty + honesty;
    }

    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2, Hufflepuff student3) {
        int sumAbilities1 = student1.abilyty();
        int sumAbilities2 = student2.abilyty();
        int sumAbilities3 = student3.abilyty();
        if (sumAbilities1 > sumAbilities2 && sumAbilities1 > sumAbilities3) {
            System.out.println("Характеристики студента "
                    + student1.getFamily() + " равны "
                    + sumAbilities1 + " и выше чем у студента "
                    + student2.getFamily() + " и у студента " + student3.getFamily());
        } else if (sumAbilities1 < sumAbilities2 && sumAbilities1 < sumAbilities3 && sumAbilities2 > sumAbilities3) {
            System.out.println("Характеристики студента "
                    + student2.getFamily() + " равны "
                    + sumAbilities2 + " и выше чем у студента "
                    + student1.getFamily() + " и выше чем у студента " + student3.getFamily());
        } else {
            System.out.println("Характеристики студента "
                    + student3.getFamily() + " равны "
                    + sumAbilities3 + " и выше чем у студента "
                    + student1.getFamily() + " и выше чем у студента " + student2.getFamily());
        }
    }

    public void compareHufflepuff(Hufflepuff student) {
        //int sumAbility = this.bravery+this.honor+this.nobility;
        int sumAbility = abilyty();
        //if(abilyty()>student.abilyty()){}//вариант с отдельным методом
        if (sumAbility > student.getIndustriousness() + student.getHonesty() + student.getLoyalty()) {
            System.out.println("Лучше из Пуффендуев " + getName()
                    + " нежели " + student.getName());
        } else {
            System.out.println("Лучший из 2х Пуффендуев " + student.getName()
                    + " нежели " + getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                '.';
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

}
