package p000;

/* renamed from: ccgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccgv implements ccgu {

    /* renamed from: a */
    public static final bdyx f178962a;

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
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_managed"));
        bdyx.m91610a(bdyw, "auth_enable_policy_compliance_check_for_gmail", false);
        bdyx.m91610a(bdyw, "auth_enable_policy_compliance_check_for_third_party", false);
        f178962a = bdyx.m91610a(bdyw, "auth_enable_security_exception_mitigation", true);
    }

    /* renamed from: a */
    public final boolean mo75938a() {
        return ((Boolean) f178962a.mo58455c()).booleanValue();
    }
}
