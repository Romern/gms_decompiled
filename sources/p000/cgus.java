package p000;

/* renamed from: cgus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgus implements cgur {

    /* renamed from: a */
    public static final bdyx f187784a;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_data_app_anr", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_data_app_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_data_app_native_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_app_anr", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_app_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_app_native_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_SYSTEM_CRASH_REPORT", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_SYSTEM_LAST_KMSG", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_server_anr", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_server_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_server_native_crash", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_system_server_watchdog", false);
        bdyx.m91610a(a, "clearcut_dropbox_background_allowed_SYTEM_TOMBSTONE", false);
        f187784a = bdyx.m91610a(a, "fix_get_qos_tier", false);
    }

    /* renamed from: a */
    public final boolean mo84513a() {
        return ((Boolean) f187784a.mo58455c()).booleanValue();
    }
}
