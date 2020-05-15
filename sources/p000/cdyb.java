package p000;

/* renamed from: cdyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdyb implements cdya {

    /* renamed from: a */
    public static final bdyx f181893a;

    /* renamed from: b */
    public static final bdyx f181894b;

    /* renamed from: c */
    public static final bdyx f181895c;

    /* renamed from: d */
    public static final bdyx f181896d;

    /* renamed from: e */
    public static final bdyx f181897e;

    /* renamed from: f */
    public static final bdyx f181898f;

    /* renamed from: g */
    public static final bdyx f181899g;

    /* renamed from: h */
    public static final bdyx f181900h;

    /* renamed from: i */
    public static final bdyx f181901i;

    /* renamed from: j */
    public static final bdyx f181902j;

    /* renamed from: k */
    public static final bdyx f181903k;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.firebase.auth"));
        f181893a = bdyx.m91609a(bdyw, "firebase_auth_eid", "p");
        bdyx.m91610a(bdyw, "firebase_auth_enable_clearcut", false);
        f181894b = bdyx.m91610a(bdyw, "firebase_auth_enable_headful_lite_activities", true);
        f181895c = bdyx.m91610a(bdyw, "firebase_auth_enable_phone_number_instant_validation", true);
        f181896d = bdyx.m91610a(bdyw, "firebase_auth_enable_sms_session_keep_alive", true);
        f181897e = bdyx.m91609a(bdyw, "firebase_auth_identity_toolkit_base_url", "https://www.googleapis.com/identitytoolkit/v3/relyingparty");
        f181898f = bdyx.m91610a(bdyw, "firebase_auth_require_sender_id_match_for_auto_retrieval", false);
        f181899g = bdyx.m91609a(bdyw, "firebase_auth_sms_verification_code_regex", "(?<!\\d)\\d{6}(?!\\d)");
        f181900h = bdyx.m91609a(bdyw, "firebase_auth_sms_verification_sender_id_regex", "^\\+175426319\\d{2}$");
        f181901i = bdyx.m91609a(bdyw, "firebase_auth_sms_verification_sender_ids", "44398,54398,605512,51404,50350404,56161174,ID CODE,G.CN Phone Code,Phone Code,+33644630927,+491771783652,+6285574671017,81555,63001,Google,+14159857961,+14159857962,+14159857964,+14159857965,+14159857967,+16509355854,+16509355856,+16509355857,+16509355859,+16509355861");
        f181902j = bdyx.m91609a(bdyw, "firebase_auth_sts_base_url", "https://securetoken.googleapis.com/v1");
        f181903k = bdyx.m91610a(bdyw, "firebase_auth_use_custom_chrome_tabs_in_headful_lite", true);
    }

    /* renamed from: a */
    public final String mo78432a() {
        return (String) f181893a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78433b() {
        return ((Boolean) f181894b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78434c() {
        return ((Boolean) f181895c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78435d() {
        return ((Boolean) f181896d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo78436e() {
        return (String) f181897e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo78437f() {
        return ((Boolean) f181898f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final String mo78438g() {
        return (String) f181899g.mo58455c();
    }

    /* renamed from: h */
    public final String mo78439h() {
        return (String) f181900h.mo58455c();
    }

    /* renamed from: i */
    public final String mo78440i() {
        return (String) f181901i.mo58455c();
    }

    /* renamed from: j */
    public final String mo78441j() {
        return (String) f181902j.mo58455c();
    }

    /* renamed from: k */
    public final boolean mo78442k() {
        return ((Boolean) f181903k.mo58455c()).booleanValue();
    }
}
