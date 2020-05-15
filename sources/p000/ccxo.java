package p000;

/* renamed from: ccxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccxo implements ccxn {

    /* renamed from: a */
    public static final bdyx f180169a;

    /* renamed from: b */
    public static final bdyx f180170b;

    /* renamed from: c */
    public static final bdyx f180171c;

    /* renamed from: d */
    public static final bdyx f180172d;

    /* renamed from: e */
    public static final bdyx f180173e;

    /* renamed from: f */
    public static final bdyx f180174f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180169a = bdyx.m91607a(a, "database:await_loading_in_ms", 100L);
        f180170b = bdyx.m91607a(a, "database:device_record_time_to_live_ms", 1296000000L);
        f180171c = bdyx.m91607a(a, "database:flush_interval_in_ms", 300000L);
        f180172d = bdyx.m91610a(a, "database:purge_database", false);
        f180173e = bdyx.m91607a(a, "database:purge_database_interval_ms", 86400000L);
        f180174f = bdyx.m91610a(a, "CastDatabaseConfigs__persist_dynamic_device", false);
    }

    /* renamed from: a */
    public final long mo76984a() {
        return ((Long) f180169a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo76985b() {
        return ((Long) f180170b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo76986c() {
        return ((Long) f180171c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo76987d() {
        return ((Boolean) f180172d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo76988e() {
        return ((Long) f180173e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo76989f() {
        return ((Boolean) f180174f.mo58455c()).booleanValue();
    }
}
