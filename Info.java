import java.util.*;
class Info
 {
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int test;
    String name,coursecode,coursename,register;
    System.out.println("enter the register no=");
    register=sc.nextLine();
    System.out.println("enter course code=");
    coursecode=sc.nextLine();
    System.out.println("enter course name=");
    coursename=sc.nextLine();
    System.out.println("enter name=");
    name=sc.nextLine();
    System.out.println("enter test marks=");
    test=sc.nextInt();
    System.out.println("register number="+register);
    System.out.println("course code="+coursecode);
    System.out.println("name of student="+name);
    System.out.println("course name="+coursename);
    System.out.println("test 1 marks="+test);
   }
}