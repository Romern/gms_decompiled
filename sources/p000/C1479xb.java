package p000;

import android.view.View;

/* renamed from: xb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1479xb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1485xh f27558a;

    /* renamed from: b */
    private final C1482xe f27559b;

    public C1479xb(C1485xh xhVar, C1482xe xeVar) {
        this.f27558a = xhVar;
        this.f27559b = xeVar;
    }

    public final void run() {
        C1441vr vrVar;
        C1443vt vtVar = this.f27558a.f27363c;
        if (!(vtVar == null || (vrVar = vtVar.f27424b) == null)) {
            vrVar.mo132a(vtVar);
        }
        View view = (View) this.f27558a.f27366f;
        if (!(view == null || view.getWindowToken() == null || !this.f27559b.mo16396c())) {
            this.f27558a.f27568l = this.f27559b;
        }
        this.f27558a.f27570n = null;
    }
}
