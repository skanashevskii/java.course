package objectAndClass;

public class Main {
    public static void main(String[] args) {
        Author bochka = new Author("Наталья", "Бочка");
        Author chudnaya = new Author("Анастасия","Чудная");
        Book Barin = new Book("Барин", bochka, 2021);
        Book Sirotka = new Book("Сиротка для графа", chudnaya, 2022);
        System.out.println("Книга " +Barin.getBookName());
        System.out.println("Автор " +Barin.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Barin.getBookYear());
        System.out.println("Книга " +Sirotka.getBookName());
        System.out.println("Автор " +Sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Sirotka.getBookYear());
        Sirotka.setBookYear(2023);
        System.out.println("Книга " +Sirotka.getBookName());
        System.out.println("Автор " + Sirotka.getBookAuthor().getAuthorName()+" "+Sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Sirotka.getBookYear());
    }
}