package p000;

/* renamed from: cgha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgha implements cggz {

    /* renamed from: a */
    public static final bdyx f186917a;

    /* renamed from: b */
    public static final bdyx f186918b;

    /* renamed from: c */
    public static final bdyx f186919c;

    /* renamed from: d */
    public static final bdyx f186920d;

    /* renamed from: e */
    public static final bdyx f186921e;

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
        f186917a = bdyx.m91607a(bdyw, "semantic_location_event_interval_millis", 300000L);
        f186918b = bdyx.m91605a(bdyw, "semantic_location_event_trigger_threshold", 0.4d);
        f186919c = bdyx.m91610a(bdyw, "semantic_location_provider_ignore_calls", false);
        f186920d = bdyx.m91610a(bdyw, "semantic_location_provider_ignore_results", false);
        f186921e = bdyx.m91607a(bdyw, "semantic_location_update_interval_millis", 300000L);
    }

    /* renamed from: a */
    public final long mo83772a() {
        return ((Long) f186917a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final double mo83773b() {
        return ((Double) f186918b.mo58455c()).doubleValue();
    }

    /* renamed from: c */
    public final boolean mo83774c() {
        return ((Boolean) f186919c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83775d() {
        return ((Boolean) f186920d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo83776e() {
        return ((Long) f186921e.mo58455c()).longValue();
    }
}
