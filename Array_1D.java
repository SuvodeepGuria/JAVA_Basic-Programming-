import java.util.Scanner;
public class Array_1D {
    public static void main(String[] args){
//        array input by user
        Scanner array=new Scanner(System.in);
        int[] a;
        System.out.println("Enter the size of the Array:");
        int n=array.nextInt();
        a=new int[n];
        System.out.println("Enter the Elemwnts of the Array: ");

        for (int i=0;i<n;i++){
            a[i]=array.nextInt();
        }
        System.out.print("The Array is: ");
        for (int i=0;i<n;i++) {
            System.out.print(" "+a[i]);
        }
    }
}
