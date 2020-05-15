package p000;

/* renamed from: ceql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceql implements ceqk {

    /* renamed from: a */
    public static final bdyx f183260a;

    /* renamed from: b */
    public static final bdyx f183261b;

    /* renamed from: c */
    public static final bdyx f183262c;

    /* renamed from: d */
    public static final bdyx f183263d;

    /* renamed from: e */
    public static final bdyx f183264e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        f183260a = bdyx.m91610a(a, "TwoPhaseResolutions__enable_two_phase_resolutions", false);
        f183261b = bdyx.m91607a(a, "TwoPhaseResolutions__intent_filter_fetch_throttling_interval_secs", 0L);
        f183262c = bdyx.m91607a(a, "TwoPhaseResolutions__intent_filter_triggering_window_duration_secs", 120L);
        f183263d = bdyx.m91607a(a, "TwoPhaseResolutions__intent_filter_triggering_window_start_delay_secs", 15L);
        f183264e = bdyx.m91607a(a, "TwoPhaseResolutions__recently_used_domain_digests_ttl_secs", 7776000L);
    }

    /* renamed from: a */
    public final boolean mo79582a() {
        return ((Boolean) f183260a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo79583b() {
        return ((Long) f183261b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79584c() {
        return ((Long) f183262c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo79585d() {
        return ((Long) f183263d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo79586e() {
        return ((Long) f183264e.mo58455c()).longValue();
    }
}
