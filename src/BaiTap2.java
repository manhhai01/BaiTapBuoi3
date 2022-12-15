import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhâp số c: ");
        int c = scanner.nextInt();

        int temp;

        // chuyển số bé nhất vào a
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        // chuyển số bé nhì vào b
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Thứ tự tăng dần là: " + a + " " + b + " " + c);
    }
}
