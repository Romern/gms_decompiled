package p000;

/* renamed from: atap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atap extends bxvd implements bxxd {
    public atap() {
        super(ataq.f89963f);
    }

    /* renamed from: a */
    public final bmsz mo49766a(int i) {
        return (bmsz) ((ataq) this.f164949b).f89967c.get(i);
    }

    /* renamed from: a */
    public final void mo49767a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        ataq ataq = (ataq) this.f164949b;
        ataq ataq2 = ataq.f89963f;
        if (!ataq.f89967c.mo73666a()) {
            ataq.f89967c = GeneratedMessageLite.m124021a(ataq.f89967c);
        }
        bxsy.m123078a(iterable, ataq.f89967c);
    }
}
