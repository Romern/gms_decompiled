package p000;

/* renamed from: cbyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbyp implements cbyo {

    /* renamed from: a */
    public static final bdyx f178562a;

    /* renamed from: b */
    public static final bdyx f178563b;

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
        f178562a = bdyx.m91610a(a, "auth_enable_minute_maid_url_config_from_post_pre_add_account_hook", false);
        f178563b = bdyx.m91610a(a, "auth_enable_post_pre_add_account_hook", false);
    }

    /* renamed from: a */
    public final boolean mo75612a() {
        return ((Boolean) f178562a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75613b() {
        return ((Boolean) f178563b.mo58455c()).booleanValue();
    }
}
