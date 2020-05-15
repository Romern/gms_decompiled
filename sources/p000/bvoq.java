package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bvoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvoq implements bxvp {
    OTHER(0),
    ACCOUNTING(1),
    AIRPORT(2),
    AMUSEMENT_PARK(3),
    AQUARIUM(4),
    ART_GALLERY(5),
    ATM(6),
    BAKERY(7),
    BANK(8),
    BAR(9),
    BEAUTY_SALON(10),
    BICYCLE_STORE(11),
    BOOK_STORE(12),
    BOWLING_ALLEY(13),
    BUS_STATION(14),
    CAFE(15),
    CAMPGROUND(16),
    CAR_DEALER(17),
    CAR_RENTAL(18),
    CAR_REPAIR(19),
    CAR_WASH(20),
    CASINO(21),
    CEMETERY(22),
    CHURCH(23),
    CITY_HALL(24),
    CLOTHING_STORE(25),
    CONVENIENCE_STORE(26),
    COURTHOUSE(27),
    DENTIST(28),
    DEPARTMENT_STORE(29),
    DOCTOR(30),
    ELECTRICIAN(31),
    ELECTRONICS_STORE(32),
    EMBASSY(33),
    ESTABLISHMENT(34),
    FINANCE(35),
    FIRE_STATION(36),
    FLORIST(37),
    FOOD(38),
    FUNERAL_HOME(39),
    FURNITURE_STORE(40),
    GAS_STATION(41),
    GENERAL_CONTRACTOR(42),
    GROCERY_OR_SUPERMARKET(43),
    GYM(44),
    HAIR_CARE(45),
    HARDWARE_STORE(46),
    HEALTH(47),
    HINDU_TEMPLE(48),
    HOME_GOODS_STORE(49),
    HOSPITAL(50),
    INSURANCE_AGENCY(51),
    JEWELRY_STORE(52),
    LAUNDRY(53),
    LAWYER(54),
    LIBRARY(55),
    LIQUOR_STORE(56),
    LOCAL_GOVERNMENT_OFFICE(57),
    LOCKSMITH(58),
    LODGING(59),
    MEAL_DELIVERY(60),
    MEAL_TAKEAWAY(61),
    MOSQUE(62),
    MOVIE_RENTAL(63),
    MOVIE_THEATER(64),
    MOVING_COMPANY(65),
    MUSEUM(66),
    NIGHT_CLUB(67),
    PAINTER(68),
    PARK(69),
    PARKING(70),
    PET_STORE(71),
    PHARMACY(72),
    PHYSIOTHERAPIST(73),
    PLACE_OF_WORSHIP(74),
    PLUMBER(75),
    POLICE(76),
    POST_OFFICE(77),
    REAL_ESTATE_AGENCY(78),
    RESTAURANT(79),
    ROOFING_CONTRACTOR(80),
    RV_PARK(81),
    SCHOOL(82),
    SHOE_STORE(83),
    SHOPPING_MALL(84),
    SPA(85),
    STADIUM(86),
    STORAGE(87),
    STORE(88),
    SUBWAY_STATION(89),
    SYNAGOGUE(90),
    TAXI_STAND(91),
    TRAIN_STATION(92),
    TRAVEL_AGENCY(93),
    UNIVERSITY(94),
    VETERINARY_CARE(95),
    ZOO(96),
    ADMINISTRATIVE_AREA_LEVEL_1(1001),
    ADMINISTRATIVE_AREA_LEVEL_2(1002),
    ADMINISTRATIVE_AREA_LEVEL_3(1003),
    COLLOQUIAL_AREA(1004),
    COUNTRY(1005),
    FLOOR(1006),
    GEOCODE(1007),
    INTERSECTION(1008),
    LOCALITY(1009),
    NATURAL_FEATURE(1010),
    NEIGHBORHOOD(1011),
    POLITICAL(1012),
    POINT_OF_INTEREST(1013),
    POST_BOX(1014),
    POSTAL_CODE(1015),
    POSTAL_CODE_PREFIX(1016),
    POSTAL_TOWN(1017),
    PREMISE(1018),
    ROOM(1019),
    ROUTE(1020),
    STREET_ADDRESS(1021),
    SUBLOCALITY(1022),
    SUBLOCALITY_LEVEL_1(1023),
    SUBLOCALITY_LEVEL_2(1024),
    SUBLOCALITY_LEVEL_3(1025),
    SUBLOCALITY_LEVEL_4(1026),
    SUBLOCALITY_LEVEL_5(1027),
    SUBPREMISE(1028),
    SYNTHETIC_GEOCODE(1029),
    TRANSIT_STATION(1030);
    

    /* renamed from: bx */
    public final int f157198bx;

    private bvoq(int i) {
        this.f157198bx = i;
    }

    /* renamed from: a */
    public static bvoq m121324a(int i) {
        switch (i) {
            case 0:
                return OTHER;
            case 1:
                return ACCOUNTING;
            case 2:
                return AIRPORT;
            case 3:
                return AMUSEMENT_PARK;
            case 4:
                return AQUARIUM;
            case 5:
                return ART_GALLERY;
            case 6:
                return ATM;
            case 7:
                return BAKERY;
            case 8:
                return BANK;
            case 9:
                return BAR;
            case 10:
                return BEAUTY_SALON;
            case 11:
                return BICYCLE_STORE;
            case 12:
                return BOOK_STORE;
            case 13:
                return BOWLING_ALLEY;
            case 14:
                return BUS_STATION;
            case 15:
                return CAFE;
            case 16:
                return CAMPGROUND;
            case 17:
                return CAR_DEALER;
            case 18:
                return CAR_RENTAL;
            case 19:
                return CAR_REPAIR;
            case 20:
                return CAR_WASH;
            case 21:
                return CASINO;
            case 22:
                return CEMETERY;
            case 23:
                return CHURCH;
            case 24:
                return CITY_HALL;
            case 25:
                return CLOTHING_STORE;
            case 26:
                return CONVENIENCE_STORE;
            case 27:
                return COURTHOUSE;
            case 28:
                return DENTIST;
            case 29:
                return DEPARTMENT_STORE;
            case 30:
                return DOCTOR;
            case 31:
                return ELECTRICIAN;
            case 32:
                return ELECTRONICS_STORE;
            case 33:
                return EMBASSY;
            case 34:
                return ESTABLISHMENT;
            case 35:
                return FINANCE;
            case 36:
                return FIRE_STATION;
            case FelicaException.TYPE_NOT_CLOSED:
                return FLORIST;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return FOOD;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return FUNERAL_HOME;
            case FelicaException.TYPE_PUSH_FAILED:
                return FURNITURE_STORE;
            case 41:
                return GAS_STATION;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return GENERAL_CONTRACTOR;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return GROCERY_OR_SUPERMARKET;
            case FelicaException.TYPE_RESET_FAILED:
                return GYM;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return HAIR_CARE;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return HARDWARE_STORE;
            case 47:
                return HEALTH;
            case 48:
                return HINDU_TEMPLE;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return HOME_GOODS_STORE;
            case 50:
                return HOSPITAL;
            case 51:
                return INSURANCE_AGENCY;
            case 52:
                return JEWELRY_STORE;
            case 53:
                return LAUNDRY;
            case 54:
                return LAWYER;
            case 55:
                return LIBRARY;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return LIQUOR_STORE;
            case 57:
                return LOCAL_GOVERNMENT_OFFICE;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return LOCKSMITH;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return LODGING;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return MEAL_DELIVERY;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return MEAL_TAKEAWAY;
            case 62:
                return MOSQUE;
            case 63:
                return MOVIE_RENTAL;
            case 64:
                return MOVIE_THEATER;
            case KeyInformation.AES128_DES56:
                return MOVING_COMPANY;
            case 66:
                return MUSEUM;
            case KeyInformation.AES128_DES112:
                return NIGHT_CLUB;
            case 68:
                return PAINTER;
            case 69:
                return PARK;
            case 70:
                return PARKING;
            case 71:
                return PET_STORE;
            case 72:
                return PHARMACY;
            case 73:
                return PHYSIOTHERAPIST;
            case 74:
                return PLACE_OF_WORSHIP;
            case 75:
                return PLUMBER;
            case 76:
                return POLICE;
            case 77:
                return POST_OFFICE;
            case 78:
                return REAL_ESTATE_AGENCY;
            case KeyInformation.AES128:
                return RESTAURANT;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE:
                return ROOFING_CONTRACTOR;
            case 81:
                return RV_PARK;
            case 82:
                return SCHOOL;
            case 83:
                return SHOE_STORE;
            case 84:
                return SHOPPING_MALL;
            case 85:
                return SPA;
            case 86:
                return STADIUM;
            case 87:
                return STORAGE;
            case 88:
                return STORE;
            case 89:
                return SUBWAY_STATION;
            case 90:
                return SYNAGOGUE;
            case 91:
                return TAXI_STAND;
            case 92:
                return TRAIN_STATION;
            case 93:
                return TRAVEL_AGENCY;
            case 94:
                return UNIVERSITY;
            case 95:
                return VETERINARY_CARE;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME:
                return ZOO;
            default:
                switch (i) {
                    case 1001:
                        return ADMINISTRATIVE_AREA_LEVEL_1;
                    case 1002:
                        return ADMINISTRATIVE_AREA_LEVEL_2;
                    case 1003:
                        return ADMINISTRATIVE_AREA_LEVEL_3;
                    case 1004:
                        return COLLOQUIAL_AREA;
                    case 1005:
                        return COUNTRY;
                    case 1006:
                        return FLOOR;
                    case 1007:
                        return GEOCODE;
                    case 1008:
                        return INTERSECTION;
                    case 1009:
                        return LOCALITY;
                    case 1010:
                        return NATURAL_FEATURE;
                    case 1011:
                        return NEIGHBORHOOD;
                    case 1012:
                        return POLITICAL;
                    case 1013:
                        return POINT_OF_INTEREST;
                    case 1014:
                        return POST_BOX;
                    case 1015:
                        return POSTAL_CODE;
                    case 1016:
                        return POSTAL_CODE_PREFIX;
                    case 1017:
                        return POSTAL_TOWN;
                    case 1018:
                        return PREMISE;
                    case 1019:
                        return ROOM;
                    case 1020:
                        return ROUTE;
                    case 1021:
                        return STREET_ADDRESS;
                    case 1022:
                        return SUBLOCALITY;
                    case 1023:
                        return SUBLOCALITY_LEVEL_1;
                    case 1024:
                        return SUBLOCALITY_LEVEL_2;
                    case 1025:
                        return SUBLOCALITY_LEVEL_3;
                    case 1026:
                        return SUBLOCALITY_LEVEL_4;
                    case 1027:
                        return SUBLOCALITY_LEVEL_5;
                    case 1028:
                        return SUBPREMISE;
                    case 1029:
                        return SYNTHETIC_GEOCODE;
                    case 1030:
                        return TRANSIT_STATION;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121325b() {
        return bvop.f157069a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f157198bx;
    }

    public final String toString() {
        return Integer.toString(this.f157198bx);
    }
}
