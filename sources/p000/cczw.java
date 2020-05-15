package p000;

/* renamed from: cczw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczw implements cczv {

    /* renamed from: a */
    public static final bdyx f180330a;

    /* renamed from: b */
    public static final bdyx f180331b;

    /* renamed from: c */
    public static final bdyx f180332c;

    /* renamed from: d */
    public static final bdyx f180333d;

    /* renamed from: e */
    public static final bdyx f180334e;

    /* renamed from: f */
    public static final bdyx f180335f;

    /* renamed from: g */
    public static final bdyx f180336g;

    /* renamed from: h */
    public static final bdyx f180337h;

    /* renamed from: i */
    public static final bdyx f180338i;

    /* renamed from: j */
    public static final bdyx f180339j;

    /* renamed from: k */
    public static final bdyx f180340k;

    /* renamed from: l */
    public static final bdyx f180341l;

    /* renamed from: m */
    public static final bdyx f180342m;

    /* renamed from: n */
    public static final bdyx f180343n;

    /* renamed from: o */
    public static final bdyx f180344o;

    /* renamed from: p */
    public static final bdyx f180345p;

    /* renamed from: q */
    public static final bdyx f180346q;

    /* renamed from: r */
    public static final bdyx f180347r;

    /* renamed from: s */
    public static final bdyx f180348s;

    /* renamed from: t */
    public static final bdyx f180349t;

    /* renamed from: u */
    public static final bdyx f180350u;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:mdns:");
        f180330a = bdyx.m91610a(a, "allow_add_mdns_packet_after_discovery_stops", false);
        f180331b = bdyx.m91610a(a, "always_ask_for_unicast_response_in_each_burst", false);
        f180332c = bdyx.m91609a(a, "cast_shell_emulator_mdns_ports", "");
        f180333d = bdyx.m91610a(a, "check_multicast_response", false);
        f180334e = bdyx.m91607a(a, "check_multicast_response_interval_ms", 10000L);
        f180335f = bdyx.m91610a(a, "clear_mdns_packet_queue_after_discovery_stops", true);
        bdyx.m91610a(a, "enable_ipv6", true);
        f180336g = bdyx.m91607a(a, "initial_time_between_bursts_ms", 5000L);
        f180337h = bdyx.m91607a(a, "log_mdns_packets_count_interval_ms", 60000L);
        f180338i = bdyx.m91607a(a, "mdns_packet_queue_max_size", 2147483647L);
        f180339j = bdyx.m91607a(a, "mdns_port", 5353L);
        bdyx.m91610a(a, "multicast_lock_enabled", true);
        f180340k = bdyx.m91610a(a, "prefer_ipv6", false);
        f180341l = bdyx.m91607a(a, "queries_per_burst", 3L);
        f180342m = bdyx.m91607a(a, "queries_per_burst_passive", 1L);
        f180343n = bdyx.m91610a(a, "should_cancel_scan_task_when_future_is_null", true);
        f180344o = bdyx.m91610a(a, "should_log_mdns_packets_cunt", true);
        f180345p = bdyx.m91610a(a, "should_log_mdns_service_start_event", true);
        f180346q = bdyx.m91607a(a, "sleep_time_for_socket_thread_ms", 20000L);
        f180347r = bdyx.m91607a(a, "time_between_bursts_ms", 20000L);
        f180348s = bdyx.m91607a(a, "time_between_queries_in_burst_ms", 1000L);
        f180349t = bdyx.m91610a(a, "use_separate_socket_to_send_unicast_query", false);
        f180350u = bdyx.m91610a(a, "use_session_id_to_schedule_mdns_task", true);
    }

    /* renamed from: a */
    public final boolean mo77120a() {
        return ((Boolean) f180330a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77121b() {
        return ((Boolean) f180331b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo77122c() {
        return (String) f180332c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo77123d() {
        return ((Boolean) f180333d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo77124e() {
        return ((Long) f180334e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo77125f() {
        return ((Boolean) f180335f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo77126g() {
        return ((Long) f180336g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo77127h() {
        return ((Long) f180337h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo77128i() {
        return ((Long) f180338i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo77129j() {
        return ((Long) f180339j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final boolean mo77130k() {
        return ((Boolean) f180340k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final long mo77131l() {
        return ((Long) f180341l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo77132m() {
        return ((Long) f180342m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final boolean mo77133n() {
        return ((Boolean) f180343n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo77134o() {
        return ((Boolean) f180344o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo77135p() {
        return ((Boolean) f180345p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final long mo77136q() {
        return ((Long) f180346q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo77137r() {
        return ((Long) f180347r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo77138s() {
        return ((Long) f180348s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final boolean mo77139t() {
        return ((Boolean) f180349t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo77140u() {
        return ((Boolean) f180350u.mo58455c()).booleanValue();
    }
}
