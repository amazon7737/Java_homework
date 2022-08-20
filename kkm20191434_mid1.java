import java.util.Scanner;

public class kkm20191434_mid1 {
  public static void main(String[] args) {
    
	  	
    Scanner in = new Scanner(System.in);		
    System.out.println("컴퓨터와 가위바위보 게임을 해봅시다! 그만하고싶으면 그만할래 하세요 처음 목숨값은 3개 입니다");
	  int live = 3;	
   
    // 가위 바위 보 루프 시작


    while(true) {
		  	
		  // 입력 받음
      System.out.print("\n 안내면 진다 가위, 바위, 보! \n");
			String hand = in.nextLine();
			
		  // 만약에 하기 싫다면?	
      if(hand.equals("그만할래")) {
				break;
        }

      

      //만약 이상한짓을 한다.
			if(!hand.equals("바위") && !hand.equals("가위") && !hand.equals("보")) {
        
				System.out.printf("뭐하는거야? \n\n ");

     }

        //무작위로 난수 발생( 0~ 2)까지
        int rand = (int)(Math.random()*3);
				
				

        //컴퓨터 난수에 따른 가위 바위 보 선정
        String com = "";
				if(rand == 0) {
					com = "바위";
				} else if(rand == 1) {
					com = "보";
				} else if(rand == 2) {
					com = "가위";
        }

        System.out.println("\n컴퓨터: " +com + "\n");
					
				

        //이기고 지고 무승부 선정
        //무승부
        if(hand.equals(com)) {
					System.out.printf("무승부 \n 목숨값: %d개 \n", live);
				} 
        // 이김
        else if((hand.equals("바위") && com.equals("가위")) || (hand.equals("가위") && com.equals("보")) || (hand.equals("보") && com.equals("바위"))) {
			
          live += 1;
          System.out.printf("니가 이겼어! \n 목숨값: %d개 \n", live);
        } 
        // 졌음
        else {
		      live -= 1;	
          System.out.printf("니가 졌어! \n 목숨값: %d개 \n\n", live);
          if(live == 0){
            break;
            }
        }


		}

	  // 게임 종료 출력문	
    System.out.println("게임 종료!");

  }
}
