package p000;

/* renamed from: cfui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfui implements cfug {

    /* renamed from: a */
    public static final bdyx f185727a;

    /* renamed from: b */
    public static final bdyx f185728b;

    /* renamed from: c */
    public static final bdyx f185729c;

    /* renamed from: d */
    public static final bdyx f185730d;

    /* renamed from: e */
    public static final bdyx f185731e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.pay")).mo58443a();
        f185727a = bdyx.m91609a(a, "Loader__allowed_request_pay_module_callers", "com.google.android.apps.nbu.paisa.user");
        f185728b = bdyx.m91610a(a, "Loader__loader_cache_invalidation", true);
        try {
            f185729c = bdyx.m91608a(a, "Loader__loader_condition_package_names", (bydj) bxvk.m124014a(bydj.f165795b, new byte[0]), cfuh.f185726a);
            f185730d = bdyx.m91610a(a, "Loader__loader_package_changes", true);
            f185731e = bdyx.m91610a(a, "Loader__use_has_tokens_condition", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"Loader__loader_condition_package_names\"");
        }
    }

    /* renamed from: a */
    public final String mo82735a() {
        return (String) f185727a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo82736b() {
        return ((Boolean) f185728b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final bydj mo82737c() {
        return (bydj) f185729c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo82738d() {
        return ((Boolean) f185730d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82739e() {
        return ((Boolean) f185731e.mo58455c()).booleanValue();
    }
}
