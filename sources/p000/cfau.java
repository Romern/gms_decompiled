package p000;

/* renamed from: cfau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfau implements cfat {
    public static final bdyx addRttToWifiScan;
    public static final bdyx useWifiScanObjectForFlpApi;

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
        addRttToWifiScan = bdyx.m91610a(a, "rttulr", false);
        useWifiScanObjectForFlpApi = bdyx.m91610a(a, "wifiscanapi", false);
    }

    public boolean addRttToWifiScan() {
        return ((Boolean) addRttToWifiScan.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean useWifiScanObjectForFlpApi() {
        return ((Boolean) useWifiScanObjectForFlpApi.mo58455c()).booleanValue();
    }
}
