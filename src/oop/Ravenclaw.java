package oop;

public class Ravenclaw extends HogwartsSchool{
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

    @Override
    public String toString() {
        return super.toString() +
                "mind='" + mind + '\'' +
                ", wisdom='" + wisdom + '\'' +
                ", wit='" + wit + '\'' +
                ", creation='" + creation + '\'' +
                '}';
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
