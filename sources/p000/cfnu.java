package p000;

/* renamed from: cfnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfnu implements cfnt {

    /* renamed from: a */
    public static final bdyx f184622a;

    /* renamed from: b */
    public static final bdyx f184623b;

    /* renamed from: c */
    public static final bdyx f184624c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.nearby")).mo58445a("nearbybootstrap:");
        f184622a = bdyx.m91610a(a, "enable_discoverer_ble_beacon", true);
        bdyx.m91607a(a, "source_reconnect_limit_millis", 900000L);
        f184623b = bdyx.m91607a(a, "target_connect_timeout_millis", 5000L);
        f184624c = bdyx.m91609a(a, "wrong_token", "0000");
    }

    /* renamed from: a */
    public final boolean mo81711a() {
        return ((Boolean) f184622a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo81712b() {
        return ((Long) f184623b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo81713c() {
        return (String) f184624c.mo58455c();
    }
}
