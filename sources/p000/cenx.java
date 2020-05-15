package p000;

/* renamed from: cenx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cenx implements cenw {

    /* renamed from: a */
    public static final bdyx f183123a;

    /* renamed from: b */
    public static final bdyx f183124b;

    /* renamed from: c */
    public static final bdyx f183125c;

    /* renamed from: d */
    public static final bdyx f183126d;

    /* renamed from: e */
    public static final bdyx f183127e;

    /* renamed from: f */
    public static final bdyx f183128f;

    /* renamed from: g */
    public static final bdyx f183129g;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdh")).mo58443a();
        f183123a = bdyx.m91610a(a, "AppsUploadFeature__accounts_upload_log_read_match_event", false);
        f183124b = bdyx.m91610a(a, "AppsUploadFeature__enable_subscribe_before_each_upload", false);
        f183125c = bdyx.m91610a(a, "AppsUploadFeature__enable_sync_policy_download", false);
        f183126d = bdyx.m91610a(a, "AppsUploadFeature__package_event_skip_upload_for_unchanged", false);
        f183127e = bdyx.m91607a(a, "AppsUploadFeature__sync_policy_download_throttling_seconds", 172800L);
        f183128f = bdyx.m91610a(a, "AppsUploadFeature__sync_policy_requires_charging", false);
        f183129g = bdyx.m91610a(a, "AppsUploadFeature__sync_policy_requires_unmetered", false);
    }

    /* renamed from: a */
    public final boolean mo79467a() {
        return ((Boolean) f183123a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79468b() {
        return ((Boolean) f183124b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79469c() {
        return ((Boolean) f183125c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79470d() {
        return ((Boolean) f183126d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo79471e() {
        return ((Long) f183127e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo79472f() {
        return ((Boolean) f183128f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo79473g() {
        return ((Boolean) f183129g.mo58455c()).booleanValue();
    }
}
