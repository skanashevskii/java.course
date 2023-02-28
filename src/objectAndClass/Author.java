package objectAndClass;

public class Author {
    String name;
    String familyName;
    public Author(String name, String familyName){
        this.name = name;
        this.familyName = familyName;
    }
    public String getAuthorName(){
        return name;
    }
    public String getAuthorFamilyName(){
        return familyName;
    }
}
