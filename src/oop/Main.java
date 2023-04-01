package oop;


public class Main {

    public static void main(String[] args) {

        Griffindor greenger = new Griffindor("Greenger", "Germiona", 34, 34, 34, 70, 34);
        Griffindor potter = new Griffindor("Potter", "Harry", 54, 64, 34, 80, 75);
        Griffindor weasley = new Griffindor("Weasley", "Ron", 34, 34, 34, 50, 34);
        Hufflepuff smith = new Hufflepuff("Smith", "Zacharias", 34, 34, 34, 34, 34);
        Hufflepuff diggory = new Hufflepuff("Diggory", "Cedric", 34, 34, 55, 34, 34);
        Hufflepuff finch = new Hufflepuff("Finch-Fletchley", "Justin", 34, 34, 58, 34, 64);
        Ravenclaw chang = new Ravenclaw("Chang", "Cho", 34, 34, 34, 34, 34, 56);
        Ravenclaw patil = new Ravenclaw("Patil", "Padma", 34, 34, 34, 34, 34, 56);
        Ravenclaw belby = new Ravenclaw("Belby", "Marcus", 34, 34, 34, 34, 34, 56);
        Slytherin malfoy = new Slytherin("Malfoy", "Draco", 80, 90, 44, 54, 74, 56, 78);
        Slytherin montague = new Slytherin("Montague", "Graham", 34, 34, 34, 34, 34, 56, 78);
        Slytherin goyle = new Slytherin("Goyle", " Gregory", 34, 34, 34, 34, 34, 56, 78);


        System.out.println("Данные студентов школы : ");
        System.out.println(greenger);
        System.out.println(diggory);
        System.out.println(chang);
        System.out.println(montague);
        System.out.println("========================================================================================");
        System.out.println("Кто лучший из двух в школе : ");
        greenger.compareHogwartsSchool(malfoy);
        System.out.println();
        potter.compareHogwartsSchool(goyle);
        System.out.println();
        belby.compareHogwartsSchool(finch);
        System.out.println();
        patil.compareHogwartsSchool(weasley);
        System.out.println("========================================================================================");
        System.out.println("Кто лучший на факультете по сумме : ");
        Griffindor.compareGriffindorStudents(potter, greenger, weasley);
        Hufflepuff.compareHufflepuffStudents(smith, diggory, finch);
        Ravenclaw.compareRavenclawStudents(chang, patil, belby);
        Slytherin.compareSlytherinStudents(malfoy, montague, goyle);
        System.out.println("=======================================================================================");
        System.out.println("Кто лучший на факультете : ");
        greenger.compareGriffindors(potter);
        smith.compareHufflepuff(finch);
        chang.compareRavenclaw(patil);
        montague.compareSlytherin(goyle);
        System.out.println("=======================================================================================");


    }

}






