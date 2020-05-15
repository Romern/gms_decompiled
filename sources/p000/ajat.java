package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;

/* renamed from: ajat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajat {

    /* renamed from: a */
    public final byyg f70273a;

    /* renamed from: b */
    public final byyg f70274b;

    /* renamed from: c */
    public byyg f70275c;

    /* renamed from: d */
    public byyg f70276d;

    /* renamed from: e */
    public byyg f70277e;

    /* renamed from: f */
    public byyg f70278f;

    /* renamed from: g */
    public final ArrayList f70279g;

    /* renamed from: h */
    private final Context f70280h;

    /* renamed from: i */
    private final SharedPreferences f70281i;

    /* renamed from: j */
    private final Object f70282j = new Object();

    /* renamed from: k */
    private String f70283k;

    public ajat(Context context) {
        srn srn = ahfq.f67120a;
        this.f70280h = context;
        this.f70273a = buqf.m120233b();
        this.f70281i = context.getSharedPreferences("copresence_configuration", 0);
        this.f70274b = buqf.m120232a();
        this.f70275c = m58382a("server");
        this.f70276d = m58382a("overrides");
        this.f70277e = mo38417c();
        this.f70279g = new ArrayList();
        mo38416b();
    }

    /* renamed from: a */
    public static byyg m58381a(byyg byyg, byyg byyg2, String str) {
        sdo.m34959a(byyg2);
        srn srn = ahfq.f67120a;
        try {
            bxvd bxvd = (bxvd) byyg.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) byyg);
            bxvf bxvf = (bxvf) bxvd;
            bxvf.mo73635b(byyg2.serializeToBytes(), bxus.m123744c());
            return (byyg) bxvf.mo74062i();
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajat", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("%s update %s config error: %s", "ConfigurationManager: ", str, e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private final byyg m58385b(String str) {
        byyg b = buqf.m120233b();
        mo38415a(str, b);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.mo73635b(p000.sqd.m35971c(r0), p000.bxus.m123744c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = (p000.bnsl) p000.ahfq.f67120a.mo68387b();
        r1.mo68432a("ajat", "c", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r1.mo68424a("%s error reading gservices overrides configuration: %s", "ConfigurationManager: ", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return r7.f70273a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0.isEmpty() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r1 = p000.buqf.m120233b();
        r2 = (p000.bxvd) r1.mo74142c(5);
        r2.mo73625a((p000.GeneratedMessageLite) r1);
        r2 = (p000.bxvf) r2;
     */
    /* renamed from: c */
    public final byyg mo38417c() {
        bxvf bxvf;
        String i = cfop.f185115a.mo6606a().mo82230i();
        synchronized (this.f70282j) {
            if (i.equals(this.f70283k)) {
                return null;
            }
            this.f70283k = i;
        }
        return (byyg) bxvf.mo74062i();
    }

    /* renamed from: d */
    public final void mo38418d() {
        buye buye = (buye) ahgz.m55755b(this.f70280h, buye.class);
        if (buye != null) {
            bxvf bxvf = (bxvf) bvan.f155497d.mo74144da();
            byyg byyg = this.f70278f;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bvan bvan = (bvan) bxvf.f164949b;
            byyg.getClass();
            bvan.f155501c = byyg;
            int i = bvan.f155499a | 2;
            bvan.f155499a = i;
            bvan.f155500b = 1;
            bvan.f155499a = i | 1;
            buye.mo73257a((bvan) bxvf.mo74062i());
        }
    }

    /* renamed from: e */
    public final long mo38419e() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168967r;
    }

    /* renamed from: f */
    public final boolean mo38420f() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168953c;
    }

    /* renamed from: g */
    public final boolean mo38421g() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168954d;
    }

    /* renamed from: h */
    public final boolean mo38422h() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168965p;
    }

    /* renamed from: i */
    public final boolean mo38423i() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168966q;
    }

    /* renamed from: j */
    public final boolean mo38424j() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168956f;
    }

    /* renamed from: k */
    public final boolean mo38425k() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168958h;
    }

    /* renamed from: l */
    public final long mo38426l() {
        byyl byyl = this.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168961k;
    }

    /* renamed from: m */
    public final byya mo38427m() {
        byya byya = this.f70278f.f168925h;
        return byya == null ? byya.f168860j : byya;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0107 A[LOOP:0: B:30:0x0105->B:31:0x0107, LOOP_END] */
    /* renamed from: b */
    public final void mo38416b() {
        int i;
        int size;
        byyg b = buqf.m120233b();
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        bxvf bxvf = (bxvf) bxvd;
        try {
            bxvf.mo73635b(this.f70274b.serializeToBytes(), bxus.m123744c());
            try {
                bxvf.mo73635b(this.f70275c.serializeToBytes(), bxus.m123744c());
                bxvf.mo73635b(this.f70277e.serializeToBytes(), bxus.m123744c());
                bxvf.mo73635b(this.f70276d.serializeToBytes(), bxus.m123744c());
            } catch (bxwf e) {
                e = e;
            }
        } catch (bxwf e2) {
            e = e2;
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajat", "b", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s merging configuration error: %s", "ConfigurationManager: ", e.getMessage());
            if (cfop.m141875e()) {
            }
            this.f70278f = (byyg) bxvf.mo74062i();
            mo38418d();
            ArrayList arrayList = this.f70279g;
            size = arrayList.size();
            while (i < size) {
            }
        }
        if (cfop.m141875e()) {
            byya byya = ((byyg) bxvf.f164949b).f168925h;
            if (byya == null) {
                byya = byya.f168860j;
            }
            byxy byxy = byya.f168867f;
            if (byxy == null) {
                byxy = byxy.f168842f;
            }
            bxvd bxvd2 = (bxvd) byxy.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) byxy);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            byxy byxy2 = (byxy) bxvd2.f164949b;
            byxy2.f168844a |= 8;
            byxy2.f168847d = false;
            byxy byxy3 = (byxy) bxvd2.mo74062i();
            byya byya2 = ((byyg) bxvf.f164949b).f168925h;
            if (byya2 == null) {
                byya2 = byya.f168860j;
            }
            bxvd bxvd3 = (bxvd) byya2.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) byya2);
            bxvf bxvf2 = (bxvf) bxvd3;
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            byya byya3 = (byya) bxvf2.f164949b;
            byxy3.getClass();
            byya3.f168867f = byxy3;
            byya3.f168862a |= 32;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byyg byyg = (byyg) bxvf.f164949b;
            byya byya4 = (byya) bxvf2.mo74062i();
            byyg byyg2 = byyg.f168916p;
            byya4.getClass();
            byyg.f168925h = byya4;
            byyg.f168918a |= 64;
        }
        this.f70278f = (byyg) bxvf.mo74062i();
        mo38418d();
        ArrayList arrayList2 = this.f70279g;
        size = arrayList2.size();
        for (i = 0; i < size; i++) {
            ((ajay) arrayList2.get(i)).f70288a.mo38429d();
        }
    }

    /* renamed from: a */
    private final byyg m58382a(String str) {
        SharedPreferences sharedPreferences = this.f70281i;
        String str2 = null;
        if (sharedPreferences != null) {
            str2 = sharedPreferences.getString(str, null);
        }
        if (str2 == null) {
            return buqf.m120233b();
        }
        try {
            byte[] c = sqd.m35971c(str2);
            byyg b = buqf.m120233b();
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) b);
            bxvf bxvf = (bxvf) bxvd;
            bxvf.mo73635b(c, bxus.m123744c());
            return (byyg) bxvf.mo74062i();
        } catch (bxwf e) {
            return m58383a(str, str2);
        } catch (IllegalArgumentException e2) {
            return m58383a(str, str2);
        }
    }

    /* renamed from: a */
    private final byyg m58383a(String str, String str2) {
        try {
            byte[] a = sqd.m35966a(str2);
            byyg b = buqf.m120233b();
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) b);
            bxvf bxvf = (bxvf) bxvd;
            bxvf.mo73635b(a, bxus.m123744c());
            return (byyg) bxvf.mo74062i();
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajat", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s reading stored configuration error: %s", "ConfigurationManager: ", e.getMessage());
            return m58385b(str);
        } catch (IllegalArgumentException e2) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68432a("ajat", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("%s reading stored configuration error: %s", "ConfigurationManager: ", e2.getMessage());
            return m58385b(str);
        }
    }

    /* renamed from: a */
    private static byyo m58384a(int i, String str) {
        byyn byyn = (byyn) byyo.f168979d.mo74144da();
        if (byyn.f164950c) {
            byyn.mo74035c();
            byyn.f164950c = false;
        }
        byyo byyo = (byyo) byyn.f164949b;
        int i2 = byyo.f168981a | 1;
        byyo.f168981a = i2;
        byyo.f168982b = i;
        str.getClass();
        byyo.f168981a = i2 | 2;
        byyo.f168983c = str;
        return (byyo) byyn.mo74062i();
    }

    /* renamed from: a */
    public final byyo mo38412a(bzbu bzbu) {
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            byyd byyd = this.f70278f.f168928k;
            if (byyd == null) {
                byyd = byyd.f168903g;
            }
            byyo byyo = byyd.f168906b;
            if (byyo == null) {
                byyo = byyo.f168979d;
            }
            int i = byyo.f168982b;
            byyd byyd2 = this.f70278f.f168928k;
            if (byyd2 == null) {
                byyd2 = byyd.f168903g;
            }
            byyo byyo2 = byyd2.f168906b;
            if (byyo2 == null) {
                byyo2 = byyo.f168979d;
            }
            return m58384a(i, byyo2.f168983c);
        } else if (ordinal == 2) {
            byyd byyd3 = this.f70278f.f168928k;
            if (byyd3 == null) {
                byyd3 = byyd.f168903g;
            }
            byyo byyo3 = byyd3.f168907c;
            if (byyo3 == null) {
                byyo3 = byyo.f168979d;
            }
            int i2 = byyo3.f168982b;
            byyd byyd4 = this.f70278f.f168928k;
            if (byyd4 == null) {
                byyd4 = byyd.f168903g;
            }
            byyo byyo4 = byyd4.f168907c;
            if (byyo4 == null) {
                byyo4 = byyo.f168979d;
            }
            return m58384a(i2, byyo4.f168983c);
        } else if (ordinal == 3) {
            byyd byyd5 = this.f70278f.f168928k;
            if (byyd5 == null) {
                byyd5 = byyd.f168903g;
            }
            byyo byyo5 = byyd5.f168908d;
            if (byyo5 == null) {
                byyo5 = byyo.f168979d;
            }
            int i3 = byyo5.f168982b;
            byyd byyd6 = this.f70278f.f168928k;
            if (byyd6 == null) {
                byyd6 = byyd.f168903g;
            }
            byyo byyo6 = byyd6.f168908d;
            if (byyo6 == null) {
                byyo6 = byyo.f168979d;
            }
            return m58384a(i3, byyo6.f168983c);
        } else if (ordinal != 8) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajat", "a", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("ConfigurationManager: TokenParams config missing for medium: %s", ajgs.m58685a(bzbu));
            return m58384a(8, "GCS");
        } else {
            byyd byyd7 = this.f70278f.f168928k;
            if (byyd7 == null) {
                byyd7 = byyd.f168903g;
            }
            byyo byyo7 = byyd7.f168910f;
            if (byyo7 == null) {
                byyo7 = byyo.f168979d;
            }
            int i4 = byyo7.f168982b;
            byyd byyd8 = this.f70278f.f168928k;
            if (byyd8 == null) {
                byyd8 = byyd.f168903g;
            }
            byyo byyo8 = byyd8.f168910f;
            if (byyo8 == null) {
                byyo8 = byyo.f168979d;
            }
            return m58384a(i4, byyo8.f168983c);
        }
    }

    /* renamed from: a */
    public final void mo38413a() {
        this.f70276d = m58385b("overrides");
        mo38416b();
        buye buye = (buye) ahgz.m55755b(this.f70280h, buye.class);
        if (buye != null) {
            bxvf bxvf = (bxvf) bvan.f155497d.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bvan bvan = (bvan) bxvf.f164949b;
            bvan.f155500b = 3;
            bvan.f155499a |= 1;
            buye.mo73257a((bvan) bxvf.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo38414a(byyg byyg) {
        byyg a = m58381a(this.f70276d, byyg, "overrides");
        this.f70276d = a;
        mo38415a("overrides", a);
        mo38416b();
    }

    /* renamed from: a */
    public final void mo38415a(String str, byyg byyg) {
        String d = sqd.m35972d(byyg.serializeToBytes());
        SharedPreferences sharedPreferences = this.f70281i;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, d);
            edit.apply();
            mo38416b();
        }
    }
}
