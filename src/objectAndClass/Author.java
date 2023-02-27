package objectAndClass;

public class Author {
    String authorName;
    String authorFamilyName;
    public Author(String authorName, String authorFamilyName){
        this.authorName = authorName;
        this.authorFamilyName = authorFamilyName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getAuthorFamilyName(){
        return authorFamilyName;
    }
}
