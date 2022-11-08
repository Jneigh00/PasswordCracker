import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Tester {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String toEncrypt = "0alice1!";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(toEncrypt.getBytes(StandardCharsets.UTF_8));
        byte[] toEncryptBytes = md.digest();
        System.out.println( Base64.getEncoder().encodeToString(toEncryptBytes));
    }

}
