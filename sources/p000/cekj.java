package p000;

/* renamed from: cekj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cekj implements ceki {

    /* renamed from: a */
    public static final bdyx f182842a;

    /* renamed from: b */
    public static final bdyx f182843b;

    /* renamed from: c */
    public static final bdyx f182844c;

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
        f182842a = bdyx.m91607a(a, "gcs_service_connection_timeout_millis", 3000L);
        f182843b = bdyx.m91607a(a, "gcs_state_service_cache_ttl_millis", 604800000L);
        f182844c = bdyx.m91610a(a, "report_vpn_state", true);
    }

    /* renamed from: a */
    public final long mo79222a() {
        return ((Long) f182842a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79223b() {
        return ((Long) f182843b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo79224c() {
        return ((Boolean) f182844c.mo58455c()).booleanValue();
    }
}
