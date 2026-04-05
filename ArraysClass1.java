import java.util.Arrays;
public class ArraysClass1 {
    public static void main(String[] args) {
        int arr1[] = {7,45,18,8,69,33,25};
        int arr2[] = {7,45,18,8,69,33,25};
        for(int a:arr1){
            System.out.print(a+" ");
        }
        System.out.println();
        String s = Arrays.toString(arr1);
        // Converts Array into string
        System.out.println(Arrays.toString(arr1));
        // to sort the arrays into ascending order
        // Arrays.sort(arr1);
        //sort array with start and end index
        Arrays.sort(arr1, 0, 5);
        System.out.println(Arrays.toString(arr1));
        //fill arrays with particular values
        Arrays.fill(arr1,7);
        System.out.println(Arrays.toString(arr1));
        // Create a copy of arrays
        int newArray[] = Arrays.copyOf(arr1,15);
        System.out.println(Arrays.toString(newArray));
        //to search for a particular element
        System.out.println(Arrays.binarySearch(arr1,2));
        //to check the equality of two arrays
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
