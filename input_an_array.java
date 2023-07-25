package ARRAYCC;
import java.util.*;
public class input_an_array {
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//maths
        System.out.println("phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        //To Update
        marks[2] = 100;
        System.out.println("maths: "+ marks[2]);

        //To Calculate Percentage
        int percentage = (marks[0] + marks[1] + marks[2]) /3;
        System.out.println("Percentage: "+ percentage + "%");
    }
}
// To calculate the length of an array we use arrayname.length like marks.length