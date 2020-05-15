package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: becu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class becu {
    /* renamed from: a */
    public static byte[] m91796a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            byte[] encoded = instance.generateKey().getEncoded();
            if (encoded != null) {
                return encoded;
            }
            throw new RuntimeException("Key bytes are null!");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m91797a(byte[] bArr, byte[] bArr2) {
        return m91798a(bArr, bArr2, 2);
    }

    /* renamed from: a */
    public static byte[] m91798a(byte[] bArr, byte[] bArr2, int i) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES/ECB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(i, secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeyException e3) {
            throw new RuntimeException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new RuntimeException(e4);
        } catch (BadPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }
}
