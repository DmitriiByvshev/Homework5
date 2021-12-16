package Lesson5;

import java.io.*;

public class FileCsv {

    public static void main(String args[]){
        try ( PrintWriter writer = new PrintWriter(new File("src/test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Компаньо");
            sb.append(';');
            sb.append("Негоциант");
            sb.append(';');
            sb.append("Пилот");
            sb.append('\n');

            sb.append("100");
            sb.append(';');
            sb.append("200");
            sb.append(';');
            sb.append("123");
            sb.append('\n');

            sb.append("300");
            sb.append(';');
            sb.append("400");
            sb.append(';');
            sb.append("500");
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }



    }



}
