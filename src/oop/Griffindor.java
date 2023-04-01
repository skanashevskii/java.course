package oop;

import java.util.Objects;

public class Griffindor extends HogwartsSchool {

    private final int nobility;//благородство
    private final int honor;//честь
    private final int bravery;//храбрость

    public Griffindor(String family, String name, int nobility, int honor, int bravery, int powerMagic, int rangeMagic) {
        super(family, name, powerMagic, rangeMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int abilyty() {
        return nobility + honor + bravery;
    }

    public static void compareGriffindorStudents(Griffindor student1, Griffindor student2, Griffindor student3) {
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

    public void compareGriffindors(Griffindor student) {
        //int sumAbility = this.bravery+this.honor+this.nobility;
        int sumAbility = abilyty();
        //if(abilyty()>student.abilyty()){}//вариант с отдельным методом
        if (sumAbility > student.getNobility() + student.getBravery() + student.getHonor()) {
            System.out.println("Лучше из Гриффендорцев " + getName()
                    + " нежели " + student.getName());
        } else {
            System.out.println("Лучший из 2х Гриффендорцев " + student.getName()
                    + " нежели " + getName());
        }
    }

    @Override
    public String toString() {

        return super.toString() +
                " nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery +
                '.';
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
}



