package p000;

/* renamed from: ccfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfu implements ccft {

    /* renamed from: a */
    public static final bdyx f178883a;

    /* renamed from: b */
    public static final bdyx f178884b;

    /* renamed from: c */
    public static final bdyx f178885c;

    /* renamed from: d */
    public static final bdyx f178886d;

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
        f178883a = bdyx.m91610a(a, "UnifiedSetup__check_easy_unlock_client_supported_bit", true);
        f178884b = bdyx.m91610a(a, "UnifiedSetup__grandfathered_status_from_shared_preferences", false);
        f178885c = bdyx.m91610a(a, "UnifiedSetup__is_certified_easy_unlock_host", false);
        bdyx.m91610a(a, "readDevicesFromDeviceSyncApi", true);
        f178886d = bdyx.m91607a(a, "reportFeatureSupportTimeoutSec", 90L);
    }

    /* renamed from: a */
    public final boolean mo75868a() {
        return ((Boolean) f178883a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75869b() {
        return ((Boolean) f178884b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75870c() {
        return ((Boolean) f178885c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo75871d() {
        return ((Long) f178886d.mo58455c()).longValue();
    }
}
