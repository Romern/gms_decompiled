package p000;

/* renamed from: cete */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cete implements cetd {
    public static final bdyx burstCollectorActiveModeEnabled;
    public static final bdyx burstCollectorPassiveModeActivityCheckEnabled;
    public static final bdyx burstCollectorPassiveModeEnabled;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        burstCollectorActiveModeEnabled = bdyx.m91610a(a, "burst_collector_active_mode_enabled", true);
        burstCollectorPassiveModeActivityCheckEnabled = bdyx.m91610a(a, "burst_collector_passive_mode_activity_check_enabled", false);
        burstCollectorPassiveModeEnabled = bdyx.m91610a(a, "burst_collector_passive_mode_enabled", true);
    }

    public boolean burstCollectorActiveModeEnabled() {
        return ((Boolean) burstCollectorActiveModeEnabled.mo58455c()).booleanValue();
    }

    public boolean burstCollectorPassiveModeActivityCheckEnabled() {
        return ((Boolean) burstCollectorPassiveModeActivityCheckEnabled.mo58455c()).booleanValue();
    }

    public boolean burstCollectorPassiveModeEnabled() {
        return ((Boolean) burstCollectorPassiveModeEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
