import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bai1
//        final int NUM_OF_VALUES = 5;  // Hằng số: số lượng số cần nhập
//        int sum = 0;                  // Biến tích lũy tổng các số
//        int value;                    // Biến để lưu giá trị từ bàn phím
//        Scanner scanner = new Scanner(System.in);
//
//        // Nhập 5 số từ bàn phím
//        for (int i = 1; i <= NUM_OF_VALUES; i++) {
//            System.out.print("Nhập số thứ " + i + ": ");
//            value = scanner.nextInt();
//            sum += value;  // Tích lũy tổng
//        }
//
//        scanner.close();  // Đóng Scanner sau khi sử dụng
//
//        // Tính giá trị trung bình
//        int average = sum / NUM_OF_VALUES;  // Chú ý phép chia nguyên
//
//        // In ra kết quả
//        System.out.println("Giá trị trung bình của " + NUM_OF_VALUES + " số là: " + average);

//Bai2
//        final int VND_PRICE = 23500;
//        int dollar_input;
//        int vnd_output;
//       Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập Dollar: ");
//        dollar_input= Integer.parseInt(scanner.nextLine());
//        vnd_output = VND_PRICE * dollar_input;
//        System.out.println("Số tiền VNĐ: " + vnd_output);

//bai3
      Scanner scanner = new Scanner(System.in);


        // Nhập tọa độ tâm đường tròn và bán kính
        System.out.print("Nhập tọa độ tâm C(xC,yC): ");
        double xC = scanner.nextDouble();
        double yC = scanner.nextDouble();
        System.out.print("Nhập bán kính R của đường tròn: ");
        double R = scanner.nextDouble();

        System.out.print("Nhập tọa độ của điểm M(xM,yM): ");
        double xM = scanner.nextDouble();
        double yM = scanner.nextDouble();
        // Tính khoảng cách từ điểm M đến tâm đường tròn
        double distance = Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));


        // So sánh khoảng cách với bán kính để xác định vị trí của điểm M
        if (distance < R) {
            System.out.println("M nằm bên trong C().");
        } else if (distance == R) {
            System.out.println("M nằm trên C()");
        } else {
            System.out.println("M nằm bên ngoài C().");
        }
    }
}