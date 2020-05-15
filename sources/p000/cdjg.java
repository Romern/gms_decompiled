package p000;

/* renamed from: cdjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdjg implements cdjf {

    /* renamed from: a */
    public static final bdyx f180976a;

    /* renamed from: b */
    public static final bdyx f180977b;

    /* renamed from: c */
    public static final bdyx f180978c;

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
        bdyw b = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:bug116753498:").mo58450b();
        f180976a = bdyx.m91610a(b, "Bug116753498__generic_suppress_enabled", true);
        f180977b = bdyx.m91610a(b, "Bug116753498__nlp_suppress_enabled", true);
        bdyx.m91610a(b, "Bug116753498__suppressEnabled", false);
        f180978c = bdyx.m91605a(b, "Bug116753498__suppress_crash_probability", 1.0d);
    }

    /* renamed from: a */
    public final boolean mo77667a() {
        return ((Boolean) f180976a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77668b() {
        return ((Boolean) f180977b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo77669c() {
        return ((Double) f180978c.mo58455c()).doubleValue();
    }
}
