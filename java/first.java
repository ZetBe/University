import java.util.Scanner;

public class first {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0, num;
    do {
      System.out.println("���� ������ �Է��ϼ���: ");
      num = sc.nextInt();
      if (num % 2 == 0 && num > 0) {
        count += num;
      } else if (num <= 0) {
        break;
      }
    } while (true);

    System.out.println(count);
  }
}