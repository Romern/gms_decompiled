package p000;

/* renamed from: bard */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bard {
    /* renamed from: a */
    private static byje m87432a(bacx bacx, boolean z) {
        bxvd da = byje.f166642e.mo74144da();
        bxvd da2 = byjd.f166638c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byjd byjd = (byjd) da2.f164949b;
        byjd.f166640a = 1;
        byjd.f166641b = Boolean.valueOf(z);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byje byje = (byje) da.f164949b;
        byjd byjd2 = (byjd) da2.mo74062i();
        byjd2.getClass();
        if (!byje.f166645b.mo73666a()) {
            byje.f166645b = bxvk.m124021a(byje.f166645b);
        }
        byje.f166645b.add(byjd2);
        boolean a = bacx.mo55587a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byje byje2 = (byje) da.f164949b;
        byje2.f166644a |= 1;
        byje2.f166646c = a;
        int b = bacx.mo55588b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byje byje3 = (byje) da.f164949b;
        byje3.f166644a |= 2;
        byje3.f166647d = b;
        return (byje) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m87434a(byjh byjh) {
        return byjh.f166655e != -1;
    }

    /* renamed from: a */
    public static byjh m87433a(bacu bacu) {
        int a = bacu.mo55570a();
        if (a == 1) {
            byjc byjc = (byjc) byjh.f166649h.mo74144da();
            if (byjc.f164950c) {
                byjc.mo74035c();
                byjc.f164950c = false;
            }
            byjh byjh = (byjh) byjc.f164949b;
            byjh.f166652b = 1;
            byjh.f166651a = 1 | byjh.f166651a;
            return (byjh) byjc.mo74062i();
        } else if (a != 2) {
            byjc byjc2 = (byjc) byjh.f166649h.mo74144da();
            if (byjc2.f164950c) {
                byjc2.mo74035c();
                byjc2.f164950c = false;
            }
            byjh byjh2 = (byjh) byjc2.f164949b;
            byjh2.f166652b = 0;
            byjh2.f166651a = 1 | byjh2.f166651a;
            return (byjh) byjc2.mo74062i();
        } else {
            byjc byjc3 = (byjc) byjh.f166649h.mo74144da();
            if (byjc3.f164950c) {
                byjc3.mo74035c();
                byjc3.f164950c = false;
            }
            byjh byjh3 = (byjh) byjc3.f164949b;
            byjh3.f166652b = 2;
            byjh3.f166651a |= 1;
            byjc3.mo74385a(m87432a(bacu.mo55573d(), false));
            byjc3.mo74385a(m87432a(bacu.mo55574e(), true));
            byjc3.mo74386b(m87432a(bacu.mo55571b(), false));
            byjc3.mo74386b(m87432a(bacu.mo55572c(), true));
            if (bacu.mo55576f() != null) {
                int intValue = bacu.mo55576f().intValue();
                if (byjc3.f164950c) {
                    byjc3.mo74035c();
                    byjc3.f164950c = false;
                }
                byjh byjh4 = (byjh) byjc3.f164949b;
                byjh4.f166651a = 2 | byjh4.f166651a;
                byjh4.f166655e = intValue;
            }
            boolean g = bacu.mo55577g();
            if (byjc3.f164950c) {
                byjc3.mo74035c();
                byjc3.f164950c = false;
            }
            byjh byjh5 = (byjh) byjc3.f164949b;
            byjh5.f166651a |= 4;
            byjh5.f166656f = g;
            boolean h = bacu.mo55578h();
            if (byjc3.f164950c) {
                byjc3.mo74035c();
                byjc3.f164950c = false;
            }
            byjh byjh6 = (byjh) byjc3.f164949b;
            byjh6.f166651a |= 8;
            byjh6.f166657g = h;
            return (byjh) byjc3.mo74062i();
        }
    }
}
