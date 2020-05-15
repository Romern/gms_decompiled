package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;

/* renamed from: afmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afmo extends rpa {

    /* renamed from: a */
    final /* synthetic */ afmp f64390a;

    /* renamed from: b */
    private final SyncPolicy f64391b;

    /* renamed from: c */
    private final LatestFootprintFilter f64392c;

    public afmo(afmp afmp, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.f64390a = afmp;
        this.f64391b = syncPolicy;
        this.f64392c = latestFootprintFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        afmn afmn = new afmn(aucf);
        afni afni = (afni) ((afnp) rjd).mo25289B();
        afmp afmp = this.f64390a;
        afni.mo32804a(afmn, afmp.f64397e, afmp.f64398f, afmp.f64399g, this.f64391b, this.f64392c);
    }
}
