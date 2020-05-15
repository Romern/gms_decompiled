package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: btzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btzc implements bxvp {
    UNKNOWN_UI_ACTION(0),
    DRIVING_MODE_SETTINGS(1),
    DRIVING_MODE_BEHAVIOR_SETTINGS(2),
    DRIVING_MODE_MANUAL_TOGGLE_ENABLED(3),
    DRIVING_MODE_MANUAL_TOGGLE_DISABLED(4),
    DRIVING_MODE_PREFERENCE_GEAR_CLICKED(5),
    DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION(6),
    DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH(7),
    DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION(8),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING(9),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH(10),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE(11),
    DRIVING_MODE_AUTOMATIC_RULES_SETTINGS(12),
    DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW(13),
    DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT(14),
    DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL(15),
    DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE(16),
    DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS(17),
    DRIVING_MODE_START_GEARHEAD_BEHAVIOR(18),
    DRIVING_MODE_START_DND_BEHAVIOR(19),
    DRIVING_MODE_START_THIRDPARTY_BEHAVIOR(20),
    DRIVING_MODE_START_EMPTY_BEHAVIOR(21),
    DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR(22),
    DRIVING_MODE_STOP_DND_BEHAVIOR(23),
    DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR(24),
    DRIVING_MODE_STOP_EMPTY_BEHAVIOR(25),
    DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES(26),
    DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT(27),
    DRIVING_MODE_SETTINGS_FROM_SEARCH(28),
    DRIVING_MODE_START_MORRIS_BEHAVIOR(29),
    DRIVING_MODE_STOP_MORRIS_BEHAVIOR(30),
    DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS(31),
    DRIVING_MODE_FRX_NEXT_BUTTON(100),
    DRIVING_MODE_FRX_BACK_BUTTON(101),
    DRIVING_MODE_FRX_TERTIARY_BUTTON(102),
    DRIVING_MODE_FRX_SWITCH_TOGGLED(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    DRIVING_MODE_FRX_READY(ErrorInfo.TYPE_SDU_FAILED),
    DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX(106),
    DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION(107);
    

    /* renamed from: O */
    public final int f153091O;

    private btzc(int i) {
        this.f153091O = i;
    }

    /* renamed from: a */
    public static btzc m119033a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UI_ACTION;
            case 1:
                return DRIVING_MODE_SETTINGS;
            case 2:
                return DRIVING_MODE_BEHAVIOR_SETTINGS;
            case 3:
                return DRIVING_MODE_MANUAL_TOGGLE_ENABLED;
            case 4:
                return DRIVING_MODE_MANUAL_TOGGLE_DISABLED;
            case 5:
                return DRIVING_MODE_PREFERENCE_GEAR_CLICKED;
            case 6:
                return DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION;
            case 7:
                return DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH;
            case 8:
                return DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION;
            case 9:
                return DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING;
            case 10:
                return DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH;
            case 11:
                return DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE;
            case 12:
                return DRIVING_MODE_AUTOMATIC_RULES_SETTINGS;
            case 13:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW;
            case 14:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT;
            case 15:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL;
            case 16:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE;
            case 17:
                return DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS;
            case 18:
                return DRIVING_MODE_START_GEARHEAD_BEHAVIOR;
            case 19:
                return DRIVING_MODE_START_DND_BEHAVIOR;
            case 20:
                return DRIVING_MODE_START_THIRDPARTY_BEHAVIOR;
            case 21:
                return DRIVING_MODE_START_EMPTY_BEHAVIOR;
            case 22:
                return DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR;
            case 23:
                return DRIVING_MODE_STOP_DND_BEHAVIOR;
            case 24:
                return DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR;
            case 25:
                return DRIVING_MODE_STOP_EMPTY_BEHAVIOR;
            case 26:
                return DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES;
            case 27:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT;
            case 28:
                return DRIVING_MODE_SETTINGS_FROM_SEARCH;
            case 29:
                return DRIVING_MODE_START_MORRIS_BEHAVIOR;
            case 30:
                return DRIVING_MODE_STOP_MORRIS_BEHAVIOR;
            case 31:
                return DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS;
            default:
                switch (i) {
                    case 100:
                        return DRIVING_MODE_FRX_NEXT_BUTTON;
                    case 101:
                        return DRIVING_MODE_FRX_BACK_BUTTON;
                    case 102:
                        return DRIVING_MODE_FRX_TERTIARY_BUTTON;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return DRIVING_MODE_FRX_SWITCH_TOGGLED;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        return DRIVING_MODE_FRX_READY;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        return DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS;
                    case 106:
                        return DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX;
                    case 107:
                        return DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m119034b() {
        return btzb.f153049a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153091O;
    }

    public final String toString() {
        return Integer.toString(this.f153091O);
    }
}
