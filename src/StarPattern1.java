import java.util.Scanner;
public class StarPattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int numOfRows = scn.nextInt();

        for(int i=1;i<=numOfRows;i++){
            for(int j=1;j<=(numOfRows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
