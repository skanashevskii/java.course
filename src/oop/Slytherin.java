package oop;

public class Slytherin extends HogwartsSchool {
    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;//амбиции
    private int resourcefulness;//находчивость
    private int lustForPower;//властолюбие

    public Slytherin(String family, String name, int powerMagic, int rangeMagic, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(family, name, powerMagic, rangeMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int abilyty() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2, Slytherin student3) {
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

    public void compareSlytherin(Slytherin student) {
        //int sumAbility = this.bravery+this.honor+this.nobility;
        int sumAbility = abilyty();
        //if(abilyty()>student.abilyty()){}//вариант с отдельным методом
        if (sumAbility > student.getAmbition() + student.getCunning() + student.getDetermination()
                + student.getResourcefulness() + student.getLustForPower()) {
            System.out.println("Лучше из Слизирийцев " + getName()
                    + " нежели " + student.getName());
        } else {
            System.out.println("Лучший из 2х Слизирийцев " + student.getName()
                    + " нежели " + getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower +
                '.';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
