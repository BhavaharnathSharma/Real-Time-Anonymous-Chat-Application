import java.io.*;
import java.util.*;

public class FileEncryption {
    private static final int KEY = 3; // Simple Caesar Cipher shift

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) result.append((char) (c + KEY));
        return result.toString();
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) result.append((char) (c - KEY));
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to encrypt:");
        String input = sc.nextLine();
        String encrypted = encrypt(input);
        String decrypted = decrypt(encrypted);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
