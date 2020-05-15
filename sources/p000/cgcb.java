package p000;

/* renamed from: cgcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgcb implements cgca {

    /* renamed from: a */
    public static final bdyx f186553a;

    /* renamed from: b */
    public static final bdyx f186554b;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58443a();
        f186553a = bdyx.m91607a(a, "ApiService__thread_count", 2L);
        f186554b = bdyx.m91607a(a, "ApiService__timeout_to_close_db_in_seconds", 60L);
    }

    /* renamed from: a */
    public final long mo83486a() {
        return ((Long) f186553a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83487b() {
        return ((Long) f186554b.mo58455c()).longValue();
    }
}
