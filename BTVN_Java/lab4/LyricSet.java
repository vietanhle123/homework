package BTVN_Java.lab4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.HashSet;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best",
                         "when", "you", "say", "nothing", "at", "all"};
    
    public static void main(String[] args) {
        // Create a set from HashSet that’s implemented Set
        Set words = new HashSet();        
     // Add all words to set
        for (String w : lyric)
            words.add(w);
        
        // Traverse the list
        // NOTICE: set doesn't allow duplicate items
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");
                
        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
    }

}
