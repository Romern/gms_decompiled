package p000;

/* renamed from: bjrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrm extends bjhs {

    /* renamed from: d */
    int f123186d;

    public bjrm() {
        super(bxap.f161733d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65478a(int i, bjgf bjgf) {
        if (i != this.f123186d) {
            this.f123186d = i;
            mo65244a(bjgf);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        int a = bxar.m122500a(((bxap) bxxc).f161736b);
        if (a == 0) {
            a = 1;
        }
        mo65478a(a, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bxap.f161732c.mo74144da();
        int i = this.f123186d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxap bxap = (bxap) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bxap.f161736b = i2;
            bxap.f161735a |= 1;
            return (bxap) da.mo74062i();
        }
        throw null;
    }
}
