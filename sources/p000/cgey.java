package p000;

/* renamed from: cgey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgey implements cgex {

    /* renamed from: a */
    public static final bdyx f186702a;

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
        f186702a = bdyx.m91610a(a, "UseScopeConfig__enable_app_scope", true);
        bdyx.m91610a(a, "UseScopeConfig__enable_device_scope", true);
    }

    /* renamed from: a */
    public final boolean mo83575a() {
        return ((Boolean) f186702a.mo58455c()).booleanValue();
    }
}
