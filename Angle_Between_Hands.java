import java.util.*;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n,h="",m="";
        double H,M,hh,mm;
        n=sc.next();
        char[] ch= n.toCharArray();
        for(int i=0;i<2;i++)
        {
            h+=ch[i];
        }
        for(int i=3;i<5;i++)
        {
            m+=ch[i];
        }
        hh= Integer.parseInt(h);
        mm= Integer.parseInt(m);
        H=0.5*(hh*60+mm);
        M=6*mm;
        double angle = Math.abs(H-M);
        angle=Math.min(360-angle,angle);
        System.out.println(angle);
        
        
        
    }
}