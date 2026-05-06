package main.java.puzzles;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class EmployeeSwipeInFrequency {

    public static void main(String[] args) {
        List<String> keyName = (Arrays.asList("alice","alice","alice","bob","bob","bob","bob"));
        List<String> keyTime = (Arrays.asList("12:01","12:00","18:00","21:00","21:20","21:30","23:00"));

        //create map of employee with list of swipe times in local time
        HashMap<String, ArrayList<LocalTime>> map = new HashMap<>();
        for (int i=0;i<keyTime.size();i++) {
            if(map.get(keyName.get(i)) != null) {
                map.get(keyName.get(i)).add(LocalTime.parse(keyTime.get(i)));
                Collections.sort(map.get(keyName.get(i)));
            } else {
                ArrayList<LocalTime> time = new ArrayList<>();
                time.add(LocalTime.parse(keyTime.get(i)));
                map.put(keyName.get(i), time);
            }
        }

        map.forEach((k,v) -> {
            int frequency = 1;
            for (int i=0;i<v.size()-1;i++) {

                //calculate time in minutes between 2 swipes
                long minutes = Duration.between(v.get(i), v.get(i+1)).toMinutes();

                //if swipes happen within an hour increment frequency
                if(minutes <= 60L){
                    frequency++;
                }

                //for 3 swipes print employee name
                if(frequency == 3) {
                    System.out.println(k);
                    break;
                }
            }
        });
    }
}
