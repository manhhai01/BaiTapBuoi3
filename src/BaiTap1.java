import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int maxNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên m: ");
        int m = scan.nextInt();
        System.out.print("Nhập số nguyên n: ");
        int n = scan.nextInt();
        maxNumber = m > n ? m : n;
        System.out.println("Số nguyên lớn nhất là: " + maxNumber);
    }
}
