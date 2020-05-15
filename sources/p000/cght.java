package p000;

/* renamed from: cght */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cght implements cghs {

    /* renamed from: a */
    public static final bdyx f186964a;

    /* renamed from: b */
    public static final bdyx f186965b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.rcs"));
        f186964a = bdyx.m91610a(bdyw, "RcsBindingFeature__bind_foreground", true);
        f186965b = bdyx.m91609a(bdyw, "RcsBindingFeature__whitelisted_packages", "com.google.android.apps.messaging");
    }

    /* renamed from: a */
    public final boolean mo83810a() {
        return ((Boolean) f186964a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo83811b() {
        return (String) f186965b.mo58455c();
    }
}
