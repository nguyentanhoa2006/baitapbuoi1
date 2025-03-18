import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FileReadAndWordCount {

    public static void main(String[] args) {
        String filePath = "input.txt"; 
      BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Thread fileReaderThread = new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    queue.put(line); 
                }
                queue.put("EOF"); 
            } catch (IOException | InterruptedException e) {
                System.err.println("Lỗi đọc tệp: " + e.getMessage());
            }
        });

        // Luồng xử lý dữ liệu (đếm số từ)
        Thread wordCountThread = new Thread(() -> {
            int wordCount = 0;
            try {
                String line;
                while (!(line = queue.take()).equals("EOF")) {
                    String[] words = line.split("\\s+"); 
                    wordCount += words.length;
                }
                System.out.println("Tổng số từ: " + wordCount);
            } catch (InterruptedException e) {
                System.err.println("Lỗi xử lý dữ liệu: " + e.getMessage());
            }
        });
        fileReaderThread.start();
        wordCountThread.start();
        try {
            fileReaderThread.join();
            wordCountThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}