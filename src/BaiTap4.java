import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên có 2 chữ số: ");
        int soNguyen = scanner.nextInt();
        if((soNguyen >= 10 && soNguyen <= 99) || (soNguyen >= -99 && soNguyen <= -10)) {
            System.out.println("Cách đọc: " + xuatDau(soNguyen) + xuatHangChuc(soNguyen) + xuatHangDonVi(soNguyen));
        } else {
            System.out.println("Nhập vào số có 2 chữ số");
        }
    }

    public static String xuatDau(int soNguyen) {
        return soNguyen >= 0 ? "" : "Âm ";
    }

    public static String xuatHangChuc(int soNguyen) {
        soNguyen = Math.abs(soNguyen);
        int hangChuc = soNguyen / 10;
        switch (hangChuc) {
            case 1: return "Mười ";
            case 2: return "Hai mươi ";
            case 3: return "Ba mươi ";
            case 4: return "Bốn mươi ";
            case 5: return "Năm mươi ";
            case 6: return "Sáu mươi ";
            case 7: return "Bảy mươi ";
            case 8: return "Tám mươi ";
            case 9: return "Chín mươi ";
        }
        return "";
    }

    public static String xuatHangDonVi(int soNguyen) {
        soNguyen = Math.abs(soNguyen);
        int hangDonVi = soNguyen % 10;
        switch (hangDonVi) {
            case 1: return "một ";
            case 2: return "hai ";
            case 3: return "ba ";
            case 4: return "bốn ";
            case 5: return "lăm ";
            case 6: return "sáu ";
            case 7: return "bảy ";
            case 8: return "tám ";
            case 9: return "chín ";
        }
        return "";
    }
}
