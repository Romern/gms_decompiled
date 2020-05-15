package p000;

/* renamed from: cdrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrs implements cdrr {

    /* renamed from: a */
    public static final bdyx f181611a;

    /* renamed from: b */
    public static final bdyx f181612b;

    /* renamed from: c */
    public static final bdyx f181613c;

    /* renamed from: d */
    public static final bdyx f181614d;

    /* renamed from: e */
    public static final bdyx f181615e;

    /* renamed from: f */
    public static final bdyx f181616f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.droidguard"));
        f181611a = bdyx.m91609a(bdyw, "droidguard_fast_fail_flows", "ad_attest,recaptcha-frame,federatedMachineLearningReduced");
        f181612b = bdyx.m91607a(bdyw, "gms:droidguard:earliest_fsc_end_seconds", 3600L);
        f181613c = bdyx.m91610a(bdyw, "gms:droidguard:enable_low_latency_api", true);
        f181614d = bdyx.m91607a(bdyw, "gms:droidguard:fsc_timeout_millis", 3600000L);
        f181615e = bdyx.m91607a(bdyw, "gms:droidguard:latest_fsc_end_seconds", 2592000L);
        f181616f = bdyx.m91609a(bdyw, "gms:droidguard:not_low_latency_flows", "ad_attest,attest,checkin,federatedMachineLearningReduced,msa-f");
    }

    /* renamed from: a */
    public final String mo78218a() {
        return (String) f181611a.mo58455c();
    }

    /* renamed from: b */
    public final long mo78219b() {
        return ((Long) f181612b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo78220c() {
        return ((Boolean) f181613c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo78221d() {
        return ((Long) f181614d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo78222e() {
        return ((Long) f181615e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo78223f() {
        return (String) f181616f.mo58455c();
    }
}
