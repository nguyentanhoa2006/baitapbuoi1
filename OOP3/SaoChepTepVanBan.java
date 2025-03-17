
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaoChepTepVanBan {

    public static void main(String[] args) {
        String tepNguon = "nguon.txt"; 
        String tepDich = "dich.txt";   

        try (FileInputStream fis = new FileInputStream(tepNguon);
             FileOutputStream fos = new FileOutputStream(tepDich)) {

            int byteDocDuoc;
            while ((byteDocDuoc = fis.read()) != -1) {
                fos.write(byteDocDuoc);
            }

            System.out.println("Sao chép thành công!");

        } catch (IOException e) {
            System.err.println("Lỗi sao chép tệp: " + e.getMessage());
        }
    }
}


