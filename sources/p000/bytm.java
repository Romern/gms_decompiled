package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: bytm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytm {

    /* renamed from: a */
    private final SecretKey f167684a;

    /* renamed from: b */
    private final SecretKey f167685b;

    public bytm(SecretKey secretKey, SecretKey secretKey2) {
        if (!"AES".equals(secretKey.getAlgorithm())) {
            String valueOf = String.valueOf(secretKey.getAlgorithm());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid AES key algorithm: ") : "Invalid AES key algorithm: ".concat(valueOf));
        } else if (!"HmacSHA1".equals(secretKey2.getAlgorithm())) {
            String valueOf2 = String.valueOf(secretKey2.getAlgorithm());
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid HMAC key algorithm: ") : "Invalid HMAC key algorithm: ".concat(valueOf2));
        } else {
            byte[] encoded = secretKey.getEncoded();
            byte[] encoded2 = secretKey2.getEncoded();
            if (!(encoded == null || encoded2 == null)) {
                if (encoded.length < 16) {
                    throw new IllegalArgumentException("AES key too short");
                } else if (encoded2.length < 16) {
                    throw new IllegalArgumentException("HMAC key too short");
                } else if (MessageDigest.isEqual(encoded, encoded2)) {
                    throw new IllegalArgumentException("AES and HMAC keys should not be the same");
                }
            }
            this.f167684a = secretKey;
            this.f167685b = secretKey2;
        }
    }

    /* renamed from: a */
    public final Cipher mo74503a(int i, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 8);
            instance.init(i, this.f167684a, new IvParameterSpec(bArr2));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final byte[] mo74505b(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(this.f167685b);
            return Arrays.copyOf(instance.doFinal(bArr), 8);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo74504a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[(length + 8)];
            byte[] b = mo74505b(bArr);
            System.arraycopy(b, 0, bArr2, 0, 8);
            mo74503a(1, b).doFinal(bArr, 0, length, bArr2, 8);
            return bArr2;
        } catch (BadPaddingException | IllegalBlockSizeException | ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
