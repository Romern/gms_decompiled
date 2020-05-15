package p000;

/* renamed from: ccwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwu implements ccwt {

    /* renamed from: a */
    public static final bdyx f180123a;

    /* renamed from: b */
    public static final bdyx f180124b;

    /* renamed from: c */
    public static final bdyx f180125c;

    /* renamed from: d */
    public static final bdyx f180126d;

    /* renamed from: e */
    public static final bdyx f180127e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180123a = bdyx.m91610a(bdyw, "WirelessProjection__is_developer_settings_wifi_projection_enabled", true);
        f180124b = bdyx.m91610a(bdyw, "is_wifi_projection_enabled", false);
        f180125c = bdyx.m91610a(bdyw, "WirelessProjection__socket_no_delay_enabled", false);
        f180126d = bdyx.m91607a(bdyw, "WirelessProjection__socket_send_buffer_size", 0L);
        f180127e = bdyx.m91607a(bdyw, "WirelessProjection__socket_so_timeout", 10000L);
    }

    /* renamed from: a */
    public final boolean mo76954a() {
        return ((Boolean) f180123a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76955b() {
        return ((Boolean) f180124b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76956c() {
        return ((Boolean) f180125c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76957d() {
        return ((Long) f180126d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76958e() {
        return ((Long) f180127e.mo58455c()).longValue();
    }
}
