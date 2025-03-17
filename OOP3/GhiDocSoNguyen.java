import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiDocSoNguyen {

    public static void main(String[] args) {
        String tenTep = "so_nguyen.dat"; 
        int[] danhSachSo = {10, 20, 30, 40, 50};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(tenTep))) {
            for (int so : danhSachSo) {
                dos.writeInt(so); 
            }
            System.out.println("Đã ghi danh sách số nguyên vào tệp.");
        } catch (IOException e) {
            System.err.println("Lỗi ghi tệp: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(tenTep))) {
            System.out.println("Đọc lại danh sách số nguyên từ tệp:");
            while (dis.available() > 0) { 
                int soDocDuoc = dis.readInt(); 
                System.out.println(soDocDuoc);
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc tệp: " + e.getMessage());
        }
    }
}