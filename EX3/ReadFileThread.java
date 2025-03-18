import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileThread {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; 
        Thread fileReaderThread = new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Lỗi đọc tệp: " + e.getMessage());
            }
        });
        fileReaderThread.start();

        try {
            fileReaderThread.join();
            System.out.println("Đã đọc xong tệp.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}