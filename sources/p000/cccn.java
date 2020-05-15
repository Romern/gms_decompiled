package p000;

/* renamed from: cccn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cccn implements cccm {

    /* renamed from: a */
    public static final bdyx f178752a;

    /* renamed from: b */
    public static final bdyx f178753b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth.api.credentials"));
        f178752a = bdyx.m91607a(bdyw, "GisAssistedSigninCancelBackoff__cancel_backoff_duration_minutes", 1440L);
        f178753b = bdyx.m91607a(bdyw, "GisAssistedSigninCancelBackoff__threshold_cancel_count_to_backoff", 4L);
    }

    /* renamed from: a */
    public final long mo75766a() {
        return ((Long) f178752a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75767b() {
        return ((Long) f178753b.mo58455c()).longValue();
    }
}
