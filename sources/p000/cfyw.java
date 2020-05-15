package p000;

/* renamed from: cfyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfyw implements cfyv {

    /* renamed from: a */
    public static final bdyx f186180a;

    /* renamed from: b */
    public static final bdyx f186181b;

    /* renamed from: c */
    public static final bdyx f186182c;

    /* renamed from: d */
    public static final bdyx f186183d;

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
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186180a = bdyx.m91610a(bdyw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_catch_null_pointer_logging_enabled", true);
        f186181b = bdyx.m91610a(bdyw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_latency_logging_enabled", false);
        f186182c = bdyx.m91610a(bdyw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_silent_feedback_enabled", false);
        f186183d = bdyx.m91605a(bdyw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_silent_feedback_sample_rate", 1.0E-5d);
    }

    /* renamed from: a */
    public final boolean mo83144a() {
        return ((Boolean) f186180a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83145b() {
        return ((Boolean) f186181b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83146c() {
        return ((Boolean) f186182c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final double mo83147d() {
        return ((Double) f186183d.mo58455c()).doubleValue();
    }
}
