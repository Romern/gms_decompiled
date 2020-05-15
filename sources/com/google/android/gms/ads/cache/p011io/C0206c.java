package com.google.android.gms.ads.cache.p011io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.ads.cache.io.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0206c extends InputStream {

    /* renamed from: a */
    final /* synthetic */ C0208e f7868a;

    /* renamed from: b */
    private boolean f7869b;

    /* renamed from: c */
    private long f7870c;

    public C0206c(C0208e eVar) {
        this.f7868a = eVar;
    }

    /* renamed from: a */
    private final void m5061a() {
        m5062a(1);
    }

    /* renamed from: b */
    private final boolean m5063b() {
        return !this.f7868a.mo6412b() && this.f7868a.f7877f <= this.f7870c;
    }

    /* renamed from: c */
    private final void m5064c() {
        if (!this.f7869b) {
            this.f7868a.mo6416e();
            return;
        }
        throw new IOException("invalidated InputStream");
    }

    public final int available() {
        int max;
        synchronized (this.f7868a.f7872a) {
            m5064c();
            max = Math.max(0, (int) (this.f7868a.f7877f - this.f7870c));
        }
        return max;
    }

    public final void close() {
        synchronized (this.f7868a.f7872a) {
            m5064c();
            this.f7869b = true;
            this.f7868a.f7876e.remove(this);
            this.f7868a.f7872a.notifyAll();
        }
    }

    public final int read() {
        synchronized (this.f7868a.f7872a) {
            m5064c();
            m5061a();
            if (m5063b()) {
                return -1;
            }
            this.f7868a.f7875d.seek(this.f7870c);
            int read = this.f7868a.f7875d.read();
            this.f7870c++;
            return read;
        }
    }

    public final long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        synchronized (this.f7868a.f7872a) {
            while (this.f7868a.mo6412b() && ((long) available()) < j) {
                m5062a(j);
            }
            if (!this.f7868a.mo6412b()) {
                j = Math.min(j, (long) available());
            }
            this.f7870c += j;
        }
        return j;
    }

    /* renamed from: a */
    private final void m5062a(long j) {
        while (this.f7868a.mo6412b()) {
            C0208e eVar = this.f7868a;
            if (eVar.f7877f - this.f7870c < j) {
                try {
                    eVar.f7872a.wait();
                    m5064c();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("interrupted while waiting for data", e);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return r5;
     */
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 < 0 || i < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            synchronized (this.f7868a.f7872a) {
                m5064c();
                m5061a();
                if (m5063b()) {
                    return -1;
                }
                int min = Math.min(available(), i2);
                this.f7868a.f7875d.seek(this.f7870c);
                int read = this.f7868a.f7875d.read(bArr, i, min);
                if (read >= 0) {
                    this.f7870c += (long) read;
                }
            }
        }
    }
}
