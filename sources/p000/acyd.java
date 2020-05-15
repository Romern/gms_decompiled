package p000;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* renamed from: acyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acyd {

    /* renamed from: a */
    private final Cipher f61074a;

    /* renamed from: b */
    private final KeyPair f61075b;

    public acyd(Cipher cipher, KeyPair keyPair) {
        this.f61074a = cipher;
        this.f61075b = keyPair;
    }

    /* renamed from: a */
    public final SecretKey mo33236a(byte[] bArr, String str) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Secret key bytes must be set.");
        try {
            this.f61074a.init(4, this.f61075b.getPrivate());
            try {
                return (SecretKey) this.f61074a.unwrap(bArr, str, 3);
            } catch (InvalidKeyException e) {
                throw new IllegalArgumentException("Secret key bytes are not valid.", e);
            } catch (NoSuchAlgorithmException e2) {
                return null;
            }
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException("Bad input key.", e3);
        }
    }

    /* renamed from: a */
    public final byte[] mo33237a(SecretKey secretKey) {
        sdo.checkIfNull(secretKey, "Secret key must not be null.");
        try {
            this.f61074a.init(3, this.f61075b.getPublic());
            try {
                return this.f61074a.wrap(secretKey);
            } catch (IllegalBlockSizeException e) {
                throw new IllegalStateException("Cipher should request padding.", e);
            } catch (InvalidKeyException e2) {
                throw new IllegalArgumentException("The secret key is invalid.", e2);
            }
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException("Bad input key.", e3);
        }
    }
}
