package p000;

/* renamed from: cado */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cado extends bxvd implements cadq {
    public cado() {
        super(cadp.f172710f);
    }

    /* renamed from: a */
    public final void mo74616a(cadn cadn) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cadp cadp = (cadp) this.f164949b;
        cadp cadp2 = cadp.f172710f;
        cadn.getClass();
        cadp.mo74621c();
        cadp.f172714c.add(cadn);
    }

    /* renamed from: b */
    public final void mo74618b(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cadp cadp = (cadp) this.f164949b;
        cadp cadp2 = cadp.f172710f;
        if (!cadp.f172715d.mo73666a()) {
            cadp.f172715d = GeneratedMessageLite.m124021a(cadp.f172715d);
        }
        bxsy.m123078a(iterable, cadp.f172715d);
    }

    /* renamed from: n */
    public final boolean mo74619n() {
        return (((cadp) this.f164949b).f172712a & 2) != 0;
    }

    /* renamed from: o */
    public final caae mo74620o() {
        caae caae = ((cadp) this.f164949b).f172713b;
        return caae == null ? caae.f172323i : caae;
    }

    /* renamed from: a */
    public final void mo74617a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cadp cadp = (cadp) this.f164949b;
        cadp cadp2 = cadp.f172710f;
        cadp.mo74621c();
        bxsy.m123078a(iterable, cadp.f172714c);
    }
}
