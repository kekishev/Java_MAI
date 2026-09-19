package kekishev.semestr.second.seminars;

import org.jspecify.annotations.NonNull;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Task3 {
    private static final int N = 1_000_000_000;

    public void run(String @NonNull [] args) throws Exception {
        Path file = Files.createFile(Path.of("output.txt"));

        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (int number: findPrimeNumbers()) {
                writer.write(Integer.toString(number));
                writer.newLine();
            }
        }
    }

    public List<Integer> findPrimeNumbers() {
        BitSet isNotPrime = new BitSet(N);

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i < N; i++) {
            if (isNotPrime.get(i)) {
                continue;
            }

            for (int j = i + i; j < N; j += i) {
                if (j > 0) { // Integer overflow
                    isNotPrime.set(j, true);
                }
            }

            primeNumbers.add(i);
        }

        return primeNumbers;
    }
}
