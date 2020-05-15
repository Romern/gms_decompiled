package p000;

/* renamed from: cgwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgwc implements cgwb {

    /* renamed from: a */
    public static final bdyx f187840a;

    /* renamed from: b */
    public static final bdyx f187841b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187840a = bdyx.m91609a(bdyw, "droidguard_flow_name", "tapandpay_attestation");
        f187841b = bdyx.m91607a(bdyw, "droidguard_timeout_millis", 90000L);
    }

    /* renamed from: a */
    public final String mo84557a() {
        return (String) f187840a.mo58455c();
    }

    /* renamed from: b */
    public final long mo84558b() {
        return ((Long) f187841b.mo58455c()).longValue();
    }
}
