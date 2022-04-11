package BTVN_Java.lab3_dox;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LyricSet {
    private static final String[] lyric = {"you","say","it","best","when","you","nothing","at","all"};

    public static void main(String[] args) {
        Set words = new HashSet();

        for (String w : lyric)
            words.add(w);


        for (Object o : words)
            System.out.println( o +" ");
        System.out.println("\n------------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        
    }
}
