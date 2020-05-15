package p000;

/* renamed from: cbxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbxk implements cbxj {

    /* renamed from: a */
    public static final bdyx f178512a;

    /* renamed from: b */
    public static final bdyx f178513b;

    /* renamed from: c */
    public static final bdyx f178514c;

    /* renamed from: d */
    public static final bdyx f178515d;

    /* renamed from: e */
    public static final bdyx f178516e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account"));
        bdyx.m91610a(bdyw, "BugFixFeatures__fix_frp_alert_dialog", true);
        bdyx.m91610a(bdyw, "BugFixFeatures__fix_frp_in_r", true);
        f178512a = bdyx.m91610a(bdyw, "BugFixFeatures__prevent_get_result_on_failed_tasks", true);
        f178513b = bdyx.m91610a(bdyw, "BugFixFeatures__send_dmstatus_to_dpc", true);
        f178514c = bdyx.m91610a(bdyw, "BugFixFeatures__set_update_current_task_only_if_different_for_device_cert", false);
        f178515d = bdyx.m91610a(bdyw, "BugFixFeatures__uncertified_devices_remove_permissions", true);
        f178516e = bdyx.m91610a(bdyw, "BugFixFeatures__use_work_account_client_is_whitelisted", true);
    }

    /* renamed from: a */
    public final boolean mo75573a() {
        return ((Boolean) f178512a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75574b() {
        return ((Boolean) f178513b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75575c() {
        return ((Boolean) f178514c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75576d() {
        return ((Boolean) f178515d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75577e() {
        return ((Boolean) f178516e.mo58455c()).booleanValue();
    }
}
