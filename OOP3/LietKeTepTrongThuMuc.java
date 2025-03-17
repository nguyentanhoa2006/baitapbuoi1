import java.io.File;

public class LietKeTepTrongThuMuc {

    public static void main(String[] args) {
        String duongDanThuMuc = "duong_dan_thu_muc_cua_ban"; 

        File thuMuc = new File(duongDanThuMuc);

        if (thuMuc.exists() && thuMuc.isDirectory()) {
            File[] danhSachTep = thuMuc.listFiles();

            if (danhSachTep != null) {
                System.out.println("Danh sách tệp trong thư mục " + duongDanThuMuc + ":");
                for (File tep : danhSachTep) {
                    if (tep.isFile()) {
                        System.out.println(tep.getName());
                    }
                }
            } else {
                System.out.println("Thư mục trống hoặc không thể đọc được.");
            }
        } else {
            System.out.println("Đường dẫn không hợp lệ hoặc không phải là thư mục.");
        }
    }
}