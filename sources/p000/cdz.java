package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: cdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdz extends FilterInputStream {

    /* renamed from: a */
    private static final byte[] f6590a;

    /* renamed from: b */
    private static final int f6591b;

    /* renamed from: c */
    private static final int f6592c;

    /* renamed from: d */
    private final byte f6593d;

    /* renamed from: e */
    private int f6594e;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f6590a = bArr;
        int length = bArr.length;
        f6591b = length;
        f6592c = length + 2;
    }

    public cdz(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f6593d = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i;
        int i2;
        int i3 = this.f6594e;
        if (i3 >= 2 && i3 <= (i2 = f6592c)) {
            i = i3 != i2 ? f6590a[i3 - 2] & 255 : this.f6593d;
        } else {
            i = super.read();
        }
        if (i != -1) {
            this.f6594e++;
        }
        return i;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f6594e = (int) (((long) this.f6594e) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f6594e;
        int i5 = f6592c;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f6593d;
            i3 = 1;
        } else if (i4 >= 2) {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f6590a, this.f6594e - 2, bArr, i, min);
            i3 = min;
        } else {
            i3 = super.read(bArr, i, 2 - i4);
        }
        if (i3 > 0) {
            this.f6594e += i3;
        }
        return i3;
    }
}
