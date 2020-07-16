package arrayinsdel;
import java.util.Scanner;
/**
 *
 * @author Spy Hacker
 */
public class ArrayInsDel {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scObj = new Scanner(System.in);
       int a[] = new int[100];
       System.out.print("Enter the size of array: ");
       int size = scObj.nextInt();
        System.out.println("Enter the array of element: ");
       for (int i=0; i<size; i++){
           a[i] = scObj.nextInt();
       }
       //Insertion
        System.out.print("Array before insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.print("\nEnter the element to be inserted: ");
        int x = scObj.nextInt();
        System.out.print("Enter the position you want to insert: ");
        int pos = scObj.nextInt();
        for (int i = size; i > pos; i--) {
            a[i] = a[i-1];
        }
        a[pos] = x;
        ++size;
        System.out.print("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }
        
        //Deletion
        System.out.print("\nEnter the position to be delete: ");
        int delpos = scObj.nextInt();
        for (int i = delpos; i < size; i++) {
            a[i] = a[i+1];
        }
        --size;
        System.out.print("Array after delection: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }
        
    }
    
}
