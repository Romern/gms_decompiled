package p000;

/* renamed from: cdpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpn implements cdpm {

    /* renamed from: a */
    public static final bdyx f181522a;

    /* renamed from: b */
    public static final bdyx f181523b;

    /* renamed from: c */
    public static final bdyx f181524c;

    /* renamed from: d */
    public static final bdyx f181525d;

    /* renamed from: e */
    public static final bdyx f181526e;

    /* renamed from: f */
    public static final bdyx f181527f;

    /* renamed from: g */
    public static final bdyx f181528g;

    /* renamed from: h */
    public static final bdyx f181529h;

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
        bdyw bdyw = new bdyw("direct_boot:gms_chimera_phenotype_flags");
        f181522a = bdyx.m91605a(bdyw, "WakelockMetrics__base_sample_rate", 2.0E-6d);
        f181523b = bdyx.m91605a(bdyw, "WakelockMetrics__deadline_multiplier", 100.0d);
        f181524c = bdyx.m91610a(bdyw, "WakelockMetrics__enable_metrics", true);
        bdyx.m91610a(bdyw, "WakelockMetrics__install_config_in_module_initializer", false);
        f181525d = bdyx.m91610a(bdyw, "WakelockMetrics__log_unmetered_only", false);
        f181526e = bdyx.m91605a(bdyw, "WakelockMetrics__manual_multiplier", 1.0d);
        f181527f = bdyx.m91607a(bdyw, "WakelockMetrics__max_samples_per_day", 3L);
        f181528g = bdyx.m91610a(bdyw, "WakelockMetrics__report_idle_state", true);
        f181529h = bdyx.m91605a(bdyw, "WakelockMetrics__timeout_multiplier", 10.0d);
    }

    /* renamed from: a */
    public final double mo78148a() {
        return ((Double) f181522a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final double mo78149b() {
        return ((Double) f181523b.mo58455c()).doubleValue();
    }

    /* renamed from: c */
    public final boolean mo78150c() {
        return ((Boolean) f181524c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78151d() {
        return ((Boolean) f181525d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final double mo78152e() {
        return ((Double) f181526e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final long mo78153f() {
        return ((Long) f181527f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo78154g() {
        return ((Boolean) f181528g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final double mo78155h() {
        return ((Double) f181529h.mo58455c()).doubleValue();
    }
}
