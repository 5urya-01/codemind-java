import java.util.Scanner;
public class area_of_triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,at,art;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        at=(n1+n2+n3)/2;
        art=Math.sqrt(at*(at-n1)*(at-n2)*(at-n3));
        System.out.printf("%.2f",art);
    }
}