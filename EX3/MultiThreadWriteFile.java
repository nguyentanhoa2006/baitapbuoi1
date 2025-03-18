import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MultiThreadWriteFile {

    public static void main(String[] args) {
        String filePath = "output.txt"; 
        String thread1String = "Luồng 1: Đây là chuỗi được ghi bởi luồng 1.\n";
        String thread2String = "Luồng 2: Đây là chuỗi được ghi bởi luồng 2.\n";
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            writeToFile(filePath, thread1String, lock);
        });
        Thread thread2 = new Thread(() -> {
            writeToFile(filePath, thread2String, lock);
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Đã ghi xong vào tệp.");
    }
    private static void writeToFile(String filePath, String content, Object lock) {
        synchronized (lock) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(content);
            } catch (IOException e) {
                System.err.println("Lỗi ghi tệp: " + e.getMessage());
            }
        }
    }
}