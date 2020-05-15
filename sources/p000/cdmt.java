package p000;

/* renamed from: cdmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdmt implements cdms {

    /* renamed from: a */
    public static final bdyx f181250a;

    /* renamed from: b */
    public static final bdyx f181251b;

    /* renamed from: c */
    public static final bdyx f181252c;

    /* renamed from: d */
    public static final bdyx f181253d;

    /* renamed from: e */
    public static final bdyx f181254e;

    /* renamed from: f */
    public static final bdyx f181255f;

    /* renamed from: g */
    public static final bdyx f181256g;

    /* renamed from: h */
    public static final bdyx f181257h;

    /* renamed from: i */
    public static final bdyx f181258i;

    /* renamed from: j */
    public static final bdyx f181259j;

    /* renamed from: k */
    public static final bdyx f181260k;

    /* renamed from: l */
    public static final bdyx f181261l;

    /* renamed from: m */
    public static final bdyx f181262m;

    /* renamed from: n */
    public static final bdyx f181263n;

    /* renamed from: o */
    public static final bdyx f181264o;

    /* renamed from: p */
    public static final bdyx f181265p;

    /* renamed from: q */
    public static final bdyx f181266q;

    /* renamed from: r */
    public static final bdyx f181267r;

    /* renamed from: s */
    public static final bdyx f181268s;

    /* renamed from: t */
    public static final bdyx f181269t;

    /* renamed from: u */
    public static final bdyx f181270u;

    /* renamed from: v */
    public static final bdyx f181271v;

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
    static {
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58443a();
        f181250a = bdyx.m91610a(a, "Primes__enable_primes", true);
        f181251b = bdyx.m91610a(a, "Primes__enable_primes_memory", false);
        f181252c = bdyx.m91610a(a, "Primes__enable_primes_network", false);
        f181253d = bdyx.m91610a(a, "Primes__enable_primes_package", false);
        f181254e = bdyx.m91610a(a, "Primes__enable_primes_profiling", false);
        f181255f = bdyx.m91610a(a, "Primes__enable_primes_timer", false);
        f181256g = bdyx.m91610a(a, "Primes__enable_primes_tracing", true);
        bdyx.m91607a(a, "Primes__initial_approximate_histogram_count", 4L);
        f181257h = bdyx.m91610a(a, "Primes__is_testing_mode", false);
        bdyx.m91609a(a, "latency_service_whitelist", "*");
        f181258i = bdyx.m91607a(a, "Primes__max_event_proto_bytes", 16384L);
        f181259j = bdyx.m91607a(a, "Primes__memory_sample_rate_per_second", 3L);
        f181260k = bdyx.m91607a(a, "Primes__memory_timer", 30000L);
        f181261l = bdyx.m91607a(a, "Primes__throttler_initial_events", 2L);
        f181262m = bdyx.m91607a(a, "Primes__throttler_interval_seconds", 1800L);
        f181263n = bdyx.m91607a(a, "Primes__throttler_max_bank_events", 25L);
        f181264o = bdyx.m91605a(a, "Primes__timer_sample_probability", 0.01d);
        f181265p = bdyx.m91607a(a, "Primes__timer_sample_rate_per_second", 10L);
        f181266q = bdyx.m91607a(a, "Primes__trace_sampling_scale_down_interval_milliseconds", 7200000L);
        f181267r = bdyx.m91607a(a, "Primes__tracing_sample_rate_per_second", 10L);
        bdyx.m91607a(a, "Primes__tracing_sample_rate_per_thousand", 0L);
        f181268s = bdyx.m91605a(a, "Primes__tracing_sampling_probability", 0.001d);
        f181269t = bdyx.m91607a(a, "Primes__upload_interval_millis", 86400000L);
        f181270u = bdyx.m91610a(a, "Primes__use_unmetered_network_only", true);
        f181271v = bdyx.m91610a(a, "Primes__use_unmetered_or_daily_network", true);
    }

    /* renamed from: a */
    public final boolean mo77901a() {
        return ((Boolean) f181250a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77902b() {
        return ((Boolean) f181251b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77903c() {
        return ((Boolean) f181252c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77904d() {
        return ((Boolean) f181253d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77905e() {
        return ((Boolean) f181254e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo77906f() {
        return ((Boolean) f181255f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo77907g() {
        return ((Boolean) f181256g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo77908h() {
        return ((Boolean) f181257h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo77909i() {
        return ((Long) f181258i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo77910j() {
        return ((Long) f181259j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo77911k() {
        return ((Long) f181260k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo77912l() {
        return ((Long) f181261l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo77913m() {
        return ((Long) f181262m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo77914n() {
        return ((Long) f181263n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final double mo77915o() {
        return ((Double) f181264o.mo58455c()).doubleValue();
    }

    /* renamed from: p */
    public final long mo77916p() {
        return ((Long) f181265p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo77917q() {
        return ((Long) f181266q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo77918r() {
        return ((Long) f181267r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final double mo77919s() {
        return ((Double) f181268s.mo58455c()).doubleValue();
    }

    /* renamed from: t */
    public final long mo77920t() {
        return ((Long) f181269t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final boolean mo77921u() {
        return ((Boolean) f181270u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo77922v() {
        return ((Boolean) f181271v.mo58455c()).booleanValue();
    }
}
