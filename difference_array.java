import java.util.Scanner;

// import javax.naming.directory.SchemaViolationException;
// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
// import javax.swing.plaf.synth.SynthScrollBarUI;

public class difference_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        int[] arr3=new int[4];
        System.out.println("Enter first Array:");
        for(int i=0;i<4;i++)
        {
           arr1[i]=sc.nextInt();

        }
        System.out.println("Enter second Array:");
        for(int i=0;i<4;i++)
        {
           arr2[i]=sc.nextInt();

        }
        for(int i=0;i<4;i++)
        {
            arr3[i]=arr1[i]-arr2[i];
        }
        for(int i=0;i<4;i++)
        {
            System.out.println("Difference of two Array:");
        }
        for(int i=0;i<4;i++)
        {
            
        
       System.out.println(arr3[i]+" ");
        // System.out.println();
}
        
    }

    
}
