package Home_Work_Lab_1;

import java.util.Scanner;

public class InputOutputArrayToMethod {
    public static void out_array (int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void in_array(int[]array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <array.length; i++) {
            array[i]=input.nextInt();
        }
    }

    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("Enter 5 Numbers");

      in_array(array);
      out_array(array);
    }
}
