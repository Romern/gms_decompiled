package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: afmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afmb extends roh {

    /* renamed from: c */
    final /* synthetic */ afmj f64362c;

    /* renamed from: d */
    final /* synthetic */ LatestFootprintFilter f64363d;

    /* renamed from: e */
    final /* synthetic */ afmp f64364e;

    /* renamed from: f */
    final /* synthetic */ basu f64365f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afmb(afmp afmp, rod rod, afmj afmj, basu basu, LatestFootprintFilter latestFootprintFilter) {
        super(rod);
        this.f64364e = afmp;
        this.f64362c = afmj;
        this.f64365f = basu;
        this.f64363d = latestFootprintFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        afmt afmt;
        afns afns = (afns) rjd;
        afmj afmj = this.f64362c;
        basu basu = this.f64365f;
        synchronized (afmj.f64379b.f64401i) {
            if (afmj.f64378a) {
                if (afmj.f64380c == null) {
                    afmj.f64380c = new afmt(afmj.f64379b.f64394b, basu);
                }
                afmt afmt2 = afmj.f64380c;
                afmt = afmt2;
            } else {
                afmt = null;
            }
        }
        if (afmt != null) {
            afnf n = afns.mo34974n();
            afme afme = new afme(aucf);
            afmp afmp = this.f64364e;
            n.mo32821a(afme, afmp.f64397e, afmp.f64398f, afmp.f64399g, this.f64363d, afmt);
            return;
        }
        aucf.mo50391a((Object) null);
    }
}
