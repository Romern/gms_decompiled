package p000;

/* renamed from: bdqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdqo implements bdqp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58299a(bxxb bxxb) {
        return ((cinx) ((bxvd) bxxb).f164949b).f190998d;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo58301b(bxxb bxxb) {
        return ((cinx) ((bxvd) bxxb).f164949b).f190996b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo58302c(bxxb bxxb) {
        bxvd bxvd = (bxvd) bxxb;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cinx cinx = (cinx) bxvd.f164949b;
        cinx cinx2 = cinx.f190993m;
        cinx.f190995a &= -5;
        cinx.f190998d = cinx.f190993m.f190998d;
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
            cinx cinx = (cinx) bxvd.f164949b;
            cinx cinx2 = cinx.f190993m;
            cinx.f190995a |= 2;
            cinx.f190997c = longValue;
            return;
        }
        bxvd bxvd2 = (bxvd) bxxb;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cinx cinx3 = (cinx) bxvd2.f164949b;
        cinx cinx4 = cinx.f190993m;
        cinx3.f190995a &= -3;
        cinx3.f190997c = 0;
    }
}
