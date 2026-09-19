package kekishev.semestr.second.seminars;


import org.jspecify.annotations.NonNull;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task1 {
    public void run(String @NonNull [] args) throws Exception {
        List<LocalTime> sortedArray = sort(generateRandomArray());
        for (LocalTime localTime : sortedArray) {
            System.out.println(localTime);
        }
    }

    public List<LocalTime> generateRandomArray() {
        List<LocalTime> generatedList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            generatedList.add(LocalTime.of(random.nextInt() % 24, random.nextInt() % 60, random.nextInt() % 60));
        }

        return generatedList;
    }

    public List<LocalTime> sort(List<LocalTime> localTimes) {
        localTimes.sort(Comparator.comparing(LocalTime::getHour).thenComparing(LocalTime::getMinute).thenComparing(LocalTime::getSecond));
        return localTimes;
    }
}
