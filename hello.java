import java.util.Scanner;



public class hello {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("정수 A를 입력하시오: ");
    int a = sc.nextInt(); 

    System.out.print("정수 B를 입력하시오: ");
    int b = sc.nextInt(); 

    sc.close();

    int c = a+b;
    int d = a-b;

    System.out.print("A + B = " + c);
    System.out.print("  A - B = " + d);




  }


  }


