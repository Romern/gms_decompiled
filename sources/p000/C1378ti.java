package p000;

import android.view.Window;

/* renamed from: ti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1378ti implements C1457wg {

    /* renamed from: a */
    final /* synthetic */ C1381tl f27131a;

    /* renamed from: b */
    private boolean f27132b;

    public C1378ti(C1381tl tlVar) {
        this.f27131a = tlVar;
    }

    /* renamed from: a */
    public final void mo15958a(C1443vt vtVar, boolean z) {
        if (!this.f27132b) {
            this.f27132b = true;
            this.f27131a.f27135a.mo514n();
            Window.Callback callback = this.f27131a.f27137c;
            if (callback != null) {
                callback.onPanelClosed(108, vtVar);
            }
            this.f27132b = false;
        }
    }

    /* renamed from: a */
    public final boolean mo15959a(C1443vt vtVar) {
        Window.Callback callback = this.f27131a.f27137c;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(108, vtVar);
        return true;
    }
}
