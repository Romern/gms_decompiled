package p000;

/* renamed from: bdqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdqm implements bdqp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58299a(bxxb bxxb) {
        return ((cios) ((bxvd) bxxb).f164949b).f191118d;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo58301b(bxxb bxxb) {
        return ((cios) ((bxvd) bxxb).f164949b).f191128n;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo58302c(bxxb bxxb) {
        bxvd bxvd = (bxvd) bxxb;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cios cios = (cios) bxvd.f164949b;
        cios cios2 = cios.f191113s;
        cios.f191115a &= -5;
        cios.f191118d = cios.f191113s.f191118d;
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
            cios cios = (cios) bxvd.f164949b;
            cios cios2 = cios.f191113s;
            cios.f191115a |= 2;
            cios.f191117c = longValue;
            return;
        }
        bxvd bxvd2 = (bxvd) bxxb;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cios cios3 = (cios) bxvd2.f164949b;
        cios cios4 = cios.f191113s;
        cios3.f191115a &= -3;
        cios3.f191117c = 0;
    }
}
