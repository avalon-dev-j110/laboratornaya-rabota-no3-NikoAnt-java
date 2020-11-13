package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>
 * Алгоритм сортировки. Может быть как устойчивый, так и неустойчивый. На
 * массиве из n элементов имеет время выполнения в худшем, среднем и лучшем
 * случае Θ(n2), предполагая что сравнения делаются за постоянное время.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка
 * выбором</a>
 */
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //представление первого элемента массива минимальным
            int min = array[i];
            int min_i = i;
            //поиск элемента,который меньше предположенного минимума
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            //проверка на элемент, меньший, чем на текущей позиции, если есть такой меняем их местами
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
            /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
             */
        }
    }
}
