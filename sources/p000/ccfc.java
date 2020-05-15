package p000;

/* renamed from: ccfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfc implements ccfb {

    /* renamed from: a */
    public static final bdyx f178852a;

    /* renamed from: b */
    public static final bdyx f178853b;

    /* renamed from: c */
    public static final bdyx f178854c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_cryptauth"));
        f178852a = bdyx.m91609a(bdyw, "DeviceSync__devicesync_hostname", "cryptauthdevicesync.googleapis.com");
        f178853b = bdyx.m91610a(bdyw, "DeviceSync__enabled", false);
        f178854c = bdyx.m91609a(bdyw, "DeviceSync__gcm_authorized_entity", "16502139086");
    }

    /* renamed from: a */
    public final String mo75843a() {
        return (String) f178852a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75844b() {
        return ((Boolean) f178853b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo75845c() {
        return (String) f178854c.mo58455c();
    }
}
