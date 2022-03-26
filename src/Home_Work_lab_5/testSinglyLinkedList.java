package Home_Work_lab_5;

import java.util.Scanner;

public class testSinglyLinkedList {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList<String> L=new SinglyLinkedList<>();
        SinglyLinkedList<String> M=new SinglyLinkedList<>();
        int choice =-1;
        Scanner in=new Scanner(System.in);
        System.out.println("1: addFirst to L   ");
        System.out.println("2: addFirst to M");
        System.out.println("3: to concatenating M to L");
        System.out.println("4: header and tail of L");
        System.out.println("0: to exit");

        System.out.println("5:show the header and the tail of M ");
        while (choice!=0){
            System.out.println("your choice: ");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input the name");
                    L.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input the name");
                    M.addFirst(in.next());
                    break;
                case 3:
                    concatenating(L,M);
                    break;
                case 4:
                    System.out.println("--head is :  "+L.first() +"  Last is : "+L.last() +"  Size is :  "+L.size());
                    break;
                case 5:
                    System.out.println("--head is :  "+M.first() +"  Last is : "+M.last() +"  Size is :  "+M.size());
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }

    }

    public static void concatenating(SinglyLinkedList<String> L, SinglyLinkedList<String> M) throws Exception {
        if (M.isEmpty())throw new Exception("the M Empty");
        while (M.size()>0)
            L.addlast(M.removeFirst());
        System.out.println("Done");
    }
}
