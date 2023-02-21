package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner scanner = new Scanner(System.in);
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        System.out.println("Enter HTTP status code");
        String line = scanner.nextLine().trim();
        try {
            int code = Integer.parseInt(line);
            downloader.downloadStatusImage(code);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid number");
        }
        scanner.close();
    }

}
