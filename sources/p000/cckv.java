package p000;

/* renamed from: cckv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cckv implements ccku {

    /* renamed from: a */
    public static final bdyx f179253a;

    /* renamed from: b */
    public static final bdyx f179254b;

    /* renamed from: c */
    public static final bdyx f179255c;

    /* renamed from: d */
    public static final bdyx f179256d;

    /* renamed from: e */
    public static final bdyx f179257e;

    /* renamed from: f */
    public static final bdyx f179258f;

    /* renamed from: g */
    public static final bdyx f179259g;

    /* renamed from: h */
    public static final bdyx f179260h;

    /* renamed from: i */
    public static final bdyx f179261i;

    /* renamed from: j */
    public static final bdyx f179262j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179253a = bdyx.m91607a(bdyw, "backup_auth_token_get_timeout_millis", 10000L);
        f179254b = bdyx.m91610a(bdyw, "backup_disable_components_if_not_user_zero", false);
        bdyx.m91610a(bdyw, "backup_enforce_package_name_in_backup_commands", true);
        f179255c = bdyx.m91607a(bdyw, "backup_max_backup_attempts", 1L);
        f179256d = bdyx.m91607a(bdyw, "backup_max_clear_device_attempts", 1L);
        f179257e = bdyx.m91607a(bdyw, "Common__backup_max_get_app_key_blacklist_info_attempts", 3L);
        f179258f = bdyx.m91607a(bdyw, "backup_max_get_devices_attempts", 3L);
        f179259g = bdyx.m91607a(bdyw, "backup_max_restore_attempts", 3L);
        f179260h = bdyx.m91610a(bdyw, "backup_silent_feedback_enabled", true);
        f179261i = bdyx.m91605a(bdyw, "backup_silent_feedback_sampling_rate_backup_account_manager", 0.01d);
        f179262j = bdyx.m91605a(bdyw, "backup_silent_feedback_sampling_rate_backup_manager_wrapper", 0.01d);
    }

    /* renamed from: a */
    public final long mo76193a() {
        return ((Long) f179253a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76194b() {
        return ((Boolean) f179254b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo76195c() {
        return ((Long) f179255c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo76196d() {
        return ((Long) f179256d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76197e() {
        return ((Long) f179257e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76198f() {
        return ((Long) f179258f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo76199g() {
        return ((Long) f179259g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo76200h() {
        return ((Boolean) f179260h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final double mo76201i() {
        return ((Double) f179261i.mo58455c()).doubleValue();
    }

    /* renamed from: j */
    public final double mo76202j() {
        return ((Double) f179262j.mo58455c()).doubleValue();
    }
}
