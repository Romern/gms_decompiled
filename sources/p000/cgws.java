package p000;

/* renamed from: cgws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgws implements cgwr {

    /* renamed from: a */
    public static final bdyx f187936a;

    /* renamed from: b */
    public static final bdyx f187937b;

    /* renamed from: c */
    public static final bdyx f187938c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187936a = bdyx.m91607a(bdyw, "location_timeout_seconds", 60L);
        f187937b = bdyx.m91607a(bdyw, "num_tap_locations", 1L);
        f187938c = bdyx.m91607a(bdyw, "tap_location_interval_millis", 30000L);
    }

    /* renamed from: a */
    public final long mo84647a() {
        return ((Long) f187936a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo84648b() {
        return ((Long) f187937b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo84649c() {
        return ((Long) f187938c.mo58455c()).longValue();
    }
}
