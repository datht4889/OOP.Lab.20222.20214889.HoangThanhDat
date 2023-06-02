
import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    public Book(int id, String title, String catergory, double cost, ArrayList<String> authors) {
        super(id, title, catergory, cost);
        this.authors = authors;
    }


    public String toString(){
        return ("Book - ID: " + this.getId() + " Title: " + this.getTitle() + " - Category: " + this.getCategory() + " - Cost: " +this.getCost() + " $");
    }

    public ArrayList<String> getAthors(){
        return this.authors;
    }
    
    public void setAthors(ArrayList<String> authors){
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author " + authorName + " added to the book.");
        } else {
            System.out.println("Author " + authorName + " is already in the book.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " removed from the book.");
        } else {
            System.out.println("Author " + authorName + " is not present in the book.");
        }
    }

}
