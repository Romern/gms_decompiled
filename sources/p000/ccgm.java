package p000;

/* renamed from: ccgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccgm implements ccgl {

    /* renamed from: a */
    public static final bdyx f178945a;

    /* renamed from: b */
    public static final bdyx f178946b;

    /* renamed from: c */
    public static final bdyx f178947c;

    /* renamed from: d */
    public static final bdyx f178948d;

    /* renamed from: e */
    public static final bdyx f178949e;

    /* renamed from: f */
    public static final bdyx f178950f;

    /* renamed from: g */
    public static final bdyx f178951g;

    /* renamed from: h */
    public static final bdyx f178952h;

    /* renamed from: i */
    public static final bdyx f178953i;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_managed"));
        f178945a = bdyx.m91610a(bdyw, "auth_enable_emm_setup_in_add_account_flow_for_unicorn", true);
        f178946b = bdyx.m91610a(bdyw, "auth_enable_emm_setup_in_add_user_flow_for_unicorn", true);
        f178947c = bdyx.m91610a(bdyw, "auth_enable_emm_setup_in_setup_wizard_for_unicorn", true);
        f178948d = bdyx.m91610a(bdyw, "auth_enable_set_up_work_profile_settings_entry", true);
        f178949e = bdyx.m91609a(bdyw, "auth_fetch_managing_app_for_user_url", "https://android.clients.google.com/auth/enterprise/fetch_managing_app_for_user?rt=b");
        f178950f = bdyx.m91610a(bdyw, "enable_emm_setup_in_add_account_flow", true);
        f178951g = bdyx.m91610a(bdyw, "enable_emm_setup_in_setup_wizard", true);
        f178952h = bdyx.m91610a(bdyw, "enable_remove_account_after_dm_failure_for_unicorn", true);
        f178953i = bdyx.m91610a(bdyw, "skip_education_screens_for_all_accounts", false);
    }

    /* renamed from: a */
    public final boolean mo75924a() {
        return ((Boolean) f178945a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75925b() {
        return ((Boolean) f178946b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75926c() {
        return ((Boolean) f178947c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75927d() {
        return ((Boolean) f178948d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo75928e() {
        return (String) f178949e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo75929f() {
        return ((Boolean) f178950f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo75930g() {
        return ((Boolean) f178951g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo75931h() {
        return ((Boolean) f178952h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo75932i() {
        return ((Boolean) f178953i.mo58455c()).booleanValue();
    }
}
