package p000;

/* renamed from: ccic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccic implements ccib {

    /* renamed from: a */
    public static final bdyx f179031a;

    /* renamed from: b */
    public static final bdyx f179032b;

    /* renamed from: c */
    public static final bdyx f179033c;

    /* renamed from: d */
    public static final bdyx f179034d;

    /* renamed from: e */
    public static final bdyx f179035e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f179031a = bdyx.m91610a(a, "MetricsLogging__enable_advertisement_generation_metrics", true);
        f179032b = bdyx.m91610a(a, "MetricsLogging__is_clearcut_logging_enabled", true);
        f179033c = bdyx.m91610a(a, "MetricsLogging__is_feedback_reporting_enabled", true);
        f179034d = bdyx.m91607a(a, "MetricsLogging__max_samples_per_clearcut_counter", 64L);
        bdyx.m91610a(a, "ProximityAuth__is_feedback_reporting_enabled", true);
        f179035e = bdyx.m91607a(a, "MetricsLogging__silent_feedback_interval_ms", 10000L);
    }

    /* renamed from: a */
    public final boolean mo75996a() {
        return ((Boolean) f179031a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75997b() {
        return ((Boolean) f179032b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75998c() {
        return ((Boolean) f179033c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo75999d() {
        return ((Long) f179034d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76000e() {
        return ((Long) f179035e.mo58455c()).longValue();
    }
}
