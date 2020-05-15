package p000;

/* renamed from: chix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chix implements chiw {

    /* renamed from: a */
    public static final bdyx f188667a;

    /* renamed from: b */
    public static final bdyx f188668b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188667a = bdyx.m91607a(bdyw, "ReauthSettings__api_timeout_millis", 30000L);
        f188668b = bdyx.m91610a(bdyw, "ReauthSettings__use_webview_for_forgot_pin_link", true);
    }

    /* renamed from: a */
    public final long mo85268a() {
        return ((Long) f188667a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo85269b() {
        return ((Boolean) f188668b.mo58455c()).booleanValue();
    }
}
