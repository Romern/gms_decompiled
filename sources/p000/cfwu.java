package p000;

/* renamed from: cfwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfwu implements cfwt {

    /* renamed from: a */
    public static final bdyx f185855a;

    /* renamed from: b */
    public static final bdyx f185856b;

    /* renamed from: c */
    public static final bdyx f185857c;

    /* renamed from: d */
    public static final bdyx f185858d;

    /* renamed from: e */
    public static final bdyx f185859e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f185855a = bdyx.m91610a(bdyw, "FsaBugFixesY2019w45__filter_null_api_version_photos_for_hash_key_generation_enabled", true);
        f185856b = bdyx.m91607a(bdyw, "FsaBugFixesY2019w45__query_cp2_photos_limit", 100L);
        f185857c = bdyx.m91607a(bdyw, "FsaBugFixesY2019w45__query_cp2_photos_max_retries", 20L);
        f185858d = bdyx.m91610a(bdyw, "FsaBugFixesY2019w45__retry_when_gmscore_entry_sync_canceled", true);
        f185859e = bdyx.m91610a(bdyw, "FsaBugFixesY2019w45__set_limit_when_query_cp2_photos", true);
    }

    /* renamed from: a */
    public final boolean mo82839a() {
        return ((Boolean) f185855a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo82840b() {
        return ((Long) f185856b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo82841c() {
        return ((Long) f185857c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo82842d() {
        return ((Boolean) f185858d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82843e() {
        return ((Boolean) f185859e.mo58455c()).booleanValue();
    }
}
