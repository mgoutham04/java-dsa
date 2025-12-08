public class binomial {
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bino(int n,int r){
         int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int binomial=a/(b*c);
        return binomial;
    }
    public static void main(String[] args) {
       System.out.println(bino(5,2));
        
    }
}
