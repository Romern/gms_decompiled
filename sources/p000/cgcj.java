package p000;

/* renamed from: cgcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgcj implements cgci {

    /* renamed from: a */
    public static final bdyx f186564a;

    /* renamed from: b */
    public static final bdyx f186565b;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:");
        f186564a = bdyx.m91609a(a, "content_provider_3p_whitelist", "com.google.android.gms.clearcut.public,com.google.android.gms.vision.sdk,com.google.android.gms.measurement,com.google.android.gms.icing,com.google.android.cruiser,org.chromium.net.cronet,com.google.android.gms.auth_account");
        f186565b = bdyx.m91610a(a, "ContentProvider__enable_committed_flags_dump", false);
    }

    /* renamed from: a */
    public final String mo83492a() {
        return (String) f186564a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo83493b() {
        return ((Boolean) f186565b.mo58455c()).booleanValue();
    }
}
