package p000;

/* renamed from: ccne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccne implements ccnd {

    /* renamed from: a */
    public static final bdyx f179484a;

    /* renamed from: b */
    public static final bdyx f179485b;

    /* renamed from: c */
    public static final bdyx f179486c;

    /* renamed from: d */
    public static final bdyx f179487d;

    /* renamed from: e */
    public static final bdyx f179488e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        bdyx.m91610a(bdyw, "backup_audit_backup_opt_in", true);
        f179484a = bdyx.m91610a(bdyw, "backup_audit_drive_backup_settings", true);
        f179485b = bdyx.m91610a(bdyw, "backup_audit_set_backup_account_flow", true);
        f179486c = bdyx.m91610a(bdyw, "backup_enable_backup_in_google_settings", true);
        f179487d = bdyx.m91610a(bdyw, "Settings__backup_log_drive_backup_toggle_state", true);
        f179488e = bdyx.m91610a(bdyw, "enable_backup_settings_playlog", true);
    }

    /* renamed from: a */
    public final boolean mo76401a() {
        return ((Boolean) f179484a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76402b() {
        return ((Boolean) f179485b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76403c() {
        return ((Boolean) f179486c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76404d() {
        return ((Boolean) f179487d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76405e() {
        return ((Boolean) f179488e.mo58455c()).booleanValue();
    }
}
