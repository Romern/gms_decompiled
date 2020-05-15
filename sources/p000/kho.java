package p000;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

/* renamed from: kho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kho {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* renamed from: a */
    public static bnic m17866a(bler bler, kra kra) {
        bmxv bmxv;
        bmxv bmxv2;
        int size;
        int i;
        boolean z;
        bxwc bxwc;
        bler bler2 = bler;
        bnia j = bnic.m109500j();
        if (bler2 != null) {
            bxwc bxwc2 = bler2.f126254d;
            if (!bxwc2.isEmpty()) {
                if (ccij.m129843d()) {
                    bxwc bxwc3 = bler2.f126256f;
                    if (!bxwc3.isEmpty()) {
                        String str = ((bleb) bxwc3.get(0)).f126172d;
                        if (!str.isEmpty()) {
                            int i2 = 1;
                            while (true) {
                                if (i2 >= bxwc3.size()) {
                                    bmxv = bmxv.m108566b(str);
                                    break;
                                }
                                String str2 = ((bleb) bxwc3.get(i2)).f126172d;
                                if (!str2.isEmpty() && !str.equals(str2)) {
                                    bmxv = bmvz.f131120a;
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        boolean c = ccij.m129842c();
                        boolean b = ccij.m129841b();
                        if (c || b) {
                            bxwc = bler2.f126261k;
                            if (bxwc.stream().distinct().count() == 1) {
                                bzru bzru = ((bldi) bxwc.get(0)).f126086d;
                                if (bzru == null) {
                                    bzru = bzru.f171201d;
                                }
                                bmxv2 = bmxv.m108566b(bzru);
                                size = bxwc2.size();
                                for (i = 0; i < size; i++) {
                                    bleh bleh = (bleh) bxwc2.get(i);
                                    bxvd da = kde.f23857h.mo74144da();
                                    String str3 = bleh.f126205e;
                                    if (!str3.isEmpty()) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        kde kde = (kde) da.f164949b;
                                        str3.getClass();
                                        kde.f23859a |= 1;
                                        kde.f23860b = str3;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    String str4 = bleh.f126206f;
                                    if (!str4.isEmpty()) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        kde kde2 = (kde) da.f164949b;
                                        str4.getClass();
                                        kde2.f23859a |= 2;
                                        kde2.f23861c = str4;
                                        z = true;
                                    }
                                    String str5 = bleh.f126207g;
                                    if (!str5.isEmpty()) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        kde kde3 = (kde) da.f164949b;
                                        str5.getClass();
                                        kde3.f23859a |= 4;
                                        kde3.f23862d = str5;
                                        z = true;
                                    }
                                    if (bmxv.mo66813a()) {
                                        String str6 = (String) bmxv.mo66814b();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        kde kde4 = (kde) da.f164949b;
                                        str6.getClass();
                                        kde4.f23859a |= 8;
                                        kde4.f23863e = str6;
                                        z = true;
                                    }
                                    if (bmxv2.mo66813a()) {
                                        bzru bzru2 = (bzru) bmxv2.mo66814b();
                                        if (c) {
                                            bzru bzru3 = (bzru) bmxv2.mo66814b();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            kde kde5 = (kde) da.f164949b;
                                            bzru3.getClass();
                                            kde5.f23864f = bzru3;
                                            kde5.f23859a |= 16;
                                            z = true;
                                        }
                                        if (b) {
                                            int i3 = bzru2.f171203a;
                                            int i4 = bzru2.f171204b;
                                            int i5 = bzru2.f171205c;
                                            if (!(i3 == 0 || i4 == 0 || i5 == 0)) {
                                                int years = Period.between(LocalDate.of(i3, i4, i5), bqdb.m112614a(bqdc.f140496a)).getYears();
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                kde kde6 = (kde) da.f164949b;
                                                kde6.f23859a |= 32;
                                                kde6.f23865g = years;
                                            }
                                        }
                                    }
                                    if (z) {
                                        j.mo67629b(kct.m17647a((kde) da.mo74062i(), m17867a()));
                                    }
                                }
                            }
                        }
                        bmxv2 = bmvz.f131120a;
                        size = bxwc2.size();
                        while (i < size) {
                        }
                    }
                }
                bmxv = bmvz.f131120a;
                boolean c2 = ccij.m129842c();
                boolean b2 = ccij.m129841b();
                bxwc = bler2.f126261k;
                if (bxwc.stream().distinct().count() == 1) {
                }
                bmxv2 = bmvz.f131120a;
                size = bxwc2.size();
                while (i < size) {
                }
            }
            bxwc bxwc4 = bler2.f126257g;
            if (!bxwc4.isEmpty()) {
                int size2 = bxwc4.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String str7 = ((bldu) bxwc4.get(i6)).f126135c;
                    if (!str7.isEmpty()) {
                        bxvd da2 = kcy.f23842c.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        kcy kcy = (kcy) da2.f164949b;
                        str7.getClass();
                        kcy.f23844a |= 1;
                        kcy.f23845b = str7;
                        j.mo67629b(kct.m17647a(da2.mo74062i(), m17867a()));
                    }
                }
            }
            bxwc bxwc5 = bler2.f126258h;
            if (!bxwc5.isEmpty()) {
                int size3 = bxwc5.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    String str8 = ((blex) bxwc5.get(i7)).f126299c;
                    if (!str8.isEmpty()) {
                        kdf a = kra.mo14821a(str8);
                        if (a != null) {
                            j.mo67629b(kct.m17647a(a, m17867a()));
                        }
                    }
                }
            }
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    public static kcs m17867a() {
        return kcs.m17644a("people", UUID.randomUUID().toString());
    }
}
