package p000;

/* renamed from: ccwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwc implements ccwb {

    /* renamed from: a */
    public static final bdyx f180082a;

    /* renamed from: b */
    public static final bdyx f180083b;

    /* renamed from: c */
    public static final bdyx f180084c;

    /* renamed from: d */
    public static final bdyx f180085d;

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
        f180082a = bdyx.m91610a(bdyw, "UsbStatusLoggingFeature__enable_usb_status_logging", false);
        f180083b = bdyx.m91610a(bdyw, "UsbStatusLoggingFeature__launch_startup_service_foreground", false);
        f180084c = bdyx.m91610a(bdyw, "UsbStatusLoggingFeature__monitor_usb_api_available_check_enabled", true);
        f180085d = bdyx.m91610a(bdyw, "UsbStatusLoggingFeature__monitor_usb_ping_telemetry_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76919a() {
        return ((Boolean) f180082a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76920b() {
        return ((Boolean) f180083b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76921c() {
        return ((Boolean) f180084c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76922d() {
        return ((Boolean) f180085d.mo58455c()).booleanValue();
    }
}
