package p000;

/* renamed from: cgfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgfe implements cgfd {

    /* renamed from: a */
    public static final bdyx f186712a;

    /* renamed from: b */
    public static final bdyx f186713b;

    /* renamed from: c */
    public static final bdyx f186714c;

    /* renamed from: d */
    public static final bdyx f186715d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186712a = bdyx.m91607a(bdyw, "ble_batch_interval_millis", 3000L);
        f186713b = bdyx.m91607a(bdyw, "ble_scan_mode", 2L);
        f186714c = bdyx.m91610a(bdyw, "enable_ble_scanning", true);
        f186715d = bdyx.m91610a(bdyw, "enable_opportunistic_ble_scanning", true);
    }

    /* renamed from: a */
    public final long mo83583a() {
        return ((Long) f186712a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83584b() {
        return ((Long) f186713b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo83585c() {
        return ((Boolean) f186714c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83586d() {
        return ((Boolean) f186715d.mo58455c()).booleanValue();
    }
}
