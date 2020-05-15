package p000;

/* renamed from: cbut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbut implements cbus {

    /* renamed from: a */
    public static final bdyx f178311a;

    /* renamed from: b */
    public static final bdyx f178312b;

    /* renamed from: c */
    public static final bdyx f178313c;

    /* renamed from: d */
    public static final bdyx f178314d;

    /* renamed from: e */
    public static final bdyx f178315e;

    /* renamed from: f */
    public static final bdyx f178316f;

    /* renamed from: g */
    public static final bdyx f178317g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178311a = bdyx.m91607a(bdyw, "gads:dynamite_load:fail:sample_rate", 10000L);
        f178312b = bdyx.m91610a(bdyw, "gads:report_dynamite_crash_in_background_thread", false);
        f178313c = bdyx.m91609a(bdyw, "gads:public_beta:traffic_multiplier", "1.0");
        f178314d = bdyx.m91609a(bdyw, "gads:sdk_crash_report_class_prefix", "com.google.");
        f178315e = bdyx.m91610a(bdyw, "gads:sdk_crash_report_enabled", false);
        f178316f = bdyx.m91610a(bdyw, "gads:sdk_crash_report_full_stacktrace", false);
        f178317g = bdyx.m91605a(bdyw, "gads:trapped_exception_sample_rate", 0.01d);
    }

    /* renamed from: a */
    public final long mo75396a() {
        return ((Long) f178311a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo75397b() {
        return ((Boolean) f178312b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo75398c() {
        return (String) f178313c.mo58455c();
    }

    /* renamed from: d */
    public final String mo75399d() {
        return (String) f178314d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo75400e() {
        return ((Boolean) f178315e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75401f() {
        return ((Boolean) f178316f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final double mo75402g() {
        return ((Double) f178317g.mo58455c()).doubleValue();
    }
}
