import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r,a;
        r=sc.nextInt();
        a=3.14*r*r;
        System.out.printf("%.2f",a);
    }
}