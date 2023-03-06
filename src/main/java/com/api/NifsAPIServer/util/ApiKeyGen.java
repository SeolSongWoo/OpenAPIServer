package com.api.NifsAPIServer.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;

class ApiKeyGen {

    private final String AES_ALGORITHM = "AES";
    private final String AES_TRANSFORMATION = "AES/ECB/PKCS5Padding";

    private final String ENCRYPTION_KEY = "geosyssr123!!@@#"; // Replace with your own secret key

    public void createKey() throws Exception {
// Generate a 256-bit AES encryption key using a secure random number generator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        keyGenerator.init(256, secureRandom);
        SecretKey encryptionKey = keyGenerator.generateKey();

// Encrypt the API key using the encryption key
        String apiKey = "geosr@nifs!@";
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, encryptionKey);
        byte[] encryptedBytes = cipher.doFinal(apiKey.getBytes("UTF-8"));
        String encryptedApiKey = Base64.getEncoder().encodeToString(encryptedBytes);

// Base64-encode the encrypted API key and return it to the client
        String encodedApiKey = Base64.getEncoder().encodeToString(encryptedApiKey.getBytes("UTF-8"));
        System.out.println("Encoded API key: " + encodedApiKey);
    }

}