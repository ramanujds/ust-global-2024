import java.time.Duration;
import java.time.LocalTime;

public class ThreadsSimplified {
    public static void main(String[] args) throws InterruptedException {

       MyFileDownloader downloader = new MyFileDownloader();

       new Thread(()-> downloader.downloadFile("File 1")).start();
       new Thread(()-> downloader.downloadFile("File 2")).start();
       new Thread(()-> downloader.downloadFile("File 3")).start();

    }
}


class MyFileDownloader {

    public void downloadFile(String fileName){
        System.out.println("Downloading file : " + fileName);
        for (int i = 1; i <= 100; i++) {
            System.out.println(fileName + " - " + i + "% Completed");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(fileName + " - Download Complete");
    }


}