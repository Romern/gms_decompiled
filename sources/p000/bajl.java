package p000;

/* renamed from: bajl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajl {
    /* renamed from: a */
    public static bqgg m86970a(babr babr, byik byik, bygw bygw, bygz bygz, byjj byjj, bngx bngx, bngx bngx2, bara bara, bmzi bmzi) {
        long j;
        bygv bygv;
        Long l;
        if (bngx2.isEmpty()) {
            bara.mo55899b(0);
            bara.mo55897a(0, 0);
            bxvd da = bykc.f166732e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bykc bykc = (bykc) da.f164949b;
            byjj.getClass();
            bykc.f166735b = byjj;
            bykc.f166734a |= 1;
            return bqga.m112775a((bykc) da.mo74062i());
        }
        byjv byjv = (byjv) byjy.f166710h.mo74144da();
        if (byjv.f164950c) {
            byjv.mo74035c();
            byjv.f164950c = false;
        }
        byjy byjy = (byjy) byjv.f164949b;
        bygz.getClass();
        byjy.f166713b = bygz;
        int i = byjy.f166712a | 1;
        byjy.f166712a = i;
        byjj.getClass();
        byjy.f166715d = byjj;
        byjy.f166712a = i | 2;
        byjv.mo74387a(bngx2);
        bxvd da2 = byjw.f166702c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byjw byjw = (byjw) da2.f164949b;
        byjw.f166704a |= 1;
        byjw.f166705b = true;
        if (byjv.f164950c) {
            byjv.mo74035c();
            byjv.f164950c = false;
        }
        byjy byjy2 = (byjy) byjv.f164949b;
        byjw byjw2 = (byjw) da2.mo74062i();
        byjw2.getClass();
        byjy2.f166717f = byjw2;
        byjy2.f166712a |= 4;
        if (babr.mo32669A()) {
            bxwc bxwc = bygw.f166400a;
            int size = bxwc.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bygv = (bygv) bxwc.get(i2);
                    bygz bygz2 = bygv.f166392c;
                    if (bygz2 == null) {
                        bygz2 = bygz.f166410c;
                    }
                    i2++;
                    if (bygz.equals(bygz2)) {
                        break;
                    }
                } else {
                    bygv = bygv.f166388h;
                    break;
                }
            }
            if (!(!bygv.f166396g || (l = (Long) bmzi.mo6606a()) == null || l.longValue() == 0)) {
                bxvd da3 = byjx.f166706c.mo74144da();
                long longValue = l.longValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byjx byjx = (byjx) da3.f164949b;
                byjx.f166708a = 1;
                byjx.f166709b = Long.valueOf(longValue);
                byjx byjx2 = (byjx) da3.mo74062i();
                if (byjv.f164950c) {
                    byjv.mo74035c();
                    byjv.f164950c = false;
                }
                byjy byjy3 = (byjy) byjv.f164949b;
                byjx2.getClass();
                byjy3.f166718g = byjx2;
                byjy3.f166712a |= 16;
            }
        }
        byjy byjy4 = (byjy) byjv.mo74062i();
        int i3 = byjy4.f164961ai;
        if (i3 == -1) {
            i3 = bxxm.f165037a.mo74228a(byjy4).mo74223b(byjy4);
            byjy4.f164961ai = i3;
        }
        long j2 = (long) i3;
        if (bngx != bngx2) {
            j = j2;
            for (int i4 = 0; i4 < bngx2.size(); i4++) {
                bygu bygu = (bygu) bngx.get(i4);
                bygu bygu2 = (bygu) bngx2.get(i4);
                if (bygu2.f166385b == 6) {
                    int i5 = bygu2.f164961ai;
                    if (i5 == -1) {
                        i5 = bxxm.f165037a.mo74228a(bygu2).mo74223b(bygu2);
                        bygu2.f164961ai = i5;
                    }
                    long j3 = j - ((long) i5);
                    int i6 = bygu.f164961ai;
                    if (i6 == -1) {
                        i6 = bxxm.f165037a.mo74228a(bygu).mo74223b(bygu);
                        bygu.f164961ai = i6;
                    }
                    j = j3 + ((long) i6);
                }
            }
        } else {
            j = j2;
        }
        bara.mo55899b((long) byjy4.f166714c.size());
        bara.mo55897a(j2, j);
        return byik.mo74383a(byjy4);
    }
}
