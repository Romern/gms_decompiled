package p000;

import android.content.Context;
import android.view.View;

/* renamed from: xe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1482xe extends C1456wf {

    /* renamed from: c */
    final /* synthetic */ C1485xh f27562c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1482xe(C1485xh xhVar, Context context, C1443vt vtVar, View view) {
        super(context, vtVar, view, true);
        this.f27562c = xhVar;
        mo16400g();
        mo16393a(xhVar.f27571o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16398e() {
        C1443vt vtVar = this.f27562c.f27363c;
        if (vtVar != null) {
            vtVar.close();
        }
        this.f27562c.f27568l = null;
        super.mo16398e();
    }
}
