package p000;

/* renamed from: bjoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoh extends bjhs {

    /* renamed from: d */
    public int f123048d;

    public bjoh() {
        super(bwtp.f160982d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        int a = bwty.m122305a(((bwtp) bxxc).f160985b);
        if (a == 0) {
            a = 2;
        }
        this.f123048d = a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwtp.f160981c.mo74144da();
        int i = this.f123048d;
        if (i != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwtp bwtp = (bwtp) da.f164949b;
            bwtp.f160985b = i - 1;
            bwtp.f160984a |= 1;
        }
        return (bwtp) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65409b(int i) {
        if (this.f123048d != i) {
            this.f123048d = i;
            mo65244a((bjgf) null);
        }
    }
}
