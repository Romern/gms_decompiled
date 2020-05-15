package p000;

/* renamed from: cgot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgot implements cgos {

    /* renamed from: a */
    public static final bdyx f187410a;

    /* renamed from: b */
    public static final bdyx f187411b;

    /* renamed from: c */
    public static final bdyx f187412c;

    /* renamed from: d */
    public static final bdyx f187413d;

    /* renamed from: e */
    public static final bdyx f187414e;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.smart_profile")).mo58450b();
        f187410a = bdyx.m91609a(b, "smart_profile.blocked_learn_more_url", "https://support.google.com/accounts?p=block_list");
        f187411b = bdyx.m91609a(b, "smart_profile.edit_in_about_me_url", "https://aboutme.google.com/");
        f187412c = bdyx.m91607a(b, "smart_profile.snackbar_active_ms", 60000L);
        f187413d = bdyx.m91609a(b, "smart_profile.view_all_google_plus_photos_intent_format_url", "https://get.google.com/albumarchive/%s");
        f187414e = bdyx.m91609a(b, "smart_profile.view_google_plus_profile_intent_format_url", "https://plus.google.com/%s");
    }

    /* renamed from: a */
    public final String mo84192a() {
        return (String) f187410a.mo58455c();
    }

    /* renamed from: b */
    public final String mo84193b() {
        return (String) f187411b.mo58455c();
    }

    /* renamed from: c */
    public final long mo84194c() {
        return ((Long) f187412c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo84195d() {
        return (String) f187413d.mo58455c();
    }

    /* renamed from: e */
    public final String mo84196e() {
        return (String) f187414e.mo58455c();
    }
}
