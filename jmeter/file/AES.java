import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES {
        public static String getAES(String src, String key, String offset) throws Exception {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("utf-8"), "AES");
            // 算法/模式/补码方式
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            IvParameterSpec iv = new IvParameterSpec(offset.getBytes("utf-8"));
            int blockSize = cipher.getBlockSize();
            byte[] dataBytes = src.getBytes("utf-8");
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
            byte[] encrypted = cipher.doFinal(plaintext);
            // 使用BASE64转码
            return Base64.getEncoder().encodeToString(encrypted);
        }
    }

