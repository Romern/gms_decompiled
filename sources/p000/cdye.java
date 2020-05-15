package p000;

/* renamed from: cdye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdye implements cdyd {

    /* renamed from: a */
    public static final bdyx f181906a;

    /* renamed from: b */
    public static final bdyx f181907b;

    /* renamed from: c */
    public static final bdyx f181908c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.firebase.auth"));
        f181906a = bdyx.m91610a(bdyw, "MultiFactorAuthFeature__enable_multi_factor_auth", true);
        f181907b = bdyx.m91609a(bdyw, "multi_factor_auth_base_url", "https://identitytoolkit.googleapis.com/v2/accounts");
        f181908c = bdyx.m91609a(bdyw, "multi_factor_auth_min_sdk_version", "19.3.0");
    }

    /* renamed from: a */
    public final boolean mo78444a() {
        return ((Boolean) f181906a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78445b() {
        return (String) f181907b.mo58455c();
    }

    /* renamed from: c */
    public final String mo78446c() {
        return (String) f181908c.mo58455c();
    }
}
