package p000;

import java.io.Serializable;
import java.nio.charset.Charset;

/* renamed from: bnzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzy extends bnyp implements Serializable {

    /* renamed from: a */
    static final bnzc f132436a = new bnzy(0);

    /* renamed from: b */
    static final bnzc f132437b = new bnzy(bnzi.f132400a);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f132438c;

    public bnzy(int i) {
        this.f132438c = i;
    }

    /* renamed from: a */
    public static int m110947a(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* renamed from: a */
    public static long m110948a(char c) {
        return (long) ((((c & '?') | 128) << 16) | (((c >>> 12) | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8));
    }

    /* renamed from: b */
    public static int m110949b(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: b */
    public static long m110951b(char c) {
        return (long) ((((c & '?') | 128) << 8) | (((c >>> 6) | 960) & 255));
    }

    /* renamed from: c */
    public static long m110953c(int i) {
        return ((((long) (i >>> 18)) | 240) & 255) | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnzy) && this.f132438c == ((bnzy) obj).f132438c;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.f132438c;
    }

    public final String toString() {
        int i = this.f132438c;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public static int m110950b(byte[] bArr, int i) {
        return bqcn.m112575a(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    /* renamed from: a */
    public final bnzb mo68719a(long j) {
        return m110952b(m110947a(m110947a(this.f132438c, m110949b((int) j)), m110949b((int) (j >>> 32))), 8);
    }

    /* renamed from: b */
    public static bnzb m110952b(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return bnzb.m110868a(i5 ^ (i5 >>> 16));
    }

    /* renamed from: a */
    public final bnzb mo68720a(CharSequence charSequence) {
        int i = this.f132438c;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = m110947a(i, m110949b((int) (charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16))));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= m110949b((int) charSequence.charAt(charSequence.length() - 1));
        }
        int length = charSequence.length();
        return m110952b(i, length + length);
    }

    /* renamed from: a */
    public final bnzb mo68721a(CharSequence charSequence, Charset charset) {
        int i;
        long j;
        if (!bmwy.f131158c.equals(charset)) {
            return mo68722a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = this.f132438c;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            j = 0;
            if (i6 > length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i4 + 1);
            char charAt3 = charSequence.charAt(i4 + 2);
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i2 = m110947a(i2, m110949b((int) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24))));
            i5 = i + 4;
            i4 = i6;
        }
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < 128) {
                j |= ((long) charAt5) << i3;
                i3 += 8;
                i++;
            } else if (charAt5 < 2048) {
                j |= m110951b(charAt5) << i3;
                i3 += 16;
                i += 2;
            } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return mo68722a(charSequence.toString().getBytes(charset));
                }
                i4++;
                j |= m110953c(codePointAt) << i3;
                i += 4;
            } else {
                j |= m110948a(charAt5) << i3;
                i3 += 24;
                i += 3;
            }
            if (i3 >= 32) {
                i2 = m110947a(i2, m110949b((int) j));
                j >>>= 32;
                i3 -= 32;
            }
            i4++;
        }
        return m110952b(m110949b((int) j) ^ i2, i);
    }

    /* renamed from: a */
    public final bnzb mo68723a(byte[] bArr, int i) {
        int i2 = 0;
        bmxy.m108585a(0, i, bArr.length);
        int i3 = this.f132438c;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 4;
            if (i5 > i) {
                break;
            }
            i3 = m110947a(i3, m110949b(m110950b(bArr, i4)));
            i4 = i5;
        }
        int i6 = i4;
        int i7 = 0;
        while (i6 < i) {
            i2 ^= bqcw.m112606a(bArr[i6]) << i7;
            i6++;
            i7 += 8;
        }
        return m110952b(m110949b(i2) ^ i3, i);
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        return new bnzx(this.f132438c);
    }
}
