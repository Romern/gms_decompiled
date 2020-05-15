package p000;

/* renamed from: ceum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceum implements ceul {
    public static final bdyx bugFixOnlyRunOnPrimaryProfile;
    public static final bdyx wifiScanNanoApp;

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
        bugFixOnlyRunOnPrimaryProfile = bdyx.m91610a(a, "ChreWifiScan__bug_fix_only_run_on_primary_profile", true);
        wifiScanNanoApp = bdyx.m91610a(a, "wfsna", false);
    }

    public boolean bugFixOnlyRunOnPrimaryProfile() {
        return ((Boolean) bugFixOnlyRunOnPrimaryProfile.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean wifiScanNanoApp() {
        return ((Boolean) wifiScanNanoApp.mo58455c()).booleanValue();
    }
}
