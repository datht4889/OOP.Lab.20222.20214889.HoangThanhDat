package media.disc;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

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

    public String toString(){
        return ("DVD - ID: " + this.getId() + " Title: " + this.getTitle() + " - Category: " + this.getCategory() + " - Director: " + this.getDirector() + " - Length: " + this.getLength() + " - Cost: " +this.getCost() + " $");
    }

    public DigitalVideoDisc(int id, String title){
        super(id ,title);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(int id, String title, String category, double cost){
        super(id, title, category, cost);
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, double cost){
        super(id, title, category, director, cost);
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, double cost){
        super(id, title, category, director, length, cost);
        nbDigitalVideoDiscs ++;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}













