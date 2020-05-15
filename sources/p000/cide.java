package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cide */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cide extends FilterInputStream {

    /* renamed from: a */
    private final int f189875a;

    /* renamed from: b */
    private final ciez f189876b;

    /* renamed from: c */
    private long f189877c;

    /* renamed from: d */
    private long f189878d;

    /* renamed from: e */
    private long f189879e = -1;

    public cide(InputStream inputStream, int i, ciez ciez) {
        super(inputStream);
        this.f189875a = i;
        this.f189876b = ciez;
    }

    /* renamed from: a */
    private final void m150045a() {
        if (this.f189878d > this.f189877c) {
            this.f189876b.mo86025b();
            this.f189877c = this.f189878d;
        }
    }

    /* renamed from: b */
    private final void m150046b() {
        if (this.f189878d > ((long) this.f189875a)) {
            throw chuv.f189224k.mo85687a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", Integer.valueOf(this.f189875a), Long.valueOf(this.f189878d))).mo85691b();
        }
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f189879e = this.f189878d;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f189878d++;
        }
        m150046b();
        m150045a();
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f189879e != -1) {
            this.in.reset();
            this.f189878d = this.f189879e;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f189878d += skip;
        m150046b();
        m150045a();
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f189878d += (long) read;
        }
        m150046b();
        m150045a();
        return read;
    }
}
