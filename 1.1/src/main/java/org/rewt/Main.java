package org.rewt;

import java.time.LocalDateTime;

public class Main {
    static void main() throws InterruptedException {

        while (true) {
            String timestamp = LocalDateTime.now().format(HashGenerator.formatter);
            String hash = HashGenerator.generateHash();

            System.out.println(timestamp + " - " + hash);

            Thread.sleep(5000);
        }

    }
}
