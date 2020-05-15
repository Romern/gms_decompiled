package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yds extends ydz {

    /* renamed from: e */
    private final int f53670e;

    /* renamed from: f */
    private long f53671f = 0;

    /* renamed from: g */
    private int f53672g = 0;

    public yds(caae caae, int i) {
        super(caae);
        this.f53670e = i;
    }

    /* renamed from: b */
    public final double mo30383b(cadn cadn) {
        this.f53671f += (long) ((caaw) cadn.f172704d.get(1)).f172382b;
        this.f53672g += ((caaw) cadn.f172704d.get(2)).f172382b;
        return (double) this.f53671f;
    }

    /* renamed from: c */
    public final cadn mo30384c() {
        return yyk.m45015a(this.f53683a, mo30394d(), this.f53684b, this.f53685c, TimeUnit.NANOSECONDS, yyp.m45047a(this.f53670e), yyp.m45047a((int) this.f53671f), yyp.m45047a(this.f53672g));
    }
}
