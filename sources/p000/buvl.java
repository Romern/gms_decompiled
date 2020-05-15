package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;

/* renamed from: buvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvl extends InputStream {

    /* renamed from: a */
    private final Object f155045a = new Object();

    /* renamed from: b */
    private final BlockingQueue f155046b;

    /* renamed from: c */
    private byte[] f155047c = null;

    /* renamed from: d */
    private int f155048d = 0;

    /* renamed from: e */
    private boolean f155049e = false;

    public buvl(BlockingQueue blockingQueue) {
        this.f155046b = blockingQueue;
    }

    /* renamed from: a */
    private final byte[] m120515a() {
        try {
            buvn buvn = (buvn) this.f155046b.take();
            Exception exc = buvn.f155055a;
            if (exc == null) {
                return buvn.f155056b;
            }
            throw new IOException(exc);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }
    }

    public final void close() {
        synchronized (this.f155045a) {
            if (!this.f155049e) {
                this.f155049e = true;
                super.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return r2;
     */
    public final int read() {
        synchronized (this.f155045a) {
            if (this.f155049e) {
                return -1;
            }
            if (this.f155047c == null) {
                this.f155047c = m120515a();
                this.f155048d = 0;
            }
            byte[] bArr = this.f155047c;
            int i = this.f155048d;
            int i2 = i + 1;
            this.f155048d = i2;
            byte b = bArr[i];
            if (i2 == bArr.length) {
                this.f155047c = null;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int min;
        synchronized (this.f155045a) {
            if (!this.f155049e) {
                if (this.f155047c == null) {
                    this.f155047c = m120515a();
                    this.f155048d = 0;
                }
                min = Math.min(i2, this.f155047c.length - this.f155048d);
                System.arraycopy(this.f155047c, this.f155048d, bArr, i, min);
                int i3 = this.f155048d + min;
                this.f155048d = i3;
                if (i3 == this.f155047c.length) {
                    this.f155047c = null;
                }
            } else {
                throw new IOException("Stream closed");
            }
        }
        return min;
    }
}
