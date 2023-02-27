package objectAndClass;

public class Main {
    public static void main(String[] args) {
        Author Bochka = new Author("Наталья","Бочка");
        Author Chudnaya = new Author("Анастасия","Чудная");
        Book Barin = new Book("Барин", Bochka, 2021);
        Book Sirotka = new Book("Сиротка для графа", Chudnaya, 2022);
        System.out.println("Книга " +Barin.getBookName());
        System.out.println("Автор " +Barin.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Barin.getBookYear());
        System.out.println("Книга " +Sirotka.getBookName());
        System.out.println("Автор " +Sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Sirotka.getBookYear());
        Sirotka.setBookYear(2023);
        System.out.println("Книга " +Sirotka.getBookName());
        System.out.println("Автор " +Sirotka.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации " +Sirotka.getBookYear());
    }
}