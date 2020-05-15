package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: aflq */
public final /* synthetic */ class aflq implements Runnable {

    /* renamed from: a */
    private final afmp f64336a;

    /* renamed from: b */
    private final LatestFootprintFilter f64337b;

    /* renamed from: c */
    private final aucf f64338c;

    public aflq(afmp afmp, LatestFootprintFilter latestFootprintFilter, aucf aucf) {
        this.f64336a = afmp;
        this.f64337b = latestFootprintFilter;
        this.f64338c = aucf;
    }

    public final void run() {
        afmp afmp = this.f64336a;
        LatestFootprintFilter latestFootprintFilter = this.f64337b;
        aucf aucf = this.f64338c;
        afno afno = afmp.f64395c;
        roz b = rpa.m34196b();
        b.f43472a = new aflv(afmp, latestFootprintFilter);
        b.f43473b = new Feature[]{abpq.f57883a};
        afno.mo24701a(b.mo24977a()).mo50378a(afmp.f64393a, new aflw(aucf));
    }
}
