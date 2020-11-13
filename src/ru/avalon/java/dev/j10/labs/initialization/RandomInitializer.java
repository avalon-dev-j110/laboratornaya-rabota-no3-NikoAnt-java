package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива значениями
 * последовательности случайных чисел.
 *
 * <p>
 * Экземпляры класса можно использовать многократно для инициализации любого
 * числа массивов.
 *
 * <p>
 * Диапазон, в пределах которого будут получены случайные значения, передаётся в
 * конструктор класса при инициализации.
 */
public class RandomInitializer implements Initializer {

    private int a;
    private int b;

    public RandomInitializer(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Выполняет инициализацию массива, значениями последовательности случайных
     * чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //элементы массива будут созданы рандомно на интервале от -50 до 50
            array[i] = (int) (Math.random() * (b-a) + a);
        }

        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
}
