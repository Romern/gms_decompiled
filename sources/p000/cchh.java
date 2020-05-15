package p000;

/* renamed from: cchh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchh implements cchg {

    /* renamed from: a */
    public static final bdyx f178975a;

    /* renamed from: b */
    public static final bdyx f178976b;

    /* renamed from: c */
    public static final bdyx f178977c;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f178975a = bdyx.m91607a(a, "BackgroundAdvertising__advertise_mode", 1L);
        f178976b = bdyx.m91610a(a, "BackgroundAdvertising__override_advertising_settings", false);
        f178977c = bdyx.m91607a(a, "BackgroundAdvertising__tx_power_level", 2L);
    }

    /* renamed from: a */
    public final long mo75947a() {
        return ((Long) f178975a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo75948b() {
        return ((Boolean) f178976b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo75949c() {
        return ((Long) f178977c.mo58455c()).longValue();
    }
}
