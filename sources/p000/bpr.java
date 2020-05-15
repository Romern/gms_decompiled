package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: bpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpr {
    static {
        bpr.class.getSimpleName();
    }

    public bpr() {
        new SecureRandom();
    }

    /* renamed from: a */
    public static final byte[] m3474a(byte[] bArr, RSAPrivateKey rSAPrivateKey) {
        try {
            Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
            instance.init(1, rSAPrivateKey);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw cbb.m3877a(e);
        }
    }
}
