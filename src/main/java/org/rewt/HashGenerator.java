package org.rewt;

import java.security.SecureRandom;
import java.time.format.DateTimeFormatter;

public class HashGenerator {

    static final SecureRandom random = new SecureRandom();
    static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String generateHash() {
        byte[] bytes = new byte[16]; // 16 bytes = 128 bits
        random.nextBytes(bytes);

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

}
