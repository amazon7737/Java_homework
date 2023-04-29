import java.util.Scanner;
// switch 버전
public class kkm20191434_mid2{
    public static void main(String[] args){
      


      Scanner in = new Scanner(System.in);
      System.out.println("컴퓨터와 가위바위보 게임을 해봅시다! 그만하고싶으면 그만할래 하세요 처음 목숨값은 3개 입니다가위: 1, 바위:2, 보:3");
      int live = 3;

     //가위바위보 for 루프

      
     for(;;){
      
      System.out.print("\n 안내면 진다 가위(1), 바위(2), 보(3)! \n");
      int hand = in.nextInt();
      String handString =""; 


      //가위바위보 switch
      switch (hand) {
        case 1: 
             handString = "가위";
             break;
        case 2: 
             handString = "바위";
             break; 
        case 3: 
             handString = "보";
             break;
}
      
      // 4를 입력하면 게임 종료!
      if (hand == 4){
        break;
      }

      //무작위로 난수 발생(0~2)까지
      int rand = (int)(Math.random()*3);
      
      // 컴퓨터 난수에 가위바위 보 선정
      String com = "";
      if(rand == 0){
        com = "바위";
      }else if(rand == 1){
        com = "보";
      }else if(rand == 2){
        com = "가위";
      }

      System.out.println("\n컴퓨터: " + com + "\n");

      //이기고 지고 무승부 선정

      //무승부
      if(handString.equals(com)){
        System.out.printf("무승부 \n 목숨값: %d개 \n", live);
      }
      //이김
      else if((handString.equals("바위")&& com.equals("가위")) || (handString.equals("가위") && com.equals("보")) || (handString.equals("보") && com.equals("바위"))){
      live += 1;
      System.out.printf("니가 이겼어! \n 목숨값: %d개 \n", live);
      }
      //졌음 
      else{
        live -=1;
        System.out.printf("니가 졌어! \n 목숨값: %d개 \n\n", live);
        if(live == 0){
          break;
          }
        }


}

  System.out.println("게임 종료!");
  }
}







