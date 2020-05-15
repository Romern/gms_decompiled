package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ayct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayct extends InputStream {

    /* renamed from: a */
    final /* synthetic */ InputStream f97181a;

    /* renamed from: b */
    final /* synthetic */ aycw f97182b;

    public ayct(aycw aycw, InputStream inputStream) {
        this.f97182b = aycw;
        this.f97181a = inputStream;
    }

    public final int available() {
        return this.f97181a.available();
    }

    public final void close() {
        this.f97181a.close();
    }

    public final synchronized void mark(int i) {
        this.f97181a.mark(i);
    }

    public final boolean markSupported() {
        return this.f97181a.markSupported();
    }

    public final int read() {
        try {
            return this.f97181a.read();
        } catch (IOException e) {
            this.f97182b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }

    public final synchronized void reset() {
        this.f97181a.reset();
    }

    public final long skip(long j) {
        return this.f97181a.skip(j);
    }

    public final int read(byte[] bArr) {
        try {
            return this.f97181a.read(bArr);
        } catch (IOException e) {
            this.f97182b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f97181a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f97182b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }
}
