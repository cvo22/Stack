/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Гамаюнов Иван
 */
//import stack.Stack;

public class Main {

    public static void main(String[] args) {
        // Создание стека
        Stack stack = new Stack();

        // Добавление элементов в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Проверка, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty());

        // Возвращает размер стека
        System.out.println("Размер стека: " + stack.size());

        // Извлечение элемента из стека
        System.out.println("Извлеченный элемент: " + stack.pop());

        // Возвращает элемент, находящийся на вершине стека, не извлекая его
        System.out.println("Элемент на вершине стека: " + stack.peek());

        // Очистка стека
        stack.clear();

        // Проверка, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty());
    }
}
