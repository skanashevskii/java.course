package objectAndClass;

import java.util.Objects;

public class Book {
     private  String bookName;
     private Author bookAuthor;
    private int bookYear;
    public Book (String bookName, Author bookAuthor, int bookYear){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;

    }
    public String getBookName(){
        return this.bookName;
    }
    public Author getBookAuthor(){
        return this.bookAuthor;
    }
    public int getBookYear(){
        return this.bookYear;
    }
    public void setBookYear(int bookYear){
        if(bookYear>0) {
            this.bookYear = bookYear;
        }
    }

    public String toString(){
        return " Книга: "+ "'" + this.bookName+ "'," + " Автор: "+ this.bookAuthor + " Год издания: " + this.bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor);
    }


}
