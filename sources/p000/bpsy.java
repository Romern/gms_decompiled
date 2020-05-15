package p000;

/* renamed from: bpsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsy extends bxvd implements bxxd {
    public bpsy() {
        super(bpsz.f139036I);
    }

    /* renamed from: a */
    public final void mo68980a(bpta bpta) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bpsz bpsz = (bpsz) this.f164949b;
        bpsz bpsz2 = bpsz.f139036I;
        bpta.getClass();
        bpsz.mo68983a();
        bpsz.f139059m.add(bpta);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo68981a(bptg bptg) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bpsz bpsz = (bpsz) this.f164949b;
        bpsz bpsz2 = bpsz.f139036I;
        bptg.getClass();
        if (!bpsz.f139058l.mo73666a()) {
            bpsz.f139058l = bxvk.m124021a(bpsz.f139058l);
        }
        bpsz.f139058l.add(bptg);
    }

    /* renamed from: a */
    public final void mo68982a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bpsz bpsz = (bpsz) this.f164949b;
        bpsz bpsz2 = bpsz.f139036I;
        if (!bpsz.f139065s.mo73666a()) {
            bpsz.f139065s = bxvk.m124021a(bpsz.f139065s);
        }
        bxsy.m123078a(iterable, bpsz.f139065s);
    }
}
