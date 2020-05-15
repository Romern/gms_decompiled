package p000;

/* renamed from: zgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgv extends zgw {

    /* renamed from: a */
    final /* synthetic */ zha f55043a;

    public zgv(zha zha) {
        this.f55043a = zha;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo31101a() {
        zha zha = this.f55043a;
        srn srn = zha.f55051a;
        zha.f55063m.mo31140a("discoverProperties");
        synchronized (this.f55043a.f55061k) {
            zha zha2 = this.f55043a;
            zhn zhn = zha2.f55062l;
            if (zhn == null) {
                zha2.f55063m.mo31139a();
            } else if (!zhn.mo31133c()) {
                ((bnsl) zha.f55051a.mo68388c()).mo68405a("Failed to start discover services");
                this.f55043a.f55063m.mo31139a();
            }
        }
    }
}
