package p000;

/* renamed from: cczz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczz implements cczy {

    /* renamed from: a */
    public static final bdyx f180353a;

    /* renamed from: b */
    public static final bdyx f180354b;

    /* renamed from: c */
    public static final bdyx f180355c;

    /* renamed from: d */
    public static final bdyx f180356d;

    /* renamed from: e */
    public static final bdyx f180357e;

    /* renamed from: f */
    public static final bdyx f180358f;

    /* renamed from: g */
    public static final bdyx f180359g;

    /* renamed from: h */
    public static final bdyx f180360h;

    /* renamed from: i */
    public static final bdyx f180361i;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180353a = bdyx.m91610a(a, "mdns_device_scanner:enable_ipv6", true);
        f180354b = bdyx.m91607a(a, "mdns_device_scanner:adaptive_discovery_delay_ms", 3000L);
        f180355c = bdyx.m91610a(a, "mdns_device_scanner:adaptive_discovery_enabled", true);
        f180356d = bdyx.m91607a(a, "mdns_device_scanner:analytics_ping_interval_ms", 600000L);
        f180357e = bdyx.m91610a(a, "mdns_device_scanner:is_enabled", true);
        f180358f = bdyx.m91610a(a, "mdns_device_scanner:mark_devices_offline_when_discovery_stops", false);
        f180359g = bdyx.m91607a(a, "mdns_device_scanner:mini_device_controller_timeout_ms", 120000L);
        f180360h = bdyx.m91607a(a, "mdns_device_scanner:record_expiration_interval_ms", 69000L);
        bdyx.m91607a(a, "mdns_device_scanner:record_query_response_timeout_ms", 2000L);
        f180361i = bdyx.m91610a(a, "mdns_device_scanner:should_log_subtype_event_if_sent_event_not_received", true);
    }

    /* renamed from: a */
    public final boolean mo77142a() {
        return ((Boolean) f180353a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo77143b() {
        return ((Long) f180354b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo77144c() {
        return ((Boolean) f180355c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77145d() {
        return ((Long) f180356d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo77146e() {
        return ((Boolean) f180357e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo77147f() {
        return ((Boolean) f180358f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo77148g() {
        return ((Long) f180359g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo77149h() {
        return ((Long) f180360h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final boolean mo77150i() {
        return ((Boolean) f180361i.mo58455c()).booleanValue();
    }
}
