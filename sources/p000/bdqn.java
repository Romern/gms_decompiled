package p000;

/* renamed from: bdqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdqn implements bdqp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58299a(bxxb bxxb) {
        return ((cimk) ((bxvd) bxxb).f164949b).f190735d;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo58301b(bxxb bxxb) {
        return ((cimk) ((bxvd) bxxb).f164949b).f190736e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo58302c(bxxb bxxb) {
        bxvd bxvd = (bxvd) bxxb;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cimk cimk = (cimk) bxvd.f164949b;
        cimk cimk2 = cimk.f190730k;
        cimk.f190732a &= -5;
        cimk.f190735d = cimk.f190730k.f190735d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo58300a(bxxb bxxb, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            bxvd bxvd = (bxvd) bxxb;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cimk cimk = (cimk) bxvd.f164949b;
            cimk cimk2 = cimk.f190730k;
            cimk.f190732a |= 2;
            cimk.f190734c = longValue;
            return;
        }
        bxvd bxvd2 = (bxvd) bxxb;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cimk cimk3 = (cimk) bxvd2.f164949b;
        cimk cimk4 = cimk.f190730k;
        cimk3.f190732a &= -3;
        cimk3.f190734c = 0;
    }
}
