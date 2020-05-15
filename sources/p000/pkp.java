package p000;

import java.io.InputStream;

/* renamed from: pkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pkp extends InputStream {

    /* renamed from: a */
    public int f39518a;

    /* renamed from: b */
    private final pko f39519b;

    public pkp(pko pko) {
        this.f39519b = pko;
    }

    public final int available() {
        return this.f39518a;
    }

    public final int read() {
        Byte b;
        if (this.f39518a != 0) {
            pko pko = this.f39519b;
            if (pko.mo23335e() > 0) {
                b = Byte.valueOf(pko.mo23337g());
            } else {
                b = null;
            }
            if (b != null) {
                this.f39518a--;
                return b.byteValue();
            }
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = this.f39518a;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i4 != 0) {
            pko pko = this.f39519b;
            if (pko.mo23335e() >= i2) {
                if (!pko.f39515e) {
                    int i5 = pko.f39512b;
                    int i6 = pko.f39513c;
                    i3 = i5 >= i6 ? pko.f39511a.length - i5 : i6 - i5;
                } else {
                    i3 = 0;
                }
                int min = Math.min(i2, i3);
                System.arraycopy(pko.f39511a, pko.f39512b, bArr, i, min);
                pko.mo23329a(min);
                int i7 = i2 - min;
                if (i7 > 0) {
                    System.arraycopy(pko.f39511a, pko.f39512b, bArr, i + min, i7);
                    pko.mo23329a(i7);
                }
                this.f39518a -= i2;
                return i2;
            }
        }
        return -1;
    }
}
