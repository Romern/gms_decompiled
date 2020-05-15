package p000;

/* renamed from: chnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chnc implements chnb {

    /* renamed from: a */
    public static final bdyx f188803a;

    /* renamed from: b */
    public static final bdyx f188804b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.wearable")).mo58445a("gms:wearable:service:");
        bdyx.m91607a(a, "ble_discover_services_after_service_changed_timeout_millis", 5000L);
        f188803a = bdyx.m91610a(a, "enable_connection_update_on_service_changed", true);
        bdyx.m91610a(a, "enable_ios_ble_central_service_refactor", true);
        f188804b = bdyx.m91610a(a, "enable_keep_system_services_when_companion_disconnected", true);
        bdyx.m91610a(a, "enable_on_service_changed_handling", false);
        bdyx.m91610a(a, "enable_reset_characteristic_update", true);
    }

    /* renamed from: a */
    public final boolean mo85367a() {
        return ((Boolean) f188803a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85368b() {
        return ((Boolean) f188804b.mo58455c()).booleanValue();
    }
}
