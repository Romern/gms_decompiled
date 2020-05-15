package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: blkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkz extends InputStream {

    /* renamed from: a */
    public final InputStream f126779a;

    /* renamed from: b */
    public Runnable f126780b = null;

    /* renamed from: c */
    public boolean f126781c = true;

    public blkz(InputStream inputStream) {
        this.f126779a = inputStream;
    }

    /* renamed from: a */
    private final void m107317a() {
        if (!this.f126781c) {
            throw new IOException("InputStream is closed.");
        }
    }

    public final int available() {
        m107317a();
        return this.f126779a.available();
    }

    public final void close() {
        if (this.f126781c) {
            this.f126781c = false;
            Runnable runnable = this.f126780b;
            if (runnable != null) {
                runnable.run();
                this.f126780b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }

    public final synchronized void mark(int i) {
        this.f126779a.mark(i);
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        m107317a();
        return this.f126779a.read();
    }

    public final synchronized void reset() {
        m107317a();
        this.f126779a.reset();
    }

    public final long skip(long j) {
        m107317a();
        return this.f126779a.skip(j);
    }

    public final int read(byte[] bArr) {
        m107317a();
        return this.f126779a.read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        m107317a();
        return this.f126779a.read(bArr, i, i2);
    }
}
