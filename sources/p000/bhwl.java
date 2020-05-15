package p000;

/* renamed from: bhwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwl extends bhxa {

    /* renamed from: d */
    private bhtz f119737d;

    /* renamed from: e */
    private final bhwm f119738e;

    public bhwl(bhuk bhuk, bicy bicy, bhwm bhwm) {
        super(bhuk, bicy);
        this.f119738e = bhwm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bhxb mo64354a(bhtx bhtx) {
        bhtz a = this.f119738e.mo64357a(bhtx);
        this.f119737d = a;
        boolean z = true;
        if (!a.f119602b && bhtx.f119580a.f119611g < 0.0f) {
            z = false;
        }
        bpol bpol = (z && a.f119601a >= ((float) cggm.f186849a.mo6606a().mo83733l())) ? bpol.IN_TRANSIT : bpol.AT_PLACE;
        return mo64375a(mo64374a(bpol), bpol, System.currentTimeMillis(), null, null);
    }

    /* renamed from: a */
    public final void mo64355a() {
        super.mo64355a();
        this.f119737d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64356a(bhuk bhuk, bhtx bhtx, bhxb bhxb) {
        float f;
        bhwz bhwz = bhxb.f119775b;
        bpol bpol = bhwz.f119765a;
        long j = bhwz.f119766b;
        bhtz bhtz = this.f119737d;
        if (bhtz != null) {
            f = bhtz.f119601a;
        } else {
            f = -1.0f;
        }
        bxvd da = bpop.f138552h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpop bpop = (bpop) da.f164949b;
        bpop.f138555b = 0;
        int i = bpop.f138554a | 1;
        bpop.f138554a = i;
        bpop.f138558e = 2;
        bpop.f138554a = i | 8;
        bxvd da2 = bpom.f138545d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpom bpom = (bpom) da2.f164949b;
        int i2 = bpom.f138547a | 2;
        bpom.f138547a = i2;
        bpom.f138549c = j;
        if (bpol != null) {
            bpom.f138548b = bpol.f138544d;
            bpom.f138547a = i2 | 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpop bpop2 = (bpop) da.f164949b;
        bpom bpom2 = (bpom) da2.mo74062i();
        bpom2.getClass();
        bpop2.f138556c = bpom2;
        bpop2.f138554a |= 2;
        bxvd da3 = bpny.f138453c.mo74144da();
        double d = (double) f;
        Double.isNaN(d);
        int i3 = (int) (d * 10000.0d);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpny bpny = (bpny) da3.f164949b;
        bpny.f138455a |= 1;
        bpny.f138456b = i3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpop bpop3 = (bpop) da.f164949b;
        bpny bpny2 = (bpny) da3.mo74062i();
        bpny2.getClass();
        bpop3.f138560g = bpny2;
        bpop3.f138554a |= 32;
        da.mo74062i();
        bicx bicx = (bicx) bhuk;
        bicx.mo64534a(bicx.mo64533a((bpop) da.mo74062i()));
    }
}
