package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ciqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqd implements ciqr {

    /* renamed from: a */
    private final cipw f191230a;

    /* renamed from: b */
    private final Inflater f191231b;

    /* renamed from: c */
    private int f191232c;

    /* renamed from: d */
    private boolean f191233d;

    public ciqd(cipw cipw, Inflater inflater) {
        if (cipw == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f191230a = cipw;
            this.f191231b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: c */
    private final void m150817c() {
        int i = this.f191232c;
        if (i != 0) {
            int remaining = i - this.f191231b.getRemaining();
            this.f191232c -= remaining;
            this.f191230a.mo86317h((long) remaining);
        }
    }

    /* renamed from: b */
    public final boolean mo86361b() {
        if (!this.f191231b.needsInput()) {
            return false;
        }
        m150817c();
        if (this.f191231b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f191230a.mo86295b()) {
            return true;
        } else {
            ciqn ciqn = ((ciqm) this.f191230a).f191247a.f191212a;
            int i = ciqn.f191252c;
            int i2 = ciqn.f191251b;
            int i3 = i - i2;
            this.f191232c = i3;
            this.f191231b.setInput(ciqn.f191250a, i2, i3);
            return false;
        }
    }

    public final void close() {
        if (!this.f191233d) {
            this.f191231b.end();
            this.f191233d = true;
            this.f191230a.close();
        }
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191230a.mo74997df();
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        ciqn a;
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f191233d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean b = mo86361b();
                try {
                    a = cipu.mo86283a(1);
                    int inflate = this.f191231b.inflate(a.f191250a, a.f191252c, (int) Math.min(j, (long) (8192 - a.f191252c)));
                    if (inflate > 0) {
                        a.f191252c += inflate;
                        long j2 = (long) inflate;
                        cipu.f191213b += j2;
                        return j2;
                    } else if (!this.f191231b.finished() && !this.f191231b.needsDictionary()) {
                        if (b) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m150817c();
            if (a.f191251b != a.f191252c) {
                return -1;
            }
            cipu.f191212a = a.mo86386b();
            ciqo.m150875a(a);
            return -1;
        }
    }
}
