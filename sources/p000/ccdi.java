package p000;

/* renamed from: ccdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccdi implements ccdh {

    /* renamed from: a */
    public static final bdyx f178784a;

    /* renamed from: b */
    public static final bdyx f178785b;

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
        f178784a = bdyx.m91607a(bdyw, "SignInCredentialCacheStrategy__expiration_since_last_access_seconds", 10L);
        f178785b = bdyx.m91607a(bdyw, "SignInCredentialCacheStrategy__max_entry_count", 10L);
    }

    /* renamed from: a */
    public final long mo75791a() {
        return ((Long) f178784a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75792b() {
        return ((Long) f178785b.mo58455c()).longValue();
    }
}
