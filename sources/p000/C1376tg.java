package p000;

import android.view.Menu;

/* renamed from: tg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1376tg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1381tl f27129a;

    public C1376tg(C1381tl tlVar) {
        this.f27129a = tlVar;
    }

    public final void run() {
        C1443vt vtVar;
        C1381tl tlVar = this.f27129a;
        Menu q = tlVar.mo16019q();
        if (q instanceof C1443vt) {
            vtVar = (C1443vt) q;
        } else {
            vtVar = null;
        }
        if (vtVar != null) {
            vtVar.mo16252e();
        }
        try {
            q.clear();
            if (!tlVar.f27137c.onCreatePanelMenu(0, q) || !tlVar.f27137c.onPreparePanel(0, null, q)) {
                q.clear();
            }
            if (vtVar != null) {
                vtVar.mo16253f();
            }
        } catch (Throwable th) {
            if (vtVar != null) {
                vtVar.mo16253f();
            }
            throw th;
        }
    }
}
