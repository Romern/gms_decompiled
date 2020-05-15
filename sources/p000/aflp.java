package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: aflp */
public final /* synthetic */ class aflp implements Runnable {

    /* renamed from: a */
    private final afmp f64333a;

    /* renamed from: b */
    private final LatestFootprintFilter f64334b;

    /* renamed from: c */
    private final aucf f64335c;

    public aflp(afmp afmp, LatestFootprintFilter latestFootprintFilter, aucf aucf) {
        this.f64333a = afmp;
        this.f64334b = latestFootprintFilter;
        this.f64335c = aucf;
    }

    public final void run() {
        afmp afmp = this.f64333a;
        afmp.f64395c.mo24701a((rpa) new afly(afmp, this.f64334b)).mo50378a(afmp.f64393a, new aflx(this.f64335c));
    }
}
