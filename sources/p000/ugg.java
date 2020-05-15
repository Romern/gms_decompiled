package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: ugg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugg extends FilterOutputStream {

    /* renamed from: a */
    private final OutputStream f47515a;

    /* renamed from: b */
    private final ufx f47516b;

    /* renamed from: c */
    private final long f47517c;

    /* renamed from: d */
    private final long f47518d;

    /* renamed from: e */
    private final vew f47519e;

    /* renamed from: f */
    private long f47520f;

    /* renamed from: g */
    private long f47521g = 0;

    public ugg(OutputStream outputStream, ufx ufx, long j, long j2, vew vew) {
        super(outputStream);
        this.f47515a = outputStream;
        this.f47516b = ufx;
        this.f47517c = j;
        this.f47520f = j2;
        long j3 = 0;
        this.f47518d = j > 0 ? j / 200 : j3;
        this.f47519e = vew;
    }

    /* renamed from: a */
    private final void m38323a() {
        this.f47519e.mo28356a("Interrupted");
    }

    public final void write(int i) {
        m38323a();
        this.f47515a.write(i);
        m38324a(1);
    }

    /* renamed from: a */
    private final void m38324a(long j) {
        long j2 = this.f47520f + j;
        this.f47520f = j2;
        if (j2 - this.f47521g > this.f47518d || j2 >= this.f47517c) {
            this.f47515a.flush();
            this.f47516b.mo27243a(this.f47520f, this.f47517c);
            this.f47521g = this.f47520f;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        m38323a();
        this.f47515a.write(bArr, i, i2);
        m38324a((long) i2);
    }
}
