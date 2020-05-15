package p000;

import com.android.volley.VolleyError;

/* renamed from: atbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbd {

    /* renamed from: a */
    public static final srn f89988a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static bzul m75354a(long j, boolean z) {
        int i;
        bxvd da = bzul.f171433c.mo74144da();
        bxvd da2 = bzuc.f171404c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bzuc) da2.f164949b).f171406a = 1;
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        ((bzuc) da2.f164949b).f171407b = i - 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzul bzul = (bzul) da.f164949b;
        bzuc bzuc = (bzuc) da2.mo74062i();
        bzuc.getClass();
        if (!bzul.f171435a.mo73666a()) {
            bzul.f171435a = GeneratedMessageLite.m124021a(bzul.f171435a);
        }
        bzul.f171435a.add(bzuc);
        bxvd da3 = bzuf.f171414c.mo74144da();
        bxvd da4 = bzue.f171411b.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((bzue) da4.f164949b).f171413a = j;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bzuf bzuf = (bzuf) da3.f164949b;
        bzue bzue = (bzue) da4.mo74062i();
        bzue.getClass();
        bzuf.f171417b = bzue;
        bzuf.f171416a = 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzuf bzuf2 = (bzuf) da3.mo74062i();
        bzuf2.getClass();
        ((bzul) da.f164949b).f171436b = bzuf2;
        return (bzul) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atbd.a(long, boolean):bzul
     arg types: [long, int]
     candidates:
      atbd.a(askf, bzuh):void
      atbd.a(askf, boolean):void
      atbd.a(long, boolean):bzul */
    /* renamed from: b */
    public static void m75359b(askf askf) {
        boolean z;
        bmxy.m108600b(cgwn.m147261k());
        long a = asjm.m74238a(askf.f89126d);
        if (a != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "AndroidId is 0");
        atff.m75769b(askf, "g/settings/updatecorenotificationsettings", m75354a(a, false), bzum.f171437a);
    }

    /* renamed from: b */
    public static void m75360b(askf askf, boolean z) {
        try {
            if (asiv.m74192b(askf, z)) {
                atkl.f90415a.mo50008a();
            }
        } catch (asks e) {
            bnsl bnsl = (bnsl) f89988a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbd", "b", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Local update failed");
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m75361b(VolleyError volleyError) {
        bnsl bnsl = (bnsl) f89988a.mo68388c();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atbd", "b", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Chime request failed");
    }

    /* renamed from: a */
    public static void m75355a(askf askf) {
        if (cgwn.m147261k()) {
            long a = asjm.m74238a(askf.f89126d);
            if (a != 0) {
                bxvd da = bzug.f171418c.mo74144da();
                bzup bzup = bzup.NOTIFICATIONS_SETTING;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzug bzug = (bzug) da.f164949b;
                bzup.getClass();
                if (!bzug.f171420a.mo73666a()) {
                    bzug.f171420a = GeneratedMessageLite.m124019a(bzug.f171420a);
                }
                bzug.f171420a.mo74153d(bzup.mo3214a());
                bxvd da2 = bzuf.f171414c.mo74144da();
                bxvd da3 = bzue.f171411b.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((bzue) da3.f164949b).f171413a = a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzuf bzuf = (bzuf) da2.f164949b;
                bzue bzue = (bzue) da3.mo74062i();
                bzue.getClass();
                bzuf.f171417b = bzue;
                bzuf.f171416a = 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzuf bzuf2 = (bzuf) da2.mo74062i();
                bzuf2.getClass();
                ((bzug) da.f164949b).f171421b = bzuf2;
                atff.m75770b(askf, "g/settings/getcoresettings", (bzug) da.mo74062i(), bzuh.f171422b, new ataz(askf), atba.f89985a, atbd.class);
                return;
            }
            bnsl bnsl = (bnsl) f89988a.mo68388c();
            bnsl.mo68432a("atbd", "a", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("androidId is 0");
        }
    }

    /* renamed from: a */
    public static void m75356a(askf askf, bzuh bzuh) {
        int i;
        char c;
        bzud bzud = bzuh.f171424a;
        if (bzud == null) {
            bzud = bzud.f171408b;
        }
        bxwc bxwc = bzud.f171410a;
        int size = bxwc.size();
        int i2 = 0;
        while (true) {
            i = 2;
            if (i2 >= size) {
                break;
            }
            bzuc bzuc = (bzuc) bxwc.get(i2);
            int i3 = bzuc.f171406a;
            if (i3 != 0) {
                c = i3 != 1 ? (char) 0 : 3;
            } else {
                c = 2;
            }
            if (c == 0) {
                c = 1;
            }
            i2++;
            if (c == 3) {
                int i4 = bzuc.f171407b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i = i4 != 2 ? 0 : 4;
                    } else {
                        i = 3;
                    }
                }
                if (i == 0) {
                    i = 1;
                }
            }
        }
        int i5 = i - 2;
        if (i5 == -1 || i5 == 0) {
            bnsl bnsl = (bnsl) f89988a.mo68388c();
            bnsl.mo68432a("atbd", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("chime status unknown");
        } else if (i5 != 1) {
            m75360b(askf, false);
        } else {
            m75360b(askf, true);
        }
    }

    /* renamed from: a */
    public static void m75357a(askf askf, boolean z) {
        if (cgwn.m147261k()) {
            long a = asjm.m74238a(askf.f89126d);
            if (a == 0) {
                bnsl bnsl = (bnsl) f89988a.mo68388c();
                bnsl.mo68432a("atbd", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("androidId is 0");
                return;
            }
            atff.m75768a(atbd.class);
            atff.m75770b(askf, "g/settings/updatecorenotificationsettings", m75354a(a, z), bzum.f171437a, atbb.f89986a, atbc.f89987a, atbd.class);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m75358a(VolleyError volleyError) {
        bnsl bnsl = (bnsl) f89988a.mo68388c();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atbd", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Chime update failed");
    }
}
