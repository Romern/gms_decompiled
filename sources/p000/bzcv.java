package p000;

/* renamed from: bzcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcv extends bxvd implements bxxd {
    public bzcv() {
        super(bzcx.f169429h);
    }

    /* renamed from: a */
    public final void mo74534a(int i, bzcs bzcs) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bzcx bzcx = (bzcx) this.f164949b;
        bzcu bzcu = (bzcu) bzcs.mo74062i();
        bzcx bzcx2 = bzcx.f169429h;
        bzcu.getClass();
        bzcx.mo74538c();
        bzcx.f169432b.set(i, bzcu);
    }

    /* renamed from: n */
    public final bzcu mo74537n() {
        return (bzcu) ((bzcx) this.f164949b).f169432b.get(0);
    }

    /* renamed from: a */
    public final void mo74535a(bzcs bzcs) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bzcx bzcx = (bzcx) this.f164949b;
        bzcu bzcu = (bzcu) bzcs.mo74062i();
        bzcx bzcx2 = bzcx.f169429h;
        bzcu.getClass();
        bzcx.mo74538c();
        bzcx.f169432b.add(bzcu);
    }

    /* renamed from: a */
    public final void mo74536a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bzcx bzcx = (bzcx) this.f164949b;
        bzcx bzcx2 = bzcx.f169429h;
        if (!bzcx.f169434d.mo73666a()) {
            bzcx.f169434d = bxvk.m124020a(bzcx.f169434d);
        }
        bxsy.m123078a(iterable, bzcx.f169434d);
    }
}
