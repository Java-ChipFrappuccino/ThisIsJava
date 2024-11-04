package ch15.exam.ex9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Iterator<Entry<String, Integer>> keys = map.entrySet().iterator();
        while (keys.hasNext()) {
            Entry<String, Integer> entry = keys.next();
            totalScore += entry.getValue();
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("Average score: " + totalScore / map.size());
        System.out.println("Max score: " + maxScore);
        System.out.println("Name: " + name);
    }
}
