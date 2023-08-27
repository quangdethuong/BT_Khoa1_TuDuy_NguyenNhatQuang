import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhTienThue {
    private static Scanner sc = new Scanner(System.in);


    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static byte getAnByte(String inputMsg, String errorMsg) {
        byte n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Byte.parseByte(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int nhapTongThuNhapMotNam() {
        int thuNhap = getAnInteger("Nhập thu nhập 1 năm của bạn: ", "Nhập lại");
        return thuNhap;
    }

    public static byte nhapSoNgPhuThuoc(){
        byte ng = getAnByte("Nhập số người phụ thuộc: ", "Nhập lại");
        return ng;
    }

    public static int thuNhapChiuThue() {
        return nhapTongThuNhapMotNam() - 4000000 - nhapSoNgPhuThuoc() + 1600000;
    }

    public static float thueSuat(int thuNhapChiuThue) {
        int mil = 1000000;
        if (thuNhapChiuThue >= 60) {
            return 0.05f;
        } else if (thuNhapChiuThue > 60 && thuNhapChiuThue <= 120) {
            return 0.1f;
        } else if (thuNhapChiuThue > 120 && thuNhapChiuThue <= 216) {
            return 0.15f;
        } else if (thuNhapChiuThue > 216 && thuNhapChiuThue <= 384) {
            return 0.2f;
        } else if (thuNhapChiuThue > 384 && thuNhapChiuThue <= 624) {
            return 0.2f;
        } else if (thuNhapChiuThue > 624 && thuNhapChiuThue <= 960) {
            return 0.3f;
        } else if (thuNhapChiuThue > 960) {
            return 0.35f;
        } else return 0;

    }
    public static String formatMillion(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedAmount = decimalFormat.format(amount);
        return formattedAmount + " triệu";
    }

    public static double tienThue(){
        int chiuThue= thuNhapChiuThue();
        double tongTien = chiuThue * thueSuat(chiuThue);
        return tongTien;
    }
}
