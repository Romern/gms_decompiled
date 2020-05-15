package p000;

import android.view.MenuItem;

/* renamed from: tj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1379tj implements C1441vr {

    /* renamed from: a */
    final /* synthetic */ C1381tl f27133a;

    public C1379tj(C1381tl tlVar) {
        this.f27133a = tlVar;
    }

    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
        C1381tl tlVar = this.f27133a;
        if (tlVar.f27137c == null) {
            return;
        }
        if (tlVar.f27135a.mo509i()) {
            this.f27133a.f27137c.onPanelClosed(108, vtVar);
        } else if (this.f27133a.f27137c.onPreparePanel(0, null, vtVar)) {
            this.f27133a.f27137c.onMenuOpened(108, vtVar);
        }
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        return false;
    }
}
