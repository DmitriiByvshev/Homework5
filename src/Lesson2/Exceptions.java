package Lesson2;

public class Exceptions {
    
    
    public static void main(String[] args) {
        
        String[][] arr = new String[][]{{"1", "@", "3", "4"}, {"2", "2", "a", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = mass(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int mass(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 5;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

    private static class MyArraySizeException extends Exception {
    }

    private static class MyArrayDataException extends Exception {int i;
        int j;

        public MyArrayDataException(int i, int j) {
        }
    }
}
