package p000;

/* renamed from: ccaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccaq implements ccap {

    /* renamed from: a */
    public static final bdyx f178693a;

    /* renamed from: b */
    public static final bdyx f178694b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178693a = bdyx.m91610a(a, "ProjectDownpourFlags__enable_get_token_full_logging_for_small_percent", false);
        f178694b = bdyx.m91610a(a, "ProjectDownpourFlags__enable_intermediate_tokens_with_ttl_caveat", false);
    }

    /* renamed from: a */
    public final boolean mo75724a() {
        return ((Boolean) f178693a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75725b() {
        return ((Boolean) f178694b.mo58455c()).booleanValue();
    }
}
