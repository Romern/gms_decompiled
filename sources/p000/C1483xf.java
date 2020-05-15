package p000;

/* renamed from: xf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1483xf implements C1457wg {

    /* renamed from: a */
    final /* synthetic */ C1485xh f27563a;

    public C1483xf(C1485xh xhVar) {
        this.f27563a = xhVar;
    }

    /* renamed from: a */
    public final void mo15958a(C1443vt vtVar, boolean z) {
        if (vtVar instanceof C1466wp) {
            vtVar.mo16261j().mo16226a(false);
        }
        C1457wg wgVar = this.f27563a.f27365e;
        if (wgVar != null) {
            wgVar.mo15958a(vtVar, z);
        }
    }

    /* renamed from: a */
    public final boolean mo15959a(C1443vt vtVar) {
        if (vtVar != null) {
            C1485xh xhVar = this.f27563a;
            xhVar.f27572p = ((C1466wp) vtVar).f27527k.f27454a;
            C1457wg wgVar = xhVar.f27365e;
            if (wgVar != null) {
                return wgVar.mo15959a(vtVar);
            }
        }
        return false;
    }
}
