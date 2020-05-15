package p000;

/* renamed from: bfcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcz {

    /* renamed from: a */
    public int f113453a;

    /* renamed from: b */
    public int f113454b;

    /* renamed from: c */
    private int f113455c;

    /* renamed from: d */
    private int f113456d;

    /* renamed from: e */
    private int f113457e;

    /* renamed from: a */
    public final bsax mo61435a(int i, int i2) {
        bsax bsax = new bsax(bgox.f117048ao);
        bsax.mo70134g(1, i);
        bsax.mo70134g(2, i2);
        bsax.mo70134g(3, this.f113455c);
        bsax.mo70134g(4, this.f113456d);
        bsax.mo70134g(5, this.f113457e);
        bsax.mo70134g(6, this.f113453a);
        bsax.mo70134g(7, this.f113454b);
        return bsax;
    }

    /* renamed from: a */
    public final void mo61436a() {
        this.f113455c++;
    }

    /* renamed from: b */
    public final bums mo61437b(int i, int i2) {
        bxvd da = bums.f154262i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bums bums = (bums) da.f164949b;
        int i3 = bums.f154264a | 1;
        bums.f154264a = i3;
        bums.f154265b = i;
        int i4 = i3 | 2;
        bums.f154264a = i4;
        bums.f154266c = i2;
        int i5 = this.f113455c;
        int i6 = i4 | 4;
        bums.f154264a = i6;
        bums.f154267d = i5;
        int i7 = this.f113456d;
        int i8 = i6 | 8;
        bums.f154264a = i8;
        bums.f154268e = i7;
        int i9 = this.f113457e;
        int i10 = i8 | 16;
        bums.f154264a = i10;
        bums.f154269f = i9;
        int i11 = this.f113453a;
        int i12 = i10 | 32;
        bums.f154264a = i12;
        bums.f154270g = i11;
        int i13 = this.f113454b;
        bums.f154264a = i12 | 64;
        bums.f154271h = i13;
        return (bums) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo61438b() {
        this.f113456d++;
    }

    /* renamed from: c */
    public final void mo61439c() {
        this.f113457e++;
    }

    /* renamed from: d */
    public final void mo61440d() {
        this.f113455c = 0;
        this.f113456d = 0;
        this.f113457e = 0;
        this.f113453a = 0;
        this.f113454b = 0;
    }
}
