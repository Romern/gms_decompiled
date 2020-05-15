package p000;

/* renamed from: cenb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cenb implements cena {

    /* renamed from: a */
    public static final bdyx f183037a;

    /* renamed from: b */
    public static final bdyx f183038b;

    /* renamed from: c */
    public static final bdyx f183039c;

    /* renamed from: d */
    public static final bdyx f183040d;

    /* renamed from: e */
    public static final bdyx f183041e;

    /* renamed from: f */
    public static final bdyx f183042f;

    /* renamed from: g */
    public static final bdyx f183043g;

    /* renamed from: h */
    public static final bdyx f183044h;

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
        f183037a = bdyx.m91610a(bdyw, "enable_predefined_typeconfig_schema_changes_during_maintenance", false);
        f183038b = bdyx.m91607a(bdyw, "unified_indexing_commit_per_num_requests", 32L);
        f183039c = bdyx.m91607a(bdyw, "unified_indexing_enable_handle_low_storage_state", -1L);
        f183040d = bdyx.m91607a(bdyw, "unified_indexing_max_drain_delay_sec", 30L);
        f183041e = bdyx.m91607a(bdyw, "unified_indexing_min_drain_delay_sec", 10L);
        f183042f = bdyx.m91609a(bdyw, "unified_indexing_package_whitelist", "com.google.android.gms,com.lge.music,com.google.android.apps.messaging,com.google.android.gm,com.google.android.youtube,com.android.chrome,com.wishabi.flipp,com.railyatri.in.mobile,ru.sberbankmobile,com.google.android.videos");
        f183043g = bdyx.m91610a(bdyw, "unified_indexing_request_queue", false);
        f183044h = bdyx.m91607a(bdyw, "unified_indexing_request_queue_items_per_shard", 32L);
        bdyx.m91610a(bdyw, "unified_indexing_use_gcm_task", true);
    }

    /* renamed from: a */
    public final boolean mo79389a() {
        return ((Boolean) f183037a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo79390b() {
        return ((Long) f183038b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79391c() {
        return ((Long) f183039c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo79392d() {
        return ((Long) f183040d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo79393e() {
        return ((Long) f183041e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo79394f() {
        return (String) f183042f.mo58455c();
    }

    /* renamed from: g */
    public final boolean mo79395g() {
        return ((Boolean) f183043g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final long mo79396h() {
        return ((Long) f183044h.mo58455c()).longValue();
    }
}
