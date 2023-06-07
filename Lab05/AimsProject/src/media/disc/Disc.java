package media.disc;

import media.Media;

public class Disc extends Media{
    private int length;
    private String director;

    public Disc(int id, String title, String category, String director, int length, double cost) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(int id, String title) {
        super(id, title);
    }

    public Disc(int id, String title, String category, double cost) {
        super(id, title, category, cost);
    }

    public Disc(int id, String title, String category, String director, double cost) {
        super(id, title, category, cost);
        this.director = director;
    }

    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }


    
}