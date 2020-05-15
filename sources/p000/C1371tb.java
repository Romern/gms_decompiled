package p000;

import android.view.Menu;
import android.view.Window;

/* renamed from: tb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1371tb implements C1457wg {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27068a;

    public C1371tb(C1372tc tcVar) {
        this.f27068a = tcVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    /* renamed from: a */
    public final void mo15958a(C1443vt vtVar, boolean z) {
        C1443vt vtVar2;
        C1443vt j = vtVar.mo16261j();
        C1372tc tcVar = this.f27068a;
        if (j == vtVar) {
            vtVar2 = vtVar;
        } else {
            vtVar2 = j;
        }
        C1370ta a = tcVar.mo15986a((Menu) vtVar2);
        if (a == null) {
            return;
        }
        if (j != vtVar) {
            this.f27068a.mo15988a(a.f27049a, a, j);
            this.f27068a.mo15989a(a, true);
            return;
        }
        this.f27068a.mo15989a(a, z);
    }

    /* renamed from: a */
    public final boolean mo15959a(C1443vt vtVar) {
        Window.Callback q;
        if (vtVar != null) {
            return true;
        }
        C1372tc tcVar = this.f27068a;
        if (!tcVar.f27114s || (q = tcVar.mo15998q()) == null || this.f27068a.f27120y) {
            return true;
        }
        q.onMenuOpened(108, null);
        return true;
    }
}
