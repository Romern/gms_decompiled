package p000;

/* renamed from: cfaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfaf implements cfae {
    public static final bdyx minimumDialogShowingIntervalMillis;
    public static final bdyx onlyShowDialogWhenSettingsOnForeground;
    public static final bdyx showWifiScanningConsentDialogPreP;
    public static final bdyx wifiScanningConsentDialogPrePAri;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        minimumDialogShowingIntervalMillis = bdyx.m91607a(a, "ScanningSettingsPreP__minimum_dialog_showing_interval_millis", 0L);
        onlyShowDialogWhenSettingsOnForeground = bdyx.m91610a(a, "ScanningSettingsPreP__only_show_dialog_when_settings_on_foreground", false);
        showWifiScanningConsentDialogPreP = bdyx.m91610a(a, "show_wifi_scanning_consent_dialog_pre_p", false);
        wifiScanningConsentDialogPrePAri = bdyx.m91610a(a, "wifi_scanning_consent_dialog_pre_p_ari", false);
    }

    public boolean compiled() {
        return true;
    }

    public long minimumDialogShowingIntervalMillis() {
        return ((Long) minimumDialogShowingIntervalMillis.mo58455c()).longValue();
    }

    public boolean onlyShowDialogWhenSettingsOnForeground() {
        return ((Boolean) onlyShowDialogWhenSettingsOnForeground.mo58455c()).booleanValue();
    }

    public boolean showWifiScanningConsentDialogPreP() {
        return ((Boolean) showWifiScanningConsentDialogPreP.mo58455c()).booleanValue();
    }

    public boolean wifiScanningConsentDialogPrePAri() {
        return ((Boolean) wifiScanningConsentDialogPrePAri.mo58455c()).booleanValue();
    }
}
