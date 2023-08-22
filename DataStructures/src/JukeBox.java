import com.sun.source.util.Trees;

import java.util.*;

public class JukeBox {
    public void go(){
        List<Song> songList = MockSongs.getSongStrings();
        System.out.println(songList);

//        Now sort the songs

        /**
         * V1
         Collections.sort(songList);
         System.out.println("Sorted: "+ songList);
         */

//        using lambda expressions to get deal done

//        1. sort using title
//         songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
//         System.out.println("Sorted on title: " + songList);

//         sort using an artist
//         songList.sort((one, two)-> one.getArtist().compareTo(two.getArtist()));
//         System.out.println("Sorted using artist: " + songList);


        /*
//        With hashset
        System.out.println("\n Using hashset\n --------------");
        Set<Song> songSet = new HashSet<>(songList);  // create a set from a given collection
        System.out.println(songSet);
        * */

        /**
//          With treeset
         //        Sorting with treeset which uses compareTo method
         Set<Song> songSet = new TreeSet<>(songList);
         System.out.println(songSet);
         */



//        treeset using Comparator in lambda function
        Set<Song> songSet = new TreeSet<>((o1, o2)-> o1.getBpm()  - o2.getBpm());
        songSet.addAll(songList);
        System.out.println(songSet);

    }
}
