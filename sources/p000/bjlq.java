package p000;

/* renamed from: bjlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjlq extends bjhs {

    /* renamed from: d */
    public int f122942d = 1;

    public bjlq() {
        super(bwnn.f160374d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        int a = bwnm.m122135a(((bwnn) bxxc).f160377b);
        if (a == 0) {
            a = 1;
        }
        mo65370b(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwnn.f160373c.mo74144da();
        int i = this.f122942d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwnn bwnn = (bwnn) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bwnn.f160377b = i2;
            bwnn.f160376a |= 1;
            return (bwnn) da.mo74062i();
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65370b(int i) {
        if (this.f122942d != i) {
            this.f122942d = i;
            mo65244a((bjgf) null);
        }
    }
}
