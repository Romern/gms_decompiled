package p000;

/* renamed from: cdlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdlj implements cdli {

    /* renamed from: a */
    public static final bdyx f181192a;

    /* renamed from: b */
    public static final bdyx f181193b;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58443a();
        f181192a = bdyx.m91610a(a, "GoogleCertificatesFlags__enable_debug_certificates", false);
        f181193b = bdyx.m91610a(a, "GoogleCertificatesFlags__remove_ia_supervisor_from_1p_apps", false);
    }

    /* renamed from: a */
    public final boolean mo77856a() {
        return ((Boolean) f181192a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77857b() {
        return ((Boolean) f181193b.mo58455c()).booleanValue();
    }
}
