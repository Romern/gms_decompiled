package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bobc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobc extends FilterInputStream {

    /* renamed from: a */
    public long f132489a;

    /* renamed from: b */
    private long f132490b = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bobc(InputStream inputStream) {
        super(inputStream);
        bmxy.m108581a(inputStream);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f132490b = this.f132489a;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f132489a++;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f132490b != -1) {
            this.in.reset();
            this.f132489a = this.f132490b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f132489a += skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f132489a += (long) read;
        }
        return read;
    }
}
