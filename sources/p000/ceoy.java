package p000;

/* renamed from: ceoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceoy implements ceox {

    /* renamed from: a */
    public static final bdyx f183165a;

    /* renamed from: b */
    public static final bdyx f183166b;

    /* renamed from: c */
    public static final bdyx f183167c;

    /* renamed from: d */
    public static final bdyx f183168d;

    /* renamed from: e */
    public static final bdyx f183169e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        bdyx.m91610a(a, "Backend__app_branding_fetcher_use_dark_launch_header", false);
        bdyx.m91607a(a, "Backend__app_branding_timeout_ms", 30000L);
        bdyx.m91609a(a, "Backend__app_branding_url_format", "https://play.google.com/api/v1/metadata/type/apps/package/%s");
        f183165a = bdyx.m91610a(a, "Backend__attach_side_channel_headers_to_requests", false);
        f183166b = bdyx.m91610a(a, "Backend__disable_domain_filter_retry", false);
        f183167c = bdyx.m91610a(a, "Backend__disable_domain_filter_retry_charging_and_unmetered", true);
        f183168d = bdyx.m91607a(a, "Backend__force_opt_in_sync_after_millis", 2592000000L);
        f183169e = bdyx.m91610a(a, "Backend__populate_package_versions", true);
    }

    /* renamed from: a */
    public final boolean mo79500a() {
        return ((Boolean) f183165a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79501b() {
        return ((Boolean) f183166b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79502c() {
        return ((Boolean) f183167c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79503d() {
        return ((Long) f183168d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo79504e() {
        return ((Boolean) f183169e.mo58455c()).booleanValue();
    }
}
