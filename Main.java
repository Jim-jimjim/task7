package ru.vsu.cs.leonov_ms;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner in = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();

        System.out.print("Введите длину подпоследовательности n: ");
        int n = in.nextInt();
        System.out.println("Начинается добавление чисел в массив");
        while (in.hasNextInt()) {
            arrayList.add(in.nextInt());
        }

        System.out.printf("""
                Ввод массива завершен.
                Массив: %s
                Результат работы: %d
                """, arrayList, solution(arrayList, n));
        Test.test();
    }

    public static int solution(List<Integer> arrayList, int n) {
        if (!(n > 0)) return -1;

        List<int[]> subsequences = new ArrayList<>();

        for (int i = 0; i <= arrayList.size() - n; i++) {
            int[] nums = new int[Math.abs(n) * 2];
            for (int j = 0; j < n; j++) {
                nums[j] = i + j;
                nums[j+n] = arrayList.get(i + j);
            }
            subsequences.add(nums);
        }
        int[] counter = {0, -1}; // первый это максимальный, второй это номер первого элемента подпоследовательности
        for (int i = 0; i < subsequences.size(); i++) {
            int[] current_arr = subsequences.get(i);
            for (int j = 1; j  < subsequences.size(); j++) {
                int[] next_arr = subsequences.get(j);
                int counter_of_nums = 0;
                for (int k = n; k < n * 2; k++) {
                    if (current_arr[k] == next_arr[k] && next_arr[k-n] - current_arr[k-n] >= n) counter_of_nums++;
                    if (counter_of_nums > counter[0]) {
                        counter[0] = counter_of_nums;
                        counter[1] = i;
                    }
                }
            }
        }
        return counter[1];
    }
}
