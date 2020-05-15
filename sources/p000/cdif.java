package p000;

/* renamed from: cdif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdif implements cdie {

    /* renamed from: a */
    public static final bdyx f180934a;

    /* renamed from: b */
    public static final bdyx f180935b;

    /* renamed from: c */
    public static final bdyx f180936c;

    /* renamed from: d */
    public static final bdyx f180937d;

    /* renamed from: e */
    public static final bdyx f180938e;

    /* renamed from: f */
    public static final bdyx f180939f;

    /* renamed from: g */
    public static final bdyx f180940g;

    /* renamed from: h */
    public static final bdyx f180941h;

    /* renamed from: i */
    public static final bdyx f180942i;

    /* renamed from: j */
    public static final bdyx f180943j;

    /* renamed from: k */
    public static final bdyx f180944k;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.contextmanager")).mo58443a();
        f180934a = bdyx.m91605a(a, "shush_accel_averaging_rate", 0.4d);
        f180935b = bdyx.m91605a(a, "shush_accel_magnitude_tolerance", 5.0d);
        f180936c = bdyx.m91605a(a, "shush_accel_variation_threshold", 0.15d);
        f180937d = bdyx.m91607a(a, "shush_freshness_delta_time_millis", 3600000L);
        f180938e = bdyx.m91605a(a, "shush_gravity_angle_tolerance", 0.1d);
        f180939f = bdyx.m91605a(a, "shush_minimum_facedown_duration_second", 1.0d);
        f180940g = bdyx.m91607a(a, "shush_nanoapp_minimum_version", 65537L);
        f180941h = bdyx.m91605a(a, "shush_proximity_transition_window_second", 2.0d);
        f180942i = bdyx.m91605a(a, "shush_sensor_batching_delay_second", 0.1d);
        f180943j = bdyx.m91605a(a, "shush_trigger_quota_replenish_rate", 0.04d);
        f180944k = bdyx.m91605a(a, "shush_trigger_quota_size", 4.0d);
    }

    /* renamed from: a */
    public final double mo77634a() {
        return ((Double) f180934a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final double mo77635b() {
        return ((Double) f180935b.mo58455c()).doubleValue();
    }

    /* renamed from: c */
    public final double mo77636c() {
        return ((Double) f180936c.mo58455c()).doubleValue();
    }

    /* renamed from: d */
    public final long mo77637d() {
        return ((Long) f180937d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final double mo77638e() {
        return ((Double) f180938e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final double mo77639f() {
        return ((Double) f180939f.mo58455c()).doubleValue();
    }

    /* renamed from: g */
    public final long mo77640g() {
        return ((Long) f180940g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final double mo77641h() {
        return ((Double) f180941h.mo58455c()).doubleValue();
    }

    /* renamed from: i */
    public final double mo77642i() {
        return ((Double) f180942i.mo58455c()).doubleValue();
    }

    /* renamed from: j */
    public final double mo77643j() {
        return ((Double) f180943j.mo58455c()).doubleValue();
    }

    /* renamed from: k */
    public final double mo77644k() {
        return ((Double) f180944k.mo58455c()).doubleValue();
    }
}
