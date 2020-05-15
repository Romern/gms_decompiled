package p000;

/* renamed from: ceks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceks implements cekr {

    /* renamed from: a */
    public static final bdyx f182860a;

    /* renamed from: b */
    public static final bdyx f182861b;

    /* renamed from: c */
    public static final bdyx f182862c;

    /* renamed from: d */
    public static final bdyx f182863d;

    /* renamed from: e */
    public static final bdyx f182864e;

    /* renamed from: f */
    public static final bdyx f182865f;

    /* renamed from: g */
    public static final bdyx f182866g;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        f182860a = bdyx.m91610a(a, "Logging__enable_lightweight_api_profiling", true);
        f182861b = bdyx.m91610a(a, "Logging__enable_tracing", false);
        f182862c = bdyx.m91610a(a, "Logging__enable_tracing_to_counters", false);
        f182863d = bdyx.m91605a(a, "Logging__lightweight_api_profiling_fraction", 0.1d);
        bdyx.m91610a(a, "Logging__log_concurrent_observations", true);
        bdyx.m91610a(a, "Logging__log_dispatch_latency", true);
        f182864e = bdyx.m91607a(a, "Logging__max_samples_per_counter", 128L);
        f182865f = bdyx.m91607a(a, "Logging__streamz_client_event_buffer_size", 100L);
        f182866g = bdyx.m91607a(a, "Logging__timestamp_precision_millis", 3600000L);
    }

    /* renamed from: a */
    public final boolean mo79237a() {
        return ((Boolean) f182860a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79238b() {
        return ((Boolean) f182861b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79239c() {
        return ((Boolean) f182862c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final double mo79240d() {
        return ((Double) f182863d.mo58455c()).doubleValue();
    }

    /* renamed from: e */
    public final long mo79241e() {
        return ((Long) f182864e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo79242f() {
        return ((Long) f182865f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo79243g() {
        return ((Long) f182866g.mo58455c()).longValue();
    }
}
