import java.util.Scanner;



public class hello3 {


  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하시오:");

    int a = sc.nextInt();

    if (a==0){
     System.out.println("0입니다.");
}
    else if (a>0){
     System.out.println("양수입니다.");
}    

    else{
      System.out.println("음수입니다.");
    }





  }





}
