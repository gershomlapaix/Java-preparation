import java.util.Collections;
import java.util.List;

public class JukeBox {
    public void go(){
        List<Song> songList = MockSongs.getSongStrings();
        System.out.println(songList);

//        Now sort the songs
        Collections.sort(songList);
        System.out.println("Sorted: "+ songList);
    }
}
