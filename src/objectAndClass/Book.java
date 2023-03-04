package objectAndClass;

public class Book {
     private String bookName;
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

}
