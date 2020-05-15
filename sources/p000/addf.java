package p000;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: addf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addf {

    /* renamed from: a */
    private static final byte[] f61431a = {1};

    static {
        m50202a("SecureMessage");
    }

    /* renamed from: a */
    private static void m50202a(String str) {
        try {
            MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("No security provider initialized yet?", e2);
        }
    }

    /* renamed from: a */
    private static byte[] m50203a(SecretKey secretKey, byte[] bArr) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            byte[] encoded = secretKey.getEncoded();
            if (encoded != null) {
                return instance.doFinal(encoded);
            }
            throw new InvalidKeyException("Cannot get encoded form of SecretKey");
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m50204a(SecretKey secretKey, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw null;
        } else if (bArr2 != null) {
            return m50205a(m50203a(secretKey, bArr), bArr2);
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    private static byte[] m50205a(byte[] bArr, byte[] bArr2) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            instance.update(bArr2);
            return instance.doFinal(f61431a);
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }
}
