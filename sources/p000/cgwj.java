package p000;

/* renamed from: cgwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgwj implements cgwi {

    /* renamed from: a */
    public static final bdyx f187850a;

    /* renamed from: b */
    public static final bdyx f187851b;

    /* renamed from: c */
    public static final bdyx f187852c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        bdyx.m91610a(bdyw, "Felica__enable_quicpay_mfi_optimization", false);
        f187850a = bdyx.m91607a(bdyw, "Felica__felica_api_timeout", 60L);
        f187851b = bdyx.m91610a(bdyw, "felica_enabled_v20", true);
        f187852c = bdyx.m91607a(bdyw, "Felica__felica_tx_sync_period_seconds", 5400L);
    }

    /* renamed from: a */
    public final long mo84564a() {
        return ((Long) f187850a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84565b() {
        return ((Boolean) f187851b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo84566c() {
        return ((Long) f187852c.mo58455c()).longValue();
    }
}
