package p000;

/* renamed from: cdzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdzx implements cdzw {

    /* renamed from: a */
    public static final bdyx f182109a;

    /* renamed from: b */
    public static final bdyx f182110b;

    /* renamed from: c */
    public static final bdyx f182111c;

    /* renamed from: d */
    public static final bdyx f182112d;

    /* renamed from: e */
    public static final bdyx f182113e;

    /* renamed from: f */
    public static final bdyx f182114f;

    /* renamed from: g */
    public static final bdyx f182115g;

    /* renamed from: h */
    public static final bdyx f182116h;

    /* renamed from: i */
    public static final bdyx f182117i;

    /* renamed from: j */
    public static final bdyx f182118j;

    /* renamed from: k */
    public static final bdyx f182119k;

    /* renamed from: l */
    public static final bdyx f182120l;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f182109a = bdyx.m91609a(a, "fitness_client_upload_background_data_types", "com.google.sensor.const_rate_events,com.google.sensor.events");
        f182110b = bdyx.m91610a(a, "Store__data_point_sync_state_migration", true);
        f182111c = bdyx.m91607a(a, "data_store_trim_interval_secs", 43200L);
        f182112d = bdyx.m91607a(a, "database_close_timeout_ms", 10000L);
        f182113e = bdyx.m91607a(a, "leveldb_max_migration_attempts", 1000L);
        f182114f = bdyx.m91607a(a, "leveldb_migration_hours", 168L);
        f182115g = bdyx.m91607a(a, "max_data_store_cache_secs", 300L);
        f182116h = bdyx.m91607a(a, "max_raw_data_points_per_row", 1000L);
        f182117i = bdyx.m91607a(a, "max_sql_selectors", 900L);
        f182118j = bdyx.m91607a(a, "max_temp_changelog_hours", 168L);
        f182119k = bdyx.m91607a(a, "sync_failure_limit", 10L);
        f182120l = bdyx.m91610a(a, "use_simple_bulk_query_read", false);
        bdyx.m91610a(a, "use_timestamps_to_find_present_data_points", true);
    }

    /* renamed from: a */
    public final String mo78632a() {
        return (String) f182109a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78633b() {
        return ((Boolean) f182110b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo78634c() {
        return ((Long) f182111c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78635d() {
        return ((Long) f182112d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo78636e() {
        return ((Long) f182113e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo78637f() {
        return ((Long) f182114f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo78638g() {
        return ((Long) f182115g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo78639h() {
        return ((Long) f182116h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo78640i() {
        return ((Long) f182117i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo78641j() {
        return ((Long) f182118j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo78642k() {
        return ((Long) f182119k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo78643l() {
        return ((Boolean) f182120l.mo58455c()).booleanValue();
    }
}
