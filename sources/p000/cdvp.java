package p000;

/* renamed from: cdvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdvp implements cdvo {

    /* renamed from: a */
    public static final bdyx f181812a;

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
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        bdyx.m91607a(bdyw, "Fido__auth_fido_check_enrollment_delay_millis", 86400000L);
        bdyx.m91610a(bdyw, "Fido__auth_fido_delete_keys_when_account_removed_enabled", false);
        bdyx.m91610a(bdyw, "Fido__auth_fido_enrollment_enabled", false);
        bdyx.m91610a(bdyw, "Fido__auth_fido_invalidate_custom_keys_enabled", false);
        bdyx.m91610a(bdyw, "Fido__auth_fido_key_validity_check_enabled", false);
        bdyx.m91610a(bdyw, "Fido__auth_fido_keystore_key_enrollment_enabled", true);
        f181812a = bdyx.m91610a(bdyw, "Fido__auth_fido_auto_enrollment_triggered_by_flag_update", false);
    }

    /* renamed from: a */
    public final boolean mo78373a() {
        return ((Boolean) f181812a.mo58455c()).booleanValue();
    }
}
