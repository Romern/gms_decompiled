package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: sgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum sgj implements bxvp {
    UNKNOWN(0),
    GAMES(1),
    PLUS(2),
    PANORAMA(3),
    WALLET(4),
    PEOPLE(5),
    LOCATION(6),
    APP_STATE(7),
    ADMOB(8),
    ACCOUNT(9),
    CAST(10),
    DRIVE(11),
    ADDRESS(12),
    CAR(13),
    WEAR(14),
    IDENTITY(15),
    AUTH_PROXY(16),
    FITNESS(17),
    REMINDERS(18),
    LIGHT_INDEX(19),
    DEVICE_CONNECTIONS(20),
    APP_DATA_SEARCH(21),
    REPORTING(22),
    GOOGLE_LOCATION_MANAGER(23),
    PLAY_LOG(24),
    DROID_GUARD(25),
    LOCKBOX(26),
    CAST_MIRRORING(27),
    NETWORK_QUALITY(28),
    FEEDBACK(29),
    SEARCH_ADMINISTRATION(30),
    AUTO_BACKUP(31),
    SEARCH_QUERIES(32),
    GLOBAL_SEARCH_ADMIN(33),
    CLOUD_SAVE(34),
    UDC(35),
    SEARCH_CORPORA(36),
    DEVICE_MANAGER(37),
    PSEUDONYMOUS_ID(38),
    COMMON(39),
    CLEARCUT_LOGGER(40),
    USAGE_REPORTING(41),
    KIDS(42),
    DOWNLOAD(43),
    SIGN_IN(44),
    SAFETY_NET(45),
    ADMOB_GSERVICES_VALUE(46),
    CONTEXT_MANAGER(47),
    AUDIO_MODEM(48),
    NEARBY(49),
    LIGHTWEIGHT_NETWORK_QUALITY(50),
    PHENOTYPE(51),
    VOICE_UNLOCK(52),
    NEARBY_CONNECTIONS(54),
    FIT_SENSORS(55),
    FIT_RECORDING(56),
    FIT_HISTORY(57),
    FIT_SESSIONS(58),
    FIT_BLE(59),
    FIT_CONFIG(60),
    FIT_INTERNAL(61),
    NEARBY_MESSAGES(62),
    GOOGLE_HELP(63),
    CHECKIN_CONFIG(64),
    PLACES_GEO_DATA(65),
    IME_UPDATES(66),
    PLACES_PLACE_DETECTION(67),
    AUTH_CREDENTIALS(68),
    NEARBY_BOOTSTRAP(69),
    PLUS_INTERNAL(70),
    MAPS_API(71),
    TRUSTAGENT_TRUSTED_DEVICES(72),
    SEARCH_AUTH(73),
    ACCOUNT_STATUS(74),
    SMARTDEVICE_D2D_SOURCE_DEVICE(75),
    SMARTDEVICE_D2D_TARGET_DEVICE(76),
    APP_INVITE(77),
    SEARCH_NATIVE_API(78),
    WALLET_TAP_AND_PAY(79),
    CHROME_SYNC(80),
    SMARTDEVICE_SETUP_ACCOUNTS_BOOTSTRAP(81),
    GSA(82),
    CAST_REMOTE_DISPLAY(83),
    TRUSTAGENT(84),
    TRUSTAGENT_STATE(85),
    YOUTUBE(86),
    AUTH_SIGN_IN(87),
    VISION(88),
    TRUSTAGENT_BRIDGE(89),
    BACKUP_STATS(90),
    AUTH_GOOGLE_SIGN_IN(91),
    MEASUREMENT(93),
    WEAVE_DEVICE(94),
    AD_MEASUREMENT(95),
    CHROME_SYNC_PREFERENCES(96),
    CHROME_SYNC_PASSWORD(97),
    FREIGHTER(98),
    WEAVE_MANAGEMENT(99),
    WEAVE_COMMAND(100),
    WEAVE_APP_ACCESS(101),
    WEAVE_EVENT(102),
    WEAVE_LOCAL_STATELESS_DEVICE(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    AUTH_AUTHZEN_KEY(ErrorInfo.TYPE_SDU_FAILED),
    SCREEN_CAPTURE(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    APP_INVITE_INTERNAL(106),
    AUTH_AUTHZEN_INTERNAL_DATA(107),
    AUTH_PROXIMITY(108),
    ACCOUNT_SETTINGS(109),
    GUNS(110),
    BEACON(111),
    FIREBASE_AUTH(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS),
    APP_INDEXING(113),
    WALLET_P2P(114),
    WALLET_P2P_INTERNAL(115),
    GASS(116),
    U2F_API(117),
    U2F_PRIVILEGED_API(118),
    U2F_ZERO_PARTY_API(119),
    WORK_ACCOUNT_API(120),
    INSTANT_APPS(121),
    CAST_FIRST_PARTY(122),
    ADMOB_CACHE(123),
    BOOT_COUNT(124),
    FIT_GOALS(125),
    SMS_RETRIEVER(126),
    MOBILE_DATA_HUB(127),
    AUTH_ACCOUNT_TRANSFER(128),
    CRYPTAUTH_API(129),
    CHECKIN_API(130),
    DYNAMIC_LINKS_API(131),
    FONT_API(132),
    TEST_SUPPORT(133),
    LOCATION_SHARING(134),
    ROMANESCO(135),
    AUTH_MANAGED_EMM_API(136),
    NETWORK_SCORER(137),
    NETWORK_RECOMMENDATION(138),
    BRELLA(139),
    RESTORE_SESSION(140),
    PEER_DOWNLOAD_MANAGER(141),
    AUTH_PROXIMITY_DEVICE_SYNC(142),
    REACHABILITY(143),
    AUTH_PROXIMITY_SECURE_CHANNEL(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD),
    PREDICT_ON_DEVICE(145),
    APP_PREVIEW_MESSAGING(146),
    LOCAL_RESTORE(147),
    FIDO2_API(148),
    FIDO2_PRIVILEGED_API(149),
    TELEPHONY_SPAM(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED),
    AUTH_UNCERTIFIED_DEVICE(MfiClientException.TYPE_MFICLIENT_NOT_FOUND),
    MOBILE_DATA_DOWNLOAD(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED),
    AUTH_ACCOUNT_DATA(MfiClientException.TYPE_MFICLIENT_STARTED),
    AUDIT(MfiClientException.TYPE_MFICLIENT_NOT_STARTED),
    CONSTELLATION(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA),
    GROWTH(MfiClientException.TYPE_NO_ACCOUNT_INFO),
    SYSTEM_UPDATE(MfiClientException.TYPE_CARD_NOT_CACHED),
    MOBILE_DATA_PLAN(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION),
    SMARTDEVICE_WIFI_HELPER(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE),
    MOBSTORE_FILE(160),
    CAST_API(161),
    CURATOR(162),
    USER_LOCATION(163),
    MOBILE_DATA_HUB_LISTENER(164),
    EXAMPLE(165),
    ADMOB_HTTP_CLIENT(166),
    LANGUAGE_PROFILE(167),
    MDNS(168),
    NEARBY_SETUP(169),
    ANALYTICS(170),
    SUBSCRIPTIONS(171),
    FOLSOM(172),
    SEMANTIC_LOCATION(173),
    VEHICLE(174),
    BACKUP_NOW(175),
    AUTH_EARLY_UPDATE(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER),
    AUTOFILL(177),
    MATCHSTICK(178),
    AUTH_CREDENTIALS_INTERNAL(179),
    FIDO2_ZERO_PARTY_API(180),
    G1_RESTORE(181),
    G1_BACKUP(182),
    CODELAB(183),
    DRIVING_MODE(184),
    OSS_LICENSES_SERVICE(185),
    CLEAR_CONTACT_INTERACTIONS_SERVICE(186),
    AUTH_MANAGED_POLICY_SERVICE(187),
    PAY_SECURE_ELEMENT_SERVICE(188),
    RCS(189),
    SMARTDEVICE_POST_SETUP(190),
    CARRIER_AUTH(191),
    SYSTEM_UPDATE_SINGLE_USER(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC),
    APPUSAGE(193),
    NEARBY_SHARING(194),
    ADMOB_CONSENT_SERVICE(195),
    CREDENTIAL_MANAGER(196),
    SMS_RETRIEVER_INTERNAL(197),
    PAY(198),
    ASTERISM(ErrorInfo.TYPE_SDU_UNKNOWN),
    MOBILE_SUBSCRIPTION(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    GMS_RESTORE(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    FACS_CACHE(202),
    ADMOB_SDK_SIGNAL(203),
    PLATFORM_CONFIGURATOR(204),
    RECAPTCHA(205),
    DUOKIT_SERVICE(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    SYSTEM_UPDATE_TV_API(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    CONTACTS_SYNC_SERVICE(208),
    FEEDBACK_CAR(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    SMARTDEVICE_SOURCE_DIRECT_TRANSFER(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA),
    SMARTDEVICE_TARGET_DIRECT_TRANSFER(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE),
    AUTH_API_IDENTITY_SIGNIN(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD),
    IDENTITY_GIS_INTERNAL(BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED),
    FIDO_CREDENTIAL_STORE(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE),
    MDI_SYNC(BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR),
    EVENT_ATTESTATION(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR),
    GCONNECT_EXP(BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR),
    SCHEDULER(BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT),
    AUTH_API_IDENTITY_AUTHORIZATION(BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE),
    FACS_INTERNAL_SYNC(220),
    AUTH_CONFIG_SYNC(221),
    ENTERPRISE(222),
    AUTH_API_IDENTITY_CREDENTIAL_SAVING(223),
    GOOGLE_AUTH(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD),
    ENTERPRISE_LOADER(225),
    THUNDERBIRD(226),
    UNRECOGNIZED(-1);
    

    /* renamed from: ds */
    private final int f44408ds;

    private sgj(int i) {
        this.f44408ds = i;
    }

    /* renamed from: a */
    public static sgj m35206a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return GAMES;
            case 2:
                return PLUS;
            case 3:
                return PANORAMA;
            case 4:
                return WALLET;
            case 5:
                return PEOPLE;
            case 6:
                return LOCATION;
            case 7:
                return APP_STATE;
            case 8:
                return ADMOB;
            case 9:
                return ACCOUNT;
            case 10:
                return CAST;
            case 11:
                return DRIVE;
            case 12:
                return ADDRESS;
            case 13:
                return CAR;
            case 14:
                return WEAR;
            case 15:
                return IDENTITY;
            case 16:
                return AUTH_PROXY;
            case 17:
                return FITNESS;
            case 18:
                return REMINDERS;
            case 19:
                return LIGHT_INDEX;
            case 20:
                return DEVICE_CONNECTIONS;
            case 21:
                return APP_DATA_SEARCH;
            case 22:
                return REPORTING;
            case 23:
                return GOOGLE_LOCATION_MANAGER;
            case 24:
                return PLAY_LOG;
            case 25:
                return DROID_GUARD;
            case 26:
                return LOCKBOX;
            case 27:
                return CAST_MIRRORING;
            case 28:
                return NETWORK_QUALITY;
            case 29:
                return FEEDBACK;
            case 30:
                return SEARCH_ADMINISTRATION;
            case 31:
                return AUTO_BACKUP;
            case 32:
                return SEARCH_QUERIES;
            case 33:
                return GLOBAL_SEARCH_ADMIN;
            case 34:
                return CLOUD_SAVE;
            case 35:
                return UDC;
            case 36:
                return SEARCH_CORPORA;
            case FelicaException.TYPE_NOT_CLOSED:
                return DEVICE_MANAGER;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return PSEUDONYMOUS_ID;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return COMMON;
            case FelicaException.TYPE_PUSH_FAILED:
                return CLEARCUT_LOGGER;
            case 41:
                return USAGE_REPORTING;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return KIDS;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return DOWNLOAD;
            case FelicaException.TYPE_RESET_FAILED:
                return SIGN_IN;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return SAFETY_NET;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return ADMOB_GSERVICES_VALUE;
            case 47:
                return CONTEXT_MANAGER;
            case 48:
                return AUDIO_MODEM;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return NEARBY;
            case 50:
                return LIGHTWEIGHT_NETWORK_QUALITY;
            case 51:
                return PHENOTYPE;
            case 52:
                return VOICE_UNLOCK;
            case 53:
            case 92:
            default:
                return null;
            case 54:
                return NEARBY_CONNECTIONS;
            case 55:
                return FIT_SENSORS;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return FIT_RECORDING;
            case 57:
                return FIT_HISTORY;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return FIT_SESSIONS;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return FIT_BLE;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return FIT_CONFIG;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return FIT_INTERNAL;
            case 62:
                return NEARBY_MESSAGES;
            case 63:
                return GOOGLE_HELP;
            case 64:
                return CHECKIN_CONFIG;
            case KeyInformation.AES128_DES56:
                return PLACES_GEO_DATA;
            case 66:
                return IME_UPDATES;
            case KeyInformation.AES128_DES112:
                return PLACES_PLACE_DETECTION;
            case 68:
                return AUTH_CREDENTIALS;
            case 69:
                return NEARBY_BOOTSTRAP;
            case 70:
                return PLUS_INTERNAL;
            case 71:
                return MAPS_API;
            case 72:
                return TRUSTAGENT_TRUSTED_DEVICES;
            case 73:
                return SEARCH_AUTH;
            case 74:
                return ACCOUNT_STATUS;
            case 75:
                return SMARTDEVICE_D2D_SOURCE_DEVICE;
            case 76:
                return SMARTDEVICE_D2D_TARGET_DEVICE;
            case 77:
                return APP_INVITE;
            case 78:
                return SEARCH_NATIVE_API;
            case KeyInformation.AES128:
                return WALLET_TAP_AND_PAY;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return CHROME_SYNC;
            case 81:
                return SMARTDEVICE_SETUP_ACCOUNTS_BOOTSTRAP;
            case 82:
                return GSA;
            case 83:
                return CAST_REMOTE_DISPLAY;
            case 84:
                return TRUSTAGENT;
            case 85:
                return TRUSTAGENT_STATE;
            case 86:
                return YOUTUBE;
            case 87:
                return AUTH_SIGN_IN;
            case 88:
                return VISION;
            case 89:
                return TRUSTAGENT_BRIDGE;
            case 90:
                return BACKUP_STATS;
            case 91:
                return AUTH_GOOGLE_SIGN_IN;
            case 93:
                return MEASUREMENT;
            case 94:
                return WEAVE_DEVICE;
            case 95:
                return AD_MEASUREMENT;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return CHROME_SYNC_PREFERENCES;
            case 97:
                return CHROME_SYNC_PASSWORD;
            case 98:
                return FREIGHTER;
            case 99:
                return WEAVE_MANAGEMENT;
            case 100:
                return WEAVE_COMMAND;
            case 101:
                return WEAVE_APP_ACCESS;
            case 102:
                return WEAVE_EVENT;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return WEAVE_LOCAL_STATELESS_DEVICE;
            case ErrorInfo.TYPE_SDU_FAILED:
                return AUTH_AUTHZEN_KEY;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return SCREEN_CAPTURE;
            case 106:
                return APP_INVITE_INTERNAL;
            case 107:
                return AUTH_AUTHZEN_INTERNAL_DATA;
            case 108:
                return AUTH_PROXIMITY;
            case 109:
                return ACCOUNT_SETTINGS;
            case 110:
                return GUNS;
            case 111:
                return BEACON;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                return FIREBASE_AUTH;
            case 113:
                return APP_INDEXING;
            case 114:
                return WALLET_P2P;
            case 115:
                return WALLET_P2P_INTERNAL;
            case 116:
                return GASS;
            case 117:
                return U2F_API;
            case 118:
                return U2F_PRIVILEGED_API;
            case 119:
                return U2F_ZERO_PARTY_API;
            case 120:
                return WORK_ACCOUNT_API;
            case 121:
                return INSTANT_APPS;
            case 122:
                return CAST_FIRST_PARTY;
            case 123:
                return ADMOB_CACHE;
            case 124:
                return BOOT_COUNT;
            case 125:
                return FIT_GOALS;
            case 126:
                return SMS_RETRIEVER;
            case 127:
                return MOBILE_DATA_HUB;
            case 128:
                return AUTH_ACCOUNT_TRANSFER;
            case 129:
                return CRYPTAUTH_API;
            case 130:
                return CHECKIN_API;
            case 131:
                return DYNAMIC_LINKS_API;
            case 132:
                return FONT_API;
            case 133:
                return TEST_SUPPORT;
            case 134:
                return LOCATION_SHARING;
            case 135:
                return ROMANESCO;
            case 136:
                return AUTH_MANAGED_EMM_API;
            case 137:
                return NETWORK_SCORER;
            case 138:
                return NETWORK_RECOMMENDATION;
            case 139:
                return BRELLA;
            case 140:
                return RESTORE_SESSION;
            case 141:
                return PEER_DOWNLOAD_MANAGER;
            case 142:
                return AUTH_PROXIMITY_DEVICE_SYNC;
            case 143:
                return REACHABILITY;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                return AUTH_PROXIMITY_SECURE_CHANNEL;
            case 145:
                return PREDICT_ON_DEVICE;
            case 146:
                return APP_PREVIEW_MESSAGING;
            case 147:
                return LOCAL_RESTORE;
            case 148:
                return FIDO2_API;
            case 149:
                return FIDO2_PRIVILEGED_API;
            case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                return TELEPHONY_SPAM;
            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                return AUTH_UNCERTIFIED_DEVICE;
            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                return MOBILE_DATA_DOWNLOAD;
            case MfiClientException.TYPE_MFICLIENT_STARTED:
                return AUTH_ACCOUNT_DATA;
            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                return AUDIT;
            case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                return CONSTELLATION;
            case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                return GROWTH;
            case MfiClientException.TYPE_CARD_NOT_CACHED:
                return SYSTEM_UPDATE;
            case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                return MOBILE_DATA_PLAN;
            case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                return SMARTDEVICE_WIFI_HELPER;
            case 160:
                return MOBSTORE_FILE;
            case 161:
                return CAST_API;
            case 162:
                return CURATOR;
            case 163:
                return USER_LOCATION;
            case 164:
                return MOBILE_DATA_HUB_LISTENER;
            case 165:
                return EXAMPLE;
            case 166:
                return ADMOB_HTTP_CLIENT;
            case 167:
                return LANGUAGE_PROFILE;
            case 168:
                return MDNS;
            case 169:
                return NEARBY_SETUP;
            case 170:
                return ANALYTICS;
            case 171:
                return SUBSCRIPTIONS;
            case 172:
                return FOLSOM;
            case 173:
                return SEMANTIC_LOCATION;
            case 174:
                return VEHICLE;
            case 175:
                return BACKUP_NOW;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER /*176*/:
                return AUTH_EARLY_UPDATE;
            case 177:
                return AUTOFILL;
            case 178:
                return MATCHSTICK;
            case 179:
                return AUTH_CREDENTIALS_INTERNAL;
            case 180:
                return FIDO2_ZERO_PARTY_API;
            case 181:
                return G1_RESTORE;
            case 182:
                return G1_BACKUP;
            case 183:
                return CODELAB;
            case 184:
                return DRIVING_MODE;
            case 185:
                return OSS_LICENSES_SERVICE;
            case 186:
                return CLEAR_CONTACT_INTERACTIONS_SERVICE;
            case 187:
                return AUTH_MANAGED_POLICY_SERVICE;
            case 188:
                return PAY_SECURE_ELEMENT_SERVICE;
            case 189:
                return RCS;
            case 190:
                return SMARTDEVICE_POST_SETUP;
            case 191:
                return CARRIER_AUTH;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC /*192*/:
                return SYSTEM_UPDATE_SINGLE_USER;
            case 193:
                return APPUSAGE;
            case 194:
                return NEARBY_SHARING;
            case 195:
                return ADMOB_CONSENT_SERVICE;
            case 196:
                return CREDENTIAL_MANAGER;
            case 197:
                return SMS_RETRIEVER_INTERNAL;
            case 198:
                return PAY;
            case ErrorInfo.TYPE_SDU_UNKNOWN:
                return ASTERISM;
            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                return MOBILE_SUBSCRIPTION;
            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                return GMS_RESTORE;
            case 202:
                return FACS_CACHE;
            case 203:
                return ADMOB_SDK_SIGNAL;
            case 204:
                return PLATFORM_CONFIGURATOR;
            case 205:
                return RECAPTCHA;
            case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                return DUOKIT_SERVICE;
            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                return SYSTEM_UPDATE_TV_API;
            case 208:
                return CONTACTS_SYNC_SERVICE;
            case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                return FEEDBACK_CAR;
            case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                return SMARTDEVICE_SOURCE_DIRECT_TRANSFER;
            case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                return SMARTDEVICE_TARGET_DIRECT_TRANSFER;
            case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                return AUTH_API_IDENTITY_SIGNIN;
            case BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED:
                return IDENTITY_GIS_INTERNAL;
            case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                return FIDO_CREDENTIAL_STORE;
            case BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR:
                return MDI_SYNC;
            case BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR:
                return EVENT_ATTESTATION;
            case BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR:
                return GCONNECT_EXP;
            case BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT:
                return SCHEDULER;
            case BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE:
                return AUTH_API_IDENTITY_AUTHORIZATION;
            case 220:
                return FACS_INTERNAL_SYNC;
            case 221:
                return AUTH_CONFIG_SYNC;
            case 222:
                return ENTERPRISE;
            case 223:
                return AUTH_API_IDENTITY_CREDENTIAL_SAVING;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD /*224*/:
                return GOOGLE_AUTH;
            case 225:
                return ENTERPRISE_LOADER;
            case 226:
                return THUNDERBIRD;
        }
    }

    /* renamed from: b */
    public static bxvr m35207b() {
        return sgi.f44180a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f44408ds;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
