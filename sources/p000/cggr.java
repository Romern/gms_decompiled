package p000;

/* renamed from: cggr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggr implements cggq {

    /* renamed from: a */
    public static final bdyx f186891a;

    /* renamed from: b */
    public static final bdyx f186892b;

    /* renamed from: c */
    public static final bdyx f186893c;

    /* renamed from: d */
    public static final bdyx f186894d;

    /* renamed from: e */
    public static final bdyx f186895e;

    /* renamed from: f */
    public static final bdyx f186896f;

    /* renamed from: g */
    public static final bdyx f186897g;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186891a = bdyx.m91607a(bdyw, "place_cache_expiration_millis", 1209600000L);
        f186892b = bdyx.m91605a(bdyw, "place_cache_free_ratio", 0.5d);
        f186893c = bdyx.m91610a(bdyw, "place_cache_leveldb_enabled", true);
        f186894d = bdyx.m91607a(bdyw, "place_cache_max_num_entries", 1000L);
        f186895e = bdyx.m91607a(bdyw, "place_cache_min_managing_interval_millis", 86400000L);
        f186896f = bdyx.m91607a(bdyw, "current_place_last_location_max_age", 60000000000L);
        f186897g = bdyx.m91610a(bdyw, "enable_place_entity_cache", true);
    }

    /* renamed from: a */
    public final long mo83749a() {
        return ((Long) f186891a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final double mo83750b() {
        return ((Double) f186892b.mo58455c()).doubleValue();
    }

    /* renamed from: c */
    public final boolean mo83751c() {
        return ((Boolean) f186893c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo83752d() {
        return ((Long) f186894d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo83753e() {
        return ((Long) f186895e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo83754f() {
        return ((Long) f186896f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo83755g() {
        return ((Boolean) f186897g.mo58455c()).booleanValue();
    }
}
