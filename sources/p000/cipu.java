package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: cipu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipu implements Cloneable, ByteChannel, cipw, cipv {

    /* renamed from: c */
    private static final byte[] f191211c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    public ciqn f191212a;

    /* renamed from: b */
    public long f191213b;

    /* renamed from: a */
    public final int mo86280a(byte[] bArr, int i, int i2) {
        ciqu.m150905a((long) bArr.length, (long) i, (long) i2);
        ciqn ciqn = this.f191212a;
        if (ciqn == null) {
            return -1;
        }
        int min = Math.min(i2, ciqn.f191252c - ciqn.f191251b);
        System.arraycopy(ciqn.f191250a, ciqn.f191251b, bArr, i, min);
        int i3 = ciqn.f191251b + min;
        ciqn.f191251b = i3;
        this.f191213b -= (long) min;
        if (i3 == ciqn.f191252c) {
            this.f191212a = ciqn.mo86386b();
            ciqo.m150875a(ciqn);
        }
        return min;
    }

    /* renamed from: a */
    public final long mo86282a(cipx cipx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo86285a(long j) {
        throw null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo86289a(byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final cipx mo86290b(int i) {
        if (i != 0) {
            return new ciqp(this, i);
        }
        return cipx.f191215b;
    }

    /* renamed from: b */
    public final boolean mo86295b() {
        return this.f191213b == 0;
    }

    /* renamed from: b */
    public final boolean mo86296b(long j) {
        throw null;
    }

    /* renamed from: c */
    public final byte mo86297c(long j) {
        int i;
        ciqu.m150905a(this.f191213b, j, 1);
        long j2 = this.f191213b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            ciqn ciqn = this.f191212a;
            do {
                ciqn = ciqn.f191256g;
                int i2 = ciqn.f191252c;
                i = ciqn.f191251b;
                j3 += (long) (i2 - i);
            } while (j3 < 0);
            return ciqn.f191250a[i + ((int) j3)];
        }
        ciqn ciqn2 = this.f191212a;
        while (true) {
            int i3 = ciqn2.f191252c;
            int i4 = ciqn2.f191251b;
            long j4 = (long) (i3 - i4);
            if (j < j4) {
                return ciqn2.f191250a[i4 + ((int) j)];
            }
            j -= j4;
            ciqn2 = ciqn2.f191255f;
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo86300c(cipx cipx) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        cipu cipu = new cipu();
        if (this.f191213b != 0) {
            ciqn a = this.f191212a.mo86383a();
            cipu.f191212a = a;
            a.f191256g = a;
            a.f191255f = a;
            ciqn ciqn = this.f191212a;
            while (true) {
                ciqn = ciqn.f191255f;
                if (ciqn == this.f191212a) {
                    break;
                }
                cipu.f191212a.f191256g.mo86384a(ciqn.mo86383a());
            }
            cipu.f191213b = this.f191213b;
        }
        return cipu;
    }

    public final void close() {
    }

    /* renamed from: d */
    public final long mo86302d() {
        long j = this.f191213b;
        if (j == 0) {
            return 0;
        }
        ciqn ciqn = this.f191212a.f191256g;
        int i = ciqn.f191252c;
        return (i >= 8192 || !ciqn.f191254e) ? j : j - ((long) (i - ciqn.f191251b));
    }

    /* renamed from: d */
    public final cipx mo86303d(long j) {
        throw null;
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return ciqt.f191261f;
    }

    /* renamed from: e */
    public final byte mo86305e() {
        long j = this.f191213b;
        if (j != 0) {
            ciqn ciqn = this.f191212a;
            int i = ciqn.f191251b;
            int i2 = ciqn.f191252c;
            int i3 = i + 1;
            byte b = ciqn.f191250a[i];
            this.f191213b = j - 1;
            if (i3 == i2) {
                this.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            } else {
                ciqn.f191251b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo86307e(int i) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cipu) {
            cipu cipu = (cipu) obj;
            long j = this.f191213b;
            if (j == cipu.f191213b) {
                long j2 = 0;
                if (j != 0) {
                    ciqn ciqn = this.f191212a;
                    ciqn ciqn2 = cipu.f191212a;
                    int i = ciqn.f191251b;
                    int i2 = ciqn2.f191251b;
                    while (j2 < this.f191213b) {
                        long min = (long) Math.min(ciqn.f191252c - i, ciqn2.f191252c - i2);
                        int i3 = 0;
                        while (((long) i3) < min) {
                            int i4 = i + 1;
                            int i5 = i2 + 1;
                            if (ciqn.f191250a[i] != ciqn2.f191250a[i2]) {
                                return false;
                            }
                            i3++;
                            i = i4;
                            i2 = i5;
                        }
                        if (i == ciqn.f191252c) {
                            ciqn = ciqn.f191255f;
                            i = ciqn.f191251b;
                        }
                        if (i2 == ciqn2.f191252c) {
                            ciqn2 = ciqn2.f191255f;
                            i2 = ciqn2.f191251b;
                        }
                        j2 += min;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String mo86309f(long j) {
        if (j > 0) {
            long j2 = -1 + j;
            if (mo86297c(j2) == 13) {
                String e = mo86306e(j2);
                mo86317h(2L);
                return e;
            }
        }
        String e2 = mo86306e(j);
        mo86317h(1L);
        return e2;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo86311f(int i) {
        throw null;
    }

    public final void flush() {
    }

    /* renamed from: g */
    public final int mo86312g() {
        long j = this.f191213b;
        if (j >= 4) {
            ciqn ciqn = this.f191212a;
            int i = ciqn.f191251b;
            int i2 = ciqn.f191252c;
            if (i2 - i < 4) {
                return ((mo86305e() & 255) << 24) | ((mo86305e() & 255) << 16) | ((mo86305e() & 255) << 8) | (mo86305e() & 255);
            }
            byte[] bArr = ciqn.f191250a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            this.f191213b = j - 4;
            if (i6 == i2) {
                this.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            } else {
                ciqn.f191251b = i6;
            }
            return b;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 4: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    public final short mo86315h() {
        return ciqu.m150904a(mo86310f());
    }

    public final int hashCode() {
        ciqn ciqn = this.f191212a;
        if (ciqn == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ciqn.f191252c;
            for (int i3 = ciqn.f191251b; i3 < i2; i3++) {
                i = (i * 31) + ciqn.f191250a[i3];
            }
            ciqn = ciqn.f191255f;
        } while (ciqn != this.f191212a);
        return i;
    }

    /* renamed from: i */
    public final int mo86319i() {
        throw null;
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final cipx mo86322j() {
        return new cipx(mo86327m());
    }

    /* renamed from: k */
    public final String mo86324k() {
        try {
            return mo86284a(this.f191213b, ciqu.f191265a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: l */
    public final String mo86326l() {
        throw null;
    }

    /* renamed from: m */
    public final byte[] mo86327m() {
        try {
            return mo86314g(this.f191213b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public final cipx mo86329o() {
        long j = this.f191213b;
        if (j <= 2147483647L) {
            return mo86290b((int) j);
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo86330p() {
        throw null;
    }

    /* renamed from: q */
    public final long mo86331q() {
        throw null;
    }

    public final int read(ByteBuffer byteBuffer) {
        ciqn ciqn = this.f191212a;
        if (ciqn == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ciqn.f191252c - ciqn.f191251b);
        byteBuffer.put(ciqn.f191250a, ciqn.f191251b, min);
        int i = ciqn.f191251b + min;
        ciqn.f191251b = i;
        this.f191213b -= (long) min;
        if (i == ciqn.f191252c) {
            this.f191212a = ciqn.mo86386b();
            ciqo.m150875a(ciqn);
        }
        return min;
    }

    public final String toString() {
        return mo86329o().toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                ciqn a = mo86283a(1);
                int min = Math.min(i, 8192 - a.f191252c);
                byteBuffer.get(a.f191250a, a.f191252c, min);
                i -= min;
                a.f191252c += min;
            }
            this.f191213b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: j */
    public final void mo86323j(long j) {
        if (j != 0) {
            int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
            ciqn a = mo86283a(numberOfTrailingZeros);
            byte[] bArr = a.f191250a;
            int i = a.f191252c;
            for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
                bArr[i2] = f191211c[(int) (15 & j)];
                j >>>= 4;
            }
            a.f191252c += numberOfTrailingZeros;
            this.f191213b += (long) numberOfTrailingZeros;
            return;
        }
        mo86316h(48);
    }

    /* renamed from: n */
    public final void mo86328n() {
        try {
            mo86317h(this.f191213b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final void mo86291b(cipu cipu, long j) {
        ciqu.m150905a(this.f191213b, 0, j);
        if (j != 0) {
            cipu.f191213b += j;
            ciqn ciqn = this.f191212a;
            long j2 = 0;
            while (true) {
                long j3 = (long) (ciqn.f191252c - ciqn.f191251b);
                if (j2 < j3) {
                    break;
                }
                j2 -= j3;
                ciqn = ciqn.f191255f;
            }
            while (j > 0) {
                ciqn a = ciqn.mo86383a();
                int i = (int) (((long) a.f191251b) + j2);
                a.f191251b = i;
                a.f191252c = Math.min(i + ((int) j), a.f191252c);
                ciqn ciqn2 = cipu.f191212a;
                if (ciqn2 == null) {
                    a.f191256g = a;
                    a.f191255f = a;
                    cipu.f191212a = a;
                } else {
                    ciqn2.f191256g.mo86384a(a);
                }
                j -= (long) (a.f191252c - a.f191251b);
                ciqn = ciqn.f191255f;
                j2 = 0;
            }
        }
    }

    /* renamed from: d */
    public final void mo86304d(int i) {
        ciqn a = mo86283a(4);
        byte[] bArr = a.f191250a;
        int i2 = a.f191252c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        a.f191252c = i5 + 1;
        this.f191213b += 4;
    }

    /* renamed from: h */
    public final void mo86317h(long j) {
        while (j > 0) {
            ciqn ciqn = this.f191212a;
            if (ciqn != null) {
                int min = (int) Math.min(j, (long) (ciqn.f191252c - ciqn.f191251b));
                long j2 = (long) min;
                this.f191213b -= j2;
                j -= j2;
                ciqn ciqn2 = this.f191212a;
                int i = ciqn2.f191251b + min;
                ciqn2.f191251b = i;
                if (i == ciqn2.f191252c) {
                    this.f191212a = ciqn2.mo86386b();
                    ciqo.m150875a(ciqn2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: k */
    public final void mo86320i(long j) {
        boolean z;
        if (j != 0) {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j >= 0) {
                    z = true;
                } else {
                    mo86293b("-9223372036854775808");
                    return;
                }
            } else {
                z = false;
            }
            if (j >= 100000000) {
                i = j >= 1000000000000L ? j < 1000000000000000L ? j >= 10000000000000L ? j < 100000000000000L ? 14 : 15 : 13 : j >= 100000000000000000L ? j < 1000000000000000000L ? 18 : 19 : j < 10000000000000000L ? 16 : 17 : j >= 10000000000L ? j < 100000000000L ? 11 : 12 : j < 1000000000 ? 9 : 10;
            } else if (j >= 10000) {
                i = j >= 1000000 ? j < 10000000 ? 7 : 8 : j < 100000 ? 5 : 6;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i = 2;
            }
            if (z) {
                i++;
            }
            ciqn a = mo86283a(i);
            byte[] bArr = a.f191250a;
            int i2 = a.f191252c + i;
            while (j != 0) {
                i2--;
                bArr[i2] = f191211c[(int) (j % 10)];
                j /= 10;
            }
            if (z) {
                bArr[i2 - 1] = 45;
            }
            a.f191252c += i;
            this.f191213b += (long) i;
            return;
        }
        mo86316h(48);
    }

    /* renamed from: a */
    public final long mo86281a(byte b, long j) {
        ciqn ciqn;
        long j2;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        if (j >= 0) {
            long j5 = this.f191213b;
            if (j5 < Long.MAX_VALUE) {
                j4 = j5;
            }
            if (j == j4 || (ciqn = this.f191212a) == null) {
                return -1;
            }
            if (j5 - j >= j) {
                while (true) {
                    long j6 = ((long) (ciqn.f191252c - ciqn.f191251b)) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    ciqn = ciqn.f191255f;
                    j3 = j6;
                }
                j5 = j3;
                j2 = j;
            } else {
                while (j5 > j) {
                    ciqn = ciqn.f191256g;
                    j5 -= (long) (ciqn.f191252c - ciqn.f191251b);
                }
                j2 = j;
            }
            while (j5 < j4) {
                byte[] bArr = ciqn.f191250a;
                int min = (int) Math.min((long) ciqn.f191252c, (((long) ciqn.f191251b) + j4) - j5);
                for (int i = (int) ((((long) ciqn.f191251b) + j2) - j5); i < min; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - ciqn.f191251b)) + j5;
                    }
                }
                j5 += (long) (ciqn.f191252c - ciqn.f191251b);
                ciqn = ciqn.f191255f;
                j2 = j5;
            }
            return -1;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f191213b), Long.valueOf(j), Long.MAX_VALUE));
    }

    /* renamed from: f */
    public final short mo86310f() {
        long j = this.f191213b;
        if (j >= 2) {
            ciqn ciqn = this.f191212a;
            int i = ciqn.f191251b;
            int i2 = ciqn.f191252c;
            if (i2 - i < 2) {
                return (short) (((mo86305e() & 255) << 8) | (mo86305e() & 255));
            }
            byte[] bArr = ciqn.f191250a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f191213b = j - 2;
            if (i4 == i2) {
                this.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            } else {
                ciqn.f191251b = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 2: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final String mo86306e(long j) {
        return mo86284a(j, ciqu.f191265a);
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j >= 0) {
            long j2 = this.f191213b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cipu.mo74930a(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public final void mo86313g(int i) {
        if (i < 128) {
            mo86316h(i);
        } else if (i < 2048) {
            mo86316h((i >> 6) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
            mo86316h((i & 63) | 128);
        } else if (i >= 65536) {
            if (i <= 1114111) {
                mo86316h((i >> 18) | 240);
                mo86316h(((i >> 12) & 63) | 128);
                mo86316h(((i >> 6) & 63) | 128);
                mo86316h((i & 63) | 128);
                return;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected code point: ") : "Unexpected code point: ".concat(valueOf));
        } else if (i >= 55296 && i <= 57343) {
            mo86316h(63);
        } else {
            mo86316h((i >> 12) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
            mo86316h(((i >> 6) & 63) | 128);
            mo86316h((i & 63) | 128);
        }
    }

    /* renamed from: c */
    public final InputStream mo86298c() {
        return new cipt(this);
    }

    /* renamed from: b */
    public final void mo86292b(cipx cipx) {
        if (cipx != null) {
            cipx.mo86337a(this);
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: c */
    public final void mo86316h(int i) {
        ciqn a = mo86283a(1);
        byte[] bArr = a.f191250a;
        int i2 = a.f191252c;
        a.f191252c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f191213b++;
    }

    /* renamed from: b */
    public final void mo86294b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            ciqu.m150905a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                ciqn a = mo86283a(1);
                int min = Math.min(i3 - i, 8192 - a.f191252c);
                System.arraycopy(bArr, i, a.f191250a, a.f191252c, min);
                i += min;
                a.f191252c += min;
            }
            this.f191213b += j;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: g */
    public final byte[] mo86314g(long j) {
        ciqu.m150905a(this.f191213b, 0, j);
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int a = mo86280a(bArr, i2, i - i2);
                if (a != -1) {
                    i2 += a;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ciqn mo86283a(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        ciqn ciqn = this.f191212a;
        if (ciqn == null) {
            ciqn a = ciqo.m150874a();
            this.f191212a = a;
            a.f191256g = a;
            a.f191255f = a;
            return a;
        }
        ciqn ciqn2 = ciqn.f191256g;
        if (ciqn2.f191252c + i <= 8192 && ciqn2.f191254e) {
            return ciqn2;
        }
        ciqn a2 = ciqo.m150874a();
        ciqn2.mo86384a(a2);
        return a2;
    }

    /* renamed from: a */
    public final String mo86284a(long j, Charset charset) {
        ciqu.m150905a(this.f191213b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            ciqn ciqn = this.f191212a;
            int i = ciqn.f191251b;
            if (((long) i) + j > ((long) ciqn.f191252c)) {
                return new String(mo86314g(j), charset);
            }
            String str = new String(ciqn.f191250a, i, (int) j, charset);
            int i2 = (int) (((long) ciqn.f191251b) + j);
            ciqn.f191251b = i2;
            this.f191213b -= j;
            if (i2 == ciqn.f191252c) {
                this.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            }
            return str;
        }
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        ciqn ciqn;
        ciqn ciqn2;
        if (cipu == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cipu != this) {
            ciqu.m150905a(cipu.f191213b, 0, j);
            while (j > 0) {
                ciqn ciqn3 = cipu.f191212a;
                int i = ciqn3.f191252c - ciqn3.f191251b;
                int i2 = 0;
                if (j < ((long) i)) {
                    ciqn ciqn4 = this.f191212a;
                    if (ciqn4 != null) {
                        ciqn = ciqn4.f191256g;
                    } else {
                        ciqn = null;
                    }
                    if (ciqn != null && ciqn.f191254e) {
                        if ((((long) ciqn.f191252c) + j) - ((long) (!ciqn.f191253d ? ciqn.f191251b : 0)) <= 8192) {
                            ciqn3.mo86385a(ciqn, (int) j);
                            cipu.f191213b -= j;
                            this.f191213b += j;
                            return;
                        }
                    }
                    int i3 = (int) j;
                    if (i3 <= 0 || i3 > i) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 < 1024) {
                        ciqn2 = ciqo.m150874a();
                        System.arraycopy(ciqn3.f191250a, ciqn3.f191251b, ciqn2.f191250a, 0, i3);
                    } else {
                        ciqn2 = ciqn3.mo86383a();
                    }
                    ciqn2.f191252c = ciqn2.f191251b + i3;
                    ciqn3.f191251b += i3;
                    ciqn3.f191256g.mo86384a(ciqn2);
                    cipu.f191212a = ciqn2;
                }
                ciqn ciqn5 = cipu.f191212a;
                long j2 = (long) (ciqn5.f191252c - ciqn5.f191251b);
                cipu.f191212a = ciqn5.mo86386b();
                ciqn ciqn6 = this.f191212a;
                if (ciqn6 == null) {
                    this.f191212a = ciqn5;
                    ciqn5.f191256g = ciqn5;
                    ciqn5.f191255f = ciqn5;
                } else {
                    ciqn6.f191256g.mo86384a(ciqn5);
                    ciqn ciqn7 = ciqn5.f191256g;
                    if (ciqn7 == ciqn5) {
                        throw new IllegalStateException();
                    } else if (ciqn7.f191254e) {
                        int i4 = ciqn5.f191252c - ciqn5.f191251b;
                        int i5 = 8192 - ciqn7.f191252c;
                        if (!ciqn7.f191253d) {
                            i2 = ciqn7.f191251b;
                        }
                        if (i4 <= i5 + i2) {
                            ciqn5.mo86385a(ciqn7, i4);
                            ciqn5.mo86386b();
                            ciqo.m150875a(ciqn5);
                        }
                    }
                }
                cipu.f191213b -= j2;
                this.f191213b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: a */
    public final void mo86286a(ciqr ciqr) {
        if (ciqr != null) {
            do {
            } while (ciqr.mo74995c(this, 8192) != -1);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final void mo86293b(String str) {
        mo86288a(str, 0, str.length());
    }

    /* renamed from: a */
    public final void mo86288a(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    ciqn a = mo86283a(1);
                    byte[] bArr = a.f191250a;
                    int i3 = a.f191252c - i;
                    int min = Math.min(i2, 8192 - i3);
                    bArr[i + i3] = (byte) charAt;
                    i++;
                    while (i < min) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i + i3] = (byte) charAt2;
                        i++;
                    }
                    int i4 = a.f191252c;
                    int i5 = (i3 + i) - i4;
                    a.f191252c = i4 + i5;
                    this.f191213b += (long) i5;
                } else if (charAt < 2048) {
                    mo86316h((charAt >> 6) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
                    mo86316h((int) ((charAt & '?') | 128));
                    i++;
                } else if (charAt >= 55296 && charAt <= 57343) {
                    int i6 = i + 1;
                    if (i6 < i2) {
                        c = str.charAt(i6);
                    } else {
                        c = 0;
                    }
                    if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                        int i7 = (((charAt & 10239) << 10) | (9215 & c)) + AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        mo86316h((i7 >> 18) | 240);
                        mo86316h(((i7 >> 12) & 63) | 128);
                        mo86316h(((i7 >> 6) & 63) | 128);
                        mo86316h((i7 & 63) | 128);
                        i += 2;
                    } else {
                        mo86316h(63);
                        i = i6;
                    }
                } else {
                    mo86316h((charAt >> 12) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
                    mo86316h(((charAt >> 6) & 63) | 128);
                    mo86316h((int) ((charAt & '?') | 128));
                    i++;
                }
            }
        } else {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(length);
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
