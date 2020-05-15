package p000;

/* renamed from: ceri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceri implements cerf {

    /* renamed from: a */
    public static final bdyx f183377a;

    /* renamed from: b */
    public static final bdyx f183378b;

    /* renamed from: c */
    public static final bdyx f183379c;

    /* renamed from: d */
    public static final bdyx f183380d;

    /* renamed from: e */
    public static final bdyx f183381e;

    /* renamed from: f */
    public static final bdyx f183382f;

    /* renamed from: g */
    public static final bdyx f183383g;

    /* renamed from: h */
    public static final bdyx f183384h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.languageprofile")).mo58443a();
        bdyx.m91607a(a, "LanguageSettingsFeedback__data_cleanup_period_sec", 86400L);
        bdyx.m91607a(a, "LanguageSettingsFeedback__data_sync_period_sec", 86400L);
        bdyx.m91610a(a, "LanguageSettingsFeedback__data_sync_requires_charging", false);
        bdyx.m91610a(a, "LanguageSettingsFeedback__data_sync_requires_unmetered_network", false);
        f183377a = bdyx.m91609a(a, "LanguageSettingsFeedback__device_language_settings_client_id", "languageprofile.devicelanguages");
        f183378b = bdyx.m91610a(a, "LanguageSettingsFeedback__enable_language_settings_feature", false);
        f183379c = bdyx.m91610a(a, "LanguageSettingsFeedback__enable_upload_language_settings", true);
        f183380d = bdyx.m91610a(a, "LanguageSettingsFeedback__force_device_language_settings_upload", false);
        f183381e = bdyx.m91609a(a, "LanguageSettingsFeedback__language_settings_source_id_prefix", "client:");
        f183382f = bdyx.m91607a(a, "LanguageSettingsFeedback__max_time_without_upload_sec", 1209600L);
        try {
            f183383g = bdyx.m91608a(a, "LanguageSettingsFeedback__settings_cleanup_policy", (bylh) GeneratedMessageLite.m124014a(bylh.f166832d, new byte[]{10, 28, 18, 26, 10, 10, 8, 3, 16, 1, 40, 3, 48, 1, 80, 2, 18, 12, 10, 4, 8, Byte.MIN_VALUE, -93, 5, 18, 4, 8, -32, -22, 4}), cerg.f183375a);
            try {
                f183384h = bdyx.m91608a(a, "LanguageSettingsFeedback__settings_upload_sync_policy", (bylh) GeneratedMessageLite.m124014a(bylh.f166832d, new byte[]{10, 54, 10, 22, 10, 12, 8, 1, 16, 1, 40, 3, 48, 1, 72, 2, 80, 2, 18, 6, 10, 0, 18, 2, 8, 1, 18, 28, 10, 12, 8, 1, 16, 1, 40, 3, 48, 1, 72, 2, 80, 2, 18, 12, 10, 4, 8, Byte.MIN_VALUE, -93, 5, 18, 4, 8, -32, -22, 4}), cerh.f183376a);
                bdyx.m91607a(a, "LanguageSettingsFeedback__udc_timeout_millis", 500L);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"LanguageSettingsFeedback__settings_upload_sync_policy\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"LanguageSettingsFeedback__settings_cleanup_policy\"");
        }
    }

    /* renamed from: a */
    public final String mo79688a() {
        return (String) f183377a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79689b() {
        return ((Boolean) f183378b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79690c() {
        return ((Boolean) f183379c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79691d() {
        return ((Boolean) f183380d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo79692e() {
        return (String) f183381e.mo58455c();
    }

    /* renamed from: f */
    public final long mo79693f() {
        return ((Long) f183382f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final bylh mo79694g() {
        return (bylh) f183383g.mo58455c();
    }

    /* renamed from: h */
    public final bylh mo79695h() {
        return (bylh) f183384h.mo58455c();
    }
}
