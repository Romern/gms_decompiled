package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmm {

    /* renamed from: a */
    public final List f64384a = new ArrayList();

    /* renamed from: b */
    public boolean f64385b;

    /* renamed from: c */
    public final aucf f64386c;

    /* renamed from: d */
    final /* synthetic */ afmp f64387d;

    /* renamed from: e */
    private final afmo f64388e;

    public afmm(afmp afmp, aucf aucf, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.f64387d = afmp;
        this.f64386c = aucf;
        this.f64388e = new afmo(afmp, syncPolicy, latestFootprintFilter);
    }

    /* renamed from: a */
    public final void mo34965a() {
        this.f64385b = true;
        this.f64387d.f64395c.mo24732b(this.f64388e).mo50378a(this.f64387d.f64393a, new afml(this));
    }
}
