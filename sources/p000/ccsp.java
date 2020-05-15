package p000;

/* renamed from: ccsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsp implements ccso {

    /* renamed from: a */
    public static final bdyx f179853a;

    /* renamed from: b */
    public static final bdyx f179854b;

    /* renamed from: c */
    public static final bdyx f179855c;

    /* renamed from: d */
    public static final bdyx f179856d;

    /* renamed from: e */
    public static final bdyx f179857e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179853a = bdyx.m91610a(bdyw, "FrameworkCarProjectionValidatorFlags__allow_preinstall_mobile_app", false);
        f179854b = bdyx.m91610a(bdyw, "FrameworkCarProjectionValidatorFlags__dump_to_bug_report_reason_apps_not_allowed", true);
        f179855c = bdyx.m91610a(bdyw, "FrameworkCarProjectionValidatorFlags__log_reason_apps_not_allowed", true);
        f179856d = bdyx.m91610a(bdyw, "FrameworkCarProjectionValidatorFlags__log_reason_apps_not_allowed_all_apps", false);
        f179857e = bdyx.m91610a(bdyw, "FrameworkCarProjectionValidatorFlags__validator_must_run_on_background_thread", true);
    }

    /* renamed from: a */
    public final boolean mo76721a() {
        return ((Boolean) f179853a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76722b() {
        return ((Boolean) f179854b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76723c() {
        return ((Boolean) f179855c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76724d() {
        return ((Boolean) f179856d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76725e() {
        return ((Boolean) f179857e.mo58455c()).booleanValue();
    }
}
