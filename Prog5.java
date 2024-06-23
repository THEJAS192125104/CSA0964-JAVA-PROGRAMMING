import java.util.Scanner;
    public class Prog5
    {
        public static void main(String[] args)
        {
            double pi = 3.14, area,r;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of circle: ");
            r = sc.nextDouble();
            area = pi * Math.pow(r,2);
            System.out.println("The area of the circle: "+area);
        }
    }
