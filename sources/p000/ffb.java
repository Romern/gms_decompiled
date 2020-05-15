package p000;

import java.util.List;
import java.util.Locale;

/* renamed from: ffb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffb {

    /* renamed from: a */
    public final ffa f16425a;

    /* renamed from: b */
    public final feh f16426b;

    /* renamed from: c */
    public final fcg f16427c;

    /* renamed from: d */
    public final C0034at f16428d;

    /* renamed from: e */
    public final C0034at f16429e;

    /* renamed from: f */
    public final C0036av f16430f;

    /* renamed from: g */
    public final C0034at f16431g;

    /* renamed from: h */
    public final C0034at f16432h;

    /* renamed from: i */
    public boolean f16433i;

    /* renamed from: j */
    public final C0034at f16434j = new C0034at();

    public ffb(ffa ffa, fcg fcg, feh feh) {
        this.f16425a = ffa;
        this.f16427c = fcg;
        this.f16426b = feh;
        fcn fcn = (fcn) ffa;
        C0034at c = fcg.mo10684c(fcn.f16282a);
        this.f16429e = c;
        this.f16428d = C0052bk.m3245b(c, new fev(fcg));
        C0036av avVar = new C0036av();
        this.f16430f = avVar;
        avVar.mo2667a(this.f16428d, new few(this));
        this.f16430f.mo2667a(this.f16434j, new fex(this));
        C0034at b = fcg.mo10682b(fcn.f16282a);
        this.f16431g = new eph(b, feh.mo10750b(), new fey(this));
        this.f16432h = C0052bk.m3244a(b, fez.f16424a);
    }

    /* renamed from: a */
    public static final List m11582a(epq epq) {
        bsxu bsxu;
        if (epq == null) {
            return null;
        }
        bsxk bsxk = epq.f15491a;
        if (bsxk.f147581b != 9 || ((bsxu) bsxk.f147582c).f147620b.size() == 0) {
            return null;
        }
        bsxk bsxk2 = epq.f15491a;
        if (bsxk2.f147581b == 9) {
            bsxu = (bsxu) bsxk2.f147582c;
        } else {
            bsxu = bsxu.f147617e;
        }
        return bsxu.f147620b;
    }

    /* renamed from: a */
    public final bsxn mo10768a() {
        return ((fcn) this.f16425a).f16282a;
    }

    /* renamed from: a */
    public static final List m11583a(List list, String str) {
        if (stm.m36302d(str) || list == null) {
            return list;
        }
        List a = sqw.m36031a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bsxv bsxv = (bsxv) list.get(i);
            if (!m11584a(bsxv.f147627c, str) && !m11584a(bsxv.f147628d, str)) {
                bxwc bxwc = bsxv.f147630f;
                int size2 = bxwc.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (m11584a((String) bxwc.get(i2), str)) {
                        break;
                    }
                    i2 = i3;
                }
            }
            a.add(bsxv);
        }
        return a;
    }

    /* renamed from: a */
    private static final boolean m11584a(String str, String str2) {
        Locale a = fgd.m11650a();
        return str.toLowerCase(a).contains(str2.toLowerCase(a).trim());
    }
}
