package objectAndClass;

public class Main {
    public static void main(String[] args) {
        Author bochka = new Author(" Наталья ", " Бочка ");
        Author chudnaya = new Author(" Анастасия ","Чудная");
        Book barin = new Book("Барин", bochka, 2021);
        Book sirotka = new Book("Сиротка для графа", chudnaya, 2022);
        System.out.println("Книга " +barin.getBookName());
        System.out.println("Автор " +barin.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +barin.getBookYear());
        System.out.println("Книга " +sirotka.getBookName());
        System.out.println("Автор " +sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +sirotka.getBookYear());
        sirotka.setBookYear(2023);
        System.out.println("Книга " +sirotka.getBookName());
        System.out.println("Автор " + sirotka.getBookAuthor().getAuthorName()+" "+sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +sirotka.getBookYear());

        System.out.println(barin);
        System.out.println(sirotka);
    }
}