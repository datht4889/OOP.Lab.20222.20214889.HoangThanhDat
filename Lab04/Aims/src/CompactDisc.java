import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable {
    private String artist;
    // private ArrayList tracks = new Track[];
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, String artist, double cost) {
        super(id, title, category, cost);
        this.artist = artist;
        this.tracks = new ArrayList<Track>();
    }

    public String toString(){
        return ("CD - ID: " + this.getId() + " Title: " + this.getTitle() + " - Artist: " + this.getArtist() + " - Category: " + this.getCategory() + " - Director: " + this.getDirector() + " - Length: " + this.getLength() + " - Cost: " +this.getCost() + "] $");
    }

    public String getArtist() {
        return artist;
    }
    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track '" + track.getTitle() + "' already exists in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' added to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' removed from the CD.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' does not exist in the CD.");
        }
    }
    
    @Override
    public void play() {
        System.out.println("ID: " + this.getId());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Cost: $" + this.getCost());
        System.out.println("Artist: " + this.getArtist());
        for (Track track : tracks) {
            System.out.println("Playing track: " + track.getTitle());
            System.out.println("Track length: " + track.getLength());
        }
        
    }

}
