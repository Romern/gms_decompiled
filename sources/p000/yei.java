package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class yei extends ydz {

    /* renamed from: e */
    private double f53697e = 90.0d;

    /* renamed from: f */
    private double f53698f = -90.0d;

    /* renamed from: g */
    private double f53699g = 180.0d;

    /* renamed from: h */
    private double f53700h = -180.0d;

    public yei(caae caae) {
        super(caae);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30396a(double d, double d2) {
        this.f53697e = Math.min(this.f53697e, d);
        this.f53698f = Math.max(this.f53698f, d);
        this.f53699g = Math.min(this.f53699g, d2);
        this.f53700h = Math.max(this.f53700h, d2);
    }

    /* renamed from: c */
    public final cadn mo30384c() {
        return yyk.m45015a(this.f53683a, mo30394d(), this.f53684b, this.f53685c, TimeUnit.NANOSECONDS, yyp.m45046a(this.f53697e), yyp.m45046a(this.f53699g), yyp.m45046a(this.f53698f), yyp.m45046a(this.f53700h));
    }
}
