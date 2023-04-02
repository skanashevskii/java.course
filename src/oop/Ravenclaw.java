package oop;

public class Ravenclaw extends HogwartsSchool {
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//острумие
    private int creation;//творчество


    public Ravenclaw(String family, String name, int powerMagic, int rangeMagic, int mind, int wisdom, int wit, int creation) {
        super(family, name, powerMagic, rangeMagic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int abilyty() {
        return mind + wisdom + wit + creation;
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2, Ravenclaw student3) {
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

    public void compareRavenclaw(Ravenclaw student) {
        //int sumAbility = this.bravery+this.honor+this.nobility;
        int sumAbility = abilyty();
        //if(abilyty()>student.abilyty()){}//вариант с отдельным методом
        if (sumAbility > student.getCreation() + student.getMind() + student.getWisdom() + student.getWit()) {
            System.out.println("Лучше из Когтерванов" + getName()
                    + " нежели " + student.getName());
        } else {
            System.out.println("Лучший из 2х Когтевранов " + student.getName()
                    + " нежели " + getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " mind = " + mind + '\'' +
                ", wisdom = " + wisdom + '\'' +
                ", wit = " + wit + '\'' +
                ", creation = " + creation + '\'' +
                '.';
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
