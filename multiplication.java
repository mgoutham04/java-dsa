package basicsandpatterns;
public class multiplication {
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=2;
        int b=10;
        int prod=product(a, b);
        System.out.println(prod);
    }
}
