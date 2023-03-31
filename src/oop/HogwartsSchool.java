package oop;

public class HogwartsSchool {

    private String family;
    private String name;
    private int powerMagic;//сила колдовства
    private int rangeMagic;//дальность колдовства

    public HogwartsSchool(String family, String name, int powerMagic, int rangeMagic) {
        this.family=family;
        this.name=name;
        this.rangeMagic=rangeMagic;
        this.powerMagic=powerMagic;
    }

    public void printStudent (HogwartsSchool[] faculty){

        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i] == null) {
                continue;
            }
            System.out.println(faculty[i]);
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", powerMagic=" + powerMagic +
                ", rangeMagic=" + rangeMagic +
                '}'
                ;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
