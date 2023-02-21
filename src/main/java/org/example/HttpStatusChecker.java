package org.example;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
        public String getStatusImage(int code) {
                String imageUrl = "https://http.cat/" + code + ".jpg";
                try {
                        URL url = new URL(imageUrl);
                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        connection.setRequestMethod("GET");
                        int responseCode = connection.getResponseCode();
                        if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
                                throw new IOException("There is not image for HTTP status " + code);
                        }

                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
                return imageUrl;
        }
}
