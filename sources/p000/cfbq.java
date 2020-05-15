package p000;

/* renamed from: cfbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfbq implements cfbp {

    /* renamed from: a */
    public static final bdyx f183594a;

    /* renamed from: b */
    public static final bdyx f183595b;

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
        bdyw b = new bdyw("com.google.android.gms.lockbox").mo58445a("gms:lockbox:service").mo58450b();
        f183594a = bdyx.m91610a(b, "collect_standby_buckets", false);
        f183595b = bdyx.m91607a(b, "commit_phenotype_interval_millis", 3600000L);
        bdyx.m91610a(b, "disable_lockbox_udc_receiver", true);
        bdyx.m91607a(b, "phenotype_register_timeout_millis", 5000L);
    }

    /* renamed from: a */
    public final boolean mo80811a() {
        return ((Boolean) f183594a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo80812b() {
        return ((Long) f183595b.mo58455c()).longValue();
    }
}
