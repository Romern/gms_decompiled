package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ncx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncx extends InputStream {

    /* renamed from: a */
    private final bzrx f35297a;

    /* renamed from: b */
    private final byte[] f35298b = new byte[1];

    public ncx(bzrx bzrx) {
        this.f35297a = bzrx;
    }

    public final int available() {
        return this.f35297a.mo20327h() ? 1 : 0;
    }

    public final void close() {
        this.f35297a.close();
    }

    public final void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int read;
        do {
            read = read(this.f35298b);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return this.f35298b[0];
    }

    public final synchronized void reset() {
        throw new IOException();
    }

    public final long skip(long j) {
        return this.f35297a.mo20317a(j);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = this.f35297a.mo20316a(bArr, i, i2);
        if (a == 0) {
            return -1;
        }
        return a;
    }
}
