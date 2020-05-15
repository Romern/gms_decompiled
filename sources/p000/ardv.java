package p000;

/* renamed from: ardv */
final /* synthetic */ class ardv implements arql {

    /* renamed from: a */
    private final ardy f87475a;

    public ardv(ardy ardy) {
        this.f87475a = ardy;
    }

    /* renamed from: a */
    public final void mo48368a() {
        ardy ardy = this.f87475a;
        if (ardy.f87485f) {
            ardy.f87480a.mo25416d("AccountTransfer Imports timed out", new Object[0]);
            if (ardy.m72570b(ardy.f87488i)) {
                ardy.mo48451b();
            } else {
                ardy.f87483d.mo48454a(15, "Timed out while waiting on AccountTransfer imports");
            }
        }
    }
}
