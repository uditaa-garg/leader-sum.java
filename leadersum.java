import java.util.Scanner;

public class leadersum {
     
    public static void main(String args[]){
        int sum=0,ldr;
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();


        }

         ldr = a[4];
        sum = sum +ldr;

        for(int j = 3;j>=0;j--){
            if(a[j]>ldr){
                ldr = a[j];
                sum = sum + ldr;
            }
        }
        System.out.println(sum);

    }
}
