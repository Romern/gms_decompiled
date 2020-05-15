package p000;

import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bhqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqm {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m101333a(String str) {
        char c;
        String str2 = str;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2094695477:
                if (str2.equals("aquarium")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -2053308192:
                if (str2.equals("natural_feature")) {
                    c = 'j';
                    break;
                }
                c = 65535;
                break;
            case -2053263135:
                if (str2.equals("postal_code")) {
                    c = 'o';
                    break;
                }
                c = 65535;
                break;
            case -2052756090:
                if (str2.equals("postal_town")) {
                    c = 'q';
                    break;
                }
                c = 65535;
                break;
            case -2050684885:
                if (str2.equals("fire_station")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -1964369267:
                if (str2.equals("shoe_store")) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case -1921392712:
                if (str2.equals("street_address")) {
                    c = 'u';
                    break;
                }
                c = 65535;
                break;
            case -1912447312:
                if (str2.equals("amusement_park")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1897612291:
                if (str2.equals("stadium")) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -1884274053:
                if (str2.equals("storage")) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case -1772467395:
                if (str2.equals("restaurant")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -1771916171:
                if (str2.equals("courthouse")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1741462721:
                if (str2.equals("veterinary_care")) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case -1740874356:
                if (str2.equals("moving_company")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -1700587098:
                if (str2.equals("place_of_worship")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1682124937:
                if (str2.equals("real_estate_agency")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -1676983117:
                if (str2.equals("pharmacy")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -1655831541:
                if (str2.equals("book_store")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -1648595317:
                if (str2.equals("shopping_mall")) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case -1637322286:
                if (str2.equals("embassy")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1625981817:
                if (str2.equals("funeral_home")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1521826541:
                if (str2.equals("movie_rental")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1480760809:
                if (str2.equals("establishment")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1396440608:
                if (str2.equals("bakery")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1367569419:
                if (str2.equals("casino")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1361036889:
                if (str2.equals("church")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1326477025:
                if (str2.equals("doctor")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1221262756:
                if (str2.equals("health")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -1144292445:
                if (str2.equals("sublocality")) {
                    c = 'v';
                    break;
                }
                c = 65535;
                break;
            case -1137922232:
                if (str2.equals("campground")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1122304826:
                if (str2.equals("roofing_contractor")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -1109772796:
                if (str2.equals("lawyer")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -1106572659:
                if (str2.equals("city_hall")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1093701446:
                if (str2.equals("beauty_salon")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1068340720:
                if (str2.equals("mosque")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -1062811118:
                if (str2.equals("museum")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -991666997:
                if (str2.equals("airport")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -982670050:
                if (str2.equals("police")) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case -911707720:
                if (str2.equals("locksmith")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -907977868:
                if (str2.equals("school")) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -894467854:
                if (str2.equals("cemetery")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -853258278:
                if (str2.equals("finance")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -803323243:
                if (str2.equals("accounting")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -801413749:
                if (str2.equals("painter")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case -793201736:
                if (str2.equals("parking")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case -765945151:
                if (str2.equals("florist")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -735873907:
                if (str2.equals("grocery_or_supermarket")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -687630504:
                if (str2.equals("home_goods_store")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -616704468:
                if (str2.equals("jewelry_store")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -602093443:
                if (str2.equals("night_club")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -594184620:
                if (str2.equals("furniture_store")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -494309456:
                if (str2.equals("postal_code_prefix")) {
                    c = 'p';
                    break;
                }
                c = 65535;
                break;
            case -482704010:
                if (str2.equals("art_gallery")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -480031188:
                if (str2.equals("general_contractor")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -475457925:
                if (str2.equals("plumber")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -338178443:
                if (str2.equals("taxi_stand")) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case -318452207:
                if (str2.equals("premise")) {
                    c = 'r';
                    break;
                }
                c = 65535;
                break;
            case -303628742:
                if (str2.equals("hospital")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case -299560451:
                if (str2.equals("train_station")) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case -276749071:
                if (str2.equals("meal_takeaway")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case -210452739:
                if (str2.equals("political")) {
                    c = 'l';
                    break;
                }
                c = 65535;
                break;
            case -84391837:
                if (str2.equals("point_of_interest")) {
                    c = 'm';
                    break;
                }
                c = 65535;
                break;
            case -79287106:
                if (str2.equals("geocode")) {
                    c = 'g';
                    break;
                }
                c = 65535;
                break;
            case -78601522:
                if (str2.equals("hindu_temple")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -63373159:
                if (str2.equals("convenience_store")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -45393891:
                if (str2.equals("laundry")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -11825110:
                if (str2.equals("car_wash")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 96922:
                if (str2.equals("atm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 97299:
                if (str2.equals("bar")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 102843:
                if (str2.equals("gym")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 114084:
                if (str2.equals("spa")) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case 120794:
                if (str2.equals("zoo")) {
                    c = '`';
                    break;
                }
                c = 65535;
                break;
            case 3016252:
                if (str2.equals("bank")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 3045789:
                if (str2.equals("cafe")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 3148894:
                if (str2.equals("food")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 3433450:
                if (str2.equals("park")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 3506395:
                if (str2.equals("room")) {
                    c = 's';
                    break;
                }
                c = 65535;
                break;
            case 97526796:
                if (str2.equals("floor")) {
                    c = 'f';
                    break;
                }
                c = 65535;
                break;
            case 106069776:
                if (str2.equals("other")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108704329:
                if (str2.equals("route")) {
                    c = 't';
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                if (str2.equals("store")) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case 135260426:
                if (str2.equals("insurance_agency")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 166208699:
                if (str2.equals("library")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 169749129:
                if (str2.equals("intersection")) {
                    c = 'h';
                    break;
                }
                c = 65535;
                break;
            case 189328014:
                if (str2.equals("university")) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case 310317390:
                if (str2.equals("hair_care")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 339510492:
                if (str2.equals("lodging")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 409204991:
                if (str2.equals("colloquial_area")) {
                    c = 'd';
                    break;
                }
                c = 65535;
                break;
            case 444536918:
                if (str2.equals("synagogue")) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 498460430:
                if (str2.equals("neighborhood")) {
                    c = 'k';
                    break;
                }
                c = 65535;
                break;
            case 559132475:
                if (str2.equals("post_office")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case 600590538:
                if (str2.equals("travel_agency")) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case 708899558:
                if (str2.equals("liquor_store")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 757331372:
                if (str2.equals("post_box")) {
                    c = 'n';
                    break;
                }
                c = 65535;
                break;
            case 772885966:
                if (str2.equals("gas_station")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 830244817:
                if (str2.equals("subpremise")) {
                    c = '|';
                    break;
                }
                c = 65535;
                break;
            case 840925601:
                if (str2.equals("bicycle_store")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 944808985:
                if (str2.equals("electronics_store")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 957831062:
                if (str2.equals("country")) {
                    c = 'e';
                    break;
                }
                c = 65535;
                break;
            case 958132249:
                if (str2.equals("electrician")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 980182244:
                if (str2.equals("car_dealer")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1002431734:
                if (str2.equals("local_government_office")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 1040528330:
                if (str2.equals("hardware_store")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1164289476:
                if (str2.equals("synthetic_geocode")) {
                    c = '}';
                    break;
                }
                c = 65535;
                break;
            case 1191036144:
                if (str2.equals("meal_delivery")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 1239345090:
                if (str2.equals("physiotherapist")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 1284812246:
                if (str2.equals("bowling_alley")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 1381385199:
                if (str2.equals("car_rental")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1381426776:
                if (str2.equals("car_repair")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1501829832:
                if (str2.equals("transit_station")) {
                    c = '~';
                    break;
                }
                c = 65535;
                break;
            case 1532405365:
                if (str2.equals("bus_station")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1552746787:
                if (str2.equals("dentist")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1565612293:
                if (str2.equals("rv_park")) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case 1618734500:
                if (str2.equals("subway_station")) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case 1738891626:
                if (str2.equals("clothing_store")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1811306932:
                if (str2.equals("department_store")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1900805475:
                if (str2.equals("locality")) {
                    c = 'i';
                    break;
                }
                c = 65535;
                break;
            case 1920052738:
                if (str2.equals("movie_theater")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 2059499969:
                if (str2.equals("pet_store")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            default:
                switch (hashCode) {
                    case -1704221286:
                        if (str2.equals("sublocality_level_1")) {
                            c = 'w';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1704221285:
                        if (str2.equals("sublocality_level_2")) {
                            c = 'x';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1704221284:
                        if (str2.equals("sublocality_level_3")) {
                            c = 'y';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1704221283:
                        if (str2.equals("sublocality_level_4")) {
                            c = 'z';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1704221282:
                        if (str2.equals("sublocality_level_5")) {
                            c = '{';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        switch (hashCode) {
                            case 1191326709:
                                if (str2.equals("administrative_area_level_1")) {
                                    c = 'a';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1191326710:
                                if (str2.equals("administrative_area_level_2")) {
                                    c = 'b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1191326711:
                                if (str2.equals("administrative_area_level_3")) {
                                    c = 'c';
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                }
        }
        switch (c) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case ' ':
                return 32;
            case '!':
                return 33;
            case '\"':
                return 34;
            case '#':
                return 35;
            case '$':
                return 36;
            case FelicaException.TYPE_NOT_CLOSED:
                return 37;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return 38;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return 39;
            case FelicaException.TYPE_PUSH_FAILED:
                return 40;
            case ')':
                return 41;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return 42;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return 43;
            case FelicaException.TYPE_RESET_FAILED:
                return 44;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return 45;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return 46;
            case '/':
                return 47;
            case '0':
                return 48;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return 49;
            case '2':
                return 50;
            case '3':
                return 51;
            case '4':
                return 52;
            case '5':
                return 53;
            case '6':
                return 54;
            case '7':
                return 55;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return 56;
            case '9':
                return 57;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return 58;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return 59;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return 60;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return 61;
            case '>':
                return 62;
            case '?':
                return 63;
            case '@':
                return 64;
            case KeyInformation.AES128_DES56:
                return 65;
            case 'B':
                return 66;
            case KeyInformation.AES128_DES112:
                return 67;
            case 'D':
                return 68;
            case 'E':
                return 69;
            case 'F':
                return 70;
            case 'G':
                return 71;
            case 'H':
                return 72;
            case 'I':
                return 73;
            case 'J':
                return 74;
            case 'K':
                return 75;
            case 'L':
                return 76;
            case 'M':
                return 77;
            case 'N':
                return 78;
            case KeyInformation.AES128:
                return 79;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return 80;
            case 'Q':
                return 81;
            case 'R':
                return 82;
            case 'S':
                return 83;
            case 'T':
                return 84;
            case 'U':
                return 85;
            case 'V':
                return 86;
            case 'W':
                return 87;
            case 'X':
                return 88;
            case 'Y':
                return 89;
            case 'Z':
                return 90;
            case '[':
                return 91;
            case '\\':
                return 92;
            case ']':
                return 93;
            case '^':
                return 94;
            case '_':
                return 95;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return 96;
            case 'a':
                return 1001;
            case 'b':
                return 1002;
            case 'c':
                return 1003;
            case 'd':
                return 1004;
            case 'e':
                return 1005;
            case 'f':
                return 1006;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return 1007;
            case ErrorInfo.TYPE_SDU_FAILED:
                return 1008;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return 1009;
            case 'j':
                return 1010;
            case 'k':
                return 1011;
            case 'l':
                return 1012;
            case 'm':
                return 1013;
            case 'n':
                return 1014;
            case 'o':
                return 1015;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                return 1016;
            case 'q':
                return 1017;
            case 'r':
                return 1018;
            case 's':
                return 1019;
            case 't':
                return 1020;
            case 'u':
                return 1021;
            case 'v':
                return 1022;
            case 'w':
                return 1023;
            case 'x':
                return 1024;
            case 'y':
                return 1025;
            case 'z':
                return 1026;
            case '{':
                return 1027;
            case '|':
                return 1028;
            case '}':
                return 1029;
            case '~':
                return 1030;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static String m101336b(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 2) {
            return "address";
        }
        if (i == 34) {
            return "establishment";
        }
        if (i == 1007) {
            return "geocode";
        }
        if (i == 4) {
            return "(regions)";
        }
        if (i == 5) {
            return "(cities)";
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "toAutocompleteFilterString called without a valid type");
        }
        return null;
    }

    /* renamed from: a */
    public static String m101334a(int i) {
        switch (i) {
            case 0:
                return "other";
            case 1:
                return "accounting";
            case 2:
                return "airport";
            case 3:
                return "amusement_park";
            case 4:
                return "aquarium";
            case 5:
                return "art_gallery";
            case 6:
                return "atm";
            case 7:
                return "bakery";
            case 8:
                return "bank";
            case 9:
                return "bar";
            case 10:
                return "beauty_salon";
            case 11:
                return "bicycle_store";
            case 12:
                return "book_store";
            case 13:
                return "bowling_alley";
            case 14:
                return "bus_station";
            case 15:
                return "cafe";
            case 16:
                return "campground";
            case 17:
                return "car_dealer";
            case 18:
                return "car_rental";
            case 19:
                return "car_repair";
            case 20:
                return "car_wash";
            case 21:
                return "casino";
            case 22:
                return "cemetery";
            case 23:
                return "church";
            case 24:
                return "city_hall";
            case 25:
                return "clothing_store";
            case 26:
                return "convenience_store";
            case 27:
                return "courthouse";
            case 28:
                return "dentist";
            case 29:
                return "department_store";
            case 30:
                return "doctor";
            case 31:
                return "electrician";
            case 32:
                return "electronics_store";
            case 33:
                return "embassy";
            case 34:
                return "establishment";
            case 35:
                return "finance";
            case 36:
                return "fire_station";
            case FelicaException.TYPE_NOT_CLOSED:
                return "florist";
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return "food";
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return "funeral_home";
            case FelicaException.TYPE_PUSH_FAILED:
                return "furniture_store";
            case 41:
                return "gas_station";
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return "general_contractor";
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return "grocery_or_supermarket";
            case FelicaException.TYPE_RESET_FAILED:
                return "gym";
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return "hair_care";
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return "hardware_store";
            case 47:
                return "health";
            case 48:
                return "hindu_temple";
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return "home_goods_store";
            case 50:
                return "hospital";
            case 51:
                return "insurance_agency";
            case 52:
                return "jewelry_store";
            case 53:
                return "laundry";
            case 54:
                return "lawyer";
            case 55:
                return "library";
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return "liquor_store";
            case 57:
                return "local_government_office";
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return "locksmith";
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return "lodging";
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return "meal_delivery";
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return "meal_takeaway";
            case 62:
                return "mosque";
            case 63:
                return "movie_rental";
            case 64:
                return "movie_theater";
            case KeyInformation.AES128_DES56:
                return "moving_company";
            case 66:
                return "museum";
            case KeyInformation.AES128_DES112:
                return "night_club";
            case 68:
                return "painter";
            case 69:
                return "park";
            case 70:
                return "parking";
            case 71:
                return "pet_store";
            case 72:
                return "pharmacy";
            case 73:
                return "physiotherapist";
            case 74:
                return "place_of_worship";
            case 75:
                return "plumber";
            case 76:
                return "police";
            case 77:
                return "post_office";
            case 78:
                return "real_estate_agency";
            case KeyInformation.AES128:
                return "restaurant";
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return "roofing_contractor";
            case 81:
                return "rv_park";
            case 82:
                return "school";
            case 83:
                return "shoe_store";
            case 84:
                return "shopping_mall";
            case 85:
                return "spa";
            case 86:
                return "stadium";
            case 87:
                return "storage";
            case 88:
                return "store";
            case 89:
                return "subway_station";
            case 90:
                return "synagogue";
            case 91:
                return "taxi_stand";
            case 92:
                return "train_station";
            case 93:
                return "travel_agency";
            case 94:
                return "university";
            case 95:
                return "veterinary_care";
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return "zoo";
            default:
                switch (i) {
                    case 1001:
                        return "administrative_area_level_1";
                    case 1002:
                        return "administrative_area_level_2";
                    case 1003:
                        return "administrative_area_level_3";
                    case 1004:
                        return "colloquial_area";
                    case 1005:
                        return "country";
                    case 1006:
                        return "floor";
                    case 1007:
                        return "geocode";
                    case 1008:
                        return "intersection";
                    case 1009:
                        return "locality";
                    case 1010:
                        return "natural_feature";
                    case 1011:
                        return "neighborhood";
                    case 1012:
                        return "political";
                    case 1013:
                        return "point_of_interest";
                    case 1014:
                        return "post_box";
                    case 1015:
                        return "postal_code";
                    case 1016:
                        return "postal_code_prefix";
                    case 1017:
                        return "postal_town";
                    case 1018:
                        return "premise";
                    case 1019:
                        return "room";
                    case 1020:
                        return "route";
                    case 1021:
                        return "street_address";
                    case 1022:
                        return "sublocality";
                    case 1023:
                        return "sublocality_level_1";
                    case 1024:
                        return "sublocality_level_2";
                    case 1025:
                        return "sublocality_level_3";
                    case 1026:
                        return "sublocality_level_4";
                    case 1027:
                        return "sublocality_level_5";
                    case 1028:
                        return "subpremise";
                    case 1029:
                        return "synthetic_geocode";
                    case 1030:
                        return "transit_station";
                    default:
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("other (");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: a */
    public static List m101335a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m101334a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }
}
