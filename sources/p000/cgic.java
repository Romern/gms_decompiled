package p000;

/* renamed from: cgic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgic implements cgib {

    /* renamed from: a */
    public static final bdyx f186984a;

    /* renamed from: b */
    public static final bdyx f186985b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.recaptcha")).mo58443a();
        f186984a = bdyx.m91610a(a, "enable_recaptcha_v3", true);
        bdyx.m91610a(a, "enable_recaptcha_v3_tv", true);
        f186985b = bdyx.m91610a(a, "enable_verify_with_recaptcha_v2_internal", false);
        bdyx.m91610a(a, "send_recaptcha_version", false);
        bdyx.m91610a(a, "use_alternative_api_for_26", true);
    }

    /* renamed from: a */
    public final boolean mo83827a() {
        return ((Boolean) f186984a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83828b() {
        return ((Boolean) f186985b.mo58455c()).booleanValue();
    }
}
