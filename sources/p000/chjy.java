package p000;

/* renamed from: chjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chjy implements chjx {

    /* renamed from: a */
    public static final bdyx f188697a;

    /* renamed from: b */
    public static final bdyx f188698b;

    /* renamed from: c */
    public static final bdyx f188699c;

    /* renamed from: d */
    public static final bdyx f188700d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188697a = bdyx.m91607a(bdyw, "WalletRequestContext__fido_isuvpaa_timeout_milliseconds", 100L);
        f188698b = bdyx.m91610a(bdyw, "WalletRequestContext__include_native_client_context_android_id", true);
        f188699c = bdyx.m91609a(bdyw, "WalletRequestContext__override_experiment_ids", "");
        f188700d = bdyx.m91610a(bdyw, "WalletRequestContext__set_is_device_fido_compatible", false);
    }

    /* renamed from: a */
    public final long mo85289a() {
        return ((Long) f188697a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo85290b() {
        return ((Boolean) f188698b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo85291c() {
        return (String) f188699c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo85292d() {
        return ((Boolean) f188700d.mo58455c()).booleanValue();
    }
}
