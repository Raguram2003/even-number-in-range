import java.util.Arrays;
import java.util.Scanner;


public class EvenNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array_1 element : ");
        int size_1 = sc.nextInt();
        int[] arr = new int[size_1];
        System.out.print("Enter the array Element : ");
        for(int i=0;i<size_1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the array_2 element : ");
        int size_2 = sc.nextInt();
        int[][] array= new int[size_2][2];
        for(int i=0;i<size_2;i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[] ans = new int[size_2];
        for(int i=0;i<size_2;i++){
            int count=0;
            int a=array[i][0];
            int b=array[i][1];
            for(int j=a;j<=b;j++){
                if(arr[j]%2==0){
                    count++;
                }
            }
            ans[i] =count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
