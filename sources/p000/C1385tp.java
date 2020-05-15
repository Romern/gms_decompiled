package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* renamed from: tp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1385tp extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ C1389tt f27153a;

    public C1385tp(C1389tt ttVar) {
        this.f27153a = ttVar;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        View view2;
        C1389tt ttVar = this.f27153a;
        if (ttVar.f27175k && (view2 = ttVar.f27170f) != null) {
            view2.setTranslationY(0.0f);
            this.f27153a.f27167c.setTranslationY(0.0f);
        }
        this.f27153a.f27167c.setVisibility(8);
        this.f27153a.f27167c.mo1227a(false);
        C1389tt ttVar2 = this.f27153a;
        ttVar2.f27178n = null;
        C1413uq uqVar = ttVar2.f27173i;
        if (uqVar != null) {
            uqVar.mo15960a(ttVar2.f27172h);
            ttVar2.f27172h = null;
            ttVar2.f27173i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27153a.f27166b;
        if (actionBarOverlayLayout != null) {
            C1280ps.m19937s(actionBarOverlayLayout);
        }
    }
}
