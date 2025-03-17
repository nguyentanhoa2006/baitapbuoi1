import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoDongVaoTep {

    public static void main(String[] args) {
        String tenTep = "ten_tep_cua_ban.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(tenTep))) {

            int soDong = 0;
            while (br.readLine() != null) {
                soDong++;
            }

            System.out.println("Số dòng trong tệp: " + soDong);

        } catch (IOException e) {
            System.err.println("Lỗi đọc tệp: " + e.getMessage());
        }
    }
}
