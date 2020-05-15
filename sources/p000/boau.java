package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: boau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boau extends FilterInputStream {

    /* renamed from: a */
    private long f132478a;

    /* renamed from: b */
    private long f132479b = -1;

    public boau(InputStream inputStream, long j) {
        super(inputStream);
        bmxy.m108581a(inputStream);
        bmxy.m108589a(j >= 0, "limit must be non-negative");
        this.f132478a = j;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f132478a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f132479b = this.f132478a;
    }

    public final int read() {
        if (this.f132478a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f132478a--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f132479b != -1) {
            this.in.reset();
            this.f132478a = this.f132479b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f132478a));
        this.f132478a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f132478a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f132478a -= (long) read;
        }
        return read;
    }
}
