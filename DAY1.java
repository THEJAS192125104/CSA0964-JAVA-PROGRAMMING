1)program to print even or odd number.
  
import java.util.Scanner;
public class prog {
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            {
                System.out.println("Enter the string");
                String n= scanner.next();
                int a=n.length();
                        if(a%2==0)
                        {
                            System.out.println("Even string");
                        }
                        else {
                            System.out.println("odd strings");
                        }
            }
        }
    }

2)Exception handling
    public class SampleException {
    public static void main(String arg[]) {

        try {
            int a = 7;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(" get back");
        }
    }
}
3)integer and float data type
    
    public class Greater {
    public static void main(String[] arg)
    {
        int a=5;
        float f=3.8;
        if(a>f)
        {
            System.out.println("greater");
        }
    }
}
4)given two string are same
    
    import java.util.Scanner;
public class Equal {
    public static void main(String[] arg)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the first String");
      String s1= scanner.next();
      System.out.println("Enter the second string");
      String s2= scanner.next();
      if(s1.equals(s2))
      {
          System.out.print("Same string");
      }
      else{
          System.out.print("Not same");
      }
    }
}

5)palindrome using reverse function
    
    public class Palindrome {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}



