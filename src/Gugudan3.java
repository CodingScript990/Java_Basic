public class Gugudan3 {
  // caculate mathod
  public static int[] caculate(int num) {
    int[] rs = new int[9];
    for (int i = 0; i < rs.length; i++) {
      rs[i] = num * (i + 1);
    }
    return rs;
  }

  // print gugudan mathod
  public static void print(int[] rs) {
    for (int i = 0; i < rs.length; i++) {
      System.out.println(rs[i]);
    }
  }

  public static void main(String[] args) {
    // 1 ~ 9단까지 출력하기(메소드)
    for (int i = 1; i < 10; i++) {
      System.out.println(i + "단");
      int[] rs = caculate(i);
      print(rs);
      System.out.println(" ");
    }

  }
}
