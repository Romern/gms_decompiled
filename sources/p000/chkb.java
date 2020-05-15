package p000;

/* renamed from: chkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chkb implements chka {

    /* renamed from: a */
    public static final bdyx f188703a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        bdyx.m91609a(bdyw, "WalletSync__dummy_testing_flag", "default");
        bdyx.m91610a(bdyw, "sync.enable_periodic_sync", true);
        f188703a = bdyx.m91607a(bdyw, "WalletSync__environment", 1L);
        bdyx.m91607a(bdyw, "sync.max_random_delay_minutes", 30L);
        bdyx.m91607a(bdyw, "sync.max_retries", 1L);
        bdyx.m91607a(bdyw, "sync.period_hours", 672L);
    }

    /* renamed from: a */
    public final long mo85294a() {
        return ((Long) f188703a.mo58455c()).longValue();
    }
}
