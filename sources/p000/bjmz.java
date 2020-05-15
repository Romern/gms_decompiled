package p000;

/* renamed from: bjmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmz extends bjhs {

    /* renamed from: d */
    bxtx f122993d = null;

    public bjmz() {
        super(bwqx.f160733d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwqx bwqx = (bwqx) bxxc;
        this.f122993d = (bwqx.f160735a & 1) != 0 ? bwqx.f160736b : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwqx.f160732c.mo74144da();
        bxtx bxtx = this.f122993d;
        if (bxtx != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwqx bwqx = (bwqx) da.f164949b;
            bxtx.getClass();
            bwqx.f160735a |= 1;
            bwqx.f160736b = bxtx;
        }
        return (bwqx) da.mo74062i();
    }
}
