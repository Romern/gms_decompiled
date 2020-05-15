package p000;

/* renamed from: cgry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgry implements cgrx {

    /* renamed from: a */
    public static final bdyx f187618a;

    /* renamed from: b */
    public static final bdyx f187619b;

    /* renamed from: c */
    public static final bdyx f187620c;

    /* renamed from: d */
    public static final bdyx f187621d;

    /* renamed from: e */
    public static final bdyx f187622e;

    /* renamed from: f */
    public static final bdyx f187623f;

    /* renamed from: g */
    public static final bdyx f187624g;

    /* renamed from: h */
    public static final bdyx f187625h;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187618a = bdyx.m91609a(a, "BatteryStats__filters", ",hsp,&,h,");
        f187619b = bdyx.m91610a(a, "BatteryStats__package_manager", true);
        f187620c = bdyx.m91607a(a, "BatteryStats__qos", 2L);
        f187621d = bdyx.m91609a(a, "BatteryStats__record_flags", "--charged -c");
        f187622e = bdyx.m91610a(a, "BatteryStats__require_charging", false);
        f187623f = bdyx.m91607a(a, "BatteryStats__reset_timestamp_group_index", 3L);
        f187624g = bdyx.m91609a(a, "BatteryStats__summary_format", "(l,bt,\\d+,)(\\d+,){4}(\\d+)(,\\d+){2}");
        f187625h = bdyx.m91609a(a, "BatteryStats__summary_line", ",l,bt,");
    }

    /* renamed from: a */
    public final String mo84371a() {
        return (String) f187618a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo84372b() {
        return ((Boolean) f187619b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo84373c() {
        return ((Long) f187620c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo84374d() {
        return (String) f187621d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo84375e() {
        return ((Boolean) f187622e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo84376f() {
        return ((Long) f187623f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo84377g() {
        return (String) f187624g.mo58455c();
    }

    /* renamed from: h */
    public final String mo84378h() {
        return (String) f187625h.mo58455c();
    }
}
