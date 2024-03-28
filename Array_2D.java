import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        String[][] name;
        System.out.println("Enter the row size of the 2D Array:");
        int r = array.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int c = array.nextInt();
        array.nextLine();
        name = new String[r][c];
        System.out.println("Enter the Elements in the Array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                name[i][j] = array.nextLine();
            }
        }
        System.out.println("The Array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(" " + name[i][j]);
            }
        }
    }
}
