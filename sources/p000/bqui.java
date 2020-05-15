package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bqui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqui implements bqng {

    /* renamed from: a */
    private static final ThreadLocal f141631a = new bqug();

    /* renamed from: b */
    private static final ThreadLocal f141632b = new bquh();

    /* renamed from: c */
    private final byte[] f141633c;

    /* renamed from: d */
    private final byte[] f141634d;

    /* renamed from: e */
    private final SecretKeySpec f141635e;

    /* renamed from: f */
    private final int f141636f;

    public bqui(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f141636f = i;
            bqwl.m113526a(bArr.length);
            this.f141635e = new SecretKeySpec(bArr, "AES");
            Cipher cipher = (Cipher) f141631a.get();
            cipher.init(1, this.f141635e);
            byte[] a = m113423a(cipher.doFinal(new byte[16]));
            this.f141633c = a;
            this.f141634d = m113423a(a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    private final byte[] m113422a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m113424c(bArr3, this.f141633c));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m113424c(copyOfRange, this.f141633c);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f141634d, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m113424c(doFinal, bArr2));
    }

    /* renamed from: c */
    private static byte[] m113424c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: b */
    public final byte[] mo69282b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: a */
    private static byte[] m113423a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            byte b = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b + b) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        byte b2 = bArr[15];
        int i4 = b2 + b2;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo69281a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f141636f;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = bqwf.m113516a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f141636f);
            Cipher cipher = (Cipher) f141631a.get();
            cipher.init(1, this.f141635e);
            byte[] a2 = m113422a(cipher, 0, a, 0, a.length);
            byte[] a3 = m113422a(cipher, 1, bArr2, 0, bArr2.length);
            Cipher cipher2 = (Cipher) f141632b.get();
            cipher2.init(1, this.f141635e, new IvParameterSpec(a2));
            cipher2.doFinal(bArr, 0, length, bArr3, this.f141636f);
            byte[] a4 = m113422a(cipher, 2, bArr3, this.f141636f, length);
            int i2 = length + this.f141636f;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((a3[i3] ^ a2[i3]) ^ a4[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
