package Home_Work_Lab3;
import java.util.Scanner;
public class remove_from_Stack {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            ArratyStack<String> s=new ArratyStack<>(5);
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter element: ");
                s.push(in.next()) ;
            }
            System.out.println("Is it empty before removing ?  "+s.isEmpty());

            for (int i = 0; i <s.size()+4; i++) {
                s.pop();
            }
            System.out.println("Is it empty after removing ?  "+s.isEmpty());
        }
    }

