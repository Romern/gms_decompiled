package p000;

/* renamed from: cdct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdct implements cdcs {

    /* renamed from: a */
    public static final bdyx f180505a;

    /* renamed from: b */
    public static final bdyx f180506b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.chromesync")).mo58443a();
        f180505a = bdyx.m91607a(a, "AffiliationCacheExpirationTime__base_expiration_millis", 1209600000L);
        f180506b = bdyx.m91607a(a, "AffiliationCacheExpirationTime__jitter_millis", 259200000L);
    }

    /* renamed from: a */
    public final long mo77269a() {
        return ((Long) f180505a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77270b() {
        return ((Long) f180506b.mo58455c()).longValue();
    }
}
