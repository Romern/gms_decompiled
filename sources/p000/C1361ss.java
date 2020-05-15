package p000;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: ss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1361ss extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ C1362st f27036a;

    public C1361ss(C1362st stVar) {
        this.f27036a = stVar;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        this.f27036a.f27037a.f27107l.setVisibility(8);
        C1372tc tcVar = this.f27036a.f27037a;
        PopupWindow popupWindow = tcVar.f27108m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (tcVar.f27107l.getParent() instanceof View) {
            C1280ps.m19937s((View) this.f27036a.f27037a.f27107l.getParent());
        }
        this.f27036a.f27037a.f27107l.removeAllViews();
        this.f27036a.f27037a.f27110o.mo15711a((C1286py) null);
        C1372tc tcVar2 = this.f27036a.f27037a;
        tcVar2.f27110o = null;
        C1280ps.m19937s(tcVar2.f27112q);
    }
}
