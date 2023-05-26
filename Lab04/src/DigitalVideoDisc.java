

public class DigitalVideoDisc extends Disc {
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

    public DigitalVideoDisc(int id, String title){
        super(id ,title);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost){
        super(id, title, category, cost);
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost){
        super(id, title, category, director, cost);
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost){
        super(id, title, category, director, length, cost);
        nbDigitalVideoDiscs ++;
    }

}













