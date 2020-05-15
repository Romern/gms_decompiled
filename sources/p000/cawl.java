package p000;

import java.util.logging.Level;

/* renamed from: cawl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawl implements ciqr {

    /* renamed from: a */
    int f176257a;

    /* renamed from: b */
    byte f176258b;

    /* renamed from: c */
    int f176259c;

    /* renamed from: d */
    int f176260d;

    /* renamed from: e */
    short f176261e;

    /* renamed from: f */
    private final cipw f176262f;

    public cawl(cipw cipw) {
        this.f176262f = cipw;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        int i;
        int g;
        do {
            int i2 = this.f176260d;
            if (i2 == 0) {
                this.f176262f.mo86317h((long) this.f176261e);
                this.f176261e = 0;
                if ((this.f176258b & 4) != 0) {
                    return -1;
                }
                i = this.f176259c;
                int a = cawp.m127425a(this.f176262f);
                this.f176260d = a;
                this.f176257a = a;
                byte e = (byte) (this.f176262f.mo86305e() & 255);
                this.f176258b = (byte) (this.f176262f.mo86305e() & 255);
                if (cawp.f176276a.isLoggable(Level.FINE)) {
                    cawp.f176276a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", cawm.m127407a(true, this.f176259c, this.f176257a, e, this.f176258b));
                }
                g = this.f176262f.mo86312g() & Integer.MAX_VALUE;
                this.f176259c = g;
                if (e != 9) {
                    throw cawp.m127427b("%s != TYPE_CONTINUATION", Byte.valueOf(e));
                }
            } else {
                long c = this.f176262f.mo74995c(cipu, Math.min(j, (long) i2));
                if (c == -1) {
                    return -1;
                }
                this.f176260d = (int) (((long) this.f176260d) - c);
                return c;
            }
        } while (g == i);
        throw cawp.m127427b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    public final void close() {
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f176262f.mo74997df();
    }
}
