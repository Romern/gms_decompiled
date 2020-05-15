package p000;

/* renamed from: atm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atm extends atg {

    /* renamed from: a */
    final atn f2206a;

    public atm(atn atn) {
        this.f2206a = atn;
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        atn atn = this.f2206a;
        int i = atn.f2207u - 1;
        atn.f2207u = i;
        if (i == 0) {
            atn.f2208v = false;
            atn.mo2481f();
        }
        atf.mo2473b(this);
    }

    /* renamed from: b */
    public final void mo2388b(atf atf) {
        atn atn = this.f2206a;
        if (!atn.f2208v) {
            atn.mo2479e();
            this.f2206a.f2208v = true;
        }
    }
}
