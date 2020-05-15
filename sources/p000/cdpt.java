package p000;

/* renamed from: cdpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpt implements cdps {

    /* renamed from: a */
    public static final bdyx f181535a;

    /* renamed from: b */
    public static final bdyx f181536b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.credential_manager")).mo58443a();
        f181535a = bdyx.m91610a(a, "EnhancedProtection__enhanced_protection_enabled", false);
        f181536b = bdyx.m91609a(a, "EnhancedProtection__enhanced_protection_learn_more_link", "https://support.google.com/chrome/answer/95606");
    }

    /* renamed from: a */
    public final boolean mo78159a() {
        return ((Boolean) f181535a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78160b() {
        return (String) f181536b.mo58455c();
    }
}
