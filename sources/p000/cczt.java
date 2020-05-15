package p000;

/* renamed from: cczt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczt implements cczr {

    /* renamed from: a */
    public static final bdyx f180315a;

    /* renamed from: b */
    public static final bdyx f180316b;

    /* renamed from: c */
    public static final bdyx f180317c;

    /* renamed from: d */
    public static final bdyx f180318d;

    /* renamed from: e */
    public static final bdyx f180319e;

    /* renamed from: f */
    public static final bdyx f180320f;

    /* renamed from: g */
    public static final bdyx f180321g;

    /* renamed from: h */
    public static final bdyx f180322h;

    /* renamed from: i */
    public static final bdyx f180323i;

    /* renamed from: j */
    public static final bdyx f180324j;

    /* renamed from: k */
    public static final bdyx f180325k;

    /* renamed from: l */
    public static final bdyx f180326l;

    /* renamed from: m */
    public static final bdyx f180327m;

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
        f180315a = bdyx.m91607a(a, "GaiaDiscovery__account_watcher_interval_ms", 3600000L);
        f180316b = bdyx.m91607a(a, "GaiaDiscovery__active_sender_persistent_duration_ms", 100001296000000L);
        try {
            f180317c = bdyx.m91608a(a, "GaiaDiscovery__cast_device_types", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 23, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 84, 86, 10, 28, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 83, 80, 69, 65, 75, 69, 82, 10, 32, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 71, 79, 79, 71, 76, 69, 95, 72, 79, 77, 69, 10, 34, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 83, 80, 69, 65, 75, 69, 82, 95, 71, 82, 79, 85, 80, 10, 33, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 83, 80, 69, 65, 75, 69, 82, 95, 80, 65, 73, 82, 10, 28, 97, 99, 116, 105, 111, 110, 46, 100, 101, 118, 105, 99, 101, 115, 46, 116, 121, 112, 101, 115, 46, 68, 73, 83, 80, 76, 65, 89}), cczs.f180314a);
            f180318d = bdyx.m91610a(a, "GaiaDiscovery__fetch_cloud_device_id", true);
            f180319e = bdyx.m91607a(a, "GaiaDiscovery__flush_storage_interval_sec", 60L);
            f180320f = bdyx.m91609a(a, "GaiaDiscovery__foyer_auth_scope", "https://www.googleapis.com/auth/homegraph");
            f180321g = bdyx.m91607a(a, "GaiaDiscovery__foyer_grpc_timeout_ms", 10000L);
            f180322h = bdyx.m91609a(a, "GaiaDiscovery__foyer_host", "googlehomefoyer-pa.googleapis.com");
            f180323i = bdyx.m91607a(a, "GaiaDiscovery__foyer_port", 443L);
            f180324j = bdyx.m91610a(a, "GaiaDiscovery__is_enabled", false);
            f180325k = bdyx.m91607a(a, "GaiaDiscovery__linked_devices_expiration_duration_ms", 86400000L);
            f180326l = bdyx.m91610a(a, "GaiaDiscovery__should_probe_on_local_network", false);
            f180327m = bdyx.m91607a(a, "GaiaDiscovery__start_tcp_probing_delay_ms", 3000L);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"GaiaDiscovery__cast_device_types\"");
        }
    }

    /* renamed from: a */
    public final long mo77106a() {
        return ((Long) f180315a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77107b() {
        return ((Long) f180316b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final bydj mo77108c() {
        return (bydj) f180317c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo77109d() {
        return ((Boolean) f180318d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo77110e() {
        return ((Long) f180319e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo77111f() {
        return (String) f180320f.mo58455c();
    }

    /* renamed from: g */
    public final long mo77112g() {
        return ((Long) f180321g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final String mo77113h() {
        return (String) f180322h.mo58455c();
    }

    /* renamed from: i */
    public final long mo77114i() {
        return ((Long) f180323i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo77115j() {
        return ((Boolean) f180324j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo77116k() {
        return ((Long) f180325k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo77117l() {
        return ((Boolean) f180326l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final long mo77118m() {
        return ((Long) f180327m.mo58455c()).longValue();
    }
}
