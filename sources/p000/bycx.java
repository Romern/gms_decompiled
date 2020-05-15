package p000;

/* renamed from: bycx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycx extends bxvd implements bxxd {
    public bycx() {
        super(bycy.f165733j);
    }

    /* renamed from: a */
    public final bycv mo74344a(int i) {
        return (bycv) ((bycy) this.f164949b).f165743i.get(i);
    }

    /* renamed from: a */
    public final void mo74345a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bycy bycy = (bycy) this.f164949b;
        bycy bycy2 = bycy.f165733j;
        if (!bycy.f165743i.mo73666a()) {
            bycy.f165743i = GeneratedMessageLite.m124021a(bycy.f165743i);
        }
        bxsy.m123078a(iterable, bycy.f165743i);
    }
}
