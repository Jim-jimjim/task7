package ru.vsu.cs.leonov_ms;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void test() {
        List<Integer> t1 = new ArrayList<>();
        int n = 3;
        int[] test1 = { -3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3 };
        for (int j : test1) {
            t1.add(j);
        }
        System.out.printf("Тест 1:\nМассив: %s n: %d\n Результат работы: %d\n", t1, n, Main.solution(t1, n));

        List<Integer> t2 = new ArrayList<>();
        n = 0;
        int[] tes2t = { -3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3 };
        for (int j : tes2t) {
            t2.add(j);
        }
        System.out.printf("Тест 2:\nМассив: %s n: %d\n Результат работы: %d\n", t2, n, Main.solution(t2, n));

        List<Integer> t3 = new ArrayList<>();
        n = -1;
        int[] test3 = { -3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3 };
        for (int j : test3) {
            t3.add(j);
        }
        System.out.printf("Тест 3:\nМассив: %s n: %d\n Результат работы: %d\n", t3, n, Main.solution(t3, n));

        List<Integer> t4 = new ArrayList<>();
        n = 1;
        int[] test4 = { -3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3 };
        for (int j : test4) {
            t4.add(j);
        }
        System.out.printf("Тест 4:\nМассив: %s n: %d\n Результат работы: %d\n", t4, n, Main.solution(t4, n));

        List<Integer> t5 = new ArrayList<>();
        n = 3;
        int[] test5 = {};
        for (int j : test5) {
            t5.add(j);
        }
        System.out.printf("Тест 5:\nМассив: %s n: %d\n Результат работы: %d\n", t5, n, Main.solution(t5, n));

        List<Integer> t6 = new ArrayList<>();
        n = 3;
        int[] test6 = {0};
        for (int j : test6) {
            t6.add(j);
        }
        System.out.printf("Тест 6:\nМассив: %s n: %d\n Результат работы: %d\n", t6, n, Main.solution(t6, n));

        List<Integer> t7 = new ArrayList<>();
        n = 3;
        int[] test7 = { -1};
        for (int j : test7) {
            t7.add(j);
        }
        System.out.printf("Тест 7:\nМассив: %s n: %d\n Результат работы: %d\n", t7, n, Main.solution(t7, n));

        List<Integer> t8 = new ArrayList<>();
        double k = 3.2;
        int[] test8 = { -3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3 };
        for (int j : test8) {
            t8.add(j);
        }
        System.out.printf("Тест 8:\nМассив: %s n: %d\n Результат работы: %d\n", t8, n, Main.solution(t8, (int) k));

        List<Integer> t9 = new ArrayList<>();
        n = 4;
        double[] test9 = { -3.2, 5, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 8 };
        for (double j : test9) {
            t9.add((int) j);
        }
        System.out.printf("Тест 9:\nМассив: %s n: %d\n Результат работы: %d\n", t9, n, Main.solution(t9, n));

        List<Integer> t10 = new ArrayList<>();
        n = 3;
        int[] test10 = { -3, 4, 8, 4, 8, 4, 7, 3, 3, 8, 0, 6, -1, 4, 7, 3, 3 , 5, 6};
        for (int j : test10) {
            t10.add(j);
        }
        System.out.printf("Тест 10:\nМассив: %s n: %d\n Результат работы: %d\n", t10, n, Main.solution(t10, n));
    }
}
