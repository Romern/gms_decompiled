package p000;

/* renamed from: ccmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccmj implements ccmi {

    /* renamed from: a */
    public static final bdyx f179448a;

    /* renamed from: b */
    public static final bdyx f179449b;

    /* renamed from: c */
    public static final bdyx f179450c;

    /* renamed from: d */
    public static final bdyx f179451d;

    /* renamed from: e */
    public static final bdyx f179452e;

    /* renamed from: f */
    public static final bdyx f179453f;

    /* renamed from: g */
    public static final bdyx f179454g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179448a = bdyx.m91610a(bdyw, "GmscoreModulesBackupFeature__backup_enable_new_contacts_item_in_device_backup", false);
        f179449b = bdyx.m91609a(bdyw, "GmscoreModulesBackupFeature__backup_gms_backup_modules_whitelist", "com.google.android.gms.romanesco,com.google.android.gms.backup_base");
        f179450c = bdyx.m91610a(bdyw, "GmscoreModulesBackupFeature__backup_gms_restore_return_callback_after_restore_complete", true);
        f179451d = bdyx.m91607a(bdyw, "GmscoreModulesBackupFeature__backup_max_devices_get_devices", 10L);
        bdyx.m91607a(bdyw, "GmscoreModulesBackupFeature__backup_min_pixelmigrate_version_for_launching_key_recovery_activity", 0L);
        f179452e = bdyx.m91607a(bdyw, "GmscoreModulesBackupFeature__backup_min_sdk_to_enable_gms_backup_agent", 9999L);
        bdyx.m91610a(bdyw, "GmscoreModulesBackupFeature__backup_restore_contacts_from_gms_in_cloud_suw", false);
        f179453f = bdyx.m91607a(bdyw, "GmscoreModulesBackupFeature__backup_timeout_for_gms_package_restore_ms", 300000L);
        f179454g = bdyx.m91607a(bdyw, "GmscoreModulesBackupFeature__backup_timeout_to_get_gms_restore_sets_ms", 300000L);
        bdyx.m91610a(bdyw, "GmscoreModulesBackupFeature__backup_use_device_to_create_key_recovery_activity", true);
    }

    /* renamed from: a */
    public final boolean mo76372a() {
        return ((Boolean) f179448a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo76373b() {
        return (String) f179449b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo76374c() {
        return ((Boolean) f179450c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76375d() {
        return ((Long) f179451d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76376e() {
        return ((Long) f179452e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76377f() {
        return ((Long) f179453f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo76378g() {
        return ((Long) f179454g.mo58455c()).longValue();
    }
}
