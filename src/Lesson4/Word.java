package Lesson4;

import java.util.*;

public class Word {

    public static void main(String[] args){

        List<String> words = Arrays.asList(
                "Полуторный меч", "Палаш", "Рапира", "Катана", "Хопеш",
                "Сабля", "Палаш", "Гладиус", "Кортик", "Катана",
                "Кинжал", "Фальшион", "Катана", "Хопеш", "Полуторный меч",
                "Ятаган", "Дао", "Сабля", "Полуторный меч", "Полуторный меч"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Клинки");
        System.out.println(words.toString());
        System.out.println("Уникальные названия");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости в тексте");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

    }
}
