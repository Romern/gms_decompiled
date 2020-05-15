package p000;

import java.util.List;

/* renamed from: aiaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiaf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahsu.a(aiab, boolean):void
     arg types: [aiab, int]
     candidates:
      ahsu.a(byzm, byzm):int
      ahsu.a(long, aiaa):boolean
      ahsu.a(long, java.lang.Long):boolean
      ahsu.a(aiaa, long):boolean
      ahsu.a(sqv, aiab):boolean
      ahsu.a(int, java.lang.String):void
      ahsu.a(aiab, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101 A[SYNTHETIC] */
    /* renamed from: a */
    static void m56953a(List list) {
        int i;
        int i2;
        boolean z;
        byzm byzm;
        int b;
        double d;
        double d2;
        List list2 = list;
        bmxv bmxv = bmvz.f131120a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            ahsu ahsu = (ahsu) list2.get(i3);
            List D = ahsu.mo37057D();
            int size2 = D.size();
            int i4 = 0;
            while (true) {
                i = i3 + 1;
                if (i4 >= size2) {
                    break;
                }
                aiab aiab = (aiab) D.get(i4);
                byzm byzm2 = aiab.f68542b;
                if (byzm2 == null) {
                    byzm2 = byzm.f169125d;
                }
                if (byzm2.f169129c > 0.0d) {
                    byzm byzm3 = aiab.f68542b;
                    if (byzm3 == null) {
                        byzm3 = byzm.f169125d;
                    }
                    if ((byzm3.f169127a & 2) != 0) {
                        if (cfod.m141150j() <= 0.0d) {
                            byzm byzm4 = aiab.f68542b;
                            if (byzm4 == null) {
                                byzm4 = byzm.f169125d;
                            }
                            d = byzm4.f169129c;
                        } else {
                            d = cfod.m141150j();
                        }
                        Double z2 = ahsu.mo37102z();
                        if (ahsu.m56520a(ahsu.f67968a, aiab)) {
                            i2 = i3;
                            d2 = Math.max(cfod.f184793a.mo6606a().mo81888J(), d * cfod.f184793a.mo6606a().mo81889K()) + d;
                        } else {
                            i2 = i3;
                            d2 = d;
                        }
                        Double valueOf = Double.valueOf(d2);
                        if (z2 == null || z2.doubleValue() >= valueOf.doubleValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                            String i5 = ahsu.mo37084i();
                            String G = ahsu.mo37060G();
                            String m = ahsu.mo37088m();
                            byzm byzm5 = aiab.f68542b;
                            if (byzm5 == null) {
                                byzm5 = byzm.f169125d;
                            }
                            int b2 = bzaw.m125599b(byzm5.f169128b);
                            if (b2 == 0) {
                                b2 = 1;
                            }
                            bnsl.mo68429a("Eval targeting for id=%s, triggerId=%s, address=%s, relevance=%s, maxDist=%.3f, checking %.3f < %.3f", i5, G, m, bzaw.m125598a(b2), Double.valueOf(d), z2, valueOf);
                        }
                        ahsu.mo37068a(aiab, z);
                        if (ahsu.mo37085j() == bzbk.NEARBY_DEVICE && z && !bmxv.mo66813a()) {
                            byzm = aiab.f68542b;
                            if (byzm == null) {
                                byzm = byzm.f169125d;
                            }
                            b = bzaw.m125599b(byzm.f169128b);
                            if (b == 0) {
                                b = 1;
                            }
                            if (b - 1 <= 100) {
                                bmxv = bmxv.m108566b(ahsu);
                            }
                        }
                        i4++;
                        i3 = i2;
                    }
                }
                i2 = i3;
                z = true;
                ahsu.mo37068a(aiab, z);
                byzm = aiab.f68542b;
                if (byzm == null) {
                }
                b = bzaw.m125599b(byzm.f169128b);
                if (b == 0) {
                }
                if (b - 1 <= 100) {
                }
                i4++;
                i3 = i2;
            }
            i3 = i;
        }
        if (bmxv.mo66813a()) {
            int size3 = list.size();
            for (int i6 = 0; i6 < size3; i6++) {
                ahsu ahsu2 = (ahsu) list2.get(i6);
                if (ahsu2.mo37085j() == bzbk.NEARBY_DEVICE && !ahsu2.equals(bmxv.mo66814b())) {
                    List D2 = ahsu2.mo37057D();
                    int size4 = D2.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        ahsu2.mo37068a((aiab) D2.get(i7), true);
                    }
                }
            }
        }
    }
}
