package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director;
    }

    public int getLength(){
        return length;
    }

    public float getCost(){
        return cost;
    }

    public int getId(){
        return id;
    }

    public static int getNumber(){
        return nbDigitalVideoDiscs;
    }

    public boolean isMatch(String tit){
        if (title.equals(tit)){
            return true;
        } else {
            return false;
        }
    }

    // Create a DVD object by title
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    // Create a DVD object by category, title and cost
    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    // Create a DVD object by director, category, title and cost
    public DigitalVideoDisc(String director, String category, String title, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    // Create a DVD object by all attributes: title, category, director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

}













