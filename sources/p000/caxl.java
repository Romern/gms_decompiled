package p000;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: caxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxl extends caxh {

    /* renamed from: d */
    final /* synthetic */ caxn f176321d;

    /* renamed from: e */
    private long f176322e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caxl(caxn caxn, long j) {
        super(caxn);
        this.f176321d = caxn;
        this.f176322e = j;
        if (j == 0) {
            mo75040b();
        }
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f176308b) {
            long j2 = this.f176322e;
            if (j2 == 0) {
                return -1;
            }
            long c = this.f176321d.f176326b.mo74995c(cipu, Math.min(j2, j));
            if (c != -1) {
                long j3 = this.f176322e - c;
                this.f176322e = j3;
                if (j3 == 0) {
                    mo75040b();
                }
                return c;
            }
            mo75041c();
            throw new ProtocolException("unexpected end of stream");
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cavk.a(ciqr, java.util.concurrent.TimeUnit):boolean
     arg types: [caxl, java.util.concurrent.TimeUnit]
     candidates:
      cavk.a(long, long):void
      cavk.a(java.io.Closeable, java.io.Closeable):void
      cavk.a(java.lang.Object, java.lang.Object):boolean
      cavk.a(java.lang.String[], java.lang.String):boolean
      cavk.a(ciqr, java.util.concurrent.TimeUnit):boolean */
    public final void close() {
        if (!this.f176308b) {
            if (this.f176322e != 0 && !cavk.m127314a((ciqr) this, TimeUnit.MILLISECONDS)) {
                mo75041c();
            }
            this.f176308b = true;
        }
    }
}
