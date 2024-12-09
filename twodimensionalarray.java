import java.util.*;
public class twodimensionalarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initilization of2d arry
        int a[][]={{1,2},{3,4}};
        //accesing 1d array in 2d array
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
    }
}
