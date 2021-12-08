package Lesson3;

public class Substitution{

    public static void main(String[] args) {
        int [] intArray= new int [] {2, 4};
        int l= intArray[0];
        int r= intArray[1];
        System.out.println("right :" + l + " " + r);
        substitution(intArray, intArray[0], intArray[1]);
        System.out.println("left :" + intArray[0] + " " + intArray[1]);
    }

    public static void substitution (int[] intArray, int l, int r){
        l = intArray[0];
        r = intArray[1];
        intArray[1] = l;
        intArray[0] = r;
        return;
    }

}


