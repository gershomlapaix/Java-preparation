// A class on which to carry out collection operations
public class Song {

//    properties
    private String title;
    private String artist;
    private int bpm;

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
