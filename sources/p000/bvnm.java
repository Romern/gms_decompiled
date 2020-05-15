package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bvnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvnm implements bxvp {
    INVALID(0),
    DEPRECATED_BEENTHERE_ENTITY(186),
    DEPRECATED_HAPTIC_PLACE(188),
    FLIGHT_DEPARTURE(100),
    FLIGHT_ARRIVAL(101),
    FLIGHT_LAYOVER(102),
    SEARCH_CLICKS(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED),
    SEARCH_QUERIES(MfiClientException.TYPE_MFICLIENT_NOT_FOUND),
    SEARCH_RESULTS(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED),
    SEARCH_NAV_RESULTS(MfiClientException.TYPE_MFICLIENT_STARTED),
    MAPS_CLICKS(160),
    MAPS_QUERIES(161),
    MAPS_QUERIES_START_NAVIGATION(178),
    MAPS_RESULTS(162),
    MAPS_NAV_RESULTS(163),
    MAPS_DIRECTIONS(164),
    MAPS_CLICKS_CLICK_TO_CALL(165),
    MAPS_CLICKS_LOCALSEARCH_DETAIL(166),
    MAPS_CLICKS_LOCALSEARCH_MARKER(167),
    MAPS_CLICKS_LOCALSEARCH_TRUFFLE(179),
    MAPS_CLICKS_SMARTMAPS(168),
    MAPS_CLICKS_START_DIRECTIONS(169),
    MAPS_CLICKS_NAVIGATION(182),
    MAPS_CLICKS_NOT_INTERESTED(184),
    MAPS_CLICKS_HERE(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    MAPS_EMBED_LOAD_ENTITY(198),
    MAPS_EMBED_LOAD_SEARCH(ErrorInfo.TYPE_SDU_UNKNOWN),
    MAPS_EMBED_LOAD_DIRECTIONS(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    MAPS_EMBED_LOAD_RESULTS(204),
    MAPS_EMBED_LOAD_DIRECTION_RESULTS(205),
    HOTEL_RESERVATION(170),
    RESTAURANT_RESERVATION(171),
    GOOGLE_PLUS_CHECKIN(172),
    PLUS_ONE(173),
    PLACE_REVIEW(174),
    PLACE_RATING(181),
    CALENDAR_EVENT(175),
    PLACE_STAR(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER),
    PLACE_ON_LIST(BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR),
    DEPRECATED_PLACE_EDIT(180),
    PLACE_VISIT_USER_EDIT(196),
    CHECKIN_EDIT(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR),
    PLACE_BEEN_HERE(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    DEPRECATED_IMAGE(177),
    IMAGE_USER_SPECIFIED(193),
    IMAGE_EXIF(194),
    IMAGE_LANDMARK_DETECTION(195),
    DEPRECATED_SOCIAL_EVENT(183),
    SOCIAL_EVENT_RESERVATION(185),
    LOW_CONFIDENCE_EVENT_RESERVATION(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD),
    RECOMMENDED_EVENT_RESERVATION(BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED),
    REMINDER(187),
    CAR_RENTAL_PICKUP(189),
    CAR_RENTAL_RETURN(190),
    CONTACT_HOME(191),
    CONTACT_WORK(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC),
    CONTACT_OTHER(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE),
    TRIP(197),
    TRANSPORTATION_DEPARTURE(202),
    TRANSPORTATION_ARRIVAL(203),
    CRUISE_RESERVATION(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    PERSONAL_RECOMMENDATION_PLACE(208),
    PERSONAL_RECOMMENDATION_EVENT(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    EMAIL_PIVOTAL_SIGNAL(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA),
    SHIPMENT(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE),
    TRAVEL_LOCATION_INTENT(BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR);
    

    /* renamed from: ao */
    public final int f156946ao;

    private bvnm(int i) {
        this.f156946ao = i;
    }

    /* renamed from: a */
    public static bvnm m121290a(int i) {
        if (i == 0) {
            return INVALID;
        }
        switch (i) {
            case 100:
                return FLIGHT_DEPARTURE;
            case 101:
                return FLIGHT_ARRIVAL;
            case 102:
                return FLIGHT_LAYOVER;
            default:
                switch (i) {
                    case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                        return SEARCH_CLICKS;
                    case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                        return SEARCH_QUERIES;
                    case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                        return SEARCH_RESULTS;
                    case MfiClientException.TYPE_MFICLIENT_STARTED:
                        return SEARCH_NAV_RESULTS;
                    default:
                        switch (i) {
                            case 160:
                                return MAPS_CLICKS;
                            case 161:
                                return MAPS_QUERIES;
                            case 162:
                                return MAPS_RESULTS;
                            case 163:
                                return MAPS_NAV_RESULTS;
                            case 164:
                                return MAPS_DIRECTIONS;
                            case 165:
                                return MAPS_CLICKS_CLICK_TO_CALL;
                            case 166:
                                return MAPS_CLICKS_LOCALSEARCH_DETAIL;
                            case 167:
                                return MAPS_CLICKS_LOCALSEARCH_MARKER;
                            case 168:
                                return MAPS_CLICKS_SMARTMAPS;
                            case 169:
                                return MAPS_CLICKS_START_DIRECTIONS;
                            case 170:
                                return HOTEL_RESERVATION;
                            case 171:
                                return RESTAURANT_RESERVATION;
                            case 172:
                                return GOOGLE_PLUS_CHECKIN;
                            case 173:
                                return PLUS_ONE;
                            case 174:
                                return PLACE_REVIEW;
                            case 175:
                                return CALENDAR_EVENT;
                            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER:
                                return PLACE_STAR;
                            case 177:
                                return DEPRECATED_IMAGE;
                            case 178:
                                return MAPS_QUERIES_START_NAVIGATION;
                            case 179:
                                return MAPS_CLICKS_LOCALSEARCH_TRUFFLE;
                            case 180:
                                return DEPRECATED_PLACE_EDIT;
                            case 181:
                                return PLACE_RATING;
                            case 182:
                                return MAPS_CLICKS_NAVIGATION;
                            case 183:
                                return DEPRECATED_SOCIAL_EVENT;
                            case 184:
                                return MAPS_CLICKS_NOT_INTERESTED;
                            case 185:
                                return SOCIAL_EVENT_RESERVATION;
                            case 186:
                                return DEPRECATED_BEENTHERE_ENTITY;
                            case 187:
                                return REMINDER;
                            case 188:
                                return DEPRECATED_HAPTIC_PLACE;
                            case 189:
                                return CAR_RENTAL_PICKUP;
                            case 190:
                                return CAR_RENTAL_RETURN;
                            case 191:
                                return CONTACT_HOME;
                            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC:
                                return CONTACT_WORK;
                            case 193:
                                return IMAGE_USER_SPECIFIED;
                            case 194:
                                return IMAGE_EXIF;
                            case 195:
                                return IMAGE_LANDMARK_DETECTION;
                            case 196:
                                return PLACE_VISIT_USER_EDIT;
                            case 197:
                                return TRIP;
                            case 198:
                                return MAPS_EMBED_LOAD_ENTITY;
                            case ErrorInfo.TYPE_SDU_UNKNOWN:
                                return MAPS_EMBED_LOAD_SEARCH;
                            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                                return MAPS_EMBED_LOAD_DIRECTIONS;
                            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                return PLACE_BEEN_HERE;
                            case 202:
                                return TRANSPORTATION_DEPARTURE;
                            case 203:
                                return TRANSPORTATION_ARRIVAL;
                            case 204:
                                return MAPS_EMBED_LOAD_RESULTS;
                            case 205:
                                return MAPS_EMBED_LOAD_DIRECTION_RESULTS;
                            case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                                return MAPS_CLICKS_HERE;
                            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                                return CRUISE_RESERVATION;
                            case 208:
                                return PERSONAL_RECOMMENDATION_PLACE;
                            case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                                return PERSONAL_RECOMMENDATION_EVENT;
                            case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                                return EMAIL_PIVOTAL_SIGNAL;
                            case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                                return CONTACT_OTHER;
                            case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                                return LOW_CONFIDENCE_EVENT_RESERVATION;
                            case BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED:
                                return RECOMMENDED_EVENT_RESERVATION;
                            case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                                return SHIPMENT;
                            case BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR:
                                return TRAVEL_LOCATION_INTENT;
                            case BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR:
                                return CHECKIN_EDIT;
                            case BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR:
                                return PLACE_ON_LIST;
                            default:
                                return null;
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121291b() {
        return bvnl.f156878a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156946ao;
    }

    public final String toString() {
        return Integer.toString(this.f156946ao);
    }
}
