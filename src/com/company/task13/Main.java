package com.company.task13;

import java.util.Arrays;

/**
 * Задание 1.
 * Создать и проинициализировать массив String[] fruits.
 * Заполнить его названиями ваших любимых фруктов (5-10 елементов).
 * <p>
 * Задание 2.
 * Скопировать все данные из массива String[] fruits в новый массив String[] food.
 * Для копирования используйте, метод утилитного класса Arrays.
 * <p>
 * Задание 3.
 * Выведите все элементы массива food на экран. Примечание каждый элемент вывести на новой строке.
 */

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Яблоко", "Груша", "Слива", "Апельсин", "Мандарин"};

        String[] copy = Arrays.copyOf(fruits, fruits.length);

        for (String food : fruits) {
            System.out.println(food);
        }
    }
}