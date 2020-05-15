package p000;

/* renamed from: cfks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfks implements cfkr {

    /* renamed from: a */
    public static final bdyx f184244a;

    /* renamed from: b */
    public static final bdyx f184245b;

    /* renamed from: c */
    public static final bdyx f184246c;

    /* renamed from: d */
    public static final bdyx f184247d;

    /* renamed from: e */
    public static final bdyx f184248e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.measurement"));
        f184244a = bdyx.m91610a(bdyw, "measurement.test.boolean_flag", false);
        f184245b = bdyx.m91605a(bdyw, "measurement.test.double_flag", -3.0d);
        f184246c = bdyx.m91607a(bdyw, "measurement.test.int_flag", -2L);
        f184247d = bdyx.m91607a(bdyw, "measurement.test.long_flag", -1L);
        f184248e = bdyx.m91609a(bdyw, "measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo81366a() {
        return ((Boolean) f184244a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final double mo81367b() {
        return ((Double) f184245b.mo58455c()).doubleValue();
    }

    /* renamed from: c */
    public final long mo81368c() {
        return ((Long) f184246c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo81369d() {
        return ((Long) f184247d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo81370e() {
        return (String) f184248e.mo58455c();
    }
}
