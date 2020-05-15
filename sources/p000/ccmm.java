package p000;

/* renamed from: ccmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccmm implements ccml {

    /* renamed from: a */
    public static final bdyx f179457a;

    /* renamed from: b */
    public static final bdyx f179458b;

    /* renamed from: c */
    public static final bdyx f179459c;

    /* renamed from: d */
    public static final bdyx f179460d;

    /* renamed from: e */
    public static final bdyx f179461e;

    /* renamed from: f */
    public static final bdyx f179462f;

    /* renamed from: g */
    public static final bdyx f179463g;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.backup")).mo58450b();
        bdyx.m91610a(b, "backup_enable_contacts_in_cloud_restore", true);
        bdyx.m91610a(b, "backup_enable_play_setup_service_v2", true);
        f179457a = bdyx.m91610a(b, "backup_is_whitelisted_for_call_log_backup", false);
        bdyx.m91607a(b, "backup_max_get_packages_for_device_retry_calls", 1L);
        f179458b = bdyx.m91609a(b, "backup_restore_blacklist", "");
        f179459c = bdyx.m91607a(b, "backup_restore_full_minTarget", 0L);
        f179460d = bdyx.m91610a(b, "enable_full_backup", false);
        f179461e = bdyx.m91610a(b, "enable_full_restore", false);
        f179462f = bdyx.m91610a(b, "swallow_play_logger_npe", false);
        f179463g = bdyx.m91610a(b, "using_user_full_data_backup_aware", true);
    }

    /* renamed from: a */
    public final boolean mo76380a() {
        return ((Boolean) f179457a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo76381b() {
        return (String) f179458b.mo58455c();
    }

    /* renamed from: c */
    public final long mo76382c() {
        return ((Long) f179459c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo76383d() {
        return ((Boolean) f179460d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76384e() {
        return ((Boolean) f179461e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76385f() {
        return ((Boolean) f179462f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo76386g() {
        return ((Boolean) f179463g.mo58455c()).booleanValue();
    }
}
