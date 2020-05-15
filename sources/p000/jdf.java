package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: jdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdf {

    /* renamed from: a */
    public static final byte[] f22218a = "V1 shared_key".getBytes(bmwy.f131158c);

    /* renamed from: a */
    public static SecretKey m16539a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            return instance.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m16540a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, secretKey);
            byte[] iv = instance.getIV();
            try {
                return bqce.m112562a(iv, instance.doFinal(bArr));
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new IllegalStateException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        } catch (NoSuchPaddingException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
