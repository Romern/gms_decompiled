package p000;

/* renamed from: cfrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrn implements cfrm {

    /* renamed from: a */
    public static final bdyx f185516a;

    /* renamed from: b */
    public static final bdyx f185517b;

    /* renamed from: c */
    public static final bdyx f185518c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185516a = bdyx.m91610a(a, "Config__enable_udc_js_bridge", true);
        bdyx.m91607a(a, "UdcBridge__facs_cache_task_timeout_ms", 10000L);
        f185517b = bdyx.m91609a(a, "Config__udc_js_bridge_blacklist_regex", "");
        f185518c = bdyx.m91609a(a, "Config__udc_js_bridge_whitelist_regex", "https://myaccount\\.google\\.com/embedded/activitycontrols.*");
        bdyx.m91610a(a, "UdcBridge__ulr_device_information_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo82570a() {
        return ((Boolean) f185516a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo82571b() {
        return (String) f185517b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82572c() {
        return (String) f185518c.mo58455c();
    }
}
