package p000;

/* renamed from: cdix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdix implements cdiw {

    /* renamed from: a */
    public static final bdyx f180963a;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:");
        bdyx.m91610a(a, "ApiCounter__collect_gcore_dimensions", false);
        f180963a = bdyx.m91610a(a, "ApiCounter__enable_api_counter", false);
        bdyx.m91605a(a, "ApiCounter__sampling_rate", 1.0d);
    }

    /* renamed from: a */
    public final boolean mo77657a() {
        return ((Boolean) f180963a.mo58455c()).booleanValue();
    }
}
