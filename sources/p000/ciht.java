package p000;

import java.util.logging.Level;

/* renamed from: ciht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciht implements ciqr {

    /* renamed from: a */
    int f190367a;

    /* renamed from: b */
    byte f190368b;

    /* renamed from: c */
    int f190369c;

    /* renamed from: d */
    int f190370d;

    /* renamed from: e */
    short f190371e;

    /* renamed from: f */
    private final cipw f190372f;

    public ciht(cipw cipw) {
        this.f190372f = cipw;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        int i;
        int g;
        do {
            int i2 = this.f190370d;
            if (i2 == 0) {
                this.f190372f.mo86317h((long) this.f190371e);
                this.f190371e = 0;
                if ((this.f190368b & 4) != 0) {
                    return -1;
                }
                i = this.f190369c;
                int a = cihx.m150358a(this.f190372f);
                this.f190370d = a;
                this.f190367a = a;
                byte e = (byte) (this.f190372f.mo86305e() & 255);
                this.f190368b = (byte) (this.f190372f.mo86305e() & 255);
                if (cihx.f190384a.isLoggable(Level.FINE)) {
                    cihx.f190384a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", cihu.m150342a(true, this.f190369c, this.f190367a, e, this.f190368b));
                }
                g = this.f190372f.mo86312g() & Integer.MAX_VALUE;
                this.f190369c = g;
                if (e != 9) {
                    throw cihx.m150360b("%s != TYPE_CONTINUATION", Byte.valueOf(e));
                }
            } else {
                long c = this.f190372f.mo74995c(cipu, Math.min(j, (long) i2));
                if (c == -1) {
                    return -1;
                }
                this.f190370d -= (int) c;
                return c;
            }
        } while (g == i);
        throw cihx.m150360b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    public final void close() {
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f190372f.mo74997df();
    }
}
