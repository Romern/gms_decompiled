package p000;

/* renamed from: ccfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfo implements ccfn {

    /* renamed from: a */
    public static final bdyx f178872a;

    /* renamed from: b */
    public static final bdyx f178873b;

    /* renamed from: c */
    public static final bdyx f178874c;

    /* renamed from: d */
    public static final bdyx f178875d;

    /* renamed from: e */
    public static final bdyx f178876e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.easyunlock")).mo58445a("auth_easyunlock_");
        f178872a = bdyx.m91610a(a, "EasyUnlock__auth_error_force_device_sync_on_all_accounts", true);
        f178873b = bdyx.m91607a(a, "EasyUnlock__device_sync_api_timeout_sec", 30L);
        f178874c = bdyx.m91610a(a, "EasyUnlock__is_easy_unlock_enabled", true);
        f178875d = bdyx.m91610a(a, "EasyUnlock__should_check_secure_user_configuration", true);
        f178876e = bdyx.m91610a(a, "EasyUnlock__should_report_feature_support", true);
    }

    /* renamed from: a */
    public final boolean mo75859a() {
        return ((Boolean) f178872a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75860b() {
        return ((Long) f178873b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo75861c() {
        return ((Boolean) f178874c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75862d() {
        return ((Boolean) f178875d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75863e() {
        return ((Boolean) f178876e.mo58455c()).booleanValue();
    }
}
