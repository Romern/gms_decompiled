package p000;

/* renamed from: cesd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesd implements cesc {
    public static final bdyx activityRecognitionRuntimeOp;
    public static final bdyx activityRecognitionRuntimePermission;
    public static final bdyx activityRecognitionRuntimePermissionWhitelist;
    public static final bdyx addClientListenerByDefaultV27;
    public static final bdyx checkPermissionBeforeNoteopV27;
    public static final bdyx enableActivityRecognitionRuntimePermission;
    public static final bdyx enableNoteopForActivityReport;

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
        activityRecognitionRuntimeOp = bdyx.m91609a(a, "activity_recognition_runtime_op", "android:activity_recognition");
        activityRecognitionRuntimePermission = bdyx.m91609a(a, "activity_recognition_runtime_permission", "android.permission.ACTIVITY_RECOGNITION");
        activityRecognitionRuntimePermissionWhitelist = bdyx.m91609a(a, "activity_recognition_runtime_permission_whitelist", "");
        addClientListenerByDefaultV27 = bdyx.m91610a(a, "add_client_listener_by_default_v27", true);
        checkPermissionBeforeNoteopV27 = bdyx.m91610a(a, "check_permission_before_noteop_v27", true);
        enableActivityRecognitionRuntimePermission = bdyx.m91610a(a, "enable_activity_recognition_runtime_permission", true);
        enableNoteopForActivityReport = bdyx.m91610a(a, "enable_noteop_for_activity_report", true);
    }

    public String activityRecognitionRuntimeOp() {
        return (String) activityRecognitionRuntimeOp.mo58455c();
    }

    public String activityRecognitionRuntimePermission() {
        return (String) activityRecognitionRuntimePermission.mo58455c();
    }

    public String activityRecognitionRuntimePermissionWhitelist() {
        return (String) activityRecognitionRuntimePermissionWhitelist.mo58455c();
    }

    public boolean addClientListenerByDefaultV27() {
        return ((Boolean) addClientListenerByDefaultV27.mo58455c()).booleanValue();
    }

    public boolean checkPermissionBeforeNoteopV27() {
        return ((Boolean) checkPermissionBeforeNoteopV27.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityRecognitionRuntimePermission() {
        return ((Boolean) enableActivityRecognitionRuntimePermission.mo58455c()).booleanValue();
    }

    public boolean enableNoteopForActivityReport() {
        return ((Boolean) enableNoteopForActivityReport.mo58455c()).booleanValue();
    }
}
