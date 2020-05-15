package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bxco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxco implements bxvp {
    UNKNOWN_CONTEXT_NAME(0),
    USER_LOCATION(1),
    USER_LOCATION_FAMILIARITY(2),
    USER_LOCATION_FORECAST(3),
    MAPS_VIEWPORT(4),
    MAPS_VIEWPORT_FAMILIARITY(5),
    DETECTED_ACTIVITY(6),
    SCREEN(7),
    POWER_CONNECTION(8),
    TRUST_SIGNAL(9),
    TRUST_DECISION(10),
    EXPERIMENTAL1_UPLOAD_RESTRICTED(11),
    EXPERIMENTAL2_UPLOAD_OK(12),
    EXPERIMENTAL3_UPLOAD_OK(13),
    SNAPPED_TO_ROAD_LOCATION(14),
    SEMANTIC_STATE(15),
    TRAVEL(16),
    WIFI_SCAN(17),
    PLACES(18),
    CALENDAR_EVENT(19),
    RUNNING_APPS(20),
    CONTENT_INTERESTS(21),
    CAST_EVENT(22),
    PLACE_INTERESTS(23),
    AUDIO_STATE(24),
    PHONE_LOCK(25),
    DETECTED_BEACON(26),
    NETWORK_STATE(27),
    RECENT_VISITS(28),
    SNAPPED_PLACES(29),
    SNAPPED_CITY(30),
    WEATHER(31),
    WANDER_STATE(32),
    PROVIDER_AFFINITIES(34),
    ROUTINES(35),
    DAY_ATTRIBUTES(36),
    PHONE_CALL(37),
    PROXIMITY_DISTANCE(38),
    INSTALLED_APPS(39),
    SHOPPING(40),
    PERSONAS(41),
    LANGUAGES(42),
    SUN_STATE(43),
    DEMOGRAPHICS(44),
    TIME_PROPERTY(45),
    DESTINATION_PREDICTION(46),
    PARKING_LOCATIONS(47),
    USER_VELOCITY(48),
    PERSONAL_INTELLIGENCE(49),
    QUERY_PIVOT(50),
    PROACTIVE_INTENTS(51),
    XGEO_HEADER(52),
    DISTILL_LOCATION_PROFILE(53),
    USER_EMBEDDING(54),
    WEATHER_INTERNAL(55),
    INTEREST_ENTITY_EMBEDDINGS(56),
    INDOOR_OUTDOOR(57),
    VASCO_TASK_SUGGESTIONS(58),
    DND_MODE(59),
    CURRENT_PLACES(60),
    AWARE_PROFILE(61),
    DEVICE_LOCALE(62),
    ACTIVITY_TIMELINE(63),
    ACTIVITY_URL(64),
    ACTIVITY_DOMAIN(65),
    ACTIVITY_PLACE_VISIT(66),
    ACTIVITY_INTENT(69),
    ACTIVITY_VASCO_TASK(72),
    ACTIVITY_FEED_CARD(83),
    MAPS_NAVIGATION_STATE(67),
    SEARCH_DEVICE(68),
    GEO_NOTIFICATION_SCORES(70),
    INTEREST_ENTITY_SIMILARITY(71),
    CONTENT_CONSUMPTION(73),
    SEMANTIC_LOCATION(74),
    LOCATION_CONTEXT(75),
    SEARCH_INPUT_METHOD(76),
    KE_PARAMS(77),
    PRODUCT_USER_STATE(78),
    ACTIVITY_TRANSPOSE(79),
    SEARCH_UGC_INTERESTS(80),
    ON_COMMUTE(81),
    USER_RELATION_TO_PLACES(82),
    DISCOVER_ACTIONS_PROFILE(84),
    RELATED_ACTIVITY(85),
    STATEFUL_ACTIVITY_RECOMMENDED(86),
    STATEFUL_ACTIVITY_RELATED(87),
    STATEFUL_ACTIVITY_RENDERABLE(88),
    STATEFUL_TASK_ACTIVE(89),
    STATEFUL_TASK_RELATED(90),
    WIFI_CONNECTION_STATE(91),
    GEO_UGC_MOTIVATION(92),
    SEARCH_SUGGEST_STATE(93),
    GEO_MERCHANT_IDENTIFICATION_STATE(94),
    SHERLOCK_AFFINITY(95),
    USER_ACTIVITY_COUNTS(96),
    SHOPPING_PREFERENCE_PROFILE(97),
    GOG_CONTRIBUTOR_PROFILE(98),
    CROSSPATH_REPRESENTATIVE_ITEMS(99),
    USER_LOCATION_FAMILIARITY_MODEL(10000),
    HOTWORD_SPEAKER_MODEL(10001),
    UDC_FOOTPRINTS_SETTINGS_MODEL(10002),
    SAFE_LOCATION_MODEL(10003),
    PERSONALIZED_PLACES(10004),
    ALIASED_PLACES(10005),
    CONTEXT_DELTA(10006),
    LOCALE_BASED_TIME_MODEL(10007),
    FENCE_FEEDBACK(10008),
    FENCE_STATE(10009),
    LOCALLY_PRODUCED_BLOCK_START_MARKER(10999),
    UNSPECIFIED_LOCAL_CONTEXT0(11000),
    UNSPECIFIED_LOCAL_CONTEXT1(11001),
    UNSPECIFIED_LOCAL_CONTEXT2(11002),
    UNSPECIFIED_LOCAL_CONTEXT3(11003),
    UNSPECIFIED_LOCAL_CONTEXT4(11004),
    UNSPECIFIED_LOCAL_CONTEXT5(11005),
    UNSPECIFIED_LOCAL_CONTEXT6(11006),
    UNSPECIFIED_LOCAL_CONTEXT7(11007),
    UNSPECIFIED_LOCAL_CONTEXT8(11008),
    UNSPECIFIED_LOCAL_CONTEXT9(11009),
    BACKEND_PRODUCED_BLOCK_START_MARKER(11999),
    UNSPECIFIED_BACKEND_CONTEXT0(12000),
    UNSPECIFIED_BACKEND_CONTEXT1(12001),
    UNSPECIFIED_BACKEND_CONTEXT2(12002),
    UNSPECIFIED_BACKEND_CONTEXT3(12003),
    UNSPECIFIED_BACKEND_CONTEXT4(12004),
    UNSPECIFIED_BACKEND_CONTEXT5(12005),
    UNSPECIFIED_BACKEND_CONTEXT6(12006),
    UNSPECIFIED_BACKEND_CONTEXT7(12007),
    UNSPECIFIED_BACKEND_CONTEXT8(12008),
    UNSPECIFIED_BACKEND_CONTEXT9(12009),
    DUMMY_EXPERIMENTAL_AUTO_RW_MARKER(99999),
    DUMMY_EXPERIMENTAL_AUTO_RW_1(100000);
    

    /* renamed from: bD */
    public final int f162973bD;

    private bxco(int i) {
        this.f162973bD = i;
    }

    /* renamed from: a */
    public static bxco m122577a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTEXT_NAME;
            case 1:
                return USER_LOCATION;
            case 2:
                return USER_LOCATION_FAMILIARITY;
            case 3:
                return USER_LOCATION_FORECAST;
            case 4:
                return MAPS_VIEWPORT;
            case 5:
                return MAPS_VIEWPORT_FAMILIARITY;
            case 6:
                return DETECTED_ACTIVITY;
            case 7:
                return SCREEN;
            case 8:
                return POWER_CONNECTION;
            case 9:
                return TRUST_SIGNAL;
            case 10:
                return TRUST_DECISION;
            case 11:
                return EXPERIMENTAL1_UPLOAD_RESTRICTED;
            case 12:
                return EXPERIMENTAL2_UPLOAD_OK;
            case 13:
                return EXPERIMENTAL3_UPLOAD_OK;
            case 14:
                return SNAPPED_TO_ROAD_LOCATION;
            case 15:
                return SEMANTIC_STATE;
            case 16:
                return TRAVEL;
            case 17:
                return WIFI_SCAN;
            case 18:
                return PLACES;
            case 19:
                return CALENDAR_EVENT;
            case 20:
                return RUNNING_APPS;
            case 21:
                return CONTENT_INTERESTS;
            case 22:
                return CAST_EVENT;
            case 23:
                return PLACE_INTERESTS;
            case 24:
                return AUDIO_STATE;
            case 25:
                return PHONE_LOCK;
            case 26:
                return DETECTED_BEACON;
            case 27:
                return NETWORK_STATE;
            case 28:
                return RECENT_VISITS;
            case 29:
                return SNAPPED_PLACES;
            case 30:
                return SNAPPED_CITY;
            case 31:
                return WEATHER;
            case 32:
                return WANDER_STATE;
            default:
                switch (i) {
                    case 34:
                        return PROVIDER_AFFINITIES;
                    case 35:
                        return ROUTINES;
                    case 36:
                        return DAY_ATTRIBUTES;
                    case FelicaException.TYPE_NOT_CLOSED:
                        return PHONE_CALL;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        return PROXIMITY_DISTANCE;
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        return INSTALLED_APPS;
                    case FelicaException.TYPE_PUSH_FAILED:
                        return SHOPPING;
                    case 41:
                        return PERSONAS;
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                        return LANGUAGES;
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                        return SUN_STATE;
                    case FelicaException.TYPE_RESET_FAILED:
                        return DEMOGRAPHICS;
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        return TIME_PROPERTY;
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                        return DESTINATION_PREDICTION;
                    case 47:
                        return PARKING_LOCATIONS;
                    case 48:
                        return USER_VELOCITY;
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        return PERSONAL_INTELLIGENCE;
                    case 50:
                        return QUERY_PIVOT;
                    case 51:
                        return PROACTIVE_INTENTS;
                    case 52:
                        return XGEO_HEADER;
                    case 53:
                        return DISTILL_LOCATION_PROFILE;
                    case 54:
                        return USER_EMBEDDING;
                    case 55:
                        return WEATHER_INTERNAL;
                    case FelicaException.TYPE_ACTIVATE_FAILED:
                        return INTEREST_ENTITY_EMBEDDINGS;
                    case 57:
                        return INDOOR_OUTDOOR;
                    case FelicaException.TYPE_OFFLINE_CANCELED:
                        return VASCO_TASK_SUGGESTIONS;
                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        return DND_MODE;
                    case FelicaException.TYPE_MFC_NOT_FOUND:
                        return CURRENT_PLACES;
                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                        return AWARE_PROFILE;
                    case 62:
                        return DEVICE_LOCALE;
                    case 63:
                        return ACTIVITY_TIMELINE;
                    case 64:
                        return ACTIVITY_URL;
                    case KeyInformation.AES128_DES56:
                        return ACTIVITY_DOMAIN;
                    case 66:
                        return ACTIVITY_PLACE_VISIT;
                    case KeyInformation.AES128_DES112:
                        return MAPS_NAVIGATION_STATE;
                    case 68:
                        return SEARCH_DEVICE;
                    case 69:
                        return ACTIVITY_INTENT;
                    case 70:
                        return GEO_NOTIFICATION_SCORES;
                    case 71:
                        return INTEREST_ENTITY_SIMILARITY;
                    case 72:
                        return ACTIVITY_VASCO_TASK;
                    case 73:
                        return CONTENT_CONSUMPTION;
                    case 74:
                        return SEMANTIC_LOCATION;
                    case 75:
                        return LOCATION_CONTEXT;
                    case 76:
                        return SEARCH_INPUT_METHOD;
                    case 77:
                        return KE_PARAMS;
                    case 78:
                        return PRODUCT_USER_STATE;
                    case KeyInformation.AES128:
                        return ACTIVITY_TRANSPOSE;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE:
                        return SEARCH_UGC_INTERESTS;
                    case 81:
                        return ON_COMMUTE;
                    case 82:
                        return USER_RELATION_TO_PLACES;
                    case 83:
                        return ACTIVITY_FEED_CARD;
                    case 84:
                        return DISCOVER_ACTIONS_PROFILE;
                    case 85:
                        return RELATED_ACTIVITY;
                    case 86:
                        return STATEFUL_ACTIVITY_RECOMMENDED;
                    case 87:
                        return STATEFUL_ACTIVITY_RELATED;
                    case 88:
                        return STATEFUL_ACTIVITY_RENDERABLE;
                    case 89:
                        return STATEFUL_TASK_ACTIVE;
                    case 90:
                        return STATEFUL_TASK_RELATED;
                    case 91:
                        return WIFI_CONNECTION_STATE;
                    case 92:
                        return GEO_UGC_MOTIVATION;
                    case 93:
                        return SEARCH_SUGGEST_STATE;
                    case 94:
                        return GEO_MERCHANT_IDENTIFICATION_STATE;
                    case 95:
                        return SHERLOCK_AFFINITY;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME:
                        return USER_ACTIVITY_COUNTS;
                    case 97:
                        return SHOPPING_PREFERENCE_PROFILE;
                    case 98:
                        return GOG_CONTRIBUTOR_PROFILE;
                    case 99:
                        return CROSSPATH_REPRESENTATIVE_ITEMS;
                    default:
                        switch (i) {
                            case 10000:
                                return USER_LOCATION_FAMILIARITY_MODEL;
                            case 10001:
                                return HOTWORD_SPEAKER_MODEL;
                            case 10002:
                                return UDC_FOOTPRINTS_SETTINGS_MODEL;
                            case 10003:
                                return SAFE_LOCATION_MODEL;
                            case 10004:
                                return PERSONALIZED_PLACES;
                            case 10005:
                                return ALIASED_PLACES;
                            case 10006:
                                return CONTEXT_DELTA;
                            case 10007:
                                return LOCALE_BASED_TIME_MODEL;
                            case 10008:
                                return FENCE_FEEDBACK;
                            case 10009:
                                return FENCE_STATE;
                            default:
                                switch (i) {
                                    case 10999:
                                        return LOCALLY_PRODUCED_BLOCK_START_MARKER;
                                    case 11000:
                                        return UNSPECIFIED_LOCAL_CONTEXT0;
                                    case 11001:
                                        return UNSPECIFIED_LOCAL_CONTEXT1;
                                    case 11002:
                                        return UNSPECIFIED_LOCAL_CONTEXT2;
                                    case 11003:
                                        return UNSPECIFIED_LOCAL_CONTEXT3;
                                    case 11004:
                                        return UNSPECIFIED_LOCAL_CONTEXT4;
                                    case 11005:
                                        return UNSPECIFIED_LOCAL_CONTEXT5;
                                    case 11006:
                                        return UNSPECIFIED_LOCAL_CONTEXT6;
                                    case 11007:
                                        return UNSPECIFIED_LOCAL_CONTEXT7;
                                    case 11008:
                                        return UNSPECIFIED_LOCAL_CONTEXT8;
                                    case 11009:
                                        return UNSPECIFIED_LOCAL_CONTEXT9;
                                    default:
                                        switch (i) {
                                            case 11999:
                                                return BACKEND_PRODUCED_BLOCK_START_MARKER;
                                            case 12000:
                                                return UNSPECIFIED_BACKEND_CONTEXT0;
                                            case 12001:
                                                return UNSPECIFIED_BACKEND_CONTEXT1;
                                            case 12002:
                                                return UNSPECIFIED_BACKEND_CONTEXT2;
                                            case 12003:
                                                return UNSPECIFIED_BACKEND_CONTEXT3;
                                            case 12004:
                                                return UNSPECIFIED_BACKEND_CONTEXT4;
                                            case 12005:
                                                return UNSPECIFIED_BACKEND_CONTEXT5;
                                            case 12006:
                                                return UNSPECIFIED_BACKEND_CONTEXT6;
                                            case 12007:
                                                return UNSPECIFIED_BACKEND_CONTEXT7;
                                            case 12008:
                                                return UNSPECIFIED_BACKEND_CONTEXT8;
                                            case 12009:
                                                return UNSPECIFIED_BACKEND_CONTEXT9;
                                            default:
                                                switch (i) {
                                                    case 99999:
                                                        return DUMMY_EXPERIMENTAL_AUTO_RW_MARKER;
                                                    case 100000:
                                                        return DUMMY_EXPERIMENTAL_AUTO_RW_1;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m122578b() {
        return bxcn.f162838a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f162973bD;
    }

    public final String toString() {
        return Integer.toString(this.f162973bD);
    }
}
