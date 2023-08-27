import java.util.Scanner;

public class QLTS {
    private static Scanner sc = new Scanner(System.in);



    public static float getAFloat(String inputMsg, String errorMsg) {
        float n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Float.parseFloat(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập vào một chuỗi kí tự, khác rỗng
    public static String getString(String inputMsg, String errorMsg) {
        String id;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();
            if (id.length() == 0 || id.isEmpty())
                System.out.println(errorMsg);
            else
                return id;
        }
    }


    public static void nhapDiemLietVaXet(){

        float diemChuan = getAFloat("Nhập điểm chuẩn: ","input so thuc");
        float mon1 = getAFloat("Nhập điểm môn 1: ", "input so thuc");
        float mon2 = getAFloat("Nhập điểm môn 2: ", "input so thuc");
        float mon3 = getAFloat("Nhập điểm môn 3: ", "input so thuc");
        float diemKhuVuc = diemKhuVuc();
        float diemDoiTuong = diemDoiTuong();
        boolean tinh = tinhDiemLiet(mon1, mon2,mon3, diemChuan, diemKhuVuc, diemDoiTuong);

        if (tinh){
            System.out.print("PASS");
        }
        else System.out.print("FAIL");
    }
    public static boolean tinhDiemLiet(float mon1, float mon2, float mon3, float diemchuan, float diemKhuVuc, float diemDoiTuong) {
        float avg = mon1 + mon2 + mon3;
        float result = avg + diemKhuVuc + diemDoiTuong;
        System.out.println("tong diem= " +result);
        if (result >= diemchuan) {
            return true;
        }
        return false;
    }


    public static float diemKhuVuc() {
        String khuvuc = getString("Nhập khu vực: ", "Nhập khu vực nào?");
        if (khuvuc.equalsIgnoreCase("a")) {
            return 2;
        }
        if (khuvuc.equalsIgnoreCase("b")) {
            return 1;
        }
        if (khuvuc.equalsIgnoreCase("c")) {
            return 0.5f;
        } else
            return 0;
    }




    public static float diemDoiTuong() {
        float doituong = getAFloat("Nhập đối tượng: ", "Nhập đối tượng nào?");
        if (doituong == 1) {
            return 2.5f;
        } else if (doituong == 2) {
            return 1.5f;
        } else if (doituong == 3) {
            return 1;
        }
        return 0;
    }
}
