package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.index();
        ArrayList<Toy> priorityQueue = new ArrayList<>();

        for (int i = 0; i < request.index; i++) {
            priorityQueue.add(new Toy(i, request.requestNumToy(i)));
        }

        List<String> nameforf = new ArrayList<>();

        int j = 0;
        /**
         * отсартировка по выпавшим и не выпавшим игрушкам, те что не выпали удаляются из массива
         */
        while (j < priorityQueue.size()) {
            if (priorityQueue.get(j).result == false) {
                priorityQueue.remove(j);
                j = 0;
            } else {
                nameforf.add(priorityQueue.get(j).name);
                j++;
            }
        }
        /**
         * подведение итога, вывод всех тех игрушек что выпали или же уведомление о неудаче
         */
        if (priorityQueue.size() != 0) {
            for (Toy c : priorityQueue) {
                System.out.println("Вы выйграли: " + c.name);
            }
        } else System.out.println("Вы не выйграли ни одну игрушку.");
        /**
         * запись имен игрушек что выпали в текстовый файл
         */
        try {
            ObjectMapper mapper = new ObjectMapper();

            String fileName = "NameToy.json";

            mapper.writeValue(new File(fileName), nameforf);

        } catch (IOException e) {
            System.out.println("Возникла ошибка во время записи игрушек, проверьте данные.");
        }
    }


}