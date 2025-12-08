public class binotodec {
    public static void bintodec(int n){
        int pow=0;
        int mynum=n;
        int dec=0;
        while(n>0){
            int ld =n%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        System.out.print("binary no." + mynum + " is converted to decimal" + dec );

    }
    public static void main(String[] args) {
        bintodec(111);
    }
}
