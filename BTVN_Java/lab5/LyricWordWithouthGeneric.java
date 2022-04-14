package BTVN_Java.lab5;

import java.util.List;
import java.util.ArrayList;


public class LyricWordWithouthGeneric {
    private static final Word[] lyric = {
        new Word("you",1), new Word("say",2), new Word("it",3), 
        new Word("best",4),new Word("when",5),new Word("you",6), 
        new Word("say",7), new Word("nothing",8), new Word("at",9), 
        new Word("all",10)};
            
            public static void main(String[] args) {
                // Create a list that’s implemented by ArrayList
                List lyric = new ArrayList();
                  // Add all String in string array to list
                for (Word w : lyric)
                    lyric.add(w);
               
                //show all elements of words
                for (Object o : lyric) {
                        Word w=(Word) o;
                    System.out.print(w.getValue() + ", "+ w.getPosition());
                }
            }
        
}
