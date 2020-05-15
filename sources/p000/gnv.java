package p000;

/* renamed from: gnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnv {

    /* renamed from: A */
    public static final bdyx f18722A = bdyx.m91609a(f18729H, "minutemaid_uncertified_url", "https://www.google.com/android/uncertified/warning?");

    /* renamed from: B */
    public static final bdyx f18723B = bdyx.m91609a(f18729H, "setup_servlet_path", "https://android.googleapis.com/setup");

    /* renamed from: C */
    public static final bdyx f18724C = bdyx.m91609a(f18728G, "valid_minutemaid_url_pattern", String.format("^https:\\/\\/[\\d\\w\\.\\-]+\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", stn.m36304a("gms.auth.sw_domain", "google.com").replace(".", "\\.")));

    /* renamed from: D */
    public static final bdyx f18725D = bdyx.m91609a(f18728G, "token_info_endpoint", "https://www.googleapis.com/oauth2/v2/tokeninfo");

    /* renamed from: E */
    public static final bdyx f18726E = bdyx.m91609a(f18728G, "uncertified_notification_url", "https://support.google.com/googleplay/?p=uncertified_registration");

    /* renamed from: F */
    public static final bdyx f18727F = bdyx.m91609a(f18728G, "lso_revocation_server_api_path", "/oauth2/v4/");

    /* renamed from: G */
    private static final bdyw f18728G = new bdyw(anef.m64088a("com.google.android.gms.auth_account")).mo58445a("auth_").mo58451b("auth_").mo58444a(gnt.f18720a);

    /* renamed from: H */
    private static final bdyw f18729H = new bdyw(anef.m64088a("com.google.android.gms.auth_account")).mo58451b("auth_").mo58444a(gnu.f18721a);

    /* renamed from: a */
    public static final bdyx f18730a = bdyx.m91609a(f18728G, "servlet_path", "https://android.googleapis.com/auth");

    /* renamed from: b */
    public static final bdyx f18731b = bdyx.m91609a(f18728G, "reauth_settings_url", "https://android.googleapis.com/auth/reauthsettings");

    /* renamed from: c */
    public static final bdyx f18732c = bdyx.m91610a(f18728G, "work_account_managers_whitelist_enabled", false);

    /* renamed from: d */
    public static final bdyx f18733d = bdyx.m91609a(f18728G, "verify_pin_url", "https://android.googleapis.com/auth/verifypin");

    /* renamed from: e */
    public static final bdyx f18734e = bdyx.m91609a(f18729H, "checkname_servlet_path", "https://android.googleapis.com/setup/checkname");

    /* renamed from: f */
    public static final bdyx f18735f = bdyx.m91609a(f18728G, "dm_wipe_confirmation_url", "https://m.google.com/devicemanagement/devicestate");

    /* renamed from: g */
    public static final bdyx f18736g = bdyx.m91609a(f18728G, "factory_reset_protection_validation_url", "https://android.googleapis.com/auth/frp/validation");

    /* renamed from: h */
    public static final bdyx f18737h = bdyx.m91609a(f18728G, "lookup_account_state_url", "https://android.googleapis.com/auth/lookup/account_state?rt=b");

    /* renamed from: i */
    public static final bdyx f18738i = bdyx.m91609a(f18728G, "valid_oauth_url_pattern", String.format("^https:\\/\\/(accounts|gaiastaging)[\\w\\.\\-]*\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", stn.m36304a("gms.auth.sw_domain", "google.com").replace(".", "\\.")));

    /* renamed from: j */
    public static final bdyx f18739j = bdyx.m91609a(f18729H, "minutemaid_reauth_glif_url_override", "https://accounts.google.com/embedded/reauth/v2/android?");

    /* renamed from: k */
    public static final String f18740k = "https://accounts.google.com/embedded/reauth/v2/android?flow=xreauth?";

    /* renamed from: l */
    public static final bdyx f18741l = bdyx.m91609a(f18728G, "minutemaid_daydream_url_override", "https://accounts.google.com/embedded/setup/v2/daydream");

    /* renamed from: m */
    public static final bdyx f18742m = bdyx.m91609a(f18728G, "minutemaid_reauth_daydream_url_override", "https://accounts.google.com/embedded/reauth/v2/daydream");

    /* renamed from: n */
    public static final String f18743n = "https://accounts.google.com/embedded/reauth/v2/daydream?flow=xreauth";

    /* renamed from: o */
    public static final String f18744o = "https://accounts.google.com/embedded/reauth/v2/androidtv?flow=xreauth";

    /* renamed from: p */
    public static final bdyx f18745p = bdyx.m91609a(f18728G, "minutemaid_clamshell_url_override", "https://accounts.google.com/embedded/setup/ngc224?");

    /* renamed from: q */
    public static final bdyx f18746q = bdyx.m91609a(f18729H, "minutemaid_reauth_sw_url_override", String.format("https://accounts.%s/embedded/reauth/sw", stn.m36304a("gms.auth.sw_domain", "google.com")));

    /* renamed from: r */
    public static final bdyx f18747r = bdyx.m91609a(f18729H, "minutemaid_reauth_url_override", "https://accounts.google.com/embedded/reauth/android");

    /* renamed from: s */
    public static final String f18748s = "https://accounts.google.com/embedded/reauth/android?flow=xreauth";

    /* renamed from: t */
    public static final bdyx f18749t = bdyx.m91609a(f18729H, "minutemaid_sw_url_override", String.format("https://accounts.%s/embedded/setup/sw", stn.m36304a("gms.auth.sw_domain", "google.com")));

    /* renamed from: u */
    public static final bdyx f18750u = bdyx.m91609a(f18728G, "account_settings_sw_url", String.format("https://settings.%s", stn.m36304a("gms.auth.sw_domain", "google.com")));

    /* renamed from: v */
    public static final bdyx f18751v = bdyx.m91609a(f18728G, "minutemaid_tv_url_override", "https://accounts.google.com/embedded/setup/v2/androidtv");

    /* renamed from: w */
    public static final bdyx f18752w = bdyx.m91609a(f18729H, "minutemaid_glif_url_override", "https://accounts.google.com/embedded/setup/v2/android?");

    /* renamed from: x */
    public static final bdyx f18753x = bdyx.m91609a(f18729H, "minutemaid_url_override", "https://accounts.google.com/embedded/setup/android?");

    /* renamed from: y */
    public static final bdyx f18754y = bdyx.m91609a(f18728G, "minutemaid_kid_sign_in_url", "https://accounts.google.com/embedded/setup/kidsignin/android");

    /* renamed from: z */
    public static final bdyx f18755z = bdyx.m91609a(f18728G, "minutemaid_kid_sign_up_url", "https://accounts.google.com/embedded/setup/kidsignup/android");

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
    static {
        bdyx.m91609a(f18728G, "minutemaid_auto_url_override", "https://accounts.google.com/embedded/setup/v2/androidauto");
        bdyx.m91609a(f18728G, "minutemaid_uncertified_auto_url_override", "https://www.google.com/android/uncertified/warningauto");
        bdyx.m91609a(f18728G, "minutemaid_auto_reauth_url_override", "https://accounts.google.com/embedded/reauth/v2/androidauto/androidreauth");
    }

    /* renamed from: A */
    public static boolean m13491A() {
        return cbzt.f178599a.mo6606a().mo75646h();
    }

    /* renamed from: B */
    public static boolean m13492B() {
        return cbzt.f178599a.mo6606a().mo75645g();
    }

    /* renamed from: C */
    public static boolean m13493C() {
        return cbzt.f178599a.mo6606a().mo75644f();
    }

    /* renamed from: D */
    public static boolean m13494D() {
        return cbzt.f178599a.mo6606a().mo75643e();
    }

    /* renamed from: E */
    public static boolean m13495E() {
        return ccai.f178624a.mo6606a().mo75714t();
    }

    /* renamed from: F */
    public static boolean m13496F() {
        return ccai.f178624a.mo6606a().mo75716v();
    }

    /* renamed from: G */
    public static boolean m13497G() {
        return ccai.f178624a.mo6606a().mo75715u();
    }

    /* renamed from: H */
    public static boolean m13498H() {
        return ccai.f178624a.mo6606a().mo75712r();
    }

    /* renamed from: I */
    public static double m13499I() {
        return ccai.f178624a.mo6606a().mo75704j();
    }

    /* renamed from: J */
    public static int m13500J() {
        return (int) ccai.f178624a.mo6606a().mo75705k();
    }

    /* renamed from: K */
    public static String m13501K() {
        return ccai.f178624a.mo6606a().mo75666H();
    }

    /* renamed from: L */
    public static String m13502L() {
        return ccai.f178624a.mo6606a().mo75667I();
    }

    /* renamed from: M */
    public static boolean m13503M() {
        return cbzt.f178599a.mo6606a().mo75641c();
    }

    /* renamed from: N */
    public static boolean isDroidGuardEnabled() {
        return cbzt.f178599a.mo6606a().mo75642d();
    }

    /* renamed from: O */
    public static boolean m13505O() {
        return ccai.f178624a.mo6606a().mo75670L();
    }

    /* renamed from: P */
    public static boolean m13506P() {
        return ccai.f178624a.mo6606a().mo75718x();
    }

    /* renamed from: Q */
    public static boolean m13507Q() {
        return ccai.f178624a.mo6606a().mo75671M();
    }

    /* renamed from: R */
    public static boolean m13508R() {
        return ccai.f178624a.mo6606a().mo75665G();
    }

    /* renamed from: S */
    public static String m13509S() {
        return ccai.f178624a.mo6606a().mo75675Q();
    }

    /* renamed from: T */
    public static long m13510T() {
        return ccai.f178624a.mo6606a().mo75677S();
    }

    /* renamed from: U */
    public static String m13511U() {
        return ccai.f178624a.mo6606a().mo75678T();
    }

    /* renamed from: V */
    public static boolean m13512V() {
        return ccai.f178624a.mo6606a().mo75720z();
    }

    /* renamed from: W */
    public static boolean m13513W() {
        return ccai.f178624a.mo6606a().mo75662D();
    }

    /* renamed from: X */
    public static long m13514X() {
        return ccai.f178624a.mo6606a().mo75683Y();
    }

    /* renamed from: Y */
    public static String m13515Y() {
        return ccai.f178624a.mo6606a().mo75680V();
    }

    /* renamed from: Z */
    public static boolean m13516Z() {
        return ccai.f178624a.mo6606a().mo75663E();
    }

    /* renamed from: a */
    public static long m13517a() {
        return cbye.f178550a.mo6606a().mo75605a();
    }

    /* renamed from: aA */
    public static boolean m13519aA() {
        return ccai.f178624a.mo6606a().mo75701g();
    }

    /* renamed from: aB */
    public static boolean m13520aB() {
        return ccai.f178624a.mo6606a().mo75687ab();
    }

    /* renamed from: aC */
    public static int m13521aC() {
        return (int) ccai.f178624a.mo6606a().mo75706l();
    }

    /* renamed from: aD */
    public static String m13522aD() {
        return (String) f18730a.mo58455c();
    }

    /* renamed from: aE */
    public static String m13523aE() {
        return (String) f18737h.mo58455c();
    }

    /* renamed from: aF */
    public static String m13524aF() {
        return (String) f18723B.mo58455c();
    }

    /* renamed from: aG */
    public static String m13525aG() {
        return (String) f18735f.mo58455c();
    }

    /* renamed from: aH */
    public static String m13526aH() {
        return (String) f18724C.mo58455c();
    }

    /* renamed from: aI */
    public static String m13527aI() {
        return (String) f18725D.mo58455c();
    }

    /* renamed from: aa */
    public static boolean m13528aa() {
        return ccai.f178624a.mo6606a().mo75702h();
    }

    /* renamed from: ab */
    public static String m13529ab() {
        return ccai.f178624a.mo6606a().mo75693ah();
    }

    /* renamed from: ac */
    public static boolean m13530ac() {
        return ccai.f178624a.mo6606a().mo75695aj();
    }

    /* renamed from: ad */
    public static long m13531ad() {
        return ccai.f178624a.mo6606a().mo75694ai();
    }

    /* renamed from: ae */
    public static boolean m13532ae() {
        return ccai.f178624a.mo6606a().mo75664F();
    }

    /* renamed from: af */
    public static long m13533af() {
        return ccai.f178624a.mo6606a().mo75700f();
    }

    /* renamed from: ag */
    public static long m13534ag() {
        return ccai.f178624a.mo6606a().mo75691af();
    }

    /* renamed from: ah */
    public static long m13535ah() {
        return ccai.f178624a.mo6606a().mo75686aa();
    }

    /* renamed from: ai */
    public static int m13536ai() {
        return (int) cbzt.f178599a.mo6606a().mo75647i();
    }

    /* renamed from: aj */
    public static long m13537aj() {
        return cbzt.f178599a.mo6606a().mo75648j();
    }

    /* renamed from: ak */
    public static boolean m13538ak() {
        return ccai.f178624a.mo6606a().mo75697c();
    }

    /* renamed from: al */
    public static boolean m13539al() {
        return ccai.f178624a.mo6606a().mo75660B();
    }

    /* renamed from: am */
    public static boolean m13540am() {
        return ccai.f178624a.mo6606a().mo75685a();
    }

    /* renamed from: an */
    public static boolean m13541an() {
        return ccai.f178624a.mo6606a().mo75696b();
    }

    /* renamed from: ao */
    public static boolean m13542ao() {
        return ccai.f178624a.mo6606a().mo75676R();
    }

    /* renamed from: ap */
    public static double m13543ap() {
        return ccai.f178624a.mo6606a().mo75673O();
    }

    /* renamed from: aq */
    public static boolean m13544aq() {
        return ccai.f178624a.mo6606a().mo75717w();
    }

    /* renamed from: ar */
    public static long m13545ar() {
        return ccai.f178624a.mo6606a().mo75681W();
    }

    /* renamed from: as */
    public static boolean m13546as() {
        return ccai.f178624a.mo6606a().mo75688ac();
    }

    /* renamed from: at */
    public static int m13547at() {
        return (int) ccai.f178624a.mo6606a().mo75690ae();
    }

    /* renamed from: au */
    public static String m13548au() {
        return ccai.f178624a.mo6606a().mo75689ad();
    }

    /* renamed from: av */
    public static boolean m13549av() {
        return ccai.f178624a.mo6606a().mo75684Z();
    }

    /* renamed from: aw */
    public static boolean m13550aw() {
        return ccai.f178624a.mo6606a().mo75672N();
    }

    /* renamed from: ax */
    public static long m13551ax() {
        return ccai.f178624a.mo6606a().mo75682X();
    }

    /* renamed from: ay */
    public static boolean m13552ay() {
        return ccai.f178624a.mo6606a().mo75659A();
    }

    /* renamed from: az */
    public static boolean m13553az() {
        return ccai.f178624a.mo6606a().mo75703i();
    }

    /* renamed from: b */
    public static long m13554b() {
        return cbye.f178550a.mo6606a().mo75606b();
    }

    /* renamed from: c */
    public static String m13556c(boolean z) {
        return !z ? (String) f18742m.mo58455c() : f18743n;
    }

    /* renamed from: d */
    public static double m13558d() {
        return cbyh.f178554a.mo6606a().mo75608a();
    }

    /* renamed from: e */
    public static boolean m13560e() {
        return ccal.f178688a.mo6606a().mo75722a();
    }

    /* renamed from: f */
    public static String m13561f() {
        return ccbd.f178711a.mo6606a().mo75739a();
    }

    /* renamed from: g */
    public static boolean m13562g() {
        return ccbj.f178717a.mo6606a().mo75743a();
    }

    /* renamed from: h */
    public static String m13563h() {
        return ccbj.f178717a.mo6606a().mo75745c();
    }

    /* renamed from: i */
    public static boolean m13564i() {
        return ccbj.f178717a.mo6606a().mo75744b();
    }

    /* renamed from: j */
    public static kav m13565j() {
        return ccbv.f178731a.mo6606a().mo75753a();
    }

    /* renamed from: k */
    public static boolean m13566k() {
        return ccai.f178624a.mo6606a().mo75669K();
    }

    /* renamed from: l */
    public static boolean m13567l() {
        return ccai.f178624a.mo6606a().mo75719y();
    }

    /* renamed from: m */
    public static boolean m13568m() {
        return ccai.f178624a.mo6606a().mo75698d();
    }

    /* renamed from: n */
    public static long m13569n() {
        return ccai.f178624a.mo6606a().mo75699e();
    }

    /* renamed from: o */
    public static long m13570o() {
        return ccai.f178624a.mo6606a().mo75709o();
    }

    /* renamed from: p */
    public static long m13571p() {
        return ccai.f178624a.mo6606a().mo75708n();
    }

    /* renamed from: q */
    public static long m13572q() {
        return ccai.f178624a.mo6606a().mo75674P();
    }

    /* renamed from: r */
    public static boolean m13573r() {
        return ccai.f178624a.mo6606a().mo75661C();
    }

    /* renamed from: s */
    public static boolean m13574s() {
        return ccai.f178624a.mo6606a().mo75713s();
    }

    /* renamed from: t */
    public static double m13575t() {
        return ccai.f178624a.mo6606a().mo75668J();
    }

    /* renamed from: u */
    public static double m13576u() {
        return ccai.f178624a.mo6606a().mo75707m();
    }

    /* renamed from: v */
    public static String m13577v() {
        return ccai.f178624a.mo6606a().mo75692ag();
    }

    /* renamed from: w */
    public static long m13578w() {
        return cbzt.f178599a.mo6606a().mo75639a();
    }

    @Deprecated
    /* renamed from: x */
    public static String m13579x() {
        return cbzt.f178599a.mo6606a().mo75640b();
    }

    /* renamed from: y */
    public static long m13580y() {
        return ccai.f178624a.mo6606a().mo75710p();
    }

    /* renamed from: z */
    public static long m13581z() {
        return ccai.f178624a.mo6606a().mo75711q();
    }

    /* renamed from: c */
    public static boolean m13557c() {
        return cbxy.f178544a.mo6606a().mo75601a();
    }

    /* renamed from: a */
    public static String m13518a(boolean z) {
        return !z ? ccai.f178624a.mo6606a().mo75679U() : f18744o;
    }

    /* renamed from: b */
    public static String m13555b(boolean z) {
        return !z ? (String) f18739j.mo58455c() : f18740k;
    }

    /* renamed from: d */
    public static String m13559d(boolean z) {
        return !z ? (String) f18747r.mo58455c() : f18748s;
    }
}
