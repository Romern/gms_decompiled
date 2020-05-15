package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: afls */
public final /* synthetic */ class afls implements Runnable {

    /* renamed from: a */
    private final afmp f64343a;

    /* renamed from: b */
    private final rod f64344b;

    /* renamed from: c */
    private final afmj f64345c;

    /* renamed from: d */
    private final LatestFootprintFilter f64346d;

    /* renamed from: e */
    private final rob f64347e;

    /* renamed from: f */
    private final aucf f64348f;

    /* renamed from: g */
    private final basu f64349g;

    public afls(afmp afmp, rod rod, afmj afmj, basu basu, LatestFootprintFilter latestFootprintFilter, rob rob, aucf aucf) {
        this.f64343a = afmp;
        this.f64344b = rod;
        this.f64345c = afmj;
        this.f64349g = basu;
        this.f64346d = latestFootprintFilter;
        this.f64347e = rob;
        this.f64348f = aucf;
    }

    public final void run() {
        afmp afmp = this.f64343a;
        rod rod = this.f64344b;
        afmj afmj = this.f64345c;
        afmp.f64396d.mo24699a(new afmb(afmp, rod, afmj, this.f64349g, this.f64346d), new afmd(afmp, this.f64347e, afmj)).mo50378a(afmp.f64393a, new aflt(this.f64348f));
    }
}
