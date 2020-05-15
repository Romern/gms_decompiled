package p000;

/* renamed from: cfcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfcc implements cfcb {

    /* renamed from: a */
    public static final bdyx f183608a;

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
        bdyw a = new bdyw("com.google.android.gms.lockbox").mo58445a("gms:lockbox:service");
        bdyx.m91610a(a, "check_whitelist_via_flag", true);
        f183608a = bdyx.m91609a(a, "sign_in_package_whitelist", "com.android.vending,com.google.android.googlequicksearchbox,com.google.android.gms.apitest,com.google.android.apps.assistant,com.google.android.apps.searchlite,com.google.android.carassistant");
    }

    /* renamed from: a */
    public final String mo80821a() {
        return (String) f183608a.mo58455c();
    }
}
