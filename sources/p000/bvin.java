package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bvin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvin implements bxvp {
    UNKNOWN_DISCOVERY_EVENT(0),
    BEACON_OPT_IN_NOTIFICATION_TRIGGERED(1),
    BEACON_OPT_IN_NOTIFICATION_CLICKED(2),
    NOTIFICATION_TRIGGERED(3),
    NOTIFICATION_TIMED_OUT(4),
    NOTIFICATION_MANAGE_SETTINGS_CLICKED(5),
    NOTIFICATION_DISMISS_BACKOFF_MAXED(6),
    NOTIFICATION_GROUP_CLICKED(7),
    NOTIFICATION_GROUP_DISMISSED(8),
    NOTIFICATION_ITEM_CLICKED(9),
    NOTIFICATION_ITEM_DISMISSED(10),
    LIST_ITEM_CLICKED(11),
    LIST_ITEMS_DISABLED(12),
    LIST_ITEMS_ENABLED(13),
    LIST_VIEW_LAUNCHED(14),
    LIST_VIEW_OPT_IN_DIALOG_POSITIVE(15),
    LIST_VIEW_OPT_IN_DIALOG_NEGATIVE(16),
    LIST_VIEW_REFRESHED(17),
    LIST_VIEW_HELP_LINK_CLICKED(18),
    NOTIFICATION_SETTINGS_LAUNCHED(19),
    NOTIFICATION_SETTINGS_ENABLED(20),
    NOTIFICATION_SETTINGS_DISABLED(21),
    APP_INSTALLED(22),
    LIST_VIEW_NOTIFICATION_SETTINGS_CLICKED(23),
    PERMISSION_DIALOG_TRIGGERED(24),
    PERMISSION_DIALOG_POSITIVE(25),
    PERMISSION_DIALOG_NEGATIVE(26),
    REDIRECTED_TO_PLAYSTORE(27),
    DATA_CLEARED(28),
    GOOGLE_SETTING_CLICKED(29),
    NETWORK_UNAVAILABLE(30),
    TILE_ADDED(31),
    TILE_REMOVED(32),
    TILE_CLICKED(33),
    NOTIFICATION_DISABLED(34),
    LIST_VIEW_EXIT(35),
    LIST_VIEW_LAUNCHED_FROM_HOME_SCREEN(36),
    LIST_VIEW_LAUNCHED_FROM_NOTIFICATION(37),
    LIST_VIEW_LAUNCHED_FROM_QS_TILE(38),
    LIST_VIEW_AUTO_REFRESHED(39),
    HOME_SCREEN_ICON_ADDED(40),
    HOME_SCREEN_ICON_OVERFLOW_ADDED(41),
    HOME_SCREEN_ICON_WW_ACCEPTED(42),
    HOME_SCREEN_ICON_WW_REJECTED(43),
    BEACON_OPT_IN_NOTIFICATION_TIMED_OUT(44),
    BEACON_OPT_IN_NOTIFICATION_DISMISSED(45),
    NOTIFICATION_MASTER_SWITCH_ENABLED(46),
    NOTIFICATION_MASTER_SWITCH_DISABLED(47),
    CHROME_CUSTOM_TAB_START(48),
    CHROME_CUSTOM_TAB_FINISH(49),
    MAGIC_PAIR_PAIRING_NOTIFICATION_DISMISSED(50),
    BLUETOOTH_BONDING(57),
    ITEM_AUTO_LAUNCHED(51),
    LIST_ITEM_VIEWED(52),
    WEB_URL_LAUNCHED_IN_BROWSER(53),
    NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICKED(54),
    CHROME_CUSTOM_TAB_REPORT_CLICKED(55),
    MAGIC_PAIR_POST_COMPLETION_INTENT_LAUNCHED(56),
    REPORT_ABUSE_SUBMITTED(58),
    SNACKBAR_REPORT_CLICKED(59),
    DEVICES_LIST_VIEW_LAUNCHED_FROM_SETTINGS(60),
    DEVICES_LIST_VIEW_LAUNCHED_FROM_NOTIFICATION(61),
    DEVICES_LIST_VIEW_EXIT(62),
    DEVICES_LIST_ITEM_VIEWED(63),
    DEVICES_LIST_ITEM_CLICKED(64),
    DEVICES_LIST_VIEW_ACTION_BAR_HELP_LINK_CLICKED(66),
    DEVICES_LIST_VIEW_NOTIFICATIONS_TOGGLED(73),
    FAST_PAIR_ACCOUNT_SETTINGS_ACTION_BAR_HELP_LINK_CLICKED(74),
    DEVICE_NOTIFICATION_SETTINGS_ENABLED(75),
    DEVICE_NOTIFICATION_SETTINGS_DISABLED(76),
    BLUETOOTH_BATTERY_LEVEL_TOAST_SHOWN(77),
    FIND_MY_ACCESSORY_UPLOADED(78),
    FAST_PAIR_ACCOUNT_SETTINGS_LAUNCHED(79),
    FAST_PAIR_ACCOUNT_SETTINGS_SWITCHED(80),
    FAST_PAIR_ACCOUNT_SETTINGS_SAVE_DISABLED(81),
    FAST_PAIR_ACCOUNT_SETTINGS_SAVE_ENABLED(82),
    FAST_PAIR_ACCOUNT_SETTINGS_DEVICE_ITEM_LAUNCHED(83),
    FAST_PAIR_DEVICE_RENAMED(84),
    FAST_PAIR_DEVICE_FORGOTTEN(85),
    FAST_PAIR_DEVICE_FIND_DEVICE_CLICKED(86),
    FAST_PAIR_DEVICE_INSTALL_COMPANION_APP_CLICKED(87),
    FAST_PAIR_DEVICE_OPEN_COMPANION_APP_CLICKED(88),
    FAST_PAIR_DEVICE_SLICE_ITEM_CLICKED(89),
    FAST_PAIR_FIND_DEVICE_LAUNCHED(90),
    FAST_PAIR_FIND_DEVICE_RING_CLICKED(91),
    FAST_PAIR_FIND_DEVICE_MUTE_CLICKED(92),
    FAST_PAIR_FIND_DEVICE_RING_LEFT_CLICKED(93),
    FAST_PAIR_FIND_DEVICE_RING_RIGHT_CLICKED(94),
    FAST_PAIR_FIND_DEVICE_MUTE_LEFT_CLICKED(95),
    FAST_PAIR_FIND_DEVICE_MUTE_RIGHT_CLICKED(96),
    FAST_PAIR_FIND_DEVICE_HISTORY_CLICKED(97),
    FAST_PAIR_CONNECTED_DEVICE_SLICE_QUERIED(98),
    FAST_PAIR_OPTIONAL_MODULE_REQUEST_SUCCEEDED(99),
    FAST_PAIR_OPTIONAL_MODULE_REQUEST_FAILED(100),
    FAST_PAIR_OPTIONAL_MODULE_ENABLED(101),
    FAST_PAIR_DEVICE_DETECTED_WITH_MODEL_ID(102),
    FAST_PAIR_DEVICE_DETECTED_WITH_BLOOM_FILTER(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    FAST_PAIR_LOCAL_DB_CACHE_HIT(ErrorInfo.TYPE_SDU_FAILED),
    FAST_PAIR_DEVICE_INFO_SERVER_REQUEST_SENT(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    FAST_PAIR_DEVICE_INFO_SERVER_ERROR_RESPONSE(106),
    FAST_PAIR_DEVICE_INFO_SERVER_RESPONSE_RECEIVED(107),
    FAST_PAIR_NOTIFICATION_SHOWN(108),
    FAST_PAIR_NOTIFICATION_DISMISSED(109),
    FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED(110),
    FAST_PAIR_NOTIFICATION_TIMEOUT(111),
    FAST_PAIR_AUTO_LAUNCH_TRIGGERED(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS),
    FAST_PAIR_NOTIFICATION_CLICKED(113),
    FAST_PAIR_BATTERY_NOTIFICATION_SHOWN(114),
    FAST_PAIR_BATTERY_NOTIFICATION_DISMISSED(115),
    FAST_PAIR_BATTERY_NOTIFICATION_CLICKED(116),
    FAST_PAIR_BATTERY_NOTIFICATION_DISPLAYED_SMART_BATTERY(117),
    FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED(118),
    FAST_PAIR_POST_ACTION_NOTIFICATION_SHOWN(119),
    FAST_PAIR_POST_ACTION_INSTALL_COMPANION_APP(120),
    FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP(121),
    FAST_PAIR_DEVICE_COMPANION_OOBE_CLICKED(122),
    FAST_PAIR_DEVICE_COMPANION_SETTINGS_CLICKED(123),
    FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_SHOWN(124),
    FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DISMISSED(125),
    FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DO_NOT_SHOW_CLICKED(126),
    FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_TIMEOUT(127),
    FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_CLICKED(128),
    FAST_PAIR_POST_ACTION_DISMISS_COMPANION_APP(129),
    FAST_PAIR_OFFLINE_SERVICE_CACHE_HIT(130),
    FAST_PAIR_LOW_BATTERY_NOTIFICATION_SHOWN(131);
    

    /* renamed from: bv */
    public final int f156289bv;

    private bvin(int i) {
        this.f156289bv = i;
    }

    /* renamed from: a */
    public static bvin m121150a(int i) {
        if (i == 66) {
            return DEVICES_LIST_VIEW_ACTION_BAR_HELP_LINK_CLICKED;
        }
        switch (i) {
            case 0:
                return UNKNOWN_DISCOVERY_EVENT;
            case 1:
                return BEACON_OPT_IN_NOTIFICATION_TRIGGERED;
            case 2:
                return BEACON_OPT_IN_NOTIFICATION_CLICKED;
            case 3:
                return NOTIFICATION_TRIGGERED;
            case 4:
                return NOTIFICATION_TIMED_OUT;
            case 5:
                return NOTIFICATION_MANAGE_SETTINGS_CLICKED;
            case 6:
                return NOTIFICATION_DISMISS_BACKOFF_MAXED;
            case 7:
                return NOTIFICATION_GROUP_CLICKED;
            case 8:
                return NOTIFICATION_GROUP_DISMISSED;
            case 9:
                return NOTIFICATION_ITEM_CLICKED;
            case 10:
                return NOTIFICATION_ITEM_DISMISSED;
            case 11:
                return LIST_ITEM_CLICKED;
            case 12:
                return LIST_ITEMS_DISABLED;
            case 13:
                return LIST_ITEMS_ENABLED;
            case 14:
                return LIST_VIEW_LAUNCHED;
            case 15:
                return LIST_VIEW_OPT_IN_DIALOG_POSITIVE;
            case 16:
                return LIST_VIEW_OPT_IN_DIALOG_NEGATIVE;
            case 17:
                return LIST_VIEW_REFRESHED;
            case 18:
                return LIST_VIEW_HELP_LINK_CLICKED;
            case 19:
                return NOTIFICATION_SETTINGS_LAUNCHED;
            case 20:
                return NOTIFICATION_SETTINGS_ENABLED;
            case 21:
                return NOTIFICATION_SETTINGS_DISABLED;
            case 22:
                return APP_INSTALLED;
            case 23:
                return LIST_VIEW_NOTIFICATION_SETTINGS_CLICKED;
            case 24:
                return PERMISSION_DIALOG_TRIGGERED;
            case 25:
                return PERMISSION_DIALOG_POSITIVE;
            case 26:
                return PERMISSION_DIALOG_NEGATIVE;
            case 27:
                return REDIRECTED_TO_PLAYSTORE;
            case 28:
                return DATA_CLEARED;
            case 29:
                return GOOGLE_SETTING_CLICKED;
            case 30:
                return NETWORK_UNAVAILABLE;
            case 31:
                return TILE_ADDED;
            case 32:
                return TILE_REMOVED;
            case 33:
                return TILE_CLICKED;
            case 34:
                return NOTIFICATION_DISABLED;
            case 35:
                return LIST_VIEW_EXIT;
            case 36:
                return LIST_VIEW_LAUNCHED_FROM_HOME_SCREEN;
            case FelicaException.TYPE_NOT_CLOSED:
                return LIST_VIEW_LAUNCHED_FROM_NOTIFICATION;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return LIST_VIEW_LAUNCHED_FROM_QS_TILE;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return LIST_VIEW_AUTO_REFRESHED;
            case FelicaException.TYPE_PUSH_FAILED:
                return HOME_SCREEN_ICON_ADDED;
            case 41:
                return HOME_SCREEN_ICON_OVERFLOW_ADDED;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return HOME_SCREEN_ICON_WW_ACCEPTED;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return HOME_SCREEN_ICON_WW_REJECTED;
            case FelicaException.TYPE_RESET_FAILED:
                return BEACON_OPT_IN_NOTIFICATION_TIMED_OUT;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return BEACON_OPT_IN_NOTIFICATION_DISMISSED;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return NOTIFICATION_MASTER_SWITCH_ENABLED;
            case 47:
                return NOTIFICATION_MASTER_SWITCH_DISABLED;
            case 48:
                return CHROME_CUSTOM_TAB_START;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return CHROME_CUSTOM_TAB_FINISH;
            case 50:
                return MAGIC_PAIR_PAIRING_NOTIFICATION_DISMISSED;
            case 51:
                return ITEM_AUTO_LAUNCHED;
            case 52:
                return LIST_ITEM_VIEWED;
            case 53:
                return WEB_URL_LAUNCHED_IN_BROWSER;
            case 54:
                return NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICKED;
            case 55:
                return CHROME_CUSTOM_TAB_REPORT_CLICKED;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return MAGIC_PAIR_POST_COMPLETION_INTENT_LAUNCHED;
            case 57:
                return BLUETOOTH_BONDING;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return REPORT_ABUSE_SUBMITTED;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return SNACKBAR_REPORT_CLICKED;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return DEVICES_LIST_VIEW_LAUNCHED_FROM_SETTINGS;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return DEVICES_LIST_VIEW_LAUNCHED_FROM_NOTIFICATION;
            case 62:
                return DEVICES_LIST_VIEW_EXIT;
            case 63:
                return DEVICES_LIST_ITEM_VIEWED;
            case 64:
                return DEVICES_LIST_ITEM_CLICKED;
            default:
                switch (i) {
                    case 73:
                        return DEVICES_LIST_VIEW_NOTIFICATIONS_TOGGLED;
                    case 74:
                        return FAST_PAIR_ACCOUNT_SETTINGS_ACTION_BAR_HELP_LINK_CLICKED;
                    case 75:
                        return DEVICE_NOTIFICATION_SETTINGS_ENABLED;
                    case 76:
                        return DEVICE_NOTIFICATION_SETTINGS_DISABLED;
                    case 77:
                        return BLUETOOTH_BATTERY_LEVEL_TOAST_SHOWN;
                    case 78:
                        return FIND_MY_ACCESSORY_UPLOADED;
                    case KeyInformation.AES128:
                        return FAST_PAIR_ACCOUNT_SETTINGS_LAUNCHED;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE:
                        return FAST_PAIR_ACCOUNT_SETTINGS_SWITCHED;
                    case 81:
                        return FAST_PAIR_ACCOUNT_SETTINGS_SAVE_DISABLED;
                    case 82:
                        return FAST_PAIR_ACCOUNT_SETTINGS_SAVE_ENABLED;
                    case 83:
                        return FAST_PAIR_ACCOUNT_SETTINGS_DEVICE_ITEM_LAUNCHED;
                    case 84:
                        return FAST_PAIR_DEVICE_RENAMED;
                    case 85:
                        return FAST_PAIR_DEVICE_FORGOTTEN;
                    case 86:
                        return FAST_PAIR_DEVICE_FIND_DEVICE_CLICKED;
                    case 87:
                        return FAST_PAIR_DEVICE_INSTALL_COMPANION_APP_CLICKED;
                    case 88:
                        return FAST_PAIR_DEVICE_OPEN_COMPANION_APP_CLICKED;
                    case 89:
                        return FAST_PAIR_DEVICE_SLICE_ITEM_CLICKED;
                    case 90:
                        return FAST_PAIR_FIND_DEVICE_LAUNCHED;
                    case 91:
                        return FAST_PAIR_FIND_DEVICE_RING_CLICKED;
                    case 92:
                        return FAST_PAIR_FIND_DEVICE_MUTE_CLICKED;
                    case 93:
                        return FAST_PAIR_FIND_DEVICE_RING_LEFT_CLICKED;
                    case 94:
                        return FAST_PAIR_FIND_DEVICE_RING_RIGHT_CLICKED;
                    case 95:
                        return FAST_PAIR_FIND_DEVICE_MUTE_LEFT_CLICKED;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME:
                        return FAST_PAIR_FIND_DEVICE_MUTE_RIGHT_CLICKED;
                    case 97:
                        return FAST_PAIR_FIND_DEVICE_HISTORY_CLICKED;
                    case 98:
                        return FAST_PAIR_CONNECTED_DEVICE_SLICE_QUERIED;
                    case 99:
                        return FAST_PAIR_OPTIONAL_MODULE_REQUEST_SUCCEEDED;
                    case 100:
                        return FAST_PAIR_OPTIONAL_MODULE_REQUEST_FAILED;
                    case 101:
                        return FAST_PAIR_OPTIONAL_MODULE_ENABLED;
                    case 102:
                        return FAST_PAIR_DEVICE_DETECTED_WITH_MODEL_ID;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return FAST_PAIR_DEVICE_DETECTED_WITH_BLOOM_FILTER;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        return FAST_PAIR_LOCAL_DB_CACHE_HIT;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        return FAST_PAIR_DEVICE_INFO_SERVER_REQUEST_SENT;
                    case 106:
                        return FAST_PAIR_DEVICE_INFO_SERVER_ERROR_RESPONSE;
                    case 107:
                        return FAST_PAIR_DEVICE_INFO_SERVER_RESPONSE_RECEIVED;
                    case 108:
                        return FAST_PAIR_NOTIFICATION_SHOWN;
                    case 109:
                        return FAST_PAIR_NOTIFICATION_DISMISSED;
                    case 110:
                        return FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED;
                    case 111:
                        return FAST_PAIR_NOTIFICATION_TIMEOUT;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS:
                        return FAST_PAIR_AUTO_LAUNCH_TRIGGERED;
                    case 113:
                        return FAST_PAIR_NOTIFICATION_CLICKED;
                    case 114:
                        return FAST_PAIR_BATTERY_NOTIFICATION_SHOWN;
                    case 115:
                        return FAST_PAIR_BATTERY_NOTIFICATION_DISMISSED;
                    case 116:
                        return FAST_PAIR_BATTERY_NOTIFICATION_CLICKED;
                    case 117:
                        return FAST_PAIR_BATTERY_NOTIFICATION_DISPLAYED_SMART_BATTERY;
                    case 118:
                        return FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED;
                    case 119:
                        return FAST_PAIR_POST_ACTION_NOTIFICATION_SHOWN;
                    case 120:
                        return FAST_PAIR_POST_ACTION_INSTALL_COMPANION_APP;
                    case 121:
                        return FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP;
                    case 122:
                        return FAST_PAIR_DEVICE_COMPANION_OOBE_CLICKED;
                    case 123:
                        return FAST_PAIR_DEVICE_COMPANION_SETTINGS_CLICKED;
                    case 124:
                        return FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_SHOWN;
                    case 125:
                        return FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DISMISSED;
                    case 126:
                        return FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DO_NOT_SHOW_CLICKED;
                    case 127:
                        return FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_TIMEOUT;
                    case 128:
                        return FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_CLICKED;
                    case 129:
                        return FAST_PAIR_POST_ACTION_DISMISS_COMPANION_APP;
                    case 130:
                        return FAST_PAIR_OFFLINE_SERVICE_CACHE_HIT;
                    case 131:
                        return FAST_PAIR_LOW_BATTERY_NOTIFICATION_SHOWN;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121151b() {
        return bvim.f156162a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156289bv;
    }

    public final String toString() {
        return Integer.toString(this.f156289bv);
    }
}
