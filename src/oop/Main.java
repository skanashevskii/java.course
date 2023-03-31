package oop;


public class Main {
    public static void printStudent (HogwartsSchool[] faculty){

        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i] == null) {
                continue;
            }
            System.out.println(faculty[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {

        HogwartsSchool[] hogwartsSchools = {
                new Griffindor("Greenger", "Germiona", 34, 34, 34, 70, 34),
                new Griffindor("Potter", "Harry", 54, 64, 34, 80, 75),
                new Griffindor("Weasley", "Ron", 34, 34, 34, 50, 34),
                new Hufflepuff("Smith", "Zacharias", 34, 34, 34, 34, 34),
                new Hufflepuff("Diggory", "Cedric", 34, 34, 55, 34, 34),
                new Hufflepuff("Finch-Fletchley", "Justin", 34, 34, 34, 34, 34),
                new Ravenclaw("Chang", "Cho", 34, 34, 34, 34, 34, 56),
                new Ravenclaw("Patil", "Padma", 34, 34, 34, 34, 34, 56),
                new Ravenclaw("Belby", "Marcus", 34, 34, 34, 34, 34, 56),
                new Slytherin("Malfoy", "Draco", 80, 90, 44, 54, 74, 56, 78),
                new Slytherin("Montague", "Graham", 34, 34, 34, 34, 34, 56, 78),
                new Slytherin("Goyle", " Gregory", 34, 34, 34, 34, 34, 56, 78),
        };
        Griffindor[] griffindors = {
                new Griffindor("Greenger", "Germiona", 34, 34, 34, 70, 34),
                new Griffindor("Potter", "Harry", 54, 64, 34, 80, 75),
                new Griffindor("Weasley", "Ron", 34, 34, 34, 50, 34),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Smith", "Zacharias", 34, 34, 34, 34, 34),
                new Hufflepuff("Diggory", "Cedric", 34, 34, 55, 34, 34),
                new Hufflepuff("Finch-Fletchley", "Justin", 34, 34, 34, 34, 34),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Chang", "Cho", 34, 34, 34, 34, 34, 56),
                new Ravenclaw("Patil", "Padma", 34, 34, 34, 34, 34, 56),
                new Ravenclaw("Belby", "Marcus", 34, 34, 34, 34, 34, 56),
        };
        Slytherin[] slytherins = {
                new Slytherin("Malfoy", "Draco", 80, 90, 44, 54, 74, 56, 78),
                new Slytherin("Montague", "Graham", 34, 34, 34, 34, 34, 56, 78),
                new Slytherin("Goyle", " Gregory", 34, 34, 34, 34, 34, 56, 78),
        };
/*      HogwartsSchool greenger = new Griffindor("Greenger", "Germiona", 34, 34, 34, 70, 34);
        HogwartsSchool potter =new Griffindor("Potter", "Harry", 54, 64, 34, 80, 75);
        HogwartsSchool weasley = new Griffindor("Weasley", "Ron", 34, 34, 34, 50, 34);
        HogwartsSchool smith =new Hufflepuff("Smith", "Zacharias", 34, 34, 34, 34, 34);
        HogwartsSchool diggory = new Hufflepuff("Diggory", "Cedric", 34, 34, 55, 34, 34);
        HogwartsSchool finch =new Hufflepuff("Finch-Fletchley", "Justin", 34, 34, 34, 34, 34);
        HogwartsSchool chang =new Ravenclaw("Chang", "Cho", 34, 34, 34, 34, 34, 56);
        HogwartsSchool patil =new Ravenclaw("Patil", "Padma", 34, 34, 34, 34, 34, 56);
        HogwartsSchool belby =new Ravenclaw("Belby", "Marcus", 34, 34, 34, 34, 34, 56);
        HogwartsSchool malfoy =new Slytherin("Malfoy", "Draco", 80, 90, 44, 54, 74, 56, 78);
        HogwartsSchool montague =new Slytherin("Montague", "Graham", 34, 34, 34, 34, 34, 56, 78);
        HogwartsSchool goyle =new Slytherin("Goyle", " Gregory", 34, 34, 34, 34, 34, 56, 78);*/

        printStudent(hogwartsSchools);
        printStudent(griffindors);
        printStudent(ravenclaws);
        printStudent(hufflepuffs);
        printStudent(slytherins);



    }




}






