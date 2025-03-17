
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class GhiDuLieuVaoTep {

    public static void main(String[] args) {
        String tenTep = "du_lieu_tu_ban_phim.txt"; 

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tenTep))) {

            System.out.println("Nhập dữ liệu từ bàn phím (nhập 'ketthuc' để dừng):");

            String dong;
            while (!(dong = br.readLine()).equalsIgnoreCase("ketthuc")) {
                bw.write(dong);
                bw.newLine(); 
            }

            System.out.println("Dữ liệu đã được ghi vào tệp thành công!");

        } catch (IOException e) {
            System.err.println("Lỗi ghi dữ liệu vào tệp: " + e.getMessage());
        }
    }
}