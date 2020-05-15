package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nda extends FilterInputStream {

    /* renamed from: a */
    public volatile IOException f35304a;

    public nda(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final void m25951a() {
        if (this.f35304a != null) {
            throw new IOException(this.f35304a);
        }
    }

    public final int available() {
        m25951a();
        return super.available();
    }

    public final void close() {
        m25951a();
        super.close();
    }

    public final int read() {
        m25951a();
        int read = super.read();
        if (ccmn.m130690b()) {
            m25951a();
        }
        return read;
    }

    public final synchronized void reset() {
        m25951a();
        super.reset();
    }

    public final long skip(long j) {
        m25951a();
        return super.skip(j);
    }

    public final int read(byte[] bArr) {
        m25951a();
        int read = super.read(bArr);
        if (ccmn.m130690b()) {
            m25951a();
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        m25951a();
        int read = super.read(bArr, i, i2);
        if (ccmn.m130690b()) {
            m25951a();
        }
        return read;
    }
}
