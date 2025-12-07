import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for(lines=1;lines<=10;lines++){
            for(int j=1;j<=lines;j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
