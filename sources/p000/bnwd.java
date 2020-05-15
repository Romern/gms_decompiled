package p000;

/* renamed from: bnwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwd extends bnwf {
    public bnwd(bnvj bnvj, bnvp bnvp) {
        super(bnvj, bnvp);
    }

    /* renamed from: d */
    public static bnwd m110619d() {
        return new bnwd(bnvj.m110496a(), bnvp.m110535c());
    }

    /* renamed from: a */
    public final bnvj mo68622a() {
        return new bnvj(this.f132276a);
    }

    /* renamed from: b */
    public final bnvp mo68625b() {
        return new bnvp(this.f132277b);
    }

    /* renamed from: c */
    public final bnwe mo68626c() {
        return new bnwe(new bnvj(this.f132276a), new bnvp(this.f132277b));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new bnwe(mo68634g(), mo68635h());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 <= r0.f132221b) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: a */
    public final void mo68623a(bnwc bnwc) {
        double d;
        bnvj bnvj = this.f132276a;
        double d2 = bnwc.mo68614a().f132229b;
        if (!bnvj.mo68521b()) {
            if (d2 < bnvj.f132220a) {
                bnvj.f132220a = d2;
            }
            bnvp bnvp = this.f132277b;
            d = bnwc.mo68616c().f132229b;
            if (d == -3.141592653589793d) {
                d = 3.141592653589793d;
            }
            bnvp.mo68565b(new bnvp(d, d, true));
        }
        bnvj.f132220a = d2;
        bnvj.f132221b = d2;
        bnvp bnvp2 = this.f132277b;
        d = bnwc.mo68616c().f132229b;
        if (d == -3.141592653589793d) {
        }
        bnvp2.mo68565b(new bnvp(d, d, true));
    }

    /* renamed from: a */
    public final void mo68624a(bnwe bnwe) {
        this.f132276a.mo68517a(bnwe.f132276a);
        this.f132277b.mo68565b(bnwe.f132277b);
    }
}
