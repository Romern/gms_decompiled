package p000;

/* renamed from: cezn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezn implements cezm {
    public static final bdyx passiveCollectorEnableCellChangeUpload;
    public static final bdyx passiveCollectorEnableGpsChangeUpload;
    public static final bdyx passiveCollectorEnableMovedTooFarChangeUpload;
    public static final bdyx passiveCollectorEnableWifiChangeUpload;

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
        passiveCollectorEnableCellChangeUpload = bdyx.m91610a(a, "passive_collector_enable_cell_change_upload", true);
        passiveCollectorEnableGpsChangeUpload = bdyx.m91610a(a, "passive_collector_enable_gps_change_upload", true);
        passiveCollectorEnableMovedTooFarChangeUpload = bdyx.m91610a(a, "passive_collector_enable_moved_too_far_change_upload", true);
        passiveCollectorEnableWifiChangeUpload = bdyx.m91610a(a, "passive_collector_enable_wifi_change_upload", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean passiveCollectorEnableCellChangeUpload() {
        return ((Boolean) passiveCollectorEnableCellChangeUpload.mo58455c()).booleanValue();
    }

    public boolean passiveCollectorEnableGpsChangeUpload() {
        return ((Boolean) passiveCollectorEnableGpsChangeUpload.mo58455c()).booleanValue();
    }

    public boolean passiveCollectorEnableMovedTooFarChangeUpload() {
        return ((Boolean) passiveCollectorEnableMovedTooFarChangeUpload.mo58455c()).booleanValue();
    }

    public boolean passiveCollectorEnableWifiChangeUpload() {
        return ((Boolean) passiveCollectorEnableWifiChangeUpload.mo58455c()).booleanValue();
    }
}
