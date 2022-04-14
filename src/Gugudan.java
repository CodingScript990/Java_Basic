import java.util.Scanner;

public class Gugudan {
  public static void main(String[] args) {
    System.out.println("2단");
    System.out.println(2 * 1);
    System.out.println(2 * 2);
    System.out.println(2 * 3);
    System.out.println(2 * 4);
    System.out.println(2 * 5);
    System.out.println(2 * 6);
    System.out.println(2 * 7);
    System.out.println(2 * 8);
    System.out.println(2 * 9);

    System.out.println("3단");
    // 3단
    int rs = 3 * 1;
    System.out.println(rs);

    // 4단
    System.out.println("4단");
    System.out.println("구구단 중 출력할 단은? : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("4단 : " + num * 1);
    System.out.println("4단 : " + num * 2);
    System.out.println("4단 : " + num * 3);
    System.out.println("4단 : " + num * 4);
    System.out.println("4단 : " + num * 5);
    System.out.println("4단 : " + num * 6);
    System.out.println("4단 : " + num * 7);
    System.out.println("4단 : " + num * 8);
    System.out.println("4단 : " + num * 9);

    // 5단 반복문
    // whiel문
    int i = 1;
    System.out.println("5단");
    while (i < 10) {
      System.out.println(5 * i);
      i += 1;
    }
    // 6단
    System.out.println("6단");
    // for문
    for (int g = 1; g < 10; g++) {
      System.out.println(6 * g);
    }
    // 7~9단
    // scanner funciton 을 활용
    System.out.println("구구단 중 출력할 단은? : ");
    Scanner sc2 = new Scanner(System.in);
    int num2 = sc2.nextInt();
    System.out.println("사용자가 입력한 값 : " + num2);

    // if ~ else로 예외를 제외한 True 값만 출력되게 하라!
    if (num2 < 2) {
      System.out.println("값을 잘 못 입력했습니다!");
    } else if (num2 > 9) {
      System.out.println("값을 잘 못 입력했습니다!");
    } else {
      for (int j = 1; j < 10; j++) {
        System.out.println(num2 * j);
      }
    }

  }
}
