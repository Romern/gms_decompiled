package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ciqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciqf implements ciqr {

    /* renamed from: a */
    final /* synthetic */ ciqt f191236a;

    /* renamed from: b */
    final /* synthetic */ InputStream f191237b;

    public ciqf(ciqt ciqt, InputStream inputStream) {
        this.f191236a = ciqt;
        this.f191237b = inputStream;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.f191236a.mo86356e();
                ciqn a = cipu.mo86283a(1);
                int read = this.f191237b.read(a.f191250a, a.f191252c, (int) Math.min(j, (long) (8192 - a.f191252c)));
                if (read == -1) {
                    return -1;
                }
                a.f191252c += read;
                long j2 = (long) read;
                cipu.f191213b += j2;
                return j2;
            } catch (AssertionError e) {
                if (ciqh.m150835a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    public final void close() {
        this.f191237b.close();
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191236a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191237b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
