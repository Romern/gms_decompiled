package p000;

/* renamed from: bbhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhd implements bbfp {

    /* renamed from: a */
    public final bbgj f102623a;

    /* renamed from: b */
    public final bnsn f102624b;

    /* renamed from: c */
    private final bbhp f102625c;

    public bbhd(bbhp bbhp, bbgj bbgj, bnsn bnsn) {
        this.f102625c = bbhp;
        this.f102623a = bbgj;
        this.f102624b = bnsn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bmxv mo56135a(Throwable th) {
        bnsi c = this.f102624b.mo68388c();
        c.mo68437a(th);
        c.mo68432a("bbhd", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Error during local lookup");
        return bmvz.f131120a;
    }

    /* renamed from: b */
    public final bqgg mo56137b(Iterable iterable, bbfu bbfu) {
        bqgg bqgg;
        bbhp bbhp = this.f102625c;
        bmxy.m108581a(iterable);
        bmxy.m108581a(bbfu);
        int i = ((bbfq) bbfu).f102562b;
        bbjn bbjn = bbhp.f102665d;
        if (bbjn == null || i == 0) {
            bqgg = bbhp.mo56143a(iterable);
        } else {
            bqgg = bbjn.mo34066a(new bbhk(bbhp, iterable), 1, bbhp.f102662a);
        }
        return bqdx.m112674a(bqgg, new bbha(this, iterable), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56101a(Iterable iterable, bbfu bbfu) {
        if (!((bbfq) bbfu).f102561a) {
            return bqdx.m112674a(bqdf.m112619a(bqdx.m112673a(bqfl.m112747c(this.f102623a.mo56101a(iterable, bbfu)), bbgv.f102614a, bqfb.INSTANCE), Throwable.class, new bbgw(this), bqfb.INSTANCE), new bbgu(this, iterable, bbfu), bqfb.INSTANCE);
        }
        return mo56137b(iterable, bbfu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo56136a(Exception exc) {
        bnsi c = this.f102624b.mo68388c();
        c.mo68437a(exc);
        c.mo68432a("bbhd", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Error during caching results of online lookp");
        return null;
    }
}
