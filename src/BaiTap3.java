import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập số c: ");
        int c = scanner.nextInt();

        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        System.out.println("Nhập lựa chọn: ");
        byte luaChon = scanner.nextByte();

        switch (luaChon) {
            case 1:
                sapXepTangDan(a, b, c);
                break;
            case 2:
                sapXepGiamDan(a, b, c);
                break;
                default:
                    System.out.println("Lựa chọn sai.");

        }

    }

    public static void sapXepTangDan(int a, int b, int c) {
        int temp;

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

        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Thứ tự tăng dần là: " + a + " " + b + " " + c);
    }

    public static void sapXepGiamDan(int a, int b, int c) {
        int temp;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a < c){
            temp = a;
            a = c;
            c = temp;
        }

        if(b < c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Thứ tự giảm dần là: " + a + " " + b + " " + c);
    }
}
