package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bvmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvmj implements bxvp {
    AT_LEAST_ONE_SEEN(0),
    HP_MULTIPLICATIVE(1),
    MAX_RSSI(2),
    NONE_SEEN(3),
    REGISTERED_PROPORTION_SEEN(4),
    SEEN_PROPORTION_REGISTERED(5),
    ALIASED_LOCATION(6),
    CONF_HOME(7),
    CONF_WORK(8),
    INF_HOME(9),
    INF_WORK(10),
    SEARCHED_ADDRESS(11),
    BUSINESS_HOURS_OVER_LAP(12),
    DISTANCE_FAR(13),
    MODE_SOURCE(14),
    NORM_DISTANCE(15),
    NORM_DISTANCE2(16),
    NORM_NP_DISTANCE(17),
    HID_NODE_1(18),
    HID_NODE_2(19),
    HID_NODE_3(20),
    HID_NODE_4(21),
    MEAN_COS_SIMILARITY_60_ZERO(22),
    MEAN_COS_SIMILARITY_ZERO(23),
    MEAN_COS_KMEANS_MAX_SIMILARITY_ZERO(24),
    SPOTTER(25),
    GEO_BINARY_PAST(26),
    MEDIAN_ACCURACY(27),
    DISTANCE_KM(28),
    MEAN_COS_SIMILARITY(29),
    MEAN_COS_SIMILARITY_60(30),
    MEAN_COS_KMEANS_MAX_SIMILARITY(31),
    MEAN_COS_SIMILARITY_ABSENT(32),
    MEAN_COS_SIMILARITY_60_ABSENT(33),
    MEAN_COS_KMEANS_MAX_SIMILARITY_ABSENT(34),
    TIME_OF_DAY_FROM_4AM(35),
    DAY_IN_WEEK_FROM_MON(36),
    CALENDAR_EVENT_HOURS_PAST(37),
    CAR_RENTAL_PICKUP_HOURS_PAST(38),
    CAR_RENTAL_RETURN_HOURS_PAST(39),
    CONTACT_HOME_HOURS_PAST(40),
    CONTACT_OTHER_HOURS_PAST(41),
    CONTACT_WORK_HOURS_PAST(42),
    EMAIL_PIVOTAL_SIGNAL_HOURS_PAST(43),
    FLIGHT_ARRIVAL_HOURS_PAST(44),
    FLIGHT_DEPARTURE_HOURS_PAST(45),
    FLIGHT_LAYOVER_HOURS_PAST(46),
    HOTEL_RESERVATION_HOURS_PAST(47),
    LOW_CONFIDENCE_EVENT_RESERVATION_HOURS_PAST(48),
    MAPS_CLICKS_CLICK_TO_CALL_HOURS_PAST(49),
    MAPS_CLICKS_LOCALSEARCH_DETAIL_HOURS_PAST(50),
    MAPS_CLICKS_LOCALSEARCH_MARKER_HOURS_PAST(51),
    MAPS_CLICKS_LOCALSEARCH_TRUFFLE_HOURS_PAST(52),
    MAPS_CLICKS_NAVIGATION_HOURS_PAST(53),
    MAPS_CLICKS_NOT_INTERESTED_HOURS_PAST(54),
    MAPS_CLICKS_HOURS_PAST(55),
    MAPS_CLICKS_SMARTMAPS_HOURS_PAST(56),
    MAPS_CLICKS_START_DIRECTIONS_HOURS_PAST(57),
    MAPS_DIRECTIONS_HOURS_PAST(58),
    MAPS_EMBED_LOAD_DIRECTIONS_HOURS_PAST(59),
    MAPS_EMBED_LOAD_DIRECTION_RESULTS_HOURS_PAST(60),
    MAPS_EMBED_LOAD_ENTITY_HOURS_PAST(61),
    MAPS_EMBED_LOAD_RESULTS_HOURS_PAST(62),
    MAPS_EMBED_LOAD_SEARCH_HOURS_PAST(63),
    MAPS_NAV_RESULTS_HOURS_PAST(64),
    MAPS_QUERIES_HOURS_PAST(65),
    MAPS_QUERIES_START_NAVIGATION_HOURS_PAST(66),
    MAPS_RESULTS_HOURS_PAST(67),
    PERSONAL_RECOMMENDATION_EVENT_HOURS_PAST(68),
    PERSONAL_RECOMMENDATION_PLACE_HOURS_PAST(69),
    PLACE_RATING_HOURS_PAST(70),
    PLACE_REVIEW_HOURS_PAST(71),
    PLACE_STAR_HOURS_PAST(72),
    PLACE_VISIT_USER_EDIT_HOURS_PAST(73),
    PLUS_ONE_HOURS_PAST(74),
    RECOMMENDED_EVENT_RESERVATION_HOURS_PAST(75),
    RESTAURANT_RESERVATION_HOURS_PAST(76),
    SEARCH_CLICKS_HOURS_PAST(77),
    SEARCH_NAV_RESULTS_HOURS_PAST(78),
    SEARCH_RESULTS_HOURS_PAST(79),
    SEARCH_QUERIES_HOURS_PAST(80),
    SHIPMENT_HOURS_PAST(81),
    SOCIAL_EVENT_RESERVATION_HOURS_PAST(82),
    TRIP_HOURS_PAST(83),
    TRAVEL_LOCATION_INTENT_HOURS_PAST(84),
    DURATION_SINCE_PLACE_VISIT_HRS(85),
    PLACE_VISIT_FRACTION_EXACT_DAY_HOUR_MATCH(86),
    PLACE_VISIT_FRACTION_WEEKDAY_HOUR_MATCH(87),
    PLACE_VISIT_FRACTION_WEEKEND_HOUR_MATCH(88),
    CHECKIN_EDIT_HOURS_PAST(89);
    

    /* renamed from: aM */
    public final int f156743aM;

    private bvmj(int i) {
        this.f156743aM = i;
    }

    /* renamed from: a */
    public static bvmj m121259a(int i) {
        switch (i) {
            case 0:
                return AT_LEAST_ONE_SEEN;
            case 1:
                return HP_MULTIPLICATIVE;
            case 2:
                return MAX_RSSI;
            case 3:
                return NONE_SEEN;
            case 4:
                return REGISTERED_PROPORTION_SEEN;
            case 5:
                return SEEN_PROPORTION_REGISTERED;
            case 6:
                return ALIASED_LOCATION;
            case 7:
                return CONF_HOME;
            case 8:
                return CONF_WORK;
            case 9:
                return INF_HOME;
            case 10:
                return INF_WORK;
            case 11:
                return SEARCHED_ADDRESS;
            case 12:
                return BUSINESS_HOURS_OVER_LAP;
            case 13:
                return DISTANCE_FAR;
            case 14:
                return MODE_SOURCE;
            case 15:
                return NORM_DISTANCE;
            case 16:
                return NORM_DISTANCE2;
            case 17:
                return NORM_NP_DISTANCE;
            case 18:
                return HID_NODE_1;
            case 19:
                return HID_NODE_2;
            case 20:
                return HID_NODE_3;
            case 21:
                return HID_NODE_4;
            case 22:
                return MEAN_COS_SIMILARITY_60_ZERO;
            case 23:
                return MEAN_COS_SIMILARITY_ZERO;
            case 24:
                return MEAN_COS_KMEANS_MAX_SIMILARITY_ZERO;
            case 25:
                return SPOTTER;
            case 26:
                return GEO_BINARY_PAST;
            case 27:
                return MEDIAN_ACCURACY;
            case 28:
                return DISTANCE_KM;
            case 29:
                return MEAN_COS_SIMILARITY;
            case 30:
                return MEAN_COS_SIMILARITY_60;
            case 31:
                return MEAN_COS_KMEANS_MAX_SIMILARITY;
            case 32:
                return MEAN_COS_SIMILARITY_ABSENT;
            case 33:
                return MEAN_COS_SIMILARITY_60_ABSENT;
            case 34:
                return MEAN_COS_KMEANS_MAX_SIMILARITY_ABSENT;
            case 35:
                return TIME_OF_DAY_FROM_4AM;
            case 36:
                return DAY_IN_WEEK_FROM_MON;
            case FelicaException.TYPE_NOT_CLOSED:
                return CALENDAR_EVENT_HOURS_PAST;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return CAR_RENTAL_PICKUP_HOURS_PAST;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return CAR_RENTAL_RETURN_HOURS_PAST;
            case FelicaException.TYPE_PUSH_FAILED:
                return CONTACT_HOME_HOURS_PAST;
            case 41:
                return CONTACT_OTHER_HOURS_PAST;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return CONTACT_WORK_HOURS_PAST;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return EMAIL_PIVOTAL_SIGNAL_HOURS_PAST;
            case FelicaException.TYPE_RESET_FAILED:
                return FLIGHT_ARRIVAL_HOURS_PAST;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return FLIGHT_DEPARTURE_HOURS_PAST;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return FLIGHT_LAYOVER_HOURS_PAST;
            case 47:
                return HOTEL_RESERVATION_HOURS_PAST;
            case 48:
                return LOW_CONFIDENCE_EVENT_RESERVATION_HOURS_PAST;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return MAPS_CLICKS_CLICK_TO_CALL_HOURS_PAST;
            case 50:
                return MAPS_CLICKS_LOCALSEARCH_DETAIL_HOURS_PAST;
            case 51:
                return MAPS_CLICKS_LOCALSEARCH_MARKER_HOURS_PAST;
            case 52:
                return MAPS_CLICKS_LOCALSEARCH_TRUFFLE_HOURS_PAST;
            case 53:
                return MAPS_CLICKS_NAVIGATION_HOURS_PAST;
            case 54:
                return MAPS_CLICKS_NOT_INTERESTED_HOURS_PAST;
            case 55:
                return MAPS_CLICKS_HOURS_PAST;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return MAPS_CLICKS_SMARTMAPS_HOURS_PAST;
            case 57:
                return MAPS_CLICKS_START_DIRECTIONS_HOURS_PAST;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return MAPS_DIRECTIONS_HOURS_PAST;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return MAPS_EMBED_LOAD_DIRECTIONS_HOURS_PAST;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return MAPS_EMBED_LOAD_DIRECTION_RESULTS_HOURS_PAST;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return MAPS_EMBED_LOAD_ENTITY_HOURS_PAST;
            case 62:
                return MAPS_EMBED_LOAD_RESULTS_HOURS_PAST;
            case 63:
                return MAPS_EMBED_LOAD_SEARCH_HOURS_PAST;
            case 64:
                return MAPS_NAV_RESULTS_HOURS_PAST;
            case KeyInformation.AES128_DES56:
                return MAPS_QUERIES_HOURS_PAST;
            case 66:
                return MAPS_QUERIES_START_NAVIGATION_HOURS_PAST;
            case KeyInformation.AES128_DES112:
                return MAPS_RESULTS_HOURS_PAST;
            case 68:
                return PERSONAL_RECOMMENDATION_EVENT_HOURS_PAST;
            case 69:
                return PERSONAL_RECOMMENDATION_PLACE_HOURS_PAST;
            case 70:
                return PLACE_RATING_HOURS_PAST;
            case 71:
                return PLACE_REVIEW_HOURS_PAST;
            case 72:
                return PLACE_STAR_HOURS_PAST;
            case 73:
                return PLACE_VISIT_USER_EDIT_HOURS_PAST;
            case 74:
                return PLUS_ONE_HOURS_PAST;
            case 75:
                return RECOMMENDED_EVENT_RESERVATION_HOURS_PAST;
            case 76:
                return RESTAURANT_RESERVATION_HOURS_PAST;
            case 77:
                return SEARCH_CLICKS_HOURS_PAST;
            case 78:
                return SEARCH_NAV_RESULTS_HOURS_PAST;
            case KeyInformation.AES128:
                return SEARCH_RESULTS_HOURS_PAST;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE:
                return SEARCH_QUERIES_HOURS_PAST;
            case 81:
                return SHIPMENT_HOURS_PAST;
            case 82:
                return SOCIAL_EVENT_RESERVATION_HOURS_PAST;
            case 83:
                return TRIP_HOURS_PAST;
            case 84:
                return TRAVEL_LOCATION_INTENT_HOURS_PAST;
            case 85:
                return DURATION_SINCE_PLACE_VISIT_HRS;
            case 86:
                return PLACE_VISIT_FRACTION_EXACT_DAY_HOUR_MATCH;
            case 87:
                return PLACE_VISIT_FRACTION_WEEKDAY_HOUR_MATCH;
            case 88:
                return PLACE_VISIT_FRACTION_WEEKEND_HOUR_MATCH;
            case 89:
                return CHECKIN_EDIT_HOURS_PAST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m121260b() {
        return bvmi.f156651a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156743aM;
    }

    public final String toString() {
        return Integer.toString(this.f156743aM);
    }
}
