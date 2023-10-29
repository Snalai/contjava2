package org.example;

import java.util.Scanner;

public class Request {

    Integer index;
    String name;
    Integer weightInt = 0;

    /**
     * Метод index() запрашивает упользоваетля с колько игрушек он хочет попробовать разыграть
     * @return index возвращает колличество игрушек введеное пользоваетелем
     * @return index() заново вызывает метод при ошибочно введённых данных
     */
    public int index() {
        System.out.println("Сколько игрушек желаете разыграть?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return index = scanner.nextInt();

        } else System.out.println("Введите нужный тип данных.");

        return index();
    }

    /**
     * Метод для выбора имени для той игрушки которую он хочет разиграть
     * @param i посчёт для того, чтобы полльзователь знал какую он игрушку добавил уже по счёту
     * @return возвращает имя игрушки
     */
    public String requestNumToy(int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как называется ваша " + (i + 1) + " игрушка?");
        if (scanner.hasNextLine()) {
            return name = scanner.nextLine();
        } else System.out.println("Введите нужный тип данных.");

        return requestNumToy(i);
    }

    /**
     * Метод для определения веса для игрушки чем она тяжелее тем меньше шансов её достать
     * @return возвращает вес целым числом
     */
    public int weiInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой вес имеет ваша игрушка? Введите вес целым числом.");
        if (scanner.hasNextInt()) {
            return weightInt = scanner.nextInt();

        } else System.out.println("Введите нужный тип данных.");

        return weiInt();
    }


}
