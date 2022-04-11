package BTVN_Java.lab3_dox;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PlanetDiameters {

    private static final String[] names = {"Mercury","Venus","Earth","Mars","Jupiter","Staurn","Uranus","Neptune","Pluto"};

    private static final float[] diameters = {4800f, 12103.6f,12756.3f,6794f,142984f,120536f,51118f,49532,2274f};

    private static void main(String[] args){
        Map planets = new HashMap();

        for (int i = 0;i < names.length; i++)
            planets.put(names[i], diameters[i]);

        Iterator it = planets.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println("---------------------");

        while (true) {
            System.out.println("Find planet (ENTER To quit) : ");
            String name = (new Scanner(System.in)).nextLine();
            
            if (name.length() == 0) break;

            if (!planets.containsKey(name))
                System.out.println("Planet" + name + "not found!");
            else
                System.out.println("The diameter of " + name + "is" + planets.get(name));
        }

    }
    
}
