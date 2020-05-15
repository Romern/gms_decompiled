package p000;

/* renamed from: celj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class celj implements celi {

    /* renamed from: a */
    public static final bdyx f182900a;

    /* renamed from: b */
    public static final bdyx f182901b;

    /* renamed from: c */
    public static final bdyx f182902c;

    /* renamed from: d */
    public static final bdyx f182903d;

    /* renamed from: e */
    public static final bdyx f182904e;

    /* renamed from: f */
    public static final bdyx f182905f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        f182900a = bdyx.m91607a(a, "ZeroPartyApis__activity_recognition_timeout_millis", 500L);
        bdyx.m91610a(a, "ZeroPartyApis__add_unneeded_apis_network_quality_service_client", true);
        f182901b = bdyx.m91607a(a, "ZeroPartyApis__captive_portal_lwnq_timeout_millis", 500L);
        f182902c = bdyx.m91610a(a, "ZeroPartyApis__collect_activity", true);
        f182903d = bdyx.m91607a(a, "ZeroPartyApis__connectionless_location_services_timeout_millis", 2000L);
        bdyx.m91607a(a, "gcore_connection_timeout_millis", 15000L);
        f182904e = bdyx.m91610a(a, "ZeroPartyApis__monitor_request_cellinfo_timeout", true);
        f182905f = bdyx.m91607a(a, "ZeroPartyApis__reporting_services_timeout_millis", 500L);
        bdyx.m91610a(a, "ZeroPartyApis__use_clearcut_logger_in_google_apiclient", true);
        bdyx.m91610a(a, "ZeroPartyApis__use_connectionless_activity_recognition_client", true);
        bdyx.m91610a(a, "ZeroPartyApis__use_connectionless_client_nova", false);
        bdyx.m91610a(a, "ZeroPartyApis__use_connectionless_location_services_client", true);
        bdyx.m91610a(a, "ZeroPartyApis__use_connectionless_network_quality_client", true);
        bdyx.m91610a(a, "ZeroPartyApis__use_connectionless_reporting_services_client", true);
    }

    /* renamed from: a */
    public final long mo79270a() {
        return ((Long) f182900a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79271b() {
        return ((Long) f182901b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo79272c() {
        return ((Boolean) f182902c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79273d() {
        return ((Long) f182903d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo79274e() {
        return ((Boolean) f182904e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo79275f() {
        return ((Long) f182905f.mo58455c()).longValue();
    }
}
