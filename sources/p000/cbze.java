package p000;

/* renamed from: cbze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbze implements cbzd {

    /* renamed from: a */
    public static final bdyx f178581a;

    /* renamed from: b */
    public static final bdyx f178582b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178581a = bdyx.m91605a(a, "HasFeaturesLogging__has_features_log_sample_percentage", 0.0d);
        f178582b = bdyx.m91610a(a, "HasFeaturesLogging__has_features_logging_enabled", false);
    }

    /* renamed from: a */
    public final double mo75625a() {
        return ((Double) f178581a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final boolean mo75626b() {
        return ((Boolean) f178582b.mo58455c()).booleanValue();
    }
}
