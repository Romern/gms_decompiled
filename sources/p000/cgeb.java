package p000;

/* renamed from: cgeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgeb implements cgdz {

    /* renamed from: a */
    public static final bdyx f186629a;

    /* renamed from: b */
    public static final bdyx f186630b;

    /* renamed from: c */
    public static final bdyx f186631c;

    /* renamed from: d */
    public static final bdyx f186632d;

    /* renamed from: e */
    public static final bdyx f186633e;

    /* renamed from: f */
    public static final bdyx f186634f;

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
        bdyw b = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:").mo58450b();
        bdyx.m91610a(b, "PackageUpdateOptimization__allow_sending_broadcasts_to_not_running_apps", false);
        f186629a = bdyx.m91610a(b, "PackageUpdateOptimization__do_not_wake_up_unless_idle_and_charging", false);
        bdyx.m91610a(b, "PackageUpdateOptimization__enable_optimization", true);
        f186630b = bdyx.m91610a(b, "PackageUpdateOptimization__include_stopped_packages_in_broadcast", true);
        f186631c = bdyx.m91610a(b, "PackageUpdateOptimization__may_notify_base_package", true);
        f186632d = bdyx.m91607a(b, "PackageUpdateOptimization__min_timeout_seconds", 14400L);
        f186633e = bdyx.m91607a(b, "PackageUpdateOptimization__notify_all_uncommitted_timeout_seconds", 86400L);
        try {
            f186634f = bdyx.m91608a(b, "PackageUpdateOptimization__update_now_app_whitelist", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 97, 114, 114, 105, 101, 114}), cgea.f186628a);
            bdyx.m91607a(b, "PackageUpdateOptimization__update_now_bucket_upper_bound", 10L);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"PackageUpdateOptimization__update_now_app_whitelist\"");
        }
    }

    /* renamed from: a */
    public final boolean mo83513a() {
        return ((Boolean) f186629a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83514b() {
        return ((Boolean) f186630b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83515c() {
        return ((Boolean) f186631c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo83516d() {
        return ((Long) f186632d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo83517e() {
        return ((Long) f186633e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final bydj mo83518f() {
        return (bydj) f186634f.mo58455c();
    }
}
