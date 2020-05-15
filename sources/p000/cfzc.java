package p000;

/* renamed from: cfzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfzc implements cfzb {

    /* renamed from: a */
    public static final bdyx f186191a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        bdyx.m91607a(bdyw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_api_disabled", 2L);
        bdyx.m91610a(bdyw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_api_logging_enabled", true);
        f186191a = bdyx.m91605a(bdyw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_sample_rate", 1.0d);
        bdyx.m91607a(bdyw, "MenagerieContactsSyncApiFeature__on_sync_to_contacts_enabled_operation_disabled", 1L);
        bdyx.m91607a(bdyw, "MenagerieContactsSyncApiFeature__set_sync_to_contacts_settings_operation_disabled", 2L);
        bdyx.m91607a(bdyw, "MenagerieContactsSyncApiFeature__sync_raw_contact_operation_disabled", 2L);
    }

    /* renamed from: a */
    public final double mo83153a() {
        return ((Double) f186191a.mo58455c()).doubleValue();
    }
}
