package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ciqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqk implements cipv {

    /* renamed from: a */
    public final cipu f191243a = new cipu();

    /* renamed from: b */
    public final ciqq f191244b;

    /* renamed from: c */
    public boolean f191245c;

    public ciqk(ciqq ciqq) {
        if (ciqq != null) {
            this.f191244b = ciqq;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        if (!this.f191245c) {
            this.f191243a.mo74930a(cipu, j);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final void mo86293b(String str) {
        if (!this.f191245c) {
            this.f191243a.mo86293b(str);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public final void mo86300c(cipx cipx) {
        if (!this.f191245c) {
            this.f191243a.mo86292b(cipx);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f191245c) {
            Throwable th = null;
            try {
                cipu cipu = this.f191243a;
                long j = cipu.f191213b;
                if (j > 0) {
                    this.f191244b.mo74930a(cipu, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f191244b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f191245c = true;
            if (th != null) {
                Charset charset = ciqu.f191265a;
                throw th;
            }
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f191244b.mo74932df();
    }

    /* renamed from: e */
    public final void mo86307e(int i) {
        if (!this.f191245c) {
            this.f191243a.mo86304d(i);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final void mo86311f(int i) {
        if (!this.f191245c) {
            cipu cipu = this.f191243a;
            ciqn a = cipu.mo86283a(2);
            byte[] bArr = a.f191250a;
            int i2 = a.f191252c;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i3] = (byte) (i & 255);
            a.f191252c = i3 + 1;
            cipu.f191213b += 2;
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f191245c) {
            cipu cipu = this.f191243a;
            long j = cipu.f191213b;
            if (j > 0) {
                this.f191244b.mo74930a(cipu, j);
            }
            this.f191244b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: h */
    public final void mo86316h(int i) {
        if (!this.f191245c) {
            this.f191243a.mo86316h(i);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public final void mo86320i(long j) {
        if (!this.f191245c) {
            this.f191243a.mo86320i(j);
            mo86330p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f191245c;
    }

    /* renamed from: p */
    public final void mo86330p() {
        if (!this.f191245c) {
            long d = this.f191243a.mo86302d();
            if (d > 0) {
                this.f191244b.mo74930a(this.f191243a, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191244b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f191245c) {
            int write = this.f191243a.write(byteBuffer);
            mo86330p();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public final void mo86289a(byte[] bArr) {
        if (!this.f191245c) {
            cipu cipu = this.f191243a;
            if (bArr != null) {
                cipu.mo86294b(bArr, 0, bArr.length);
                mo86330p();
                return;
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }
}
