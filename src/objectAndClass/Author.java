package objectAndClass;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(familyName, author.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName);
    }

    public String toString() {
        return this.name + this.familyName;

    }
}
