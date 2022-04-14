package BTVN_Java.lab4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map;
import java.util.Collections;

public class LyricWord {
    private static final String[] lyric = {"you", "say", "it", "best",
    "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args){
        // Create a list that’s implemented by ArrayList
        List words = new ArrayList();
		  // Add all String in string array to list
        for (String w : lyric)
            words.add(w);
        
        // Traverse the list
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");
            
        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " +       words.lastIndexOf("say"));

            //Sort words
            Collections.sort(words);

            //show all elements of words
            for (Object o : words) {
                System.out.print(o + " ");
            }

    }
}
