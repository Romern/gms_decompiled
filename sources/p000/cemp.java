package p000;

/* renamed from: cemp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cemp implements cemk {

    /* renamed from: a */
    public static final bdyx f182992a;

    /* renamed from: b */
    public static final bdyx f182993b;

    /* renamed from: c */
    public static final bdyx f182994c;

    /* renamed from: d */
    public static final bdyx f182995d;

    /* renamed from: e */
    public static final bdyx f182996e;

    /* renamed from: f */
    public static final bdyx f182997f;

    /* renamed from: g */
    public static final bdyx f182998g;

    /* renamed from: h */
    public static final bdyx f182999h;

    /* renamed from: i */
    public static final bdyx f183000i;

    /* renamed from: j */
    public static final bdyx f183001j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        f182992a = bdyx.m91610a(bdyw, "disable_remove_fanout_for_messaging", true);
        f182993b = bdyx.m91610a(bdyw, "disable_update_fanout_for_messaging", true);
        f182994c = bdyx.m91610a(bdyw, "enable_search_and_upload_whitelist_all_google_apps", false);
        try {
            f182995d = bdyx.m91608a(bdyw, "firebase_corpora_trimmable_exception_whitelist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), ceml.f182988a);
            try {
                f182996e = bdyx.m91608a(bdyw, "icing_cache_indexable_type_whitelist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cemm.f182989a);
                try {
                    f182997f = bdyx.m91608a(bdyw, "icing_cache_package_whitelist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cemn.f182990a);
                    try {
                        f182998g = bdyx.m91608a(bdyw, "search_and_upload_whitelist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cemo.f182991a);
                        f182999h = bdyx.m91607a(bdyw, "gms_icing_update_app_params_end_delay_secs", 21600L);
                        f183000i = bdyx.m91607a(bdyw, "gms_icing_update_app_params_start_delay_secs", 3600L);
                        f183001j = bdyx.m91607a(bdyw, "gms_icing_wake_lock_timeout", 180000L);
                    } catch (bxwf e) {
                        throw new AssertionError("Could not parse proto flag \"search_and_upload_whitelist\"");
                    }
                } catch (bxwf e2) {
                    throw new AssertionError("Could not parse proto flag \"icing_cache_package_whitelist\"");
                }
            } catch (bxwf e3) {
                throw new AssertionError("Could not parse proto flag \"icing_cache_indexable_type_whitelist\"");
            }
        } catch (bxwf e4) {
            throw new AssertionError("Could not parse proto flag \"firebase_corpora_trimmable_exception_whitelist\"");
        }
    }

    /* renamed from: a */
    public final boolean mo79348a() {
        return ((Boolean) f182992a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79349b() {
        return ((Boolean) f182993b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79350c() {
        return ((Boolean) f182994c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final bydj mo79351d() {
        return (bydj) f182995d.mo58455c();
    }

    /* renamed from: e */
    public final bydj mo79352e() {
        return (bydj) f182996e.mo58455c();
    }

    /* renamed from: f */
    public final bydj mo79353f() {
        return (bydj) f182997f.mo58455c();
    }

    /* renamed from: g */
    public final bydj mo79354g() {
        return (bydj) f182998g.mo58455c();
    }

    /* renamed from: h */
    public final long mo79355h() {
        return ((Long) f182999h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo79356i() {
        return ((Long) f183000i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo79357j() {
        return ((Long) f183001j.mo58455c()).longValue();
    }
}
