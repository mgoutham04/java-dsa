import java.util.Scanner;

public class characpattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int lines=1;lines<=n;lines++){
            for(int chars=1;chars<=lines;chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }

    }
}
