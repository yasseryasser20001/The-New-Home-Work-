package Home_Work_Lab_2;

import java.util.Arrays;

public class Clone_Array {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,4};
        System.out.println("The main array = " + Arrays.toString(x));

            int []y=new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i]=x[i];
    }
        System.out.println("The backup array = " + Arrays.toString(y));
}
}
