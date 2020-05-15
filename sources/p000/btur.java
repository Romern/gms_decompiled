package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: btur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btur implements bxvp {
    UNKNOWN_FRAGMENT(0),
    INITIAL_LOADING(25),
    ERROR(26),
    ACCOUNT_REMOVAL_NOTICE(1),
    OTHER_SUPERVISED_PLATFORMS(2),
    OTHER_UNSUPERVISED_PLATFORMS(24),
    OTHER_ALLOWED_DEVICES(27),
    NOT_ALLOWED_DEVICES(28),
    PAIRING_CODE(3),
    NEED_HELP(45),
    PASSWORD_VERIFICATION(4),
    JOIN_FAMILY(5),
    WAITING_FOR_PARENT(6),
    SUPERVISION_DISCLAIMER(7),
    PROFILE_OWNER_DISCLAIMER(46),
    PROFILE_OWNER(8),
    ADDING_MEMBER_SUPERVISION(9),
    NEXT_STEPS(10),
    DEVICE_NAME(11),
    APP_SELECTOR(12),
    REVIEW_SETTINGS(13),
    SYNC_SUPERVISION(14),
    SUPERVISION_CONFIRMATION(15),
    ALL_SET(16),
    ABOUT_SUPERVISION(17),
    ABOUT_SUPERVISION_EXIT(101),
    STOP_SUPERVISION_WARNING(18),
    STOP_SUPERVISION_COOLDOWN(19),
    STOP_SUPERVISION_LOCKDOWN(20),
    STOP_SUPERVISION_PARENT_ACCESS_CODE(21),
    STOPPING_SUPERVISION(22),
    SUPERVISION_STOPPED(23),
    ADD_SECONDARY(29),
    AUTH_ADD_PRE(30),
    PARENT_ESCALATION(31),
    PARENT_PICKER(32),
    PARENT_PASSWORD(33),
    CONSENT_INFO(34),
    SAVE_PARTIAL_CONSENT(86),
    REMOVE_SECONDARY(35),
    INITIALIZE_DEVICE_SETUP(36),
    MEMBER_REJECTION(85),
    APP_DETAILS(37),
    APP_PERMISSIONS(38),
    APP_DETAILS_READ_MORE(53),
    PERMALOCK_DISCLAIMER(47),
    GOOGLE_SERVICES(39),
    HIDE_APP_FAILED(40),
    ACCOUNT_REMOVED(41),
    UPDATING_APPS(44),
    ACCOUNT_REMOVAL(42),
    LOCAL_UNLOCK(43),
    SETTINGS_BENEFITS(48),
    SETTINGS_DISAMBIGUATION(49),
    SETTINGS_NEXT_STEPS(50),
    SETTINGS_INSTALL_FL(51),
    SETTINGS_ERROR_DIALOG(52),
    SETTINGS_NEXT_STEPS_DOWNLOADING(78),
    SETTINGS_ERROR_NO_NETWORK(82),
    SETTINGS_ERROR_FEATURE_TIMEOUT(83),
    SETTINGS_ERROR_FEATURE_FAILURE(84),
    SETTINGS_NEXT_STEPS_SHARED(87),
    SETTINGS_ERROR_KM_FEATURE_REQUEST_FAILED(98),
    SETTINGS_ERROR_KM_UNAVAILABLE_AFTER_DOWNLOAD(99),
    KIDS_HOME_PROPOSITION(96),
    KIDS_HOME_DETAILS(97),
    SELECT_CHILD_ACCOUNT(54),
    ADDITIONAL_ACCOUNTS(55),
    PARENT_SIGN_IN_PRIMER(56),
    PARENT_SIGN_IN(57),
    CHECK_PARENT_ELIGIBILITY(58),
    INITIALIZE_MEMBER_SUPERVISION(59),
    ACCOUNTS_LINKED(60),
    BLOCKING_APPS(61),
    COULDNT_BLOCK_APPS(62),
    MANAGE_SETTINGS(63),
    CONNECT_DEVICES(64),
    AUTO_INSTALL_FAMILY_LINK(65),
    LOOK_FOR_FAMILY_LINK(66),
    ERROR_GENERIC(67),
    ERROR_CANT_NOMINATE_SELF(68),
    ERROR_TOO_YOUNG(69),
    ERROR_TOO_MANY_MEMBERS(70),
    ERROR_PLAY_COUNTRY_MISMATCH(71),
    ERROR_HOH_IS_BLOCKED(72),
    ERROR_TOO_MANY_FAMILY_SWITCHES_PARENT(73),
    ERROR_TOO_MANY_FAMILY_SWITCHES_CHILD(74),
    ERROR_IS_NOT_HOH(75),
    ERROR_FAMILY_EXISTS(76),
    ERROR_LACKS_BIRTHDAY(77),
    ERROR_NOT_WHITELISTED(88),
    ERROR_IS_DASHER(89),
    ERROR_IS_CHILD(90),
    ERROR_IS_MADISON(91),
    ERROR_IS_SUPERVISED_ACCOUNT(92),
    ERROR_IS_GRIFFIN(93),
    ERROR_HOH_OF_ANOTHER_FAMILY(94),
    ERROR_IS_PARENT(95),
    ERROR_CHILD_IS_BLOCKED(100),
    ACCOUNT_SWITCH_NEEDED(79),
    ERROR_UNMET_PRECONDITION_CHILD(80),
    ERROR_UNMET_PRECONDITION_PARENT(81);
    

    /* renamed from: aY */
    public final int f150618aY;

    private btur(int i) {
        this.f150618aY = i;
    }

    /* renamed from: a */
    public static btur m117163a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FRAGMENT;
            case 1:
                return ACCOUNT_REMOVAL_NOTICE;
            case 2:
                return OTHER_SUPERVISED_PLATFORMS;
            case 3:
                return PAIRING_CODE;
            case 4:
                return PASSWORD_VERIFICATION;
            case 5:
                return JOIN_FAMILY;
            case 6:
                return WAITING_FOR_PARENT;
            case 7:
                return SUPERVISION_DISCLAIMER;
            case 8:
                return PROFILE_OWNER;
            case 9:
                return ADDING_MEMBER_SUPERVISION;
            case 10:
                return NEXT_STEPS;
            case 11:
                return DEVICE_NAME;
            case 12:
                return APP_SELECTOR;
            case 13:
                return REVIEW_SETTINGS;
            case 14:
                return SYNC_SUPERVISION;
            case 15:
                return SUPERVISION_CONFIRMATION;
            case 16:
                return ALL_SET;
            case 17:
                return ABOUT_SUPERVISION;
            case 18:
                return STOP_SUPERVISION_WARNING;
            case 19:
                return STOP_SUPERVISION_COOLDOWN;
            case 20:
                return STOP_SUPERVISION_LOCKDOWN;
            case 21:
                return STOP_SUPERVISION_PARENT_ACCESS_CODE;
            case 22:
                return STOPPING_SUPERVISION;
            case 23:
                return SUPERVISION_STOPPED;
            case 24:
                return OTHER_UNSUPERVISED_PLATFORMS;
            case 25:
                return INITIAL_LOADING;
            case 26:
                return ERROR;
            case 27:
                return OTHER_ALLOWED_DEVICES;
            case 28:
                return NOT_ALLOWED_DEVICES;
            case 29:
                return ADD_SECONDARY;
            case 30:
                return AUTH_ADD_PRE;
            case 31:
                return PARENT_ESCALATION;
            case 32:
                return PARENT_PICKER;
            case 33:
                return PARENT_PASSWORD;
            case 34:
                return CONSENT_INFO;
            case 35:
                return REMOVE_SECONDARY;
            case 36:
                return INITIALIZE_DEVICE_SETUP;
            case FelicaException.TYPE_NOT_CLOSED:
                return APP_DETAILS;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return APP_PERMISSIONS;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return GOOGLE_SERVICES;
            case FelicaException.TYPE_PUSH_FAILED:
                return HIDE_APP_FAILED;
            case 41:
                return ACCOUNT_REMOVED;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return ACCOUNT_REMOVAL;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return LOCAL_UNLOCK;
            case FelicaException.TYPE_RESET_FAILED:
                return UPDATING_APPS;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return NEED_HELP;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return PROFILE_OWNER_DISCLAIMER;
            case 47:
                return PERMALOCK_DISCLAIMER;
            case 48:
                return SETTINGS_BENEFITS;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return SETTINGS_DISAMBIGUATION;
            case 50:
                return SETTINGS_NEXT_STEPS;
            case 51:
                return SETTINGS_INSTALL_FL;
            case 52:
                return SETTINGS_ERROR_DIALOG;
            case 53:
                return APP_DETAILS_READ_MORE;
            case 54:
                return SELECT_CHILD_ACCOUNT;
            case 55:
                return ADDITIONAL_ACCOUNTS;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return PARENT_SIGN_IN_PRIMER;
            case 57:
                return PARENT_SIGN_IN;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return CHECK_PARENT_ELIGIBILITY;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return INITIALIZE_MEMBER_SUPERVISION;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return ACCOUNTS_LINKED;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return BLOCKING_APPS;
            case 62:
                return COULDNT_BLOCK_APPS;
            case 63:
                return MANAGE_SETTINGS;
            case 64:
                return CONNECT_DEVICES;
            case KeyInformation.AES128_DES56:
                return AUTO_INSTALL_FAMILY_LINK;
            case 66:
                return LOOK_FOR_FAMILY_LINK;
            case KeyInformation.AES128_DES112:
                return ERROR_GENERIC;
            case 68:
                return ERROR_CANT_NOMINATE_SELF;
            case 69:
                return ERROR_TOO_YOUNG;
            case 70:
                return ERROR_TOO_MANY_MEMBERS;
            case 71:
                return ERROR_PLAY_COUNTRY_MISMATCH;
            case 72:
                return ERROR_HOH_IS_BLOCKED;
            case 73:
                return ERROR_TOO_MANY_FAMILY_SWITCHES_PARENT;
            case 74:
                return ERROR_TOO_MANY_FAMILY_SWITCHES_CHILD;
            case 75:
                return ERROR_IS_NOT_HOH;
            case 76:
                return ERROR_FAMILY_EXISTS;
            case 77:
                return ERROR_LACKS_BIRTHDAY;
            case 78:
                return SETTINGS_NEXT_STEPS_DOWNLOADING;
            case KeyInformation.AES128:
                return ACCOUNT_SWITCH_NEEDED;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return ERROR_UNMET_PRECONDITION_CHILD;
            case 81:
                return ERROR_UNMET_PRECONDITION_PARENT;
            case 82:
                return SETTINGS_ERROR_NO_NETWORK;
            case 83:
                return SETTINGS_ERROR_FEATURE_TIMEOUT;
            case 84:
                return SETTINGS_ERROR_FEATURE_FAILURE;
            case 85:
                return MEMBER_REJECTION;
            case 86:
                return SAVE_PARTIAL_CONSENT;
            case 87:
                return SETTINGS_NEXT_STEPS_SHARED;
            case 88:
                return ERROR_NOT_WHITELISTED;
            case 89:
                return ERROR_IS_DASHER;
            case 90:
                return ERROR_IS_CHILD;
            case 91:
                return ERROR_IS_MADISON;
            case 92:
                return ERROR_IS_SUPERVISED_ACCOUNT;
            case 93:
                return ERROR_IS_GRIFFIN;
            case 94:
                return ERROR_HOH_OF_ANOTHER_FAMILY;
            case 95:
                return ERROR_IS_PARENT;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return KIDS_HOME_PROPOSITION;
            case 97:
                return KIDS_HOME_DETAILS;
            case 98:
                return SETTINGS_ERROR_KM_FEATURE_REQUEST_FAILED;
            case 99:
                return SETTINGS_ERROR_KM_UNAVAILABLE_AFTER_DOWNLOAD;
            case 100:
                return ERROR_CHILD_IS_BLOCKED;
            case 101:
                return ABOUT_SUPERVISION_EXIT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m117164b() {
        return btuq.f150514a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f150618aY;
    }

    public final String toString() {
        return Integer.toString(this.f150618aY);
    }
}
