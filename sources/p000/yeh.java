package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yeh implements yfd {

    /* renamed from: a */
    private final caae f53692a;

    /* renamed from: b */
    private double f53693b;

    /* renamed from: c */
    private int f53694c;

    /* renamed from: d */
    private long f53695d = Long.MAX_VALUE;

    /* renamed from: e */
    private long f53696e = Long.MIN_VALUE;

    public yeh(caae caae) {
        this.f53692a = caae;
    }

    /* renamed from: a */
    public final caae mo30379a() {
        return this.f53692a;
    }

    /* renamed from: b */
    public final bngx mo30382b() {
        long j = this.f53695d;
        if (j == Long.MAX_VALUE && this.f53696e == Long.MIN_VALUE) {
            return bngx.m109376e();
        }
        return bngx.m109356a(yyk.m45011a(this.f53692a, j, this.f53696e, TimeUnit.NANOSECONDS, yyp.m45046a(this.f53693b), yyp.m45047a(this.f53694c)));
    }

    /* renamed from: a */
    public final void mo30381a(cadn cadn) {
        double d = ((caaw) cadn.f172704d.get(0)).f172383c;
        this.f53695d = Math.min(this.f53695d, cadn.f172703c);
        this.f53696e = Math.max(this.f53696e, cadn.f172702b);
        if (d > 0.0d) {
            this.f53693b += d;
            this.f53694c++;
        }
    }
}
