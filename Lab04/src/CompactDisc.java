public class CompactDisc extends Media {
    private String artist;
    private ArrayList tracks = new Track[];

    public String getArtist() {
        return artist;
    }
    public Track[] getTracks() {
        return tracks;
    }

    public void addTrack(String trackName) {
        if (!tracks.contains(trackName)) {
            tracks.add(trackName);
            System.out.println("Track " + trackName + " added to the book.");
        } else {
            System.out.println("Track " + trackName + " is already in the book.");
        }
    }

    public void removeTrack(String trackName) {
        if (tracks.contains(trackName)) {
            tracks.remove(trackName);
            System.out.println("Track " + trackName + " removed from the book.");
        } else {
            System.out.println("Track " + trackName + " is not present in the book.");
        }
    }
    

}
