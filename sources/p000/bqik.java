package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bqik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqik extends InputStream {

    /* renamed from: a */
    private final byte[] f140806a = new byte[8192];

    /* renamed from: b */
    private int f140807b = 0;

    /* renamed from: c */
    private int f140808c = 0;

    /* renamed from: d */
    private final bqiq f140809d;

    public bqik(InputStream inputStream) {
        bqiq bqiq = new bqiq();
        this.f140809d = bqiq;
        try {
            bqin.m112891a(bqiq, inputStream);
        } catch (bqil e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    public final void close() {
        bqin.m112890a(this.f140809d);
    }

    public final int read() {
        int i = this.f140808c;
        if (i >= this.f140807b) {
            byte[] bArr = this.f140806a;
            int read = read(bArr, 0, bArr.length);
            this.f140807b = read;
            this.f140808c = 0;
            if (read == -1) {
                return -1;
            }
            i = 0;
        }
        byte[] bArr2 = this.f140806a;
        this.f140808c = i + 1;
        return bArr2[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("Bad offset: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            int length = bArr.length;
            if (i3 > length) {
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("Buffer overflow: ");
                sb2.append(i3);
                sb2.append(" > ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.f140807b - this.f140808c, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.f140806a, this.f140808c, bArr, i, max);
                    this.f140808c += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    bqiq bqiq = this.f140809d;
                    bqiq.f140869f = bArr;
                    bqiq.f140851ac = i;
                    bqiq.f140852ad = i2;
                    bqiq.f140853ae = 0;
                    bqin.m112895b(bqiq);
                    int i4 = this.f140809d.f140853ae;
                    if (i4 != 0) {
                        return i4 + max;
                    }
                    return -1;
                } catch (bqil e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Bad length: ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
