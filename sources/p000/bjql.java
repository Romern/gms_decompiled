package p000;

/* renamed from: bjql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjql extends bjhs {

    /* renamed from: d */
    public int f123141d;

    public bjql() {
        super(bwys.f161517d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        this.f123141d = ((bwys) bxxc).f161520b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwys.f161516c.mo74144da();
        int i = this.f123141d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwys bwys = (bwys) da.f164949b;
        bwys.f161519a |= 1;
        bwys.f161520b = i;
        return (bwys) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo65453b(int i) {
        if (this.f123141d != i) {
            this.f123141d = i;
            mo65244a((bjgf) null);
        }
    }
}
