package Home_Work_Lab_1;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("Enter 5 Numbers");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <array.length; i++) {
            array[i]=input.nextInt();
        }
        System.out.println("The Numbers are : ");
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
