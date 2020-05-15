package p000;

/* renamed from: cdpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpq implements cdpp {

    /* renamed from: a */
    public static final bdyx f181532a;

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
        bdyw bdyw = new bdyw("direct_boot:gms_chimera_phenotype_flags");
        f181532a = bdyx.m91610a(bdyw, "WorkChainsPi__enable_retrieve_attribution_from_trace", true);
        bdyx.m91610a(bdyw, "stats_wakeLocks_enable_work_chains_pi", true);
    }

    /* renamed from: a */
    public final boolean mo78157a() {
        return ((Boolean) f181532a.mo58455c()).booleanValue();
    }
}
