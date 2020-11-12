package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>
 * Алгоритм сортировки, являющийся усовершенствованным вариантом сортировки
 * вставками. Идея метода Шелла состоит в сравнении элементов, стоящих не только
 * рядом, но и на определённом расстоянии друг от друга. Иными словами — это
 * сортировка вставками с предварительными «грубыми» проходами. Аналогичный
 * метод усовершенствования пузырьковой сортировки называется сортировка
 * расчёской.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка
 * Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        for (int step = array.length / 2; step > 0; step /= 2) {//разделение массива на два одинаковых промежутка
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    //перестановка элементов по нарастающему значению
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }//close sort
}//close ShellSort
