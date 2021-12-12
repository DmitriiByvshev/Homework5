package Lesson4;

public class Search {

        public static void main(String[] args){
            System.out.println("Справочник");
            YellowPages phonebook = new YellowPages();
            System.out.println("-----------------");

            System.out.println("Номера");
            phonebook.add("Иванов", "9311234578");
            phonebook.add("Иванов", "9098524693");
            phonebook.add("Петров", "9214758693");
            phonebook.add("Сидоров", "914528795");
            phonebook.add("Иванов", "9154785124");
            System.out.println("-----------------");

            System.out.println("Фамилии и номера");
            System.out.println("Иванов");
            System.out.println(phonebook.get("Иванов"));
            System.out.println("Петров");
            System.out.println(phonebook.get("Петров"));
            System.out.println("Сидоров");
            System.out.println(phonebook.get("Сидоров"));
            System.out.println("-----------------");

        }
}
