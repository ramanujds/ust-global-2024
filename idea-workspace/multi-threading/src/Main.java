import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread myThread1 = new Thread(new MyThread1());
        Thread myThread2= new Thread(new MyThread2());
        Thread myThread3= new Thread(new MyThread3());

        LocalTime time1 = LocalTime.now();

        myThread1.start();
        myThread2.start();
        myThread3.start();


        LocalTime time2 = LocalTime.now();

        var diff = Duration.between(time1, time2);
        var totalTime = diff.getSeconds();
        System.out.println("All files Downloaded");
        System.out.println("Time taken : " + totalTime);

    }
}

class MyThread1 implements Runnable {
    public void run() {
        FileDownloader downloader = new FileDownloader();
        try {
            downloader.downloadFile("File 1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        FileDownloader downloader = new FileDownloader();
        try {
            downloader.downloadFile("File 2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread3 implements Runnable {
    public void run() {
        FileDownloader downloader = new FileDownloader();
        try {
            downloader.downloadFile("File 3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class FileDownloader {

    public void downloadFile(String fileName) throws InterruptedException {
        System.out.println("Downloading file : " + fileName);
        for (int i = 1; i <= 100; i++) {
            System.out.println(fileName + " - " + i + "% Completed");
            Thread.sleep(100);
        }
        System.out.println(fileName + " - Download Complete");
    }


}