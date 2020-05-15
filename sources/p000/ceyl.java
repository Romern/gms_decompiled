package p000;

/* renamed from: ceyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyl implements ceyk {
    public static final bdyx bypassDndNotificationPermissionPreOmr1;
    public static final bdyx dndNotificationChannelEnabled;
    public static final bdyx dndNotificationClearCutLogEnabled;
    public static final bdyx dndNotificationMasterSwitch;
    public static final bdyx dndNotificationSwitchTheme;
    public static final bdyx drivingModeNotificationSource;
    public static final bdyx drivingModeNotificationText;
    public static final bdyx drivingModeNotificationTitle;
    public static final bdyx enableDndNotificationDefaultImportanceChannel;
    public static final bdyx enableDrivingModeNotificationExperiment;

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
        bypassDndNotificationPermissionPreOmr1 = bdyx.m91610a(a, "bypass_dnd_notification_permission_pre_omr1", true);
        dndNotificationChannelEnabled = bdyx.m91610a(a, "dnd_notification_channel_enabled", true);
        dndNotificationClearCutLogEnabled = bdyx.m91610a(a, "dnd_notification_clear_cut_log_enabled", true);
        dndNotificationMasterSwitch = bdyx.m91610a(a, "dnd_notification_master_switch", false);
        dndNotificationSwitchTheme = bdyx.m91610a(a, "dnd_notification_switch_theme", true);
        drivingModeNotificationSource = bdyx.m91609a(a, "driving_mode_notification_source", "");
        drivingModeNotificationText = bdyx.m91609a(a, "driving_mode_notification_text", "");
        drivingModeNotificationTitle = bdyx.m91609a(a, "driving_mode_notification_title", "");
        enableDndNotificationDefaultImportanceChannel = bdyx.m91610a(a, "enable_dnd_notification_default_importance_channel", true);
        enableDrivingModeNotificationExperiment = bdyx.m91610a(a, "enable_driving_mode_notification_experiment", false);
    }

    public boolean bypassDndNotificationPermissionPreOmr1() {
        return ((Boolean) bypassDndNotificationPermissionPreOmr1.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean dndNotificationChannelEnabled() {
        return ((Boolean) dndNotificationChannelEnabled.mo58455c()).booleanValue();
    }

    public boolean dndNotificationClearCutLogEnabled() {
        return ((Boolean) dndNotificationClearCutLogEnabled.mo58455c()).booleanValue();
    }

    public boolean dndNotificationMasterSwitch() {
        return ((Boolean) dndNotificationMasterSwitch.mo58455c()).booleanValue();
    }

    public boolean dndNotificationSwitchTheme() {
        return ((Boolean) dndNotificationSwitchTheme.mo58455c()).booleanValue();
    }

    public String drivingModeNotificationSource() {
        return (String) drivingModeNotificationSource.mo58455c();
    }

    public String drivingModeNotificationText() {
        return (String) drivingModeNotificationText.mo58455c();
    }

    public String drivingModeNotificationTitle() {
        return (String) drivingModeNotificationTitle.mo58455c();
    }

    public boolean enableDndNotificationDefaultImportanceChannel() {
        return ((Boolean) enableDndNotificationDefaultImportanceChannel.mo58455c()).booleanValue();
    }

    public boolean enableDrivingModeNotificationExperiment() {
        return ((Boolean) enableDrivingModeNotificationExperiment.mo58455c()).booleanValue();
    }
}
