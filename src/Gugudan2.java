public class Gugudan2 {
  // 9단까지 배열로 받아서 출력하기(배열)
  public static void main(String[] args) {
    int[] rs = new int[9];

    for (int i = 0; i < rs.length; i++) {
      rs[i] = 2 * (i + 1);
    }

    for (int j = 0; j < rs.length; j++) {
      System.out.println(rs[j]);
    }
  }

}
