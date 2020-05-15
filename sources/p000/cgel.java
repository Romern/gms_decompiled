package p000;

/* renamed from: cgel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgel implements cgek {

    /* renamed from: a */
    public static final bdyx f186662a;

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
        bdyx.m91610a(a, "disable_gcm_interaction", false);
        bdyx.m91610a(a, "enable_gcm_push", false);
        f186662a = bdyx.m91610a(a, "enable_sync_after", true);
    }

    /* renamed from: a */
    public final boolean mo83542a() {
        return ((Boolean) f186662a.mo58455c()).booleanValue();
    }
}
