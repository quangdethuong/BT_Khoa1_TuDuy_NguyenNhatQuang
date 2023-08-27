import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Thực thi bài 1");
            System.out.println("2. Thực thi bài 2");
            System.out.println("3. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    QLTS.nhapDiemLietVaXet();

                    break;
                case 2:

                    double tienThue = TinhTienThue.tienThue();
                    String formattedTienThue = TinhTienThue.formatMillion(tienThue);
                    System.out.println("Số tiền thuế mà bạn phải đóng: " + formattedTienThue);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }


        }
    }
}