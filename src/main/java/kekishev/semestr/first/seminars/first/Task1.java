package kekishev.semestr.first.seminars.first;

import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;

@Component
public class Task1 {
    public void run(String @NonNull [] args) throws Exception {
        subtask1();
        subtask2();
    }

    private void subtask1() {
        System.out.println("Вася\n    пошел\n     гулять");
    }

    private void subtask2() {
        System.out.println("   Ж\n  ЖЖЖ\n ЖЖЖЖЖ\nЖЖЖЖЖЖЖ\n НН НН\n ZZZZZ");
    }
}
