import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] myArray=new int[9];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=33;
        myArray[3]=44;
        myArray[4]=56;
        myArray[5]=78;
        myArray[6]=66;
        myArray[7]=99;
        myArray[8]=1000;
        

        System.out.println(myArray); //prints only the memory references
        System.out.println(Arrays.toString(myArray));//prints the actual value stored
        //Forcing int to print as string values.
        //Arrays.toString() is a utility method in the Java java.util.Arrays class that converts an array into a readable string format.
    }
    
}
