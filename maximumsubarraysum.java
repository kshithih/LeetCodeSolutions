import java.util.Scanner;

public class maximumsubarraysum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int k = scan.nextInt();
        int[] A = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            A[i] = scan.nextInt();
        }
                int i=0;
                int j =0;
                int sum = 0;
                int maximum =Integer.MIN_VALUE;
                while( j<A.length){
                    sum = sum+A[j];
                    if((j-i+1) < k){

                        j++;

                    }
                    else if((j-i +1 )== k){
                        maximum = Math.max(sum ,maximum );
                        sum -= A[i];
                        j++;
                        i++;

                    }
                }
        System.out.println(maximum);;
            }
        }





