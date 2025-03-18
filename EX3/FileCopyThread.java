import java.io.*;

public class FileCopyThread {

    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; 
        String destinationFilePath = "destination.txt";

        Thread copyThread = new Thread(() -> {
            try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
                 FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("Sao chép tệp thành công.");

            } catch (IOException e) {
                System.err.println("Lỗi sao chép tệp: " + e.getMessage());
            }
        });
        copyThread.start();

        try {
            copyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}