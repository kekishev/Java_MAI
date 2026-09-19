package kekishev.semestr.second.seminars;

import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public void run(String @NonNull [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(find(in.nextInt()));
    }

    public Boolean find(int number) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        while (number > 0) {
            int digit = number % 10;

            try {
                numbers.put(digit, numbers.get(digit) + 1);
            } catch (NullPointerException e) {
                numbers.put(digit, 1);
            }

            number /= 10;
        }

        return numbers.containsValue(2);
    }
}
