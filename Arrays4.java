import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for(int i =0 ; i<row; i++){
            for(int j = 0 ; j< column ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int a[]:arr){  // For each loop
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
    }   
    sc.close(); 
    }
}
