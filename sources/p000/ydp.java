package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ydp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ydp extends ydz {

    /* renamed from: e */
    private final int f53667e;

    /* renamed from: f */
    private long f53668f = 0;

    /* renamed from: g */
    private int f53669g = 0;

    public ydp(caae caae, int i) {
        super(caae);
        this.f53667e = i;
    }

    /* renamed from: b */
    public final double mo30383b(cadn cadn) {
        long millis = TimeUnit.NANOSECONDS.toMillis(cadn.f172702b) - TimeUnit.NANOSECONDS.toMillis(cadn.f172703c);
        this.f53668f += millis;
        this.f53669g++;
        return (double) millis;
    }

    /* renamed from: c */
    public final cadn mo30384c() {
        return yyk.m45015a(this.f53683a, mo30394d(), this.f53684b, this.f53685c, TimeUnit.NANOSECONDS, yyp.m45047a(this.f53667e), yyp.m45047a((int) this.f53668f), yyp.m45047a(this.f53669g));
    }
}
