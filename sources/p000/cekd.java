package p000;

/* renamed from: cekd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cekd implements cekb {

    /* renamed from: a */
    public static final bdyx f182821a;

    /* renamed from: b */
    public static final bdyx f182822b;

    /* renamed from: c */
    public static final bdyx f182823c;

    /* renamed from: d */
    public static final bdyx f182824d;

    /* renamed from: e */
    public static final bdyx f182825e;

    /* renamed from: f */
    public static final bdyx f182826f;

    /* renamed from: g */
    public static final bdyx f182827g;

    /* renamed from: h */
    public static final bdyx f182828h;

    /* renamed from: i */
    public static final bdyx f182829i;

    /* renamed from: j */
    public static final bdyx f182830j;

    /* renamed from: k */
    public static final bdyx f182831k;

    /* renamed from: l */
    public static final bdyx f182832l;

    /* renamed from: m */
    public static final bdyx f182833m;

    /* JADX WARN: Type inference failed for: r3v8, types: [byte[]], assign insn: 0x0057: NEW_ARRAY  (r3v8 ? I:byte[]) = (926 int) type: byte[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.growth")).mo58443a();
        f182821a = bdyx.m91609a(a, "Web__activity_result_callback", "window.growthOnActivityResult");
        f182822b = bdyx.m91610a(a, "Web__add_android_go_to_user_agent", false);
        f182823c = bdyx.m91610a(a, "Web__alleyoop_send_current_account", false);
        bdyx.m91607a(a, "Web__check_default_app_attempts", 5L);
        bdyx.m91607a(a, "Web__check_default_app_delay", 1800000L);
        bdyx.m91607a(a, "Web__check_default_app_period", 86400000L);
        bdyx.m91607a(a, "Web__check_default_app_window", 1800000L);
        f182824d = bdyx.m91609a(a, "Web__default_task_description", "Google Guide");
        try {
            f182825e = bdyx.m91608a(a, "Web__intent_invocation_whitelist", (cejj) bxvk.m124014a(cejj.f182771b, (byte[]) new byte[]{10, 124, 8, -24, 7, 18, 119, 10, 108, 10, 59, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 97, 99, 99, 111, 117, 110, 116, 115, 101, 116, 116, 105, 110, 103, 115, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 95, 83, 69, 84, 84, 73, 78, 71, 83, 26, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 42, 21, 10, 19, 10, 14, 101, 120, 116, 114, 97, 46, 115, 99, 114, 101, 101, 110, 73, 100, 32, -77, 2, 18, 7, 10, 5, 8, 1, 16, -24, 7, 10, 98, 8, -23, 7, 18, 93, 10, 82, 10, 47, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 116, 97, 99, 104, 121, 111, 110, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 71, 73, 83, 84, 69, 82, 26, 31, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 116, 97, 99, 104, 121, 111, 110, 18, 7, 10, 5, 8, 1, 16, -23, 7, 10, -112, 1, 8, -21, 7, 18, -118, 1, 10, -127, 1, 10, 26, 97, 110, 100, 114, 111, 105, 100, 46, 105, 110, 116, 101, 110, 116, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 18, 99, 104, 116, 116, 112, 115, 58, 47, 47, 115, 117, 112, 112, 111, 114, 116, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 97, 99, 99, 111, 117, 110, 116, 115, 47, 97, 110, 115, 119, 101, 114, 47, 49, 56, 51, 55, 50, 51, 63, 104, 108, 61, 101, 110, 38, 118, 105, 115, 105, 116, 95, 105, 100, 61, 54, 51, 54, 57, 53, 54, 50, 48, 50, 57, 53, 52, 49, 51, 53, 51, 52, 52, 45, 49, 53, 54, 56, 53, 50, 54, 53, 48, 53, 38, 114, 100, 61, 49, 18, 4, 10, 2, 8, 0, 10, 107, 8, -20, 7, 18, 102, 10, 91, 10, 50, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 103, 115, 97, 46, 111, 112, 97, 46, 79, 80, 65, 95, 79, 80, 84, 95, 73, 78, 95, 87, 82, 65, 80, 80, 69, 68, 42, 37, 10, 22, 10, 18, 118, 97, 108, 117, 101, 80, 114, 111, 112, 83, 107, 105, 112, 112, 97, 98, 108, 101, 48, 1, 10, 11, 10, 7, 104, 111, 116, 119, 111, 114, 100, 48, 1, 18, 7, 10, 5, 8, 1, 16, -20, 7, 10, -85, 1, 8, -19, 7, 18, -91, 1, 10, -100, 1, 10, 26, 97, 110, 100, 114, 111, 105, 100, 46, 105, 110, 116, 101, 110, 116, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 18, 126, 104, 116, 116, 112, 115, 58, 47, 47, 115, 117, 112, 112, 111, 114, 116, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 99, 111, 110, 116, 97, 99, 116, 115, 47, 97, 110, 115, 119, 101, 114, 47, 55, 49, 57, 57, 50, 57, 52, 63, 118, 105, 115, 105, 116, 95, 105, 100, 61, 54, 51, 54, 57, 54, 53, 51, 53, 49, 48, 52, 55, 50, 57, 53, 49, 49, 54, 45, 50, 50, 57, 57, 55, 53, 52, 49, 38, 114, 100, 61, 49, 38, 99, 111, 61, 71, 69, 78, 73, 69, 46, 80, 108, 97, 116, 102, 111, 114, 109, 37, 51, 68, 65, 110, 100, 114, 111, 105, 100, 38, 111, 99, 111, 61, 49, 18, 4, 10, 2, 8, 0, 10, 90, 8, -18, 7, 18, 85, 10, 77, 10, 26, 97, 110, 100, 114, 111, 105, 100, 46, 105, 110, 116, 101, 110, 116, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 18, 47, 104, 116, 116, 112, 115, 58, 47, 47, 115, 117, 112, 112, 111, 114, 116, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 108, 101, 103, 97, 108, 47, 97, 110, 115, 119, 101, 114, 47, 51, 49, 49, 48, 52, 50, 48, 18, 4, 10, 2, 8, 0, 10, 85, 8, -17, 7, 18, 80, 10, 72, 10, 26, 97, 110, 100, 114, 111, 105, 100, 46, 105, 110, 116, 101, 110, 116, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 18, 42, 104, 116, 116, 112, 115, 58, 47, 47, 109, 121, 97, 99, 99, 111, 117, 110, 116, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 112, 114, 105, 118, 97, 99, 121, 112, 111, 108, 105, 99, 121, 18, 4, 10, 2, 8, 0, 10, 89, 8, -16, 7, 18, 84, 10, 76, 10, 26, 97, 110, 100, 114, 111, 105, 100, 46, 105, 110, 116, 101, 110, 116, 46, 97, 99, 116, 105, 111, 110, 46, 86, 73, 69, 87, 18, 46, 104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 105, 110, 116, 108, 47, 101, 110, 47, 112, 111, 108, 105, 99, 105, 101, 115, 47, 116, 101, 114, 109, 115, 47, 18, 4, 10, 2, 8, 0}), cekc.f182820a);
            f182826f = bdyx.m91607a(a, "Web__pay_environment", 1L);
            f182827g = bdyx.m91609a(a, "Web__webview_debug_url", "https://gds.google.com/gds/debug");
            f182828h = bdyx.m91609a(a, "Web__webview_debug_welcome_url", "https://gds.google.com/gds/welcome");
            f182829i = bdyx.m91609a(a, "Web__webview_domain", "gds.google.com");
            f182830j = bdyx.m91610a(a, "Web__webview_enable", true);
            f182831k = bdyx.m91609a(a, "Web__webview_intent_whitelist", "com.google.android.apps.tachyon#com.google.android.apps.tachyon.MainActivity com.google.android.apps.walletnfcrel#com.google.commerce.tapandpay.android.cardlist.CardListActivity");
            f182832l = bdyx.m91610a(a, "Web__webview_sign_in", true);
            f182833m = bdyx.m91609a(a, "Web__webview_url_whitelist", "https://www.gstatic.com/* https://www.google.com/images/*.png https://www.google.com/insights/consumersurveys/* https://fonts.gstatic.com/* https://maps.googleapis.com/* https://www.google.com/images/*.gif https://play.google.com/log* https://www.google.com/images/*.jpg https://www.google.com/tools/feedback* https://www.gstatic.com/feedback/js* https://scone-pa.clients6.google.com/v1/feedback/* blob:https://feedback.googleusercontent.com/* https://feedback.googleusercontent.com/* https://myaccount.google.com/* https://accounts.youtube.com/* https://ssl.gstatic.com/* https://lh3.googleusercontent.com/* https://ssl.google-analytics.com/* https://stats.g.doubleclick.net/* https://apis.google.com/* https://content.googleapis.com/* https://accounts.google.com/* https://accounts.google.net/* https://accounts.google.org/* https://accounts.google.biz/* https://accounts.google.info/* https://accounts.google.mobi/* https://accounts.google.name/* https://accounts.google.pro/* https://accounts.google.us/* https://accounts.google.ag/* https://accounts.google.ba/* https://accounts.google.ca/* https://accounts.google.co.cr/* https://accounts.google.co.uk/* https://accounts.g.cn/* https://accounts.google.cn/* https://accounts.google.com.cn/* https://accounts.guge.com/* https://accounts.guge.com.cn/* https://accounts.guge.cn/* https://accounts.googel.cn/* https://accounts.xn--flW351E.cn/* https://accounts.google.al/* https://accounts.google.org.uk/* https://accounts.google.cl/* https://accounts.google.de/* https://accounts.google.ec/* https://accounts.google.ee/* https://accounts.google.fi/* https://accounts.google.fr/* https://accounts.google.gd/* https://accounts.google.ge/* https://accounts.google.gy/* https://accounts.google.com.gy/* https://accounts.google.ie/* https://accounts.google.in/* https://accounts.google.net.in/* https://accounts.google.org.in/* https://accounts.google.it/* https://accounts.google.co.nz/* https://accounts.google.org.nz/* https://accounts.google.net.nz/* https://accounts.google.co.at/* https://accounts.google.com.af/* https://accounts.google.org.af/* https://accounts.google.at/* https://accounts.google.com.au/* https://accounts.google.com.br/* https://accounts.google.com.gt/* https://accounts.google.com.mx/* https://accounts.google.mx/* https://accounts.google.co.ma/* https://accounts.google.jobs/* https://accounts.google.cz/* https://accounts.google.hu/* https://accounts.google.co.hu/* https://accounts.google.nl/* https://accounts.google.is/* https://accounts.google.dk/* https://accounts.google.pf/* https://accounts.google.com.pg/* https://accounts.google.pl/* https://accounts.google.com.pl/* https://accounts.google.com.ph/* https://accounts.google.com.pr/* https://accounts.google.ro/* https://accounts.google.se/* https://accounts.google.ch/* https://accounts.google.gm/* https://accounts.xn--2e0b0k.kr/* https://accounts.google.co.kr/* https://accounts.google.kr/* https://accounts.google.jp/* https://accounts.google.co.jp/* https://accounts.google.ne.jp/* https://accounts.google.co.je/* https://accounts.google.com.ar/* https://accounts.google.am/* https://accounts.google.be/* https://accounts.google.fm/* https://accounts.google.tv/* https://accounts.google.vg/* https://accounts.google.bi/* https://accounts.google.cc/* https://accounts.google.cd/* https://accounts.google.co.il/* https://accounts.google.kz/* https://accounts.google.la/* https://accounts.google.lv/* https://accounts.google.lt/* https://accounts.google.md/* https://accounts.google.mw/* https://accounts.google.mr/* https://accounts.google.ms/* https://accounts.google.nr/* https://accounts.google.nu/* https://accounts.google.ps/* https://accounts.google.com.ps/* https://accounts.google.com.nf/* https://accounts.google.com.pa/* https://accounts.google.com.py/* https://accounts.google.ru/* https://accounts.google.com.ru/* https://accounts.xn--c1aay4a.xn--p1ai/* https://accounts.google.rw/* https://accounts.google.sh/* https://accounts.google.com.ec/* https://accounts.google.co.gg/* https://accounts.google.li/* https://accounts.google.com.ua/* https://accounts.google.ua/* https://accounts.google.co.ua/* https://accounts.google.as/* https://accounts.google.ws/* https://accounts.google.sg/* https://accounts.google.co.th/* https://accounts.google.ae/* https://accounts.google.gr/* https://accounts.google.com.gr/* https://accounts.google.no/* https://accounts.google.com.pt/* https://accounts.google.pt/* https://accounts.google.com.sg/* https://accounts.google.io/* https://accounts.google.td/* https://accounts.google.tw/* https://accounts.google.com.hk/* https://accounts.google.hk/* https://accounts.google.com.pe/* https://accounts.google.com.tw/* https://accounts.google.je/* https://accounts.google.com.tr/* https://accounts.google.ac/* https://accounts.google.ad/* https://accounts.google.it.ao/* https://accounts.google.aw/* https://accounts.google.az/* https://accounts.google.bf/* https://accounts.google.bg/* https://accounts.google.bj/* https://accounts.google.bm/* https://accounts.google.bn/* https://accounts.google.bo/* https://accounts.google.bs/* https://accounts.google.bt/* https://accounts.google.by/* https://accounts.google.bz/* https://accounts.google.cat/* https://accounts.google.cf/* https://accounts.google.cg/* https://accounts.google.ci/* https://accounts.google.cm/* https://accounts.google.co.ao/* https://accounts.google.co.ba/* https://accounts.google.co.bi/* https://accounts.google.co.bw/* https://accounts.google.co.ci/* https://accounts.google.co.ck/* https://accounts.google.co.gl/* https://accounts.google.co.gy/* https://accounts.google.co.id/* https://accounts.google.co.im/* https://accounts.google.co.in/* https://accounts.google.co.it/* https://accounts.google.co.ke/* https://accounts.google.co.ls/* https://accounts.google.co.mu/* https://accounts.google.co.mw/* https://accounts.google.co.mz/* https://accounts.google.co.pn/* https://accounts.google.co.rs/* https://accounts.google.co.tt/* https://accounts.google.co.tz/* https://accounts.google.co.ug/* https://accounts.google.co.uz/* https://accounts.google.co.ve/* https://accounts.google.co.vi/* https://accounts.google.co.za/* https://accounts.google.co.zm/* https://accounts.google.co.zw/* https://accounts.google.com.ag/* https://accounts.google.com.ai/* https://accounts.google.com.az/* https://accounts.google.com.bd/* https://accounts.google.com.bh/* https://accounts.google.com.bi/* https://accounts.google.com.bn/* https://accounts.google.com.bo/* https://accounts.google.com.bs/* https://accounts.google.com.by/* https://accounts.google.com.bz/* https://accounts.google.com.cy/* https://accounts.google.com.dz/* https://accounts.google.com.eg/* https://accounts.google.com.er/* https://accounts.google.com.et/* https://accounts.google.com.ge/* https://accounts.google.com.gh/* https://accounts.google.com.gi/* https://accounts.google.com.gl/* https://accounts.google.com.gp/* https://accounts.google.com.hn/* https://accounts.google.com.hr/* https://accounts.google.com.ht/* https://accounts.google.com.iq/* https://accounts.google.com.jm/* https://accounts.google.com.jo/* https://accounts.google.com.kg/* https://accounts.google.com.kh/* https://accounts.google.com.ki/* https://accounts.google.com.kw/* https://accounts.google.com.kz/* https://accounts.google.com.lb/* https://accounts.google.com.lc/* https://accounts.google.com.lk/* https://accounts.google.com.lv/* https://accounts.google.com.ly/* https://accounts.google.com.mk/* https://accounts.google.com.mm/* https://accounts.google.com.mt/* https://accounts.google.com.mu/* https://accounts.google.com.mw/* https://accounts.google.com.my/* https://accounts.google.com.na/* https://accounts.google.com.nc/* https://accounts.google.com.ng/* https://accounts.google.com.ni/* https://accounts.google.com.np/* https://accounts.google.com.nr/* https://accounts.google.com.om/* https://accounts.google.com.pk/* https://accounts.google.com.qa/* https://accounts.google.com.sa/* https://accounts.google.com.sb/* https://accounts.google.com.sc/* https://accounts.google.com.sl/* https://accounts.google.com.sv/* https://accounts.google.com.tj/* https://accounts.google.com.tm/* https://accounts.google.com.tn/* https://accounts.google.com.tt/* https://accounts.google.com.uy/* https://accounts.google.com.uz/* https://accounts.google.com.vc/* https://accounts.google.com.vi/* https://accounts.google.com.vn/* https://accounts.google.com.ws/* https://accounts.google.com.cu/* https://accounts.google.cv/* https://accounts.google.cx/* https://accounts.google.dj/* https://accounts.google.dm/* https://accounts.google.do/* https://accounts.google.dz/* https://accounts.google.es/* https://accounts.google.eu/* https://accounts.google.nom.es/* https://accounts.google.org.es/* https://accounts.google.ga/* https://accounts.google.gf/* https://accounts.google.gg/* https://accounts.google.gl/* https://accounts.google.gp/* https://accounts.google.gw/* https://accounts.google.hn/* https://accounts.google.hr/* https://accounts.google.ht/* https://accounts.google.im/* https://accounts.google.in.rs/* https://accounts.google.iq/* https://accounts.google.jo/* https://accounts.google.kg/* https://accounts.google.ki/* https://accounts.google.km/* https://accounts.google.kn/* https://accounts.google.lk/* https://accounts.google.lu/* https://accounts.google.ma/* https://accounts.google.me/* https://accounts.google.mg/* https://accounts.google.mh/* https://accounts.google.mk/* https://accounts.google.ml/* https://accounts.google.mn/* https://accounts.google.mu/* https://accounts.google.mv/* https://accounts.google.ne/* https://accounts.google.nf/* https://accounts.google.ng/* https://accounts.google.off.ai/* https://accounts.google.ph/* https://accounts.google.pk/* https://accounts.google.pn/* https://accounts.google.pr/* https://accounts.google.qa/* https://accounts.google.re/* https://accounts.google.rs/* https://accounts.google.sc/* https://accounts.google.si/* https://accounts.google.sk/* https://accounts.google.sl/* https://accounts.google.sm/* https://accounts.google.sn/* https://accounts.google.so/* https://accounts.google.sr/* https://accounts.google.st/* https://accounts.google.sz/* https://accounts.google.tk/* https://accounts.google.tg/* https://accounts.google.tm/* https://accounts.google.tn/* https://accounts.google.to/* https://accounts.google.tt/* https://accounts.google.ug/* https://accounts.google.uz/* https://accounts.google.vc/* https://accounts.google.vn/* https://accounts.google.vu/* https://accounts.google.yt/* https://accounts.google.af/* https://accounts.google.com.ve/* https://accounts.google.tel/* https://accounts.google.tp/* https://accounts.google.tl/* https://accounts.google.com.do/* https://accounts.google.com.co/* https://accounts.google.com.fj/*");
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"Web__intent_invocation_whitelist\"");
        }
    }

    /* renamed from: a */
    public final String mo79203a() {
        return (String) f182821a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79204b() {
        return ((Boolean) f182822b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79205c() {
        return ((Boolean) f182823c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo79206d() {
        return (String) f182824d.mo58455c();
    }

    /* renamed from: e */
    public final cejj mo79207e() {
        return (cejj) f182825e.mo58455c();
    }

    /* renamed from: f */
    public final long mo79208f() {
        return ((Long) f182826f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo79209g() {
        return (String) f182827g.mo58455c();
    }

    /* renamed from: h */
    public final String mo79210h() {
        return (String) f182828h.mo58455c();
    }

    /* renamed from: i */
    public final String mo79211i() {
        return (String) f182829i.mo58455c();
    }

    /* renamed from: j */
    public final boolean mo79212j() {
        return ((Boolean) f182830j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final String mo79213k() {
        return (String) f182831k.mo58455c();
    }

    /* renamed from: l */
    public final boolean mo79214l() {
        return ((Boolean) f182832l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final String mo79215m() {
        return (String) f182833m.mo58455c();
    }
}
