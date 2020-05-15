package p000;

/* renamed from: ccch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccch implements cccg {

    /* renamed from: a */
    public static final bdyx f178745a;

    /* renamed from: b */
    public static final bdyx f178746b;

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
        f178745a = bdyx.m91607a(bdyw, "AssistedSignInConfirmationDelay__delay_with_grants_needed_millis", 2000L);
        f178746b = bdyx.m91607a(bdyw, "AssistedSignInConfirmationDelay__delay_without_grants_needed_millis", 1000L);
    }

    /* renamed from: a */
    public final long mo75761a() {
        return ((Long) f178745a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75762b() {
        return ((Long) f178746b.mo58455c()).longValue();
    }
}
