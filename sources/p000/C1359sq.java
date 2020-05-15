package p000;

import android.view.View;

/* renamed from: sq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1359sq extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27034a;

    public C1359sq(C1372tc tcVar) {
        this.f27034a = tcVar;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        this.f27034a.f27107l.setAlpha(1.0f);
        this.f27034a.f27110o.mo15711a((C1286py) null);
        this.f27034a.f27110o = null;
    }

    /* renamed from: b */
    public final void mo485b() {
        this.f27034a.f27107l.setVisibility(0);
        this.f27034a.f27107l.sendAccessibilityEvent(32);
        if (this.f27034a.f27107l.getParent() instanceof View) {
            C1280ps.m19937s((View) this.f27034a.f27107l.getParent());
        }
    }
}
