package BTVN_Java.lab3_dox;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class LyricWord {
    private static final String[] lyric = {"you","say","it","best","when","you","say","nothing","at","all"};

    public static void main(String[]args) {
        List words = new ArrayList<>();

        for(String w : lyric)
            words.add(w);

        for (Object o : words)
            System.out.println(o + " ");
            System.out.println("\n-----------------------");

            System.out.println("Contrains [you]?:" + words.contains("you"));
            System.out.println("Contrains [me]?:" + words.contains("me"));
            System.out.println("Where's [say]?:" + words.indexOf("say"));
            System.out.println("Where's the last [say]?: " + words.lastIndexOf("say"));

            Collections.sort(words);

            for (Object o : words) {
                System.out.println( o +" ");
            }
    }
}
