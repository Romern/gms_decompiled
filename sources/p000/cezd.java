package p000;

/* renamed from: cezd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezd implements cezc {
    public static final bdyx bugFixUseLifecycleCallbacksInFloorChange;
    public static final bdyx chreArLifecycleEnabled;
    public static final bdyx enableAdditionalVerboseNanoappLogging;
    public static final bdyx enableContexthubApiWrapper;
    public static final bdyx nanoAppClearcutEnabled;
    public static final bdyx nanoAppGroupList;
    public static final bdyx nanoAppMddTimeoutMs;
    public static final bdyx nanoAppNewVersionCheckPeriodSec;
    public static final bdyx nanoAppNewVersionIdleCheckPeriodSec;
    public static final bdyx nanoAppUploadEnabled;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        bugFixUseLifecycleCallbacksInFloorChange = bdyx.m91610a(a, "bug_fix_use_lifecycle_callbacks_in_floor_change", true);
        chreArLifecycleEnabled = bdyx.m91610a(a, "chre_ar_lifecycle_enabled", true);
        enableAdditionalVerboseNanoappLogging = bdyx.m91610a(a, "enable_additional_verbose_nanoapp_logging", false);
        enableContexthubApiWrapper = bdyx.m91610a(a, "enable_contexthub_api_wrapper", false);
        nanoAppClearcutEnabled = bdyx.m91610a(a, "nano_app_clearcut_enabled", false);
        nanoAppGroupList = bdyx.m91609a(a, "nano_app_group_list", "chre.nanoapps.loc,chre.nanoapps.gf,chre.nanoapps.ar,chre.nanoapps.extra,chre.nanoapps.test");
        nanoAppMddTimeoutMs = bdyx.m91607a(a, "nano_app_mdd_timeout_ms", 60000L);
        nanoAppNewVersionCheckPeriodSec = bdyx.m91607a(a, "nano_app_new_version_check_period_sec", 14400L);
        nanoAppNewVersionIdleCheckPeriodSec = bdyx.m91607a(a, "nano_app_new_version_idle_check_period_sec", 43200L);
        nanoAppUploadEnabled = bdyx.m91610a(a, "nano_app_upload_enabled", false);
    }

    public boolean bugFixUseLifecycleCallbacksInFloorChange() {
        return ((Boolean) bugFixUseLifecycleCallbacksInFloorChange.mo58455c()).booleanValue();
    }

    public boolean chreArLifecycleEnabled() {
        return ((Boolean) chreArLifecycleEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableAdditionalVerboseNanoappLogging() {
        return ((Boolean) enableAdditionalVerboseNanoappLogging.mo58455c()).booleanValue();
    }

    public boolean enableContexthubApiWrapper() {
        return ((Boolean) enableContexthubApiWrapper.mo58455c()).booleanValue();
    }

    public boolean nanoAppClearcutEnabled() {
        return ((Boolean) nanoAppClearcutEnabled.mo58455c()).booleanValue();
    }

    public String nanoAppGroupList() {
        return (String) nanoAppGroupList.mo58455c();
    }

    public long nanoAppMddTimeoutMs() {
        return ((Long) nanoAppMddTimeoutMs.mo58455c()).longValue();
    }

    public long nanoAppNewVersionCheckPeriodSec() {
        return ((Long) nanoAppNewVersionCheckPeriodSec.mo58455c()).longValue();
    }

    public long nanoAppNewVersionIdleCheckPeriodSec() {
        return ((Long) nanoAppNewVersionIdleCheckPeriodSec.mo58455c()).longValue();
    }

    public boolean nanoAppUploadEnabled() {
        return ((Boolean) nanoAppUploadEnabled.mo58455c()).booleanValue();
    }
}
