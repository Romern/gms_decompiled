package p000;

/* renamed from: ccxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccxi implements ccxh {

    /* renamed from: a */
    public static final bdyx f180156a;

    /* renamed from: b */
    public static final bdyx f180157b;

    /* renamed from: c */
    public static final bdyx f180158c;

    /* renamed from: d */
    public static final bdyx f180159d;

    /* renamed from: e */
    public static final bdyx f180160e;

    /* renamed from: f */
    public static final bdyx f180161f;

    /* renamed from: g */
    public static final bdyx f180162g;

    /* renamed from: h */
    public static final bdyx f180163h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180156a = bdyx.m91607a(a, "ble_device_scanner:active_mode_idle_duration", 2209035600000L);
        f180157b = bdyx.m91607a(a, "ble_device_scanner:active_mode_scan_duration", 1500L);
        f180158c = bdyx.m91610a(a, "ble_device_scanner:ble_guest_mode_enabled", false);
        f180159d = bdyx.m91607a(a, "ble_device_scanner:database_record_expiration_ms", 120000L);
        f180160e = bdyx.m91610a(a, "ble_device_scanner:is_enabled", false);
        f180161f = bdyx.m91607a(a, "ble_device_scanner:passive_mode_idle_duration", 2209035600000L);
        f180162g = bdyx.m91607a(a, "ble_device_scanner:passive_mode_scan_duration", 1500L);
        f180163h = bdyx.m91607a(a, "ble_device_scanner:process_database_interval_ms", 20000L);
    }

    /* renamed from: a */
    public final long mo76973a() {
        return ((Long) f180156a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo76974b() {
        return ((Long) f180157b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo76975c() {
        return ((Boolean) f180158c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76976d() {
        return ((Long) f180159d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo76977e() {
        return ((Boolean) f180160e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo76978f() {
        return ((Long) f180161f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo76979g() {
        return ((Long) f180162g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo76980h() {
        return ((Long) f180163h.mo58455c()).longValue();
    }
}
