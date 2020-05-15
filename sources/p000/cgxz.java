package p000;

/* renamed from: cgxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgxz implements cgxy {

    /* renamed from: a */
    public static final bdyx f188013a;

    /* renamed from: b */
    public static final bdyx f188014b;

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
        f188013a = bdyx.m91607a(bdyw, "pay_on_wear_enable_timeout_millis", 30000L);
        bdyx.m91607a(bdyw, "watch_cdcvm_expiration_in_secs", 86400L);
        bdyx.m91607a(bdyw, "wearVelocityCheckLimit", 20L);
        f188014b = bdyx.m91607a(bdyw, "wear_tokenization_screen_timeout_seconds", 300L);
    }

    /* renamed from: a */
    public final long mo84713a() {
        return ((Long) f188013a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo84714b() {
        return ((Long) f188014b.mo58455c()).longValue();
    }
}
