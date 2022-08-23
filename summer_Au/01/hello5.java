

import java.util.*;




public class hello5 {

  
  static void rock(){

    Scanner sc = new Scanner(System.in);

    

// 가위 1 바위 2 보 3
    System.out.print("가위바위보를 입력하시오(가위:1, 바위:2, 보:3  "); 

    int b = sc.nextInt();


    int a = (int)(Math.random() * 3) +1;

    System.out.println(a);

    if (b==1 & a==3){
      System.out.println("이겼습니다.");
   } 
    else if (b==2 & a==1){
      System.out.println("이겼습니다.");
  } 
    else if (b==3 & a==2){
      System.out.println("이겼습니다.");
   } 

    else if ((b==1 & a==1) | (b==2 & a==2) | (b==3 & a==3)){
      System.out.println("비겼습니다.");
    }
    else{
      System.out.println("졌습니다.");
    }




  }

/*

<경우의수>

이긴 경우
진 경우
비긴 경우





*/
  public static void main(String[] args){

    rock(); 





  }





}
