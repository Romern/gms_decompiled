package p000;

import java.nio.charset.Charset;
import java.util.zip.Deflater;

/* renamed from: cipy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipy implements ciqq {

    /* renamed from: a */
    private final cipv f191219a;

    /* renamed from: b */
    private final Deflater f191220b;

    /* renamed from: c */
    private boolean f191221c;

    public cipy(cipv cipv, Deflater deflater) {
        this.f191219a = cipv;
        this.f191220b = deflater;
    }

    /* renamed from: a */
    private final void m150799a(boolean z) {
        ciqn a;
        int i;
        cipu cipu = ((ciqk) this.f191219a).f191243a;
        while (true) {
            a = cipu.mo86283a(1);
            if (z) {
                Deflater deflater = this.f191220b;
                byte[] bArr = a.f191250a;
                int i2 = a.f191252c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f191220b;
                byte[] bArr2 = a.f191250a;
                int i3 = a.f191252c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                a.f191252c += i;
                cipu.f191213b += (long) i;
                this.f191219a.mo86330p();
            } else if (this.f191220b.needsInput()) {
                break;
            }
        }
        if (a.f191251b == a.f191252c) {
            cipu.f191212a = a.mo86386b();
            ciqo.m150875a(a);
        }
    }

    public final void close() {
        if (!this.f191221c) {
            try {
                this.f191220b.finish();
                m150799a(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f191220b.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f191219a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f191221c = true;
            if (th != null) {
                Charset charset = ciqu.f191265a;
                throw th;
            }
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f191219a.mo74932df();
    }

    public final void flush() {
        m150799a(true);
        this.f191219a.flush();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191219a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("DeflaterSink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        ciqu.m150905a(cipu.f191213b, 0, j);
        while (j > 0) {
            ciqn ciqn = cipu.f191212a;
            int min = (int) Math.min(j, (long) (ciqn.f191252c - ciqn.f191251b));
            this.f191220b.setInput(ciqn.f191250a, ciqn.f191251b, min);
            m150799a(false);
            long j2 = (long) min;
            cipu.f191213b -= j2;
            int i = ciqn.f191251b + min;
            ciqn.f191251b = i;
            if (i == ciqn.f191252c) {
                cipu.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            }
            j -= j2;
        }
    }
}
