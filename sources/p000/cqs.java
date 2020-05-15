package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: cqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqs extends InputStream {

    /* renamed from: a */
    public static final Queue f11860a = crd.m7392a(0);

    /* renamed from: b */
    public InputStream f11861b;

    /* renamed from: c */
    public IOException f11862c;

    /* renamed from: a */
    public final void mo8159a() {
        this.f11862c = null;
        this.f11861b = null;
        synchronized (f11860a) {
            f11860a.offer(this);
        }
    }

    public final int available() {
        return this.f11861b.available();
    }

    public final void close() {
        this.f11861b.close();
    }

    public final void mark(int i) {
        this.f11861b.mark(i);
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        try {
            return this.f11861b.read();
        } catch (IOException e) {
            this.f11862c = e;
            return -1;
        }
    }

    public final synchronized void reset() {
        this.f11861b.reset();
    }

    public final long skip(long j) {
        try {
            return this.f11861b.skip(j);
        } catch (IOException e) {
            this.f11862c = e;
            return 0;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f11861b.read(bArr);
        } catch (IOException e) {
            this.f11862c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f11861b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f11862c = e;
            return -1;
        }
    }
}
