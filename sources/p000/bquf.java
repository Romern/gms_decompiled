package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bquf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bquf implements bqwb {

    /* renamed from: a */
    private static final ThreadLocal f141627a = new bque();

    /* renamed from: b */
    private final SecretKeySpec f141628b;

    /* renamed from: c */
    private final int f141629c;

    /* renamed from: d */
    private final int f141630d;

    public bquf(byte[] bArr, int i) {
        bqwl.m113526a(bArr.length);
        this.f141628b = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f141627a.get()).getBlockSize();
        this.f141630d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f141629c = i;
    }

    /* renamed from: a */
    public final byte[] mo69330a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f141629c;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = bqwf.m113516a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f141629c);
            int i3 = this.f141629c;
            Cipher cipher = (Cipher) f141627a.get();
            byte[] bArr3 = new byte[this.f141630d];
            System.arraycopy(a, 0, bArr3, 0, this.f141629c);
            cipher.init(1, this.f141628b, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
