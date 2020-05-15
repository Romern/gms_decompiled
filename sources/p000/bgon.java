package p000;

/* renamed from: bgon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgon {

    /* renamed from: a */
    private int f116938a = 0;

    /* renamed from: b */
    private int f116939b = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63040a() {
        this.f116938a = 0;
        this.f116939b = 0;
    }

    /* renamed from: a */
    public final synchronized void mo63041a(boolean z) {
        this.f116938a++;
        if (z) {
            this.f116939b++;
        }
    }

    /* renamed from: b */
    public final synchronized bsax mo63042b() {
        bsax bsax;
        if (this.f116938a != 0) {
            bsax = new bsax(bgox.f117052as);
            bsax.mo70134g(1, this.f116938a);
            bsax.mo70134g(2, this.f116939b);
        } else {
            bsax = null;
        }
        return bsax;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized bunb mo63043c() {
        if (this.f116938a <= 0) {
            return null;
        }
        bxvd da = bunb.f154300d.mo74144da();
        int i = this.f116938a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bunb bunb = (bunb) da.f164949b;
        int i2 = bunb.f154302a | 1;
        bunb.f154302a = i2;
        bunb.f154303b = i;
        int i3 = this.f116939b;
        bunb.f154302a = i2 | 2;
        bunb.f154304c = i3;
        return (bunb) da.mo74062i();
    }
}
