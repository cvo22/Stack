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
// Стек на основе связного списка
 class Stack {

    // Внутренний класс для представления узла стека
    private static class Node {
        Object element;
        Node next;

        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    // Вершина стека
    private Node top;

    // Конструктор стека
    public Stack() {
        top = null;
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == null;
    }

    // Возвращает размер стека
    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Добавление элемента в стек
    public void push(Object element) {
        top = new Node(element, top);
    }

    // Извлечение элемента из стека
    public Object pop() {
        if (isEmpty()) {
            return null;
        }

        Object element = top.element;
        top = top.next;

        return element;
    }

    // Возвращает элемент, находящийся на вершине стека, не извлекая его
    public Object peek() {
        if (isEmpty()) {
            return null;
        }

        return top.element;
    }

    // Очистка стека
    public void clear() {
        top = null;
    }
}
