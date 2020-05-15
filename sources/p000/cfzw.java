package p000;

/* renamed from: cfzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfzw implements cfzv {

    /* renamed from: a */
    public static final bdyx f186221a;

    /* renamed from: b */
    public static final bdyx f186222b;

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
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186221a = bdyx.m91610a(bdyw, "MenagerieIdentityApiFeature__identity_get_by_id_gaia_id_map_lookup_disabled", false);
        bdyx.m91610a(bdyw, "MenagerieIdentityApiFeature__identity_get_by_id_web_data_source_disabled", true);
        bdyx.m91607a(bdyw, "MenagerieIdentityApiFeature__identity_get_by_ids_operation_disabled", 0L);
        f186222b = bdyx.m91607a(bdyw, "MenagerieIdentityApiFeature__identity_list_operation_disabled", 0L);
    }

    /* renamed from: a */
    public final boolean mo83173a() {
        return ((Boolean) f186221a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo83174b() {
        return ((Long) f186222b.mo58455c()).longValue();
    }
}
