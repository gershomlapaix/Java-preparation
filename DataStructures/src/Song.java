// A class on which to carry out collection operations

// It is not possible to sort the objects
// For sorting to be possible then, we implement the comparable method

public class Song implements Comparable<Song> {
//    properties
    private String title;
    private String artist;
    private int bpm;

//    override hashcode and equals for enabling HashSet
    public boolean equals(Object aSong){
        Song other  = (Song) aSong;
        return  title.equals(other.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }

    //    this method will help to sort the songs, based on their titles
    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

//    constructor
    Song(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

//    getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

//    override to string

    public String toString(){
        return title;
    }
}
