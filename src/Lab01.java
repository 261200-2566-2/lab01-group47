import java.util.Scanner;
import java.util.Arrays;

public class Lab01 {
    public  static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("n: ");
        int n = s.nextInt();
        if(n < 0){
            System.out.print("ERROR!");
        }
        else if(n >= 0){
            int [] number = new int [n];
            for(int i=0 ; i<n ; i++){
                System.out.print("Enter number: ");
                int num2 = s.nextInt();
                number[i] = num2;
            }
            sortNum(number);


        }

    }
    private static void sortNum(int[] number){
        Arrays.sort( number );
        for(int x : number){
            System.out.println(x);
        }
    }



}