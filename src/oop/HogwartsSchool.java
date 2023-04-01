package oop;

public class HogwartsSchool {

    private final String family;
    private final String name;
    private int powerMagic;//сила колдовства
    private int rangeMagic;//дальность колдовства

    public HogwartsSchool(String family, String name, int powerMagic, int rangeMagic) {
        this.family = family;
        this.name = name;
        this.rangeMagic = rangeMagic;
        this.powerMagic = powerMagic;
    }

    public void compareHogwartsSchool(HogwartsSchool student) {
        if (this.powerMagic > student.getPowerMagic()) {
            System.out.println("Сила колдовства " + this.getFamily() + " больше чем у "
                    + student.getFamily());
        } else if (this.powerMagic < student.getPowerMagic()) {
            System.out.println("Сила колдовства " + this.getFamily() + " меньше чем у "
                    + student.getFamily());
        } else {
            System.out.println("Сила колдовства " + this.getFamily() + " и "
                    + student.getFamily() + " равны ");
        }
        if (this.powerMagic > student.getPowerMagic()) {
            System.out.println("Дальность колдовства " + this.getFamily() + " больше чем у "
                    + student.getFamily());
        } else if (this.powerMagic < student.getPowerMagic()) {
            System.out.println("Дальность колдовства " + this.getFamily() + " меньше чем у "
                    + student.getFamily());
        } else {
            System.out.println("Дальность колдовства " + this.getFamily() + " и "
                    + student.getFamily() + " равны");
        }
    }

    @Override
    public String toString() {
        return
                "family = '" + family + '\'' +
                        ", name = '" + name + '\'' +
                        ", powerMagic = " + powerMagic +
                        ", rangeMagic = " + rangeMagic +
                        ','
                ;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getRangeMagic() {
        return rangeMagic;
    }

    public void setRangeMagic(int rangeMagic) {
        this.rangeMagic = rangeMagic;
    }


}
