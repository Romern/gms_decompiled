package p000;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bqud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqud implements bqnw {

    /* renamed from: a */
    private final SecretKey f141623a;

    /* renamed from: b */
    private final int f141624b;

    /* renamed from: c */
    private byte[] f141625c;

    /* renamed from: d */
    private byte[] f141626d;

    public bqud(byte[] bArr, int i) {
        bqwl.m113526a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.f141623a = new SecretKeySpec(bArr, "AES");
            this.f141624b = i;
            Cipher a = m113416a();
            a.init(1, this.f141623a);
            byte[] a2 = bqul.m113430a(a.doFinal(new byte[16]));
            this.f141625c = a2;
            this.f141626d = bqul.m113430a(a2);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    /* renamed from: a */
    private static Cipher m113416a() {
        return (Cipher) bqvo.f141689a.mo69341a("AES/ECB/NoPadding");
    }

    /* renamed from: a */
    public final byte[] mo69311a(byte[] bArr) {
        byte[] bArr2;
        Cipher a = m113416a();
        a.init(1, this.f141623a);
        int length = bArr.length;
        double d = (double) length;
        Double.isNaN(d);
        int max = Math.max(1, (int) Math.ceil(d / 16.0d));
        if (max * 16 == length) {
            bArr2 = bqup.m113433a(bArr, (max - 1) * 16, this.f141625c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
            int length2 = copyOfRange.length;
            if (length2 < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[length2] = Byte.MIN_VALUE;
                bArr2 = bqup.m113435b(copyOf, this.f141626d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = a.doFinal(bqup.m113433a(bArr3, 0, bArr, i * 16, 16));
        }
        byte[] b = bqup.m113435b(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f141624b];
        System.arraycopy(a.doFinal(b), 0, bArr4, 0, this.f141624b);
        return bArr4;
    }
}
