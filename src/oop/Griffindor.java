package oop;

import java.util.Objects;

public class Griffindor extends HogwartsSchool {

    private int nobility;//благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Griffindor(String family, String name, int nobility, int honor, int bravery, int powerMagic, int rangeMagic) {
        super(family, name, powerMagic, rangeMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public void compareGriffindor(Griffindor[] griffindors) {

        for (int i = 0; i < griffindors.length; i++) {
            Griffindor student = griffindors[i];
            if (this.nobility > student.getNobility()) {
                System.out.println("Nobility of " + this.getName() + " is higher then "
                        + student.getName());
            } else if (this.nobility < student.getNobility()) {
                System.out.println("Nobility of " + this.getName() + " is lower then "
                        + student.getName());
            } else {
                System.out.println("Nobility of " + this.getName() + " and "
                        + student.getName() + " are equal");
            }
        }
    }

    public int sumGradeStudent(Griffindor[] griffindors) {
        int sumGrade = 0;
        for (int i = 0; i < griffindors.length; i++) {
            if (griffindors[i] != null ) {
                sumGrade = sumGrade + griffindors[i].getNobility() + griffindors[i].getPowerMagic()
                        + griffindors[i].getRangeMagic() + griffindors[i].getHonor() + griffindors[i].getBravery();
            }
        }
        return sumGrade;
    }
    public int compareStudent(Griffindor[] griffindor){
        int max = 0;
       int sum =sumGradeStudent(griffindor);
        for (int i = 0; i < griffindor.length; i++) {

            if(griffindor[i] !=null){
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }


    @Override
    public String toString() {

        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}



