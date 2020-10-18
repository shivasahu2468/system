import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements : ");
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nElements in the array are : ");
        for (int a1 : arr){
            System.out.println(a1);
        }
        sc.close();
    }   
}