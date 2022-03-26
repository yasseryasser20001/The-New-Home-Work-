package Home_Work_Lab_1;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Student [] team = new Student[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Id then the name of each student");
        for (int i = 0; i <team.length ; i++) {
            Student s=new Student(input.nextInt(),input.next());
            team[i]=s;
        }
        for (int i = 0; i <team.length; i++) {
            System.out.println(team[i].toString());
        }
    }
}
