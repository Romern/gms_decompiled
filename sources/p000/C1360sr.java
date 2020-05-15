package p000;

import android.view.Window;

/* renamed from: sr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1360sr implements C1457wg {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27035a;

    public C1360sr(C1372tc tcVar) {
        this.f27035a = tcVar;
    }

    /* renamed from: a */
    public final void mo15958a(C1443vt vtVar, boolean z) {
        this.f27035a.mo15993b(vtVar);
    }

    /* renamed from: a */
    public final boolean mo15959a(C1443vt vtVar) {
        Window.Callback q = this.f27035a.mo15998q();
        if (q == null) {
            return true;
        }
        q.onMenuOpened(108, vtVar);
        return true;
    }
}
