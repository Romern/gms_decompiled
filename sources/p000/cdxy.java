package p000;

/* renamed from: cdxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdxy implements cdxx {

    /* renamed from: a */
    public static final bdyx f181889a;

    /* renamed from: b */
    public static final bdyx f181890b;

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
        f181889a = bdyx.m91610a(bdyw, "GenericIdpErrorFeature__return_idp_credential_on_error", true);
        f181890b = bdyx.m91609a(bdyw, "return_idp_credential_on_error_min_sdk_version", "16.2.1");
    }

    /* renamed from: a */
    public final boolean mo78429a() {
        return ((Boolean) f181889a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78430b() {
        return (String) f181890b.mo58455c();
    }
}
