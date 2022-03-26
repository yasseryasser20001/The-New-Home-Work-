package Home_Work_Lab_2;
import java.util.Arrays;
import java.util.Random;
        public class Remove_Randomly {
            private int numOfElements;
            private int x[];
            public Remove_Randomly(int size){
                x=new int[size];
                numOfElements =size;
            }
            public int getNumOfElements() {
                return numOfElements;
            }
            public void setNumOfElements(int numOfElements) {
                this.numOfElements = numOfElements;
            }
            public int[] getX() {
                return x;
            }
            public void setX(int[] x) {
                this.x = x;
            }
            public int delete()
            {
                if (numOfElements >0)
                {
                    int random=random(x.length);
                    if (x[random-1]!=-1)
                    {
                        x[random-1]=-1;
                        numOfElements--;
                        return 0;
                    }
                    else {
                        return -1;
                    }



                }
                return -2;
            }
            public int random(int max)
            {
                Random random=new Random();
                return random.nextInt(max-1+ 1) +1;
            }

            public static void main(String[] args) {
                Remove_Randomly randomEntry =new Remove_Randomly(6);
                int []x={12,34,45,56,5,4};
                randomEntry.setX(x);


                int i=0;
                while (i<=5) {
                    if(randomEntry.delete()==0)
                    {
                        System.out.println("Delleted ");
                        i++;
                        System.out.println(Arrays.toString(randomEntry.x));
                    }
                    else {
                        if (randomEntry.getNumOfElements()==0){
                            System.out.println("Array of empte");
                            System.out.println(Arrays.toString(randomEntry.x));

                        }
                    }
                }
            }
        }

