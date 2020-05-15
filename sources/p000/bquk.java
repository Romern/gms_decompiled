package p000;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bquk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bquk implements bqng {

    /* renamed from: a */
    private static final ThreadLocal f141637a = new bquj();

    /* renamed from: b */
    private final SecretKey f141638b;

    public bquk(byte[] bArr) {
        bqwl.m113526a(bArr.length);
        this.f141638b = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo69281a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = bqwf.m113516a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } catch (ClassNotFoundException e) {
                if (bqwk.m113521a()) {
                    algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ((Cipher) f141637a.get()).init(1, this.f141638b, algorithmParameterSpec);
            if (bArr2.length != 0) {
                ((Cipher) f141637a.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) f141637a.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo69282b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
