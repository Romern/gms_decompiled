package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bsmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsmt implements bxvp {
    IDENTITY_EVENT_CATEGORY_UNSPECIFIED(0),
    ACCESSIBILITY(19),
    ACCOUNTS_HARD_DISABLED_SB(61),
    CAPTCHA_REENABLE_SPEED_BUMP(78),
    IDENTIFIER_VIEW(79),
    RECOVERY_VIEW(80),
    ACCOUNT_SETTINGS_MOBILE_MENU(5),
    OCTARINE_WEBVIEWS(24),
    ABUSE_CARD(166),
    ADS_SETTINGS_AUTH(6),
    ADS_SETTINGS_UNAUTH(7),
    ADS_SETTINGS_PRECONSENT_AUTH(16),
    ADS_SETTINGS_PRECONSENT_UNAUTH(17),
    AGE_DISABLE_GRACE_PERIOD(221),
    AGEDISABLED_BIRTHDAY_CORRECTION(29),
    ALTERNATE_EMAIL(14),
    BIRTHDAY_EDITOR(2),
    BIRTHDAY_COLLECTION_CAMPAIGN(BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE),
    ACCOUNTS_PASSWORD_CHALLENGE(50),
    ACCOUNTS_PASSWORD_CHALLENGE_EMBEDDED(87),
    CHALLENGE_IDV_PREREGISTERED_EMAIL(74),
    CHALLENGE_IDV_PREREGISTERED_EMAIL_EMBEDDED(ErrorInfo.TYPE_SDU_FAILED),
    CHALLENGE_IDV_ANY_EMAIL_COLLECT(76),
    CHALLENGE_IDV_ANY_EMAIL_COLLECT_EMBEDDED(97),
    CHALLENGE_IDV_EMAIL_VERIFY(98),
    CHALLENGE_IDV_EMAIL_VERIFY_EMBEDDED(99),
    CHALLENGE_IDV_ANY_PHONE_COLLECT(100),
    CHALLENGE_IDV_ANY_PHONE_COLLECT_EMBEDDED(101),
    CHALLENGE_IDV_ANY_PHONE_VERIFY(102),
    CHALLENGE_IDV_ANY_PHONE_VERIFY_EMBEDDED(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    CHALLENGE_IDV_PREREGISTRED_PHONE(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    CHALLENGE_IDV_PREREGISTRED_PHONE_EMBEDDED(106),
    CHALLENGE_SELECTION(83),
    CHALLENGE_SELECTION_EMBEDDED(125),
    CHALLENGE_AUTHZEN(84),
    CHALLENGE_AUTHZEN_EMBEDDED(85),
    CHALLENGE_BACKUPCODE(89),
    CHALLENGE_BACKUPCODE_EMBEDDED(90),
    CHALLENGE_CAPTCHA(91),
    CHALLENGE_CAPTCHA_EMBEDDED(92),
    CHALLENGE_CLOUDPIN(93),
    CHALLENGE_CLOUDPIN_EMBEDDED(94),
    CHALLENGE_DASHER_CNAME(95),
    CHALLENGE_DEVICEPROMT(96),
    CHALLENGE_INTERNAL_2SV(107),
    CHALLENGE_INTERNAL_2SV_EMBEDDED(108),
    CHALLENGE_KNOWLEDGE_ACCOUNT_CREATION_DATE(109),
    CHALLENGE_KNOWLEDGE_ACCOUNT_CREATION_DATE_EMBEDDED(110),
    CHALLENGE_KNOWLEDGE_DOB(111),
    CHALLENGE_KNOWLEDGE_DOB_EMBEDDED(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS),
    CHALLENGE_KNOWLEDGE_MAIN_TITLE(113),
    CHALLENGE_KNOWLEDGE_EMPLOYEE_ID(114),
    CHALLENGE_KNOWLEDGE_EMPLOYEE_ID_EMBEDDED(115),
    CHALLENGE_KNOWLEDGE_LAST_LOGIN_DATE(116),
    CHALLENGE_KNOWLEDGE_NAME(117),
    CHALLENGE_KNOWLEDGE_NAME_EMBEDDED(118),
    CHALLENGE_KNOWLEDGE_PREREGISTERED_EMAIL(73),
    CHALLENGE_KNOWLEDGE_PREREGISTRED_EMAIL_EMBEDDED(119),
    CHALLENGE_KNOWLEDGE_PREREGISTRED_PHONE(120),
    CHALLENGE_KNOWLEDGE_PREREGISTRED_PHONE_EMBEDDED(121),
    CHALLENGE_KNOWLEDGE_SECRET_QUESTION(122),
    CHALLENGE_KNOWLEDGE_SECRET_QUESTION_EMBEDDED(123),
    CHALLENGE_KNOWLEDGE_USER_ACCOUNT(124),
    CHALLENGE_MANUAL_RECOVERY(126),
    CHALLENGE_MANUAL_RECOVERY_EMBEDDED(127),
    CHALLENGE_OFFLINE_OTP(128),
    CHALLENGE_OFFLINE_OTP_EMBEDDED(129),
    CHALLENGE_RESCURE_CODE(130),
    CHALLENGE_RESCURE_CODE_EMBEDDED(131),
    CHALLENGE_SAME_DEVICE_SCREEN_LOCK(132),
    CHALLENGE_SECURITY_KEY_OTP(133),
    CHALLENGE_TOS_TO_SAML_REDIRECT(134),
    CHALLENGE_TOS_TO_SAML_REDIRECT_EMBEDDED(135),
    CHALLENGE_TOTP(136),
    CHALLENGE_TOTP_EMBEDDED(137),
    CHALLENGE_SECURITY_KEY_BLEENABLE(138),
    CHALLENGE_SECURITY_KEY_BLEENABLE_EMBEDDED(139),
    CHALLENGE_SECURITY_KEY_BLE_INST_NOT_PAIRED(140),
    CHALLENGE_SECURITY_KEY_BLE_INST_NOT_PAIRED_EMBEDDED(141),
    CHALLENGE_SECURITY_KEY_BLE_INST_PAIRED(142),
    CHALLENGE_SECURITY_KEY_BLE_INST_PAIRED_EMBEDDED(143),
    CHALLENGE_SECURITY_KEY_BLE_INPAIRING(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD),
    CHALLENGE_SECURITY_KEY_BLE_INPAIRING_EMBEDDED(145),
    CHALLENGE_SECURITY_KEY_BLE_PAIRING_MODE(146),
    CHALLENGE_SECURITY_KEY_BLE_PAIRING_MODE_EMBEDDED(147),
    CHALLENGE_SECURITY_KEY_BLE_PROCESSING(148),
    CHALLENGE_SECURITY_KEY_BLE_PROCESSING_EMBEDDED(149),
    CHALLENGE_SECURITY_KEY_BLE_SELECT_DEVICE(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED),
    CHALLENGE_SECURITY_KEY_BLE_SELECT_DEVICE_EMBEDDED(MfiClientException.TYPE_MFICLIENT_NOT_FOUND),
    CHALLENGE_SECURITY_KEY_BLE_CRYPTO_TOKEN_ERROR_EMBEDDED(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED),
    CHALLENGE_SECURITY_KEY_MULTITRANSPORT(MfiClientException.TYPE_MFICLIENT_STARTED),
    CHALLENGE_SECURITY_KEY_MULTITRANSPORT_EMBEDDED(MfiClientException.TYPE_MFICLIENT_NOT_STARTED),
    CHALLENGE_SECURITY_KEY_NFC_ENABLE(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA),
    CHALLENGE_SECURITY_KEY_NFC_ENABLE_EMBEDDED(MfiClientException.TYPE_NO_ACCOUNT_INFO),
    CHALLENGE_SECURITY_KEY_NFC_INSCTRUCTIONS(MfiClientException.TYPE_CARD_NOT_CACHED),
    CHALLENGE_SECURITY_KEY_NFC_INSCTRUCTIONS_EMBEDDED(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION),
    CHALLENGE_SECURITY_KEY_USB_INSCTRUCTIONS(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE),
    CHALLENGE_SECURITY_KEY_USB_INSCTRUCTIONS_EMBEDDED(160),
    CHALLENGE_SECURITY_KEY(161),
    CHALLENGE_SECURITY_KEY_EMBEDDED(162),
    CHALLENGE_YOUTUBE_EMBEDDED(163),
    CHROME_FAMILY_SETTINGS(27),
    CHROME_FAMILY_EXCEPTIONS(32),
    CHROME_FAMILY_APPS(30),
    CHROME_FAMILY_PERMISSIONS(31),
    DEVICE_PROMPT_SPEED_BUMP(BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR),
    CONTACT_EMAIL(15),
    DASHBOARD(55),
    DF(51),
    EXIT_SUPERVISION(164),
    FAMILY_INVITE(9),
    FIDO_BRIDGE_SERVICE(71),
    GFE_BOTGUARD_SERVICE(BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT),
    GENDER_EDITOR(21),
    GENERAL_USER_INTERACTION(4),
    GOVERNMENT_BACKED_ATTACK_WARNING(63),
    INACTIVE_ACCOUNTS(44),
    INPUT_TOOLS(36),
    LANGUAGE(38),
    LOCATION_SHARING(8),
    MARMOSET_SERVICE(70),
    TANGO_SERVICE(248),
    MY_SUBSCRIPTIONS(62),
    PASSWORD_CHANGE(28),
    POST_HIJACK(65),
    PHONE_SIGN_IN_INTERSTITIAL(10),
    PRIMARY_EMAIL(33),
    PRIVACY_CHECKUP(1),
    PRIVACY_GUIDE(11),
    PRIVACY_GUIDE_INTRO(12),
    PROFILE_PICTURE_EDIT(18),
    REAUTH_VIEW(88),
    RECOVERY_OPTIONS_COLLECTION_WIZARD(3),
    RECOVERYBUMP(86),
    PWM_WEB(67),
    PWM_ANDROID(68),
    PWM_PICKER_ANDROID(222),
    CONTACT_EMAIL_COLLECTION_WIZARD(23),
    SECURITY_ADVISOR(54),
    SERVICE_DELETION_GMAIL(13),
    SHARED_ENDORSEMENTS(20),
    SIGNIN_REJECTED(167),
    SIGNIN_JS_AUTH_ERROR(168),
    SIGNIN_JS_AUTH_SUMMARY(169),
    SIGNIN_JS_AUTH_TIMEOUT(170),
    SIGNIN_KID_REDIRECTED(171),
    SIGNIN_KID_CONSENT(172),
    SIGNIN_PARENT_ACCESS_CODE(173),
    SIGNIN_SUPERVISION_INFO(174),
    SIGNIN_SUPERVISION_STOPPED(175),
    SIGNIN_KID_SYNC_WELCOME(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER),
    SIGNIN_DELETED_ACCOUNT(177),
    SIGNIN_EXISTING_ACCOUNTS(178),
    SIGNIN_NO_ACCOUNTS(179),
    SIGNIN_QUERY_NAME(180),
    SIGNIN_RECOVERY_CHOOSER(181),
    SIGNIN_SHADOW_DISAMBIGUATE(182),
    SIGNIN_CHOOSER(183),
    SIGNIN_USERNAME_RECOVERY(184),
    SIGNIN_RECOVERY_STATUS(186),
    SIGNIN_NATIVE_APP(187),
    NATIVE_APP_EMBEDDED(188),
    UNKNOWN_ERROR_EMBEDDED(189),
    BRAND_ACCOUNT_CHOOSER(190),
    OAUTH_CONSENT(191),
    OAUTH_CONSENT_SUMMARY(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC),
    OAUTH_CUSTOM_SCHEME_APPROVED(193),
    OAUTH_CUSTOM_SCHEME_CANCELLED(194),
    OAUTH_DEVICE_CODE(195),
    OAUTH_CHOOSE_ACCOUNT(196),
    OAUTH_DEVICE_PRESENCE(220),
    ANDROID_REAUTH(198),
    WEB_REAUTH(ErrorInfo.TYPE_SDU_UNKNOWN),
    EMBEDDED_REAUTH(249),
    ACCOUNT_LOCKDOWN_SB(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    ADD_DEVICE_PHONE_SB(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    ADD_RECOVERY_PHONE_SB(202),
    UPDATE_RECOVERY_PHONE_SB(203),
    ADD_RECOVERY_ONLY_PHONE_SB(204),
    UPDATE_DEVICE_PHONE_SB(205),
    UPDATE_BUC_DEVICE_PHONE_SB(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    UPDATE_RECOVERY_PHONE_FOR_RECOVERY_SB(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    UGRADE_UPDATE_PHONE_SB(208),
    UGRADE_EVRY_DEVICE_PHONE_SB(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    CHANGE_PASSWORD_SB(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA),
    SIGNUP_KIDS_MULTIPLE_ACCOUNTS(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE),
    SIGNUP_KIDS_CREATE_ACCOUNT(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD),
    APPROVE_DEVICE_SIGN_IN_SB(BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED),
    SIGNUP_TOS(59),
    SIGNUP_UNIFIED_AUTOMATIC(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD),
    SIGNUP_USERNAME(72),
    SIGNUP_UPGRADE_PHONE(BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR),
    SIGNUP_CONFIRM_ACCOUNT_DETAILS(165),
    SIGNUP_KIDS_SIGNUPINFO(77),
    EMBEDDED_DEVICE_PHONE_NUMBER_VERIFICATION(223),
    SECURITY_CHECKUP(22),
    DEVICE_ACTIVITY(25),
    DEVICES_V2(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR),
    SECURITY_NOTIFICATIONS(26),
    TRANSFER_CONTENT(34),
    UDC_SETTINGS(37),
    UDC_WEB_CONSENT_DIALOG(58),
    UDC_MOBILE(39),
    UNSUPPORTED_PHONE(75),
    UNSUPPORTED_PHONE_EMBEDDED(81),
    WHITEPAGES_UI(40),
    STRONG_AUTH(41),
    STRONG_AUTH_AUTHENTICATOR(45),
    STRONG_AUTH_IDV_ENROLLMENT(46),
    STRONG_AUTH_SECURITY_KEY(47),
    STRONG_AUTH_SECURITY_KEY_ENROLLMENT(49),
    STRONG_AUTH_GOOGLE_PROMPT(42),
    STRONG_AUTH_GOOGLE_PROMPT_ENROLLMENT(53),
    STRONG_AUTH_SUPERCARD(56),
    PHONE_SIGN_IN(43),
    RECOVERY_PHONE(48),
    OOB_KID_SIGNUP(52),
    OOB_YOUNG_TEEN_SIGNUP(60),
    TITANIUM_ENROLLMENT(57),
    POLICIES(64),
    PUBLIC_CHALLENGE_SIGN_IN(69),
    SIGN_IN_JS_AUTH(250),
    METRICS_SANDBOX(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE),
    PROFILE_ADD_ABOUT(225),
    PROFILE_ADD_CONTACT_INFO(226),
    PROFILE_ADD_WORK_AND_EDUCATION(227),
    PROFILE_ADDRESS_EDIT(228),
    PROFILE_BIRTHDAY(251),
    PROFILE_CHAT_EDIT(229),
    PROFILE_CUSTOM_URLS(230),
    PROFILE_DISPLAY_NAME_EDIT(231),
    PROFILE_EDUCATION(232),
    PROFILE_EDUCATION_EDIT(233),
    PROFILE_EMAIL_EDIT(234),
    PROFILE_GENDER(252),
    PROFILE_INTRODUCTION_EDIT(235),
    PROFILE_LINKS(236),
    PROFILE_LINKS_EDIT(237),
    PROFILE_NAME(238),
    PROFILE_NAME_EDIT(239),
    PROFILE_NICKNAME_EDIT(240),
    PROFILE_OCCUPATION_EDIT(241),
    PROFILE_PHONE_EDIT(242),
    PROFILE_PHOTO_EDIT(243),
    PROFILE_PLACES(247),
    PROFILE_PLACES_EDIT(244),
    PROFILE_WORK(245),
    PROFILE_WORK_EDIT(246);
    

    /* renamed from: dO */
    public final int f145305dO;

    private bsmt(int i) {
        this.f145305dO = i;
    }

    /* renamed from: a */
    public static bsmt m115987a(int i) {
        switch (i) {
            case 0:
                return IDENTITY_EVENT_CATEGORY_UNSPECIFIED;
            case 1:
                return PRIVACY_CHECKUP;
            case 2:
                return BIRTHDAY_EDITOR;
            case 3:
                return RECOVERY_OPTIONS_COLLECTION_WIZARD;
            case 4:
                return GENERAL_USER_INTERACTION;
            case 5:
                return ACCOUNT_SETTINGS_MOBILE_MENU;
            case 6:
                return ADS_SETTINGS_AUTH;
            case 7:
                return ADS_SETTINGS_UNAUTH;
            case 8:
                return LOCATION_SHARING;
            case 9:
                return FAMILY_INVITE;
            case 10:
                return PHONE_SIGN_IN_INTERSTITIAL;
            case 11:
                return PRIVACY_GUIDE;
            case 12:
                return PRIVACY_GUIDE_INTRO;
            case 13:
                return SERVICE_DELETION_GMAIL;
            case 14:
                return ALTERNATE_EMAIL;
            case 15:
                return CONTACT_EMAIL;
            case 16:
                return ADS_SETTINGS_PRECONSENT_AUTH;
            case 17:
                return ADS_SETTINGS_PRECONSENT_UNAUTH;
            case 18:
                return PROFILE_PICTURE_EDIT;
            case 19:
                return ACCESSIBILITY;
            case 20:
                return SHARED_ENDORSEMENTS;
            case 21:
                return GENDER_EDITOR;
            case 22:
                return SECURITY_CHECKUP;
            case 23:
                return CONTACT_EMAIL_COLLECTION_WIZARD;
            case 24:
                return OCTARINE_WEBVIEWS;
            case 25:
                return DEVICE_ACTIVITY;
            case 26:
                return SECURITY_NOTIFICATIONS;
            case 27:
                return CHROME_FAMILY_SETTINGS;
            case 28:
                return PASSWORD_CHANGE;
            case 29:
                return AGEDISABLED_BIRTHDAY_CORRECTION;
            case 30:
                return CHROME_FAMILY_APPS;
            case 31:
                return CHROME_FAMILY_PERMISSIONS;
            case 32:
                return CHROME_FAMILY_EXCEPTIONS;
            case 33:
                return PRIMARY_EMAIL;
            case 34:
                return TRANSFER_CONTENT;
            case 35:
            case 66:
            case 82:
            case 185:
            case 197:
            default:
                return null;
            case 36:
                return INPUT_TOOLS;
            case FelicaException.TYPE_NOT_CLOSED:
                return UDC_SETTINGS;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return LANGUAGE;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return UDC_MOBILE;
            case FelicaException.TYPE_PUSH_FAILED:
                return WHITEPAGES_UI;
            case 41:
                return STRONG_AUTH;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return STRONG_AUTH_GOOGLE_PROMPT;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return PHONE_SIGN_IN;
            case FelicaException.TYPE_RESET_FAILED:
                return INACTIVE_ACCOUNTS;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return STRONG_AUTH_AUTHENTICATOR;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return STRONG_AUTH_IDV_ENROLLMENT;
            case 47:
                return STRONG_AUTH_SECURITY_KEY;
            case 48:
                return RECOVERY_PHONE;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return STRONG_AUTH_SECURITY_KEY_ENROLLMENT;
            case 50:
                return ACCOUNTS_PASSWORD_CHALLENGE;
            case 51:
                return DF;
            case 52:
                return OOB_KID_SIGNUP;
            case 53:
                return STRONG_AUTH_GOOGLE_PROMPT_ENROLLMENT;
            case 54:
                return SECURITY_ADVISOR;
            case 55:
                return DASHBOARD;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return STRONG_AUTH_SUPERCARD;
            case 57:
                return TITANIUM_ENROLLMENT;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return UDC_WEB_CONSENT_DIALOG;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return SIGNUP_TOS;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return OOB_YOUNG_TEEN_SIGNUP;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return ACCOUNTS_HARD_DISABLED_SB;
            case 62:
                return MY_SUBSCRIPTIONS;
            case 63:
                return GOVERNMENT_BACKED_ATTACK_WARNING;
            case 64:
                return POLICIES;
            case KeyInformation.AES128_DES56:
                return POST_HIJACK;
            case KeyInformation.AES128_DES112:
                return PWM_WEB;
            case 68:
                return PWM_ANDROID;
            case 69:
                return PUBLIC_CHALLENGE_SIGN_IN;
            case 70:
                return MARMOSET_SERVICE;
            case 71:
                return FIDO_BRIDGE_SERVICE;
            case 72:
                return SIGNUP_USERNAME;
            case 73:
                return CHALLENGE_KNOWLEDGE_PREREGISTERED_EMAIL;
            case 74:
                return CHALLENGE_IDV_PREREGISTERED_EMAIL;
            case 75:
                return UNSUPPORTED_PHONE;
            case 76:
                return CHALLENGE_IDV_ANY_EMAIL_COLLECT;
            case 77:
                return SIGNUP_KIDS_SIGNUPINFO;
            case 78:
                return CAPTCHA_REENABLE_SPEED_BUMP;
            case KeyInformation.AES128:
                return IDENTIFIER_VIEW;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return RECOVERY_VIEW;
            case 81:
                return UNSUPPORTED_PHONE_EMBEDDED;
            case 83:
                return CHALLENGE_SELECTION;
            case 84:
                return CHALLENGE_AUTHZEN;
            case 85:
                return CHALLENGE_AUTHZEN_EMBEDDED;
            case 86:
                return RECOVERYBUMP;
            case 87:
                return ACCOUNTS_PASSWORD_CHALLENGE_EMBEDDED;
            case 88:
                return REAUTH_VIEW;
            case 89:
                return CHALLENGE_BACKUPCODE;
            case 90:
                return CHALLENGE_BACKUPCODE_EMBEDDED;
            case 91:
                return CHALLENGE_CAPTCHA;
            case 92:
                return CHALLENGE_CAPTCHA_EMBEDDED;
            case 93:
                return CHALLENGE_CLOUDPIN;
            case 94:
                return CHALLENGE_CLOUDPIN_EMBEDDED;
            case 95:
                return CHALLENGE_DASHER_CNAME;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return CHALLENGE_DEVICEPROMT;
            case 97:
                return CHALLENGE_IDV_ANY_EMAIL_COLLECT_EMBEDDED;
            case 98:
                return CHALLENGE_IDV_EMAIL_VERIFY;
            case 99:
                return CHALLENGE_IDV_EMAIL_VERIFY_EMBEDDED;
            case 100:
                return CHALLENGE_IDV_ANY_PHONE_COLLECT;
            case 101:
                return CHALLENGE_IDV_ANY_PHONE_COLLECT_EMBEDDED;
            case 102:
                return CHALLENGE_IDV_ANY_PHONE_VERIFY;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return CHALLENGE_IDV_ANY_PHONE_VERIFY_EMBEDDED;
            case ErrorInfo.TYPE_SDU_FAILED:
                return CHALLENGE_IDV_PREREGISTERED_EMAIL_EMBEDDED;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return CHALLENGE_IDV_PREREGISTRED_PHONE;
            case 106:
                return CHALLENGE_IDV_PREREGISTRED_PHONE_EMBEDDED;
            case 107:
                return CHALLENGE_INTERNAL_2SV;
            case 108:
                return CHALLENGE_INTERNAL_2SV_EMBEDDED;
            case 109:
                return CHALLENGE_KNOWLEDGE_ACCOUNT_CREATION_DATE;
            case 110:
                return CHALLENGE_KNOWLEDGE_ACCOUNT_CREATION_DATE_EMBEDDED;
            case 111:
                return CHALLENGE_KNOWLEDGE_DOB;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                return CHALLENGE_KNOWLEDGE_DOB_EMBEDDED;
            case 113:
                return CHALLENGE_KNOWLEDGE_MAIN_TITLE;
            case 114:
                return CHALLENGE_KNOWLEDGE_EMPLOYEE_ID;
            case 115:
                return CHALLENGE_KNOWLEDGE_EMPLOYEE_ID_EMBEDDED;
            case 116:
                return CHALLENGE_KNOWLEDGE_LAST_LOGIN_DATE;
            case 117:
                return CHALLENGE_KNOWLEDGE_NAME;
            case 118:
                return CHALLENGE_KNOWLEDGE_NAME_EMBEDDED;
            case 119:
                return CHALLENGE_KNOWLEDGE_PREREGISTRED_EMAIL_EMBEDDED;
            case 120:
                return CHALLENGE_KNOWLEDGE_PREREGISTRED_PHONE;
            case 121:
                return CHALLENGE_KNOWLEDGE_PREREGISTRED_PHONE_EMBEDDED;
            case 122:
                return CHALLENGE_KNOWLEDGE_SECRET_QUESTION;
            case 123:
                return CHALLENGE_KNOWLEDGE_SECRET_QUESTION_EMBEDDED;
            case 124:
                return CHALLENGE_KNOWLEDGE_USER_ACCOUNT;
            case 125:
                return CHALLENGE_SELECTION_EMBEDDED;
            case 126:
                return CHALLENGE_MANUAL_RECOVERY;
            case 127:
                return CHALLENGE_MANUAL_RECOVERY_EMBEDDED;
            case 128:
                return CHALLENGE_OFFLINE_OTP;
            case 129:
                return CHALLENGE_OFFLINE_OTP_EMBEDDED;
            case 130:
                return CHALLENGE_RESCURE_CODE;
            case 131:
                return CHALLENGE_RESCURE_CODE_EMBEDDED;
            case 132:
                return CHALLENGE_SAME_DEVICE_SCREEN_LOCK;
            case 133:
                return CHALLENGE_SECURITY_KEY_OTP;
            case 134:
                return CHALLENGE_TOS_TO_SAML_REDIRECT;
            case 135:
                return CHALLENGE_TOS_TO_SAML_REDIRECT_EMBEDDED;
            case 136:
                return CHALLENGE_TOTP;
            case 137:
                return CHALLENGE_TOTP_EMBEDDED;
            case 138:
                return CHALLENGE_SECURITY_KEY_BLEENABLE;
            case 139:
                return CHALLENGE_SECURITY_KEY_BLEENABLE_EMBEDDED;
            case 140:
                return CHALLENGE_SECURITY_KEY_BLE_INST_NOT_PAIRED;
            case 141:
                return CHALLENGE_SECURITY_KEY_BLE_INST_NOT_PAIRED_EMBEDDED;
            case 142:
                return CHALLENGE_SECURITY_KEY_BLE_INST_PAIRED;
            case 143:
                return CHALLENGE_SECURITY_KEY_BLE_INST_PAIRED_EMBEDDED;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                return CHALLENGE_SECURITY_KEY_BLE_INPAIRING;
            case 145:
                return CHALLENGE_SECURITY_KEY_BLE_INPAIRING_EMBEDDED;
            case 146:
                return CHALLENGE_SECURITY_KEY_BLE_PAIRING_MODE;
            case 147:
                return CHALLENGE_SECURITY_KEY_BLE_PAIRING_MODE_EMBEDDED;
            case 148:
                return CHALLENGE_SECURITY_KEY_BLE_PROCESSING;
            case 149:
                return CHALLENGE_SECURITY_KEY_BLE_PROCESSING_EMBEDDED;
            case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                return CHALLENGE_SECURITY_KEY_BLE_SELECT_DEVICE;
            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                return CHALLENGE_SECURITY_KEY_BLE_SELECT_DEVICE_EMBEDDED;
            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                return CHALLENGE_SECURITY_KEY_BLE_CRYPTO_TOKEN_ERROR_EMBEDDED;
            case MfiClientException.TYPE_MFICLIENT_STARTED:
                return CHALLENGE_SECURITY_KEY_MULTITRANSPORT;
            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                return CHALLENGE_SECURITY_KEY_MULTITRANSPORT_EMBEDDED;
            case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                return CHALLENGE_SECURITY_KEY_NFC_ENABLE;
            case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                return CHALLENGE_SECURITY_KEY_NFC_ENABLE_EMBEDDED;
            case MfiClientException.TYPE_CARD_NOT_CACHED:
                return CHALLENGE_SECURITY_KEY_NFC_INSCTRUCTIONS;
            case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                return CHALLENGE_SECURITY_KEY_NFC_INSCTRUCTIONS_EMBEDDED;
            case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                return CHALLENGE_SECURITY_KEY_USB_INSCTRUCTIONS;
            case 160:
                return CHALLENGE_SECURITY_KEY_USB_INSCTRUCTIONS_EMBEDDED;
            case 161:
                return CHALLENGE_SECURITY_KEY;
            case 162:
                return CHALLENGE_SECURITY_KEY_EMBEDDED;
            case 163:
                return CHALLENGE_YOUTUBE_EMBEDDED;
            case 164:
                return EXIT_SUPERVISION;
            case 165:
                return SIGNUP_CONFIRM_ACCOUNT_DETAILS;
            case 166:
                return ABUSE_CARD;
            case 167:
                return SIGNIN_REJECTED;
            case 168:
                return SIGNIN_JS_AUTH_ERROR;
            case 169:
                return SIGNIN_JS_AUTH_SUMMARY;
            case 170:
                return SIGNIN_JS_AUTH_TIMEOUT;
            case 171:
                return SIGNIN_KID_REDIRECTED;
            case 172:
                return SIGNIN_KID_CONSENT;
            case 173:
                return SIGNIN_PARENT_ACCESS_CODE;
            case 174:
                return SIGNIN_SUPERVISION_INFO;
            case 175:
                return SIGNIN_SUPERVISION_STOPPED;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER /*176*/:
                return SIGNIN_KID_SYNC_WELCOME;
            case 177:
                return SIGNIN_DELETED_ACCOUNT;
            case 178:
                return SIGNIN_EXISTING_ACCOUNTS;
            case 179:
                return SIGNIN_NO_ACCOUNTS;
            case 180:
                return SIGNIN_QUERY_NAME;
            case 181:
                return SIGNIN_RECOVERY_CHOOSER;
            case 182:
                return SIGNIN_SHADOW_DISAMBIGUATE;
            case 183:
                return SIGNIN_CHOOSER;
            case 184:
                return SIGNIN_USERNAME_RECOVERY;
            case 186:
                return SIGNIN_RECOVERY_STATUS;
            case 187:
                return SIGNIN_NATIVE_APP;
            case 188:
                return NATIVE_APP_EMBEDDED;
            case 189:
                return UNKNOWN_ERROR_EMBEDDED;
            case 190:
                return BRAND_ACCOUNT_CHOOSER;
            case 191:
                return OAUTH_CONSENT;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC /*192*/:
                return OAUTH_CONSENT_SUMMARY;
            case 193:
                return OAUTH_CUSTOM_SCHEME_APPROVED;
            case 194:
                return OAUTH_CUSTOM_SCHEME_CANCELLED;
            case 195:
                return OAUTH_DEVICE_CODE;
            case 196:
                return OAUTH_CHOOSE_ACCOUNT;
            case 198:
                return ANDROID_REAUTH;
            case ErrorInfo.TYPE_SDU_UNKNOWN:
                return WEB_REAUTH;
            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                return ACCOUNT_LOCKDOWN_SB;
            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                return ADD_DEVICE_PHONE_SB;
            case 202:
                return ADD_RECOVERY_PHONE_SB;
            case 203:
                return UPDATE_RECOVERY_PHONE_SB;
            case 204:
                return ADD_RECOVERY_ONLY_PHONE_SB;
            case 205:
                return UPDATE_DEVICE_PHONE_SB;
            case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                return UPDATE_BUC_DEVICE_PHONE_SB;
            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                return UPDATE_RECOVERY_PHONE_FOR_RECOVERY_SB;
            case 208:
                return UGRADE_UPDATE_PHONE_SB;
            case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                return UGRADE_EVRY_DEVICE_PHONE_SB;
            case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                return CHANGE_PASSWORD_SB;
            case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                return SIGNUP_KIDS_MULTIPLE_ACCOUNTS;
            case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                return SIGNUP_KIDS_CREATE_ACCOUNT;
            case BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED:
                return APPROVE_DEVICE_SIGN_IN_SB;
            case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                return METRICS_SANDBOX;
            case BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR:
                return SIGNUP_UPGRADE_PHONE;
            case BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR:
                return DEVICES_V2;
            case BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR:
                return DEVICE_PROMPT_SPEED_BUMP;
            case BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT:
                return GFE_BOTGUARD_SERVICE;
            case BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE:
                return BIRTHDAY_COLLECTION_CAMPAIGN;
            case 220:
                return OAUTH_DEVICE_PRESENCE;
            case 221:
                return AGE_DISABLE_GRACE_PERIOD;
            case 222:
                return PWM_PICKER_ANDROID;
            case 223:
                return EMBEDDED_DEVICE_PHONE_NUMBER_VERIFICATION;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD /*224*/:
                return SIGNUP_UNIFIED_AUTOMATIC;
            case 225:
                return PROFILE_ADD_ABOUT;
            case 226:
                return PROFILE_ADD_CONTACT_INFO;
            case 227:
                return PROFILE_ADD_WORK_AND_EDUCATION;
            case 228:
                return PROFILE_ADDRESS_EDIT;
            case 229:
                return PROFILE_CHAT_EDIT;
            case 230:
                return PROFILE_CUSTOM_URLS;
            case 231:
                return PROFILE_DISPLAY_NAME_EDIT;
            case 232:
                return PROFILE_EDUCATION;
            case 233:
                return PROFILE_EDUCATION_EDIT;
            case 234:
                return PROFILE_EMAIL_EDIT;
            case 235:
                return PROFILE_INTRODUCTION_EDIT;
            case 236:
                return PROFILE_LINKS;
            case 237:
                return PROFILE_LINKS_EDIT;
            case 238:
                return PROFILE_NAME;
            case 239:
                return PROFILE_NAME_EDIT;
            case 240:
                return PROFILE_NICKNAME_EDIT;
            case 241:
                return PROFILE_OCCUPATION_EDIT;
            case 242:
                return PROFILE_PHONE_EDIT;
            case 243:
                return PROFILE_PHOTO_EDIT;
            case 244:
                return PROFILE_PLACES_EDIT;
            case 245:
                return PROFILE_WORK;
            case 246:
                return PROFILE_WORK_EDIT;
            case 247:
                return PROFILE_PLACES;
            case 248:
                return TANGO_SERVICE;
            case 249:
                return EMBEDDED_REAUTH;
            case 250:
                return SIGN_IN_JS_AUTH;
            case 251:
                return PROFILE_BIRTHDAY;
            case 252:
                return PROFILE_GENDER;
        }
    }

    /* renamed from: b */
    public static bxvr m115988b() {
        return bsms.f145055a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f145305dO;
    }

    public final String toString() {
        return Integer.toString(this.f145305dO);
    }
}
