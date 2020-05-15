package p000;

/* renamed from: cgqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgqn implements cgqm {

    /* renamed from: a */
    public static final bdyx f187515a;

    /* renamed from: b */
    public static final bdyx f187516b;

    /* renamed from: c */
    public static final bdyx f187517c;

    /* renamed from: d */
    public static final bdyx f187518d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187515a = bdyx.m91610a(bdyw, "Nearby__remove_google_settings_instruction", false);
        f187516b = bdyx.m91607a(bdyw, "Nearby__retry_attempts", 0L);
        f187517c = bdyx.m91610a(bdyw, "Nearby__use_connect2", false);
        f187518d = bdyx.m91610a(bdyw, "Nearby__use_real_target_device_type", false);
    }

    /* renamed from: a */
    public final boolean mo84281a() {
        return ((Boolean) f187515a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo84282b() {
        return ((Long) f187516b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo84283c() {
        return ((Boolean) f187517c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84284d() {
        return ((Boolean) f187518d.mo58455c()).booleanValue();
    }
}
