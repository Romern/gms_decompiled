package p000;

/* renamed from: fcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fcg {

    /* renamed from: a */
    public final ero f16263a;

    /* renamed from: b */
    public final C0034at f16264b;

    /* renamed from: c */
    public final esr f16265c;

    /* renamed from: d */
    public final C0034at f16266d;

    /* renamed from: e */
    public final eql f16267e;

    public fcg(ero ero, ffk ffk, esr esr, eql eql) {
        this.f16263a = ero;
        C0034at atVar = new C0034at();
        this.f16266d = atVar;
        atVar.mo2450b(ffk);
        if (eql == null) {
            C0034at atVar2 = new C0034at();
            atVar2.mo2450b(bmvz.f131120a);
            this.f16264b = atVar2;
        } else {
            C0034at atVar3 = this.f16266d;
            eql.getClass();
            this.f16264b = C0052bk.m3245b(atVar3, new fcd(eql));
        }
        this.f16267e = eql;
        this.f16265c = esr;
    }

    /* renamed from: a */
    public final void mo10679a() {
        ffk b = mo10683b();
        eql eql = this.f16267e;
        if (eql != null) {
            eql.mo10416b(b);
        }
    }

    /* renamed from: b */
    public final C0034at mo10682b(bsxn bsxn) {
        return C0052bk.m3245b(this.f16266d, new fce(this, bsxn));
    }

    /* renamed from: c */
    public final C0034at mo10684c(bsxn bsxn) {
        return C0052bk.m3245b(this.f16266d, new fcf(this, bsxn));
    }

    /* renamed from: d */
    public final epq mo10686d(bsxn bsxn) {
        return (epq) this.f16263a.mo10450b(mo10683b(), bsxn, this.f16265c).mo2448b();
    }

    /* renamed from: b */
    public final ffk mo10683b() {
        return (ffk) this.f16266d.mo2448b();
    }

    /* renamed from: c */
    public final void mo10685c() {
        this.f16263a.mo10454c(mo10683b());
    }

    /* renamed from: a */
    public final void mo10680a(bsxn bsxn) {
        this.f16263a.mo10455c(mo10683b(), bsxn, this.f16265c);
    }

    /* renamed from: a */
    public final void mo10681a(String str) {
        this.f16266d.mo2450b(ffr.m11619a(str));
    }
}
