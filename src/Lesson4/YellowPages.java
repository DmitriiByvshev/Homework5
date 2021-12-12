package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class YellowPages {

    private HashMap<String, List<String>> book;

    public YellowPages(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format(number, surname));
            } else {
                System.out.println(String.format(number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format(number, surname));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        }
        return new ArrayList<>();
    }

}
