package oop;

public class Hufflepuff extends HogwartsSchool{
    private int industriousness;//трудолюбие
    private int loyalty;//верность
    private int honesty;//чесность

    public Hufflepuff(String family, String name, int powerMagic, int rangeMagic, int industriousness, int loyalty, int honesty) {
        super(family, name, powerMagic, rangeMagic);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
