package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    private static int sum(int[] array) {//алгоритм для подсчета суммы элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static final String ANSI_RED = "\u001B[31m";//красный
    public static final String ANSI_GREEN = "\u001B[32m";//зеленый
    public static final String ANSI_YELLOW = "\u001B[33m";//желный
    public static final String ANSI_BLUE = "\u001B[34m";//синий
    public static final String ANSI_PURPLE = "\u001B[35m";//
    public static final String ANSI_CYAN = "\u001B[36m";//

    public static void main(String[] args) {
        /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
         */
        int[] array = new int[20];
        System.out.println("");
        /* 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
         */
        new FibonacciInitializer().initialize(array);
        System.out.println(ANSI_RED + "Массив Фибоначчи " + Arrays.toString(array));
        System.out.println("");
        /* 2. Найти сумму элементов массива.
         */
        System.out.println(ANSI_GREEN + "Сумма элементов массива = " + sum(array));
        System.out.println("");

        /* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
         */
        new RandomInitializer(-50, 50).initialize(array);
        System.out.println(ANSI_PURPLE + "Рандомный массив №1 " + Arrays.toString(array));
        System.out.println("");
        /* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
         */
        new BubbleSort().sort(array);
        System.out.println(ANSI_CYAN + "Сортировка массива пузырьковым методом " + Arrays.toString(array));
        System.out.println("");
        /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        new RandomInitializer(-50, 50).initialize(array);
        System.out.println(ANSI_PURPLE + "Рандомный массив №2 " + Arrays.toString(array));
        System.out.println("");
        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */
        new SelectionSort().sort(array);
        System.out.println(ANSI_YELLOW + "Сортировка массива методом выбор " + Arrays.toString(array));
        System.out.println("");
        /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        new RandomInitializer(-50,50).initialize(array);
        System.out.println(ANSI_PURPLE + "Рандомный массив №3 " + Arrays.toString(array));
        System.out.println("");
        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
         */
        new ShellSort().sort(array);
        System.out.println(ANSI_BLUE + "Сортировка массива методом Шелла " + Arrays.toString(array));
        System.out.println("");
    }
}
