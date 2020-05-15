package p000;

/* renamed from: ccee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccee implements ccec {

    /* renamed from: a */
    public static final bdyx f178818a;

    /* renamed from: b */
    public static final bdyx f178819b;

    /* renamed from: c */
    public static final bdyx f178820c;

    /* renamed from: d */
    public static final bdyx f178821d;

    /* renamed from: e */
    public static final bdyx f178822e;

    /* renamed from: f */
    public static final bdyx f178823f;

    /* renamed from: g */
    public static final bdyx f178824g;

    /* renamed from: h */
    public static final bdyx f178825h;

    /* renamed from: i */
    public static final bdyx f178826i;

    /* renamed from: j */
    public static final bdyx f178827j;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_api_phone")).mo58443a();
        try {
            f178818a = bdyx.m91608a(a, "SmsCodeAutofillFeature__api_caller_whitelist", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 36, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 105, 112, 104, 111, 110, 101, 46, 97, 105, 97, 105}), cced.f178817a);
            f178819b = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_api_caller_whitelist", false);
            f178820c = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_checking_method_for_first_party_app", true);
            f178821d = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_feature", true);
            f178822e = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_metrics_logging", true);
            f178823f = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_metrics_logging_2020_w06", false);
            f178824g = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_metrics_logging_phase_2", true);
            f178825h = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_multipart_sms_message_bugfix", false);
            f178826i = bdyx.m91610a(a, "SmsCodeAutofillFeature__enable_settings_at_autofill_subcategory", false);
            f178827j = bdyx.m91607a(a, "SmsCodeAutofillFeature__inbox_search_back_time_seconds", 60L);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"SmsCodeAutofillFeature__api_caller_whitelist\"");
        }
    }

    /* renamed from: a */
    public final bydj mo75817a() {
        return (bydj) f178818a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75818b() {
        return ((Boolean) f178819b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75819c() {
        return ((Boolean) f178820c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75820d() {
        return ((Boolean) f178821d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75821e() {
        return ((Boolean) f178822e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75822f() {
        return ((Boolean) f178823f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo75823g() {
        return ((Boolean) f178824g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo75824h() {
        return ((Boolean) f178825h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo75825i() {
        return ((Boolean) f178826i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final long mo75826j() {
        return ((Long) f178827j.mo58455c()).longValue();
    }
}
