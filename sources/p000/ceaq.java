package p000;

/* renamed from: ceaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceaq implements ceap {

    /* renamed from: a */
    public static final bdyx f182171a;

    /* renamed from: b */
    public static final bdyx f182172b;

    /* renamed from: c */
    public static final bdyx f182173c;

    /* renamed from: d */
    public static final bdyx f182174d;

    /* renamed from: e */
    public static final bdyx f182175e;

    /* renamed from: f */
    public static final bdyx f182176f;

    /* renamed from: g */
    public static final bdyx f182177g;

    /* renamed from: h */
    public static final bdyx f182178h;

    /* renamed from: i */
    public static final bdyx f182179i;

    /* renamed from: j */
    public static final bdyx f182180j;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fonts")).mo58445a("gms:fonts:");
        f182171a = bdyx.m91610a(a, "fonts:add_removal_listener_to_cache", true);
        f182172b = bdyx.m91609a(a, "bundled_fonts_for_early_extract", "Google_Sans-400-100_0-0_0.ttf,Google_Sans-500-100_0-0_0.ttf,Google_Sans_Display-400-100_0-0_0.ttf");
        f182173c = bdyx.m91610a(a, "fonts:check_disk_space_before_download", true);
        f182174d = bdyx.m91607a(a, "contentprovider:timeout_millis", 10000L);
        f182175e = bdyx.m91610a(a, "fonts:delete_files_reported_as_directory", true);
        f182176f = bdyx.m91607a(a, "directory:update:interval_seconds", 86400L);
        f182177g = bdyx.m91610a(a, "fonts:eviction:enabled", true);
        f182178h = bdyx.m91607a(a, "fonts:eviction:min_available_bytes_download", 33554432L);
        f182179i = bdyx.m91607a(a, "fonts:eviction:min_time_between_eviction_calls_millis", 60000L);
        f182180j = bdyx.m91607a(a, "fonts:min_available_bytes_update", 16777216L);
        bdyx.m91610a(a, "prefetch:enabled", false);
    }

    /* renamed from: a */
    public final boolean mo78687a() {
        return ((Boolean) f182171a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78688b() {
        return (String) f182172b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo78689c() {
        return ((Boolean) f182173c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo78690d() {
        return ((Long) f182174d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo78691e() {
        return ((Boolean) f182175e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo78692f() {
        return ((Long) f182176f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo78693g() {
        return ((Boolean) f182177g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final long mo78694h() {
        return ((Long) f182178h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo78695i() {
        return ((Long) f182179i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo78696j() {
        return ((Long) f182180j.mo58455c()).longValue();
    }
}
