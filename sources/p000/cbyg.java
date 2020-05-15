package p000;

/* renamed from: cbyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbyg implements cbyf {

    /* renamed from: a */
    public static final bdyx f178552a;

    /* renamed from: b */
    public static final bdyx f178553b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account"));
        f178552a = bdyx.m91607a(bdyw, "auth_droidguard_burst_window_millis", 0L);
        f178553b = bdyx.m91607a(bdyw, "auth_droidguard_timeout_millis", 60000L);
    }

    /* renamed from: a */
    public final long mo75605a() {
        return ((Long) f178552a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75606b() {
        return ((Long) f178553b.mo58455c()).longValue();
    }
}
