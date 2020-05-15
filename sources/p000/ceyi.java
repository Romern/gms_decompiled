package p000;

/* renamed from: ceyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyi implements ceyh {
    public static final bdyx addDndRuleOnBind;
    public static final bdyx autoDismissNotificationOnVehicleExit;
    public static final bdyx dndClearCutLogEnabled;
    public static final bdyx dndDefaultInterruption;
    public static final bdyx enableDndNotificationBroadcast;
    public static final bdyx enableDrivingModeGoogleSetting;
    public static final bdyx enableDrivingModeInConnectedDeviceSetting;
    public static final bdyx enableDrivingModeLaunchOneTapNotification;
    public static final bdyx enableDrivingModeLocationClearCutLog;
    public static final bdyx morrisBroadcastIntent;
    public static final bdyx morrisPackageName;
    public static final bdyx removeDndRuleUponDrivingModeTurnedOff;
    public static final bdyx routeDndRuleToDrivingModeForAuto;
    public static final bdyx showDndBehavior;

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
        addDndRuleOnBind = bdyx.m91610a(a, "add_dnd_rule_on_bind", false);
        autoDismissNotificationOnVehicleExit = bdyx.m91610a(a, "auto_dismiss_notification_on_vehicle_exit", true);
        dndClearCutLogEnabled = bdyx.m91610a(a, "dnd_clear_cut_log_enabled", true);
        dndDefaultInterruption = bdyx.m91607a(a, "dnd_default_interruption", 2L);
        enableDndNotificationBroadcast = bdyx.m91610a(a, "enable_dnd_notification_broadcast", false);
        enableDrivingModeGoogleSetting = bdyx.m91610a(a, "enable_driving_mode_google_setting", false);
        enableDrivingModeInConnectedDeviceSetting = bdyx.m91610a(a, "enable_driving_mode_in_connected_device_setting", true);
        enableDrivingModeLaunchOneTapNotification = bdyx.m91610a(a, "enable_driving_mode_launch_one_tap_notification", true);
        enableDrivingModeLocationClearCutLog = bdyx.m91610a(a, "enable_driving_mode_location_clear_cut_log", false);
        morrisBroadcastIntent = bdyx.m91609a(a, "morris_broadcast_intent", "com.google.android.apps.gsa.morris.INTENT_ACTION_ENTER_DRIVING_MODE");
        morrisPackageName = bdyx.m91609a(a, "morris_package_name", "com.google.android.apps.gsa.staticplugins.opa.morris");
        removeDndRuleUponDrivingModeTurnedOff = bdyx.m91610a(a, "remove_dnd_rule_upon_driving_mode_turned_off", true);
        routeDndRuleToDrivingModeForAuto = bdyx.m91610a(a, "route_dnd_rule_to_driving_mode_for_auto", true);
        showDndBehavior = bdyx.m91610a(a, "show_dnd_behavior", true);
    }

    public boolean addDndRuleOnBind() {
        return ((Boolean) addDndRuleOnBind.mo58455c()).booleanValue();
    }

    public boolean autoDismissNotificationOnVehicleExit() {
        return ((Boolean) autoDismissNotificationOnVehicleExit.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean dndClearCutLogEnabled() {
        return ((Boolean) dndClearCutLogEnabled.mo58455c()).booleanValue();
    }

    public long dndDefaultInterruption() {
        return ((Long) dndDefaultInterruption.mo58455c()).longValue();
    }

    public boolean enableDndNotificationBroadcast() {
        return ((Boolean) enableDndNotificationBroadcast.mo58455c()).booleanValue();
    }

    public boolean enableDrivingModeGoogleSetting() {
        return ((Boolean) enableDrivingModeGoogleSetting.mo58455c()).booleanValue();
    }

    public boolean enableDrivingModeInConnectedDeviceSetting() {
        return ((Boolean) enableDrivingModeInConnectedDeviceSetting.mo58455c()).booleanValue();
    }

    public boolean enableDrivingModeLaunchOneTapNotification() {
        return ((Boolean) enableDrivingModeLaunchOneTapNotification.mo58455c()).booleanValue();
    }

    public boolean enableDrivingModeLocationClearCutLog() {
        return ((Boolean) enableDrivingModeLocationClearCutLog.mo58455c()).booleanValue();
    }

    public String morrisBroadcastIntent() {
        return (String) morrisBroadcastIntent.mo58455c();
    }

    public String morrisPackageName() {
        return (String) morrisPackageName.mo58455c();
    }

    public boolean removeDndRuleUponDrivingModeTurnedOff() {
        return ((Boolean) removeDndRuleUponDrivingModeTurnedOff.mo58455c()).booleanValue();
    }

    public boolean routeDndRuleToDrivingModeForAuto() {
        return ((Boolean) routeDndRuleToDrivingModeForAuto.mo58455c()).booleanValue();
    }

    public boolean showDndBehavior() {
        return ((Boolean) showDndBehavior.mo58455c()).booleanValue();
    }
}
