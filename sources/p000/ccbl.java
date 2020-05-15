package p000;

/* renamed from: ccbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccbl implements ccbk {

    /* renamed from: a */
    public static final bdyx f178719a;

    /* renamed from: b */
    public static final bdyx f178720b;

    /* renamed from: c */
    public static final bdyx f178721c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account"));
        f178719a = bdyx.m91610a(bdyw, "enable_supervised_account_intent_operation", false);
        f178720b = bdyx.m91610a(bdyw, "enable_token_refresh_on_container_update", false);
        f178721c = bdyx.m91609a(bdyw, "supervised_account_on_install_whitelist", "");
    }

    /* renamed from: a */
    public final boolean mo75743a() {
        return ((Boolean) f178719a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75744b() {
        return ((Boolean) f178720b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo75745c() {
        return (String) f178721c.mo58455c();
    }
}
