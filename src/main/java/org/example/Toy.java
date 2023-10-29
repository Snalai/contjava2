package org.example;

import java.util.Random;


public class Toy extends Request{
    Integer id;

    Integer freq;

    Boolean result;



    public Toy(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.result = chance();

    }


    public Integer getId() {
        return id;
    }

    public Integer getFreq() {
        return freq;
    }

    /**
     * Метод для определения выпадет ли игрушка введеная пользователь пользователю
     * @return возращает булевое значения выпала или не выпала игрушка
     */
    public boolean chance() {

        Random random = new Random();
        freq = random.nextInt(100);

        if (freq > weiInt()%100) return true;


        return false;
    }


    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", result=" + result +
                '}';
    }


}
