package p000;

/* renamed from: aerl */
final /* synthetic */ class aerl implements aerc {

    /* renamed from: a */
    private final aero f63675a;

    public aerl(aero aero) {
        this.f63675a = aero;
    }

    /* renamed from: a */
    public final void mo9721a(int i, int i2) {
        aero aero = this.f63675a;
        synchronized (aero.f63684c) {
            aero.f63688g = aeri.m52433a(i2);
            aero.mo34496c();
            if (i == 0 && i2 != 0) {
                aero.mo34495b("passive", true);
                aero.mo34495b("fused", true);
            } else if (i != 0 && i2 == 0) {
                aero.mo34495b("passive", false);
                aero.mo34495b("fused", false);
            }
        }
    }
}
