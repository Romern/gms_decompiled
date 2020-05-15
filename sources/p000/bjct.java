package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.ulr.LocationDescriptor;
import com.google.android.ulr.PresenceInterval;
import com.google.android.ulr.SemanticPlace;
import com.google.android.ulr.VisibleNetwork;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: bjct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjct {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static byex m103203a(LocationDescriptor locationDescriptor) {
        char c;
        String str;
        char c2;
        String str2;
        char c3;
        String str3;
        char c4;
        String str4;
        char c5;
        String str5;
        char c6;
        String str6;
        if (locationDescriptor == null) {
            return null;
        }
        byew byew = (byew) byex.f165964y.mo74144da();
        if (locationDescriptor.mo71684n() != null) {
            String n = locationDescriptor.mo71684n();
            switch (n.hashCode()) {
                case -2119958228:
                    if (n.equals("EXPERIMENTAL_LOCATION")) {
                        c6 = 20;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -2038740823:
                    if (n.equals("CURRENT_CONTEXT")) {
                        c6 = 22;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -2005567299:
                    if (n.equals("experimentalLocation")) {
                        c6 = 21;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1878750543:
                    if (n.equals("FUTURE_LOCATION")) {
                        c6 = 16;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1634095760:
                    if (n.equals("wildcardRole")) {
                        c6 = 25;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -777302797:
                    if (n.equals("HISTORICAL_QUERY")) {
                        c6 = 10;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -638343690:
                    if (n.equals("currentContext")) {
                        c6 = 23;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -603067429:
                    if (n.equals("CURRENT_LOCATION")) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -491947490:
                    if (n.equals("historicalQuery")) {
                        c6 = 11;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -395835114:
                    if (n.equals("defaultLocation")) {
                        c6 = 5;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -254434373:
                    if (n.equals("WILDCARD_ROLE")) {
                        c6 = 24;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -140429234:
                    if (n.equals("currentLocation")) {
                        c6 = 3;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 69284883:
                    if (n.equals("DEFAULT_LOCATION")) {
                        c6 = 4;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 77406376:
                    if (n.equals("QUERY")) {
                        c6 = 6;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 107944136:
                    if (n.equals("query")) {
                        c6 = 7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 230388107:
                    if (n.equals("userSpecifiedForRequest")) {
                        c6 = 9;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 608828298:
                    if (n.equals("HISTORICAL_LOCATION")) {
                        c6 = 12;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 629149388:
                    if (n.equals("invalidLocation")) {
                        c6 = 19;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1027507051:
                    if (n.equals("UNKNOWN_ROLE")) {
                        c6 = 0;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1176706712:
                    if (n.equals("futureLocation")) {
                        c6 = 17;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1196685478:
                    if (n.equals("viewport")) {
                        c6 = 15;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1619618784:
                    if (n.equals("unknownRole")) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1647557430:
                    if (n.equals("USER_SPECIFIED_FOR_REQUEST")) {
                        c6 = 8;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1779033373:
                    if (n.equals("INVALID_LOCATION")) {
                        c6 = 18;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1888532127:
                    if (n.equals("historicalLocation")) {
                        c6 = 13;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1979312294:
                    if (n.equals("VIEWPORT")) {
                        c6 = 14;
                        break;
                    }
                    c6 = 65535;
                    break;
                default:
                    c6 = 65535;
                    break;
            }
            switch (c6) {
                case 0:
                case 1:
                    if (byew.f164950c) {
                        byew.mo74035c();
                        byew.f164950c = false;
                    }
                    byex byex = (byex) byew.f164949b;
                    byex.f165967b = 0;
                    byex.f165966a |= 1;
                    break;
                case 2:
                case 3:
                    if (byew.f164950c) {
                        byew.mo74035c();
                        byew.f164950c = false;
                    }
                    byex byex2 = (byex) byew.f164949b;
                    byex2.f165967b = 1;
                    byex2.f165966a |= 1;
                    break;
                case 4:
                case 5:
                    if (byew.f164950c) {
                        byew.mo74035c();
                        byew.f164950c = false;
                    }
                    byex byex3 = (byex) byew.f164949b;
                    byex3.f165967b = 2;
                    byex3.f165966a |= 1;
                    break;
                case 6:
                case 7:
                    byew.mo74353K(5);
                    break;
                case 8:
                case 9:
                    byew.mo74353K(6);
                    break;
                case 10:
                case 11:
                    byew.mo74353K(7);
                    break;
                case 12:
                case 13:
                    byew.mo74353K(8);
                    break;
                case 14:
                case 15:
                    byew.mo74353K(9);
                    break;
                case 16:
                case 17:
                    byew.mo74353K(10);
                    break;
                case 18:
                case 19:
                    byew.mo74353K(11);
                    break;
                case 20:
                case 21:
                    byew.mo74353K(12);
                    break;
                case 22:
                case 23:
                    byew.mo74353K(13);
                    break;
                case 24:
                case 25:
                    byew.mo74353K(1);
                    break;
                default:
                    String valueOf = String.valueOf(locationDescriptor.mo71684n());
                    if (valueOf.length() == 0) {
                        str6 = new String("Json2LiteBadEnum location.unified.LocationDescriptor.role ");
                    } else {
                        str6 = "Json2LiteBadEnum location.unified.LocationDescriptor.role ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str6);
            }
        }
        if (locationDescriptor.mo71681k() != null) {
            String k = locationDescriptor.mo71681k();
            switch (k.hashCode()) {
                case -2137373228:
                    if (k.equals("adsPartnerGeoParam")) {
                        c5 = 'W';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2120094230:
                    if (k.equals("legacyMobileFrontendGll")) {
                        c5 = 145;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2079033344:
                    if (k.equals("LEGACY_PARTNER_GL_PARAM")) {
                        c5 = 'H';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2051215490:
                    if (k.equals("DEVICE_LOCATION")) {
                        c5 = 20;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2045180744:
                    if (k.equals("JURISDICTION_COUNTRY")) {
                        c5 = 26;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2034211040:
                    if (k.equals("localUniversal")) {
                        c5 = '#';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -2026431955:
                    if (k.equals("ipAddressAlternate")) {
                        c5 = 'o';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1938938700:
                    if (k.equals("defaultLocationOverrideProducer")) {
                        c5 = 'Y';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1869970538:
                    if (k.equals("RQUERY")) {
                        c5 = 12;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1856066892:
                    if (k.equals("ABLATED_PRODUCER")) {
                        c5 = 148;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1841341387:
                    if (k.equals("SQUERY")) {
                        c5 = 14;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1834132468:
                    if (k.equals("GWS_MOBILE_HISTORY_ZWIEBACK")) {
                        c5 = '(';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1823655998:
                    if (k.equals("IGOOGLE")) {
                        c5 = '@';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1780693104:
                    if (k.equals("badDeviceLocation")) {
                        c5 = 'y';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1772671342:
                    if (k.equals("QUERY_LOCATION_OVERRIDE_PRODUCER")) {
                        c5 = 16;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1762338012:
                    if (k.equals("BAD_DEVICE_LOCATION")) {
                        c5 = 'x';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1745024593:
                    if (k.equals("ablatedProducer")) {
                        c5 = 149;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1741506823:
                    if (k.equals("LOGGED_IN_USER_SPECIFIED")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1737901724:
                    if (k.equals("snapToRoute")) {
                        c5 = 'u';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1711173593:
                    if (k.equals("snapToPlaceImplicit")) {
                        c5 = 'c';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1667314750:
                    if (k.equals("HULK_ROUTINES")) {
                        c5 = 138;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1634561820:
                    if (k.equals("MOBILE_APP")) {
                        c5 = '8';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1607061264:
                    if (k.equals("ADS_GEO_PARAM")) {
                        c5 = 'T';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1602172551:
                    if (k.equals("DEFAULT_LOCATION_OVERRIDE_PRODUCER")) {
                        c5 = 'X';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1569657456:
                    if (k.equals("SEARCH_ALONG_ROUTE")) {
                        c5 = 'r';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1545863717:
                    if (k.equals("oolongRealtimeCache")) {
                        c5 = 151;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1541319913:
                    if (k.equals("GAIA_LOCATION_HISTORY")) {
                        c5 = '\\';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1505625297:
                    if (k.equals("TRAVEL_STATE_INTENT")) {
                        c5 = 136;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1479177898:
                    if (k.equals("stickinessParams")) {
                        c5 = '_';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1478898123:
                    if (k.equals("GOOGLE_HOST_DOMAIN")) {
                        c5 = 10;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1472184075:
                    if (k.equals("directionsWaypoint")) {
                        c5 = 155;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1425864852:
                    if (k.equals("OOLONG_REALTIME_CACHE_ALTERNATE")) {
                        c5 = 152;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1404022621:
                    if (k.equals("gwsHistoryGaia")) {
                        c5 = '}';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1385958546:
                    if (k.equals("SMS_SEARCH")) {
                        c5 = 'D';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1358293158:
                    if (k.equals("SEARCH_TOOLBELT")) {
                        c5 = '$';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1298210107:
                    if (k.equals("legacyMobileFrontendNear")) {
                        c5 = 147;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1240965211:
                    if (k.equals("googleHostDomain")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1232276625:
                    if (k.equals("gwsMobileHistoryZwieback")) {
                        c5 = ')';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1202516368:
                    if (k.equals("clientSpecifiedJurisdictionCountry")) {
                        c5 = 29;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1201146372:
                    if (k.equals("unknownProducer")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1154143284:
                    if (k.equals("LEGACY_NEAR_PARAM")) {
                        c5 = 22;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1129017011:
                    if (k.equals("gaiaLocationHistory")) {
                        c5 = ']';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1114339255:
                    if (k.equals("LEGACY_GL_PARAM")) {
                        c5 = 'F';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1101226522:
                    if (k.equals("OZ_FRONTEND")) {
                        c5 = 'R';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1092412677:
                    if (k.equals("CLIENT_SPECIFIED_JURISDICTION_COUNTRY")) {
                        c5 = 28;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1088683461:
                    if (k.equals("queryLocationOverrideProducer")) {
                        c5 = 17;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -932063139:
                    if (k.equals("CIRCULARS_FRONTEND")) {
                        c5 = 'N';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -925492243:
                    if (k.equals("GOOGLE_MY_BUSINESS")) {
                        c5 = 'v';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -923299946:
                    if (k.equals("rquery")) {
                        c5 = 13;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -894670795:
                    if (k.equals("squery")) {
                        c5 = 15;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -887499069:
                    if (k.equals("prefLFieldAddress")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -850340154:
                    if (k.equals("mapsActivity")) {
                        c5 = 'm';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -794711141:
                    if (k.equals("SNAP_TO_PLACE_EXPLICIT")) {
                        c5 = 'd';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -792929080:
                    if (k.equals("partner")) {
                        c5 = '-';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -674662886:
                    if (k.equals("SHOPPING_SEARCH_API")) {
                        c5 = 'P';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -608973850:
                    if (k.equals("circularsFrontend")) {
                        c5 = 'O';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -544108024:
                    if (k.equals("LEGACY_GL_COOKIE")) {
                        c5 = 'J';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -497176436:
                    if (k.equals("adsGeoParam")) {
                        c5 = 'U';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -444576691:
                    if (k.equals("HULK_USER_PLACES_CONFIRMED")) {
                        c5 = 'f';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -437161527:
                    if (k.equals("mapsFrontend")) {
                        c5 = '3';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -424047558:
                    if (k.equals("SNAP_TO_ROUTE")) {
                        c5 = 't';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -389002075:
                    if (k.equals("googleMyBusiness")) {
                        c5 = 'w';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -382316393:
                    if (k.equals("IP_ADDRESS_ALTERNATE")) {
                        c5 = 'n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -368361191:
                    if (k.equals("ADS_PARTNER_GEO_PARAM")) {
                        c5 = 'V';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -343845356:
                    if (k.equals("GWS_JURISDICTION_COUNTRY")) {
                        c5 = 'L';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -330639492:
                    if (k.equals("legacyNearParam")) {
                        c5 = 23;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -311025223:
                    if (k.equals("GWS_HISTORY_GAIA")) {
                        c5 = '|';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -270872847:
                    if (k.equals("turnByTurnNavigationReroute")) {
                        c5 = 'a';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -257841768:
                    if (k.equals("MOBILE_SELECTED")) {
                        c5 = '*';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -234025519:
                    if (k.equals("OOLONG_REALTIME_CACHE")) {
                        c5 = 150;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -178324674:
                    if (k.equals("calendar")) {
                        c5 = 'C';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -166985095:
                    if (k.equals("deviceContext")) {
                        c5 = 135;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -120266081:
                    if (k.equals("legacyGlParam")) {
                        c5 = 'G';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -112175040:
                    if (k.equals("QUERY_HISTORY_INFERRED_ALTERNATE")) {
                        c5 = '<';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -99184557:
                    if (k.equals("mobileFeHistory")) {
                        c5 = '\'';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -74946392:
                    if (k.equals("PARTNER")) {
                        c5 = ',';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2392787:
                    if (k.equals("NEWS")) {
                        c5 = 130;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2494082:
                    if (k.equals("QREF")) {
                        c5 = 18;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3377875:
                    if (k.equals("news")) {
                        c5 = 131;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3479170:
                    if (k.equals("qref")) {
                        c5 = 19;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 51562878:
                    if (k.equals("carrierCountry")) {
                        c5 = 25;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 131303637:
                    if (k.equals("jurisdictionCountry")) {
                        c5 = 27;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 173862796:
                    if (k.equals("wildcardProducer")) {
                        c5 = 141;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 207389330:
                    if (k.equals("legacyGlCookie")) {
                        c5 = 'K';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 273457551:
                    if (k.equals("showtimeOnebox")) {
                        c5 = '!';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 320148503:
                    if (k.equals("gmmQuantizedDeviceLocation")) {
                        c5 = '{';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 390565082:
                    if (k.equals("DECODED_FROM_UNKNOWN_ROLE_PRODUCER")) {
                        c5 = 30;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 396678580:
                    if (k.equals("searchAlongRoute")) {
                        c5 = 's';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 398233148:
                    if (k.equals("hulkUserPlacesConfirmed")) {
                        c5 = 'g';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 420815246:
                    if (k.equals("IP_ADDRESS_REALTIME")) {
                        c5 = 8;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 436079379:
                    if (k.equals("travelStateIntent")) {
                        c5 = 137;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 452009390:
                    if (k.equals("webSearchResultsPageShared")) {
                        c5 = '/';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 485576949:
                    if (k.equals("STICKINESS_PARAMS")) {
                        c5 = '^';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 525178789:
                    if (k.equals("QUERY_HISTORY_INFERRED")) {
                        c5 = ':';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 567560652:
                    if (k.equals("viewportParams")) {
                        c5 = '[';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 598709098:
                    if (k.equals("tactileNearbyParam")) {
                        c5 = 'k';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 604302142:
                    if (k.equals("CALENDAR")) {
                        c5 = 'B';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 613022879:
                    if (k.equals("legacyToolbarHeader")) {
                        c5 = 143;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 622552078:
                    if (k.equals("LEGACY_MOBILE_FRONTEND_NEAR")) {
                        c5 = 146;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 624301599:
                    if (k.equals("mobileApp")) {
                        c5 = '9';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 685491366:
                    if (k.equals("DEVICE_CONTEXT")) {
                        c5 = 134;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 692002874:
                    if (k.equals("SHOWTIME_ONEBOX")) {
                        c5 = ' ';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 699380736:
                    if (k.equals("WEB_SEARCH_RESULTS_PAGE_SHARED")) {
                        c5 = '.';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 701468215:
                    if (k.equals("LOCAL_UNIVERSAL")) {
                        c5 = '\"';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 708957004:
                    if (k.equals("SNAP_TO_PLACE_IMPLICIT")) {
                        c5 = 'b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 708975423:
                    if (k.equals("VIEWPORT_PARAMS")) {
                        c5 = 'Z';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 745138273:
                    if (k.equals("smsSearch")) {
                        c5 = 'E';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 854366441:
                    if (k.equals("legacyPartnerGlParam")) {
                        c5 = 'I';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 900319455:
                    if (k.equals("oolongRealtimeCacheAlternate")) {
                        c5 = 153;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 909774403:
                    if (k.equals("SHIPPING_ADDRESS")) {
                        c5 = 132;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 915144139:
                    if (k.equals("gmailTheme")) {
                        c5 = '?';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 947264411:
                    if (k.equals("hulkRoutines")) {
                        c5 = 139;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 951444313:
                    if (k.equals("PRODUCT_SEARCH_FRONTEND")) {
                        c5 = '4';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 970379033:
                    if (k.equals("contextManagerForecast")) {
                        c5 = 127;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1015685304:
                    if (k.equals("GMM_HEATMAP_AREA")) {
                        c5 = 128;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1042452407:
                    if (k.equals("MAPS_ACTIVITY")) {
                        c5 = 'l';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1080125558:
                    if (k.equals("snapToPlaceExplicit")) {
                        c5 = 'e';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1153387098:
                    if (k.equals("GMM_QUANTIZED_DEVICE_LOCATION")) {
                        c5 = 'z';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1161921292:
                    if (k.equals("DIRECTIONS_WAYPOINT")) {
                        c5 = 154;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1169352881:
                    if (k.equals("MOBILE_FE_HISTORY")) {
                        c5 = '&';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1173263467:
                    if (k.equals("searchToolbelt")) {
                        c5 = '%';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1193227878:
                    if (k.equals("shippingAddress")) {
                        c5 = 133;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1208903752:
                    if (k.equals("DIRECTIONS_START_POINT")) {
                        c5 = 'p';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1294737098:
                    if (k.equals("shoppingSearchApi")) {
                        c5 = 'Q';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1312548125:
                    if (k.equals("ozFrontend")) {
                        c5 = 'S';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1337610584:
                    if (k.equals("ipAddressRealtime")) {
                        c5 = 9;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1367255847:
                    if (k.equals("LEGACY_TOOLBAR_HEADER")) {
                        c5 = 142;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1371629547:
                    if (k.equals("webSearchPreferencesPage")) {
                        c5 = '1';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1399077490:
                    if (k.equals("decodedFromUnknownRoleProducer")) {
                        c5 = 31;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1438629975:
                    if (k.equals("WILDCARD_PRODUCER")) {
                        c5 = 140;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1455317766:
                    if (k.equals("hulkUserPlacesInferred")) {
                        c5 = 'i';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1455631034:
                    if (k.equals("MAPS_FRONTEND")) {
                        c5 = '2';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1467697128:
                    if (k.equals("TACTILE_NEARBY_PARAM")) {
                        c5 = 'j';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1482124487:
                    if (k.equals("TURN_BY_TURN_NAVIGATION_REROUTE")) {
                        c5 = '`';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1504208975:
                    if (k.equals("queryHistoryInferred")) {
                        c5 = ';';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1529008722:
                    if (k.equals("gwsJurisdictionCountry")) {
                        c5 = 'M';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1566677685:
                    if (k.equals("HULK_USER_PLACES_INFERRED")) {
                        c5 = 'h';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1586785323:
                    if (k.equals("deviceLocation")) {
                        c5 = 21;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1601954027:
                    if (k.equals("queryHistoryInferredAlternate")) {
                        c5 = '=';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1634032845:
                    if (k.equals("ipAddress")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1682643809:
                    if (k.equals("LEGACY_MOBILE_FRONTEND_GLL")) {
                        c5 = 144;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1699876008:
                    if (k.equals("GMAIL_THEME")) {
                        c5 = '>';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1710059724:
                    if (k.equals("ADS_CRITERIA_ID")) {
                        c5 = '6';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1719144221:
                    if (k.equals("CONTEXT_MANAGER_FORECAST")) {
                        c5 = '~';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1720427680:
                    if (k.equals("PREF_L_FIELD_ADDRESS")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1740797266:
                    if (k.equals("gmmHeatmapArea")) {
                        c5 = 129;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1753328610:
                    if (k.equals("igoogle")) {
                        c5 = 'A';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1779235497:
                    if (k.equals("productSearchFrontend")) {
                        c5 = '5';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1900462268:
                    if (k.equals("IP_ADDRESS")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1920842526:
                    if (k.equals("loggedInUserSpecified")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1927882077:
                    if (k.equals("mobileSelected")) {
                        c5 = '+';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1979489551:
                    if (k.equals("CARRIER_COUNTRY")) {
                        c5 = 24;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2096814658:
                    if (k.equals("directionsStartPoint")) {
                        c5 = 'q';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2119256071:
                    if (k.equals("UNKNOWN_PRODUCER")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2145201474:
                    if (k.equals("WEB_SEARCH_PREFERENCES_PAGE")) {
                        c5 = '0';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2146944426:
                    if (k.equals("adsCriteriaId")) {
                        c5 = '7';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                case 1:
                    byew.mo74351I(2);
                    break;
                case 2:
                case 3:
                    byew.mo74351I(3);
                    break;
                case 4:
                case 5:
                    byew.mo74351I(4);
                    break;
                case 6:
                case 7:
                    byew.mo74351I(5);
                    break;
                case 8:
                case 9:
                    byew.mo74351I(44);
                    break;
                case 10:
                case 11:
                    byew.mo74351I(6);
                    break;
                case 12:
                case 13:
                    byew.mo74351I(7);
                    break;
                case 14:
                case 15:
                    byew.mo74351I(8);
                    break;
                case 16:
                case 17:
                    byew.mo74351I(43);
                    break;
                case 18:
                case 19:
                    byew.mo74351I(46);
                    break;
                case 20:
                case 21:
                    byew.mo74351I(14);
                    break;
                case 22:
                case 23:
                    byew.mo74351I(13);
                    break;
                case 24:
                case 25:
                    byew.mo74351I(19);
                    break;
                case 26:
                case 27:
                    byew.mo74351I(53);
                    break;
                case 28:
                case 29:
                    byew.mo74351I(56);
                    break;
                case 30:
                case 31:
                    byew.mo74351I(70);
                    break;
                case ' ':
                case '!':
                    byew.mo74351I(9);
                    break;
                case '\"':
                case '#':
                    byew.mo74351I(10);
                    break;
                case '$':
                case FelicaException.TYPE_NOT_CLOSED:
                    byew.mo74351I(15);
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    byew.mo74351I(16);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                case ')':
                    byew.mo74351I(36);
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    byew.mo74351I(17);
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    byew.mo74351I(18);
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                case '/':
                    byew.mo74351I(20);
                    break;
                case '0':
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    byew.mo74351I(22);
                    break;
                case '2':
                case '3':
                    byew.mo74351I(23);
                    break;
                case '4':
                case '5':
                    byew.mo74351I(24);
                    break;
                case '6':
                case '7':
                    byew.mo74351I(25);
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                case '9':
                    byew.mo74351I(26);
                    break;
                case FelicaException.TYPE_OFFLINE_CANCELED:
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    byew.mo74351I(27);
                    break;
                case FelicaException.TYPE_MFC_NOT_FOUND:
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    byew.mo74351I(61);
                    break;
                case '>':
                case '?':
                    byew.mo74351I(28);
                    break;
                case '@':
                case KeyInformation.AES128_DES56:
                    byew.mo74351I(29);
                    break;
                case 'B':
                case KeyInformation.AES128_DES112:
                    byew.mo74351I(30);
                    break;
                case 'D':
                case 'E':
                    byew.mo74351I(31);
                    break;
                case 'F':
                case 'G':
                    byew.mo74351I(32);
                    break;
                case 'H':
                case 'I':
                    byew.mo74351I(33);
                    break;
                case 'J':
                case 'K':
                    byew.mo74351I(37);
                    break;
                case 'L':
                case 'M':
                    byew.mo74351I(66);
                    break;
                case 'N':
                case KeyInformation.AES128:
                    byew.mo74351I(35);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                case 'Q':
                    byew.mo74351I(38);
                    break;
                case 'R':
                case 'S':
                    byew.mo74351I(39);
                    break;
                case 'T':
                case 'U':
                    byew.mo74351I(40);
                    break;
                case 'V':
                case 'W':
                    byew.mo74351I(41);
                    break;
                case 'X':
                case 'Y':
                    byew.mo74351I(34);
                    break;
                case 'Z':
                case '[':
                    byew.mo74351I(42);
                    break;
                case '\\':
                case ']':
                    byew.mo74351I(45);
                    break;
                case '^':
                case '_':
                    byew.mo74351I(47);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                case 'a':
                    byew.mo74351I(48);
                    break;
                case 'b':
                case 'c':
                    byew.mo74351I(49);
                    break;
                case 'd':
                case 'e':
                    byew.mo74351I(50);
                    break;
                case 'f':
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                    byew.mo74351I(51);
                    break;
                case ErrorInfo.TYPE_SDU_FAILED:
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                    byew.mo74351I(52);
                    break;
                case 'j':
                case 'k':
                    byew.mo74351I(54);
                    break;
                case 'l':
                case 'm':
                    byew.mo74351I(57);
                    break;
                case 'n':
                case 'o':
                    byew.mo74351I(55);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                case 'q':
                    byew.mo74351I(58);
                    break;
                case 'r':
                case 's':
                    byew.mo74351I(59);
                    break;
                case 't':
                case 'u':
                    byew.mo74351I(60);
                    break;
                case 'v':
                case 'w':
                    byew.mo74351I(62);
                    break;
                case 'x':
                case 'y':
                    byew.mo74351I(63);
                    break;
                case 'z':
                case '{':
                    byew.mo74351I(64);
                    break;
                case '|':
                case '}':
                    byew.mo74351I(65);
                    break;
                case '~':
                case 127:
                    byew.mo74351I(67);
                    break;
                case 128:
                case 129:
                    byew.mo74351I(68);
                    break;
                case 130:
                case 131:
                    byew.mo74351I(69);
                    break;
                case 132:
                case 133:
                    byew.mo74351I(71);
                    break;
                case 134:
                case 135:
                    byew.mo74351I(72);
                    break;
                case 136:
                case 137:
                    byew.mo74351I(73);
                    break;
                case 138:
                case 139:
                    byew.mo74351I(74);
                    break;
                case 140:
                case 141:
                    byew.mo74351I(1);
                    break;
                case 142:
                case 143:
                    byew.mo74351I(11);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                case 145:
                    byew.mo74351I(12);
                    break;
                case 146:
                case 147:
                    byew.mo74351I(21);
                    break;
                case 148:
                case 149:
                    byew.mo74351I(75);
                    break;
                case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                    byew.mo74351I(76);
                    break;
                case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                case MfiClientException.TYPE_MFICLIENT_STARTED:
                    byew.mo74351I(78);
                    break;
                case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                    byew.mo74351I(77);
                    break;
                default:
                    String valueOf2 = String.valueOf(locationDescriptor.mo71681k());
                    if (valueOf2.length() == 0) {
                        str5 = new String("Json2LiteBadEnum location.unified.LocationDescriptor.producer ");
                    } else {
                        str5 = "Json2LiteBadEnum location.unified.LocationDescriptor.producer ".concat(valueOf2);
                    }
                    throw new IllegalArgumentException(str5);
            }
        }
        if (locationDescriptor.mo71686p() != null) {
            long longValue = locationDescriptor.mo71686p().longValue();
            if (byew.f164950c) {
                byew.mo74035c();
                byew.f164950c = false;
            }
            byex byex4 = (byex) byew.f164949b;
            byex4.f165966a |= 4;
            byex4.f165969d = longValue;
        }
        if (locationDescriptor.mo71679i() != null) {
            byew.mo74370s(locationDescriptor.mo71679i());
        }
        if (locationDescriptor.getLatlng() != null) {
            byew.mo74357a(bjcq.m103200a(locationDescriptor.getLatlng()));
        }
        if (locationDescriptor.getLatlngSpan() != null) {
            byew.mo74368b(bjcq.m103200a(locationDescriptor.getLatlngSpan()));
        }
        if (locationDescriptor.getRect() != null) {
            byew.mo74358a(bjcr.m103201a(locationDescriptor.getRect()));
        }
        if (locationDescriptor.mo71683m() != null) {
            byew.mo74365b(locationDescriptor.mo71683m().floatValue());
        }
        if (locationDescriptor.mo71663b() != null) {
            byew.mo74355a(locationDescriptor.mo71663b().intValue());
        }
        if (locationDescriptor.getFeatureId() != null) {
            byew.mo74356a(bjcp.m103199a(locationDescriptor.getFeatureId()));
        }
        if (locationDescriptor.mo71680j() == null) {
            if (locationDescriptor.getLevelFeatureId() != null) {
                byew.mo74367b(bjcp.m103199a(locationDescriptor.getLevelFeatureId()));
            }
            if (locationDescriptor.mo71678h() != null) {
                byew.mo74354a(locationDescriptor.mo71678h().floatValue());
            }
            if (locationDescriptor.mo71668g() != null) {
                byew.mo74369b(locationDescriptor.mo71668g());
            }
            if (locationDescriptor.mo71682l() != null) {
                String l = locationDescriptor.mo71682l();
                switch (l.hashCode()) {
                    case -1774591034:
                        if (l.equals("xgeoHeader")) {
                            c4 = 17;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1471174608:
                        if (l.equals("gwsMobileClient")) {
                            c4 = 13;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1440420935:
                        if (l.equals("evalBaseUniqueSelectedUserLocation")) {
                            c4 = 25;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1171664369:
                        if (l.equals("LEGACY_MOBILE_FRONTEND_GLL_PARAM")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1140094085:
                        if (l.equals("toolbar")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -984167026:
                        if (l.equals("EVAL_EXP_UNIQUE_SELECTED_USER_LOCATION")) {
                            c4 = 26;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -911396313:
                        if (l.equals("assistantSettingsForCurrentDevice")) {
                            c4 = 21;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -884011652:
                        if (l.equals("MOBILE_FE")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -723518413:
                        if (l.equals("unremarkable")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -672597759:
                        if (l.equals("mobileFe")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -422111397:
                        if (l.equals("TOOLBAR")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -97180472:
                        if (l.equals("EVAL_BASE_UNIQUE_SELECTED_USER_LOCATION")) {
                            c4 = 24;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 197088660:
                        if (l.equals("XFF_HEADER")) {
                            c4 = 14;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 337799603:
                        if (l.equals("XGEO_HEADER")) {
                            c4 = 16;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 523904252:
                        if (l.equals("LEGACY_MOBILE_FRONTEND_NEAR_PARAM")) {
                            c4 = 10;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 962967821:
                        if (l.equals("evalExpUniqueSelectedUserLocation")) {
                            c4 = 27;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1008613576:
                        if (l.equals("legacyMobileFrontendNearParam")) {
                            c4 = 11;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1012750856:
                        if (l.equals("evalUniqueSelectedUserLocation")) {
                            c4 = 23;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1059733578:
                        if (l.equals("MAPS_FRONTEND_IL_DEBUG_IP")) {
                            c4 = 8;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1079673900:
                        if (l.equals("GWS_MOBILE_CLIENT")) {
                            c4 = 12;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1231820286:
                        if (l.equals("legacyGeoPositionHeader")) {
                            c4 = 19;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1265042542:
                        if (l.equals("mapsFrontendIlDebugIp")) {
                            c4 = 9;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1533893827:
                        if (l.equals("legacyMobileFrontendGllParam")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1593762867:
                        if (l.equals("UNREMARKABLE")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1828648927:
                        if (l.equals("LEGACY_GEO_POSITION_HEADER")) {
                            c4 = 18;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2015450085:
                        if (l.equals("xffHeader")) {
                            c4 = 15;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2037120720:
                        if (l.equals("EVAL_UNIQUE_SELECTED_USER_LOCATION")) {
                            c4 = 22;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2098353645:
                        if (l.equals("ASSISTANT_SETTINGS_FOR_CURRENT_DEVICE")) {
                            c4 = 20;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                    case 1:
                        byew.mo74352J(1);
                        break;
                    case 2:
                    case 3:
                        byew.mo74352J(2);
                        break;
                    case 4:
                    case 5:
                        byew.mo74352J(3);
                        break;
                    case 6:
                    case 7:
                        byew.mo74352J(4);
                        break;
                    case 8:
                    case 9:
                        byew.mo74352J(5);
                        break;
                    case 10:
                    case 11:
                        byew.mo74352J(6);
                        break;
                    case 12:
                    case 13:
                        byew.mo74352J(7);
                        break;
                    case 14:
                    case 15:
                        byew.mo74352J(8);
                        break;
                    case 16:
                    case 17:
                        byew.mo74352J(9);
                        break;
                    case 18:
                    case 19:
                        byew.mo74352J(10);
                        break;
                    case 20:
                    case 21:
                        byew.mo74352J(11);
                        break;
                    case 22:
                    case 23:
                        byew.mo74352J(102);
                        break;
                    case 24:
                    case 25:
                        byew.mo74352J((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                        break;
                    case 26:
                    case 27:
                        byew.mo74352J((int) ErrorInfo.TYPE_SDU_FAILED);
                        break;
                    default:
                        String valueOf3 = String.valueOf(locationDescriptor.mo71682l());
                        if (valueOf3.length() == 0) {
                            str4 = new String("Json2LiteBadEnum location.unified.LocationDescriptor.provenance ");
                        } else {
                            str4 = "Json2LiteBadEnum location.unified.LocationDescriptor.provenance ".concat(valueOf3);
                        }
                        throw new IllegalArgumentException(str4);
                }
            }
            if (locationDescriptor.mo71667f() != null) {
                String f = locationDescriptor.mo71667f();
                switch (f.hashCode()) {
                    case -2119958228:
                        if (f.equals("EXPERIMENTAL_LOCATION")) {
                            c3 = 20;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -2038740823:
                        if (f.equals("CURRENT_CONTEXT")) {
                            c3 = 22;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -2005567299:
                        if (f.equals("experimentalLocation")) {
                            c3 = 21;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1878750543:
                        if (f.equals("FUTURE_LOCATION")) {
                            c3 = 16;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1634095760:
                        if (f.equals("wildcardRole")) {
                            c3 = 25;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -777302797:
                        if (f.equals("HISTORICAL_QUERY")) {
                            c3 = 10;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -638343690:
                        if (f.equals("currentContext")) {
                            c3 = 23;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -603067429:
                        if (f.equals("CURRENT_LOCATION")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -491947490:
                        if (f.equals("historicalQuery")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -395835114:
                        if (f.equals("defaultLocation")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -254434373:
                        if (f.equals("WILDCARD_ROLE")) {
                            c3 = 24;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -140429234:
                        if (f.equals("currentLocation")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 69284883:
                        if (f.equals("DEFAULT_LOCATION")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 77406376:
                        if (f.equals("QUERY")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 107944136:
                        if (f.equals("query")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 230388107:
                        if (f.equals("userSpecifiedForRequest")) {
                            c3 = 9;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 608828298:
                        if (f.equals("HISTORICAL_LOCATION")) {
                            c3 = 12;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 629149388:
                        if (f.equals("invalidLocation")) {
                            c3 = 19;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1027507051:
                        if (f.equals("UNKNOWN_ROLE")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1176706712:
                        if (f.equals("futureLocation")) {
                            c3 = 17;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1196685478:
                        if (f.equals("viewport")) {
                            c3 = 15;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1619618784:
                        if (f.equals("unknownRole")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1647557430:
                        if (f.equals("USER_SPECIFIED_FOR_REQUEST")) {
                            c3 = 8;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1779033373:
                        if (f.equals("INVALID_LOCATION")) {
                            c3 = 18;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1888532127:
                        if (f.equals("historicalLocation")) {
                            c3 = 13;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1979312294:
                        if (f.equals("VIEWPORT")) {
                            c3 = 14;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                    case 1:
                        byew.mo74350H(2);
                        break;
                    case 2:
                    case 3:
                        byew.mo74350H(3);
                        break;
                    case 4:
                    case 5:
                        byew.mo74350H(4);
                        break;
                    case 6:
                    case 7:
                        byew.mo74350H(5);
                        break;
                    case 8:
                    case 9:
                        byew.mo74350H(6);
                        break;
                    case 10:
                    case 11:
                        byew.mo74350H(7);
                        break;
                    case 12:
                    case 13:
                        byew.mo74350H(8);
                        break;
                    case 14:
                    case 15:
                        byew.mo74350H(9);
                        break;
                    case 16:
                    case 17:
                        byew.mo74350H(10);
                        break;
                    case 18:
                    case 19:
                        byew.mo74350H(11);
                        break;
                    case 20:
                    case 21:
                        byew.mo74350H(12);
                        break;
                    case 22:
                    case 23:
                        byew.mo74350H(13);
                        break;
                    case 24:
                    case 25:
                        byew.mo74350H(1);
                        break;
                    default:
                        String valueOf4 = String.valueOf(locationDescriptor.mo71667f());
                        if (valueOf4.length() == 0) {
                            str3 = new String("Json2LiteBadEnum location.unified.LocationDescriptor.historical_role ");
                        } else {
                            str3 = "Json2LiteBadEnum location.unified.LocationDescriptor.historical_role ".concat(valueOf4);
                        }
                        throw new IllegalArgumentException(str3);
                }
            }
            if (locationDescriptor.mo71665d() != null) {
                String d = locationDescriptor.mo71665d();
                switch (d.hashCode()) {
                    case -2137373228:
                        if (d.equals("adsPartnerGeoParam")) {
                            c2 = 'W';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2120094230:
                        if (d.equals("legacyMobileFrontendGll")) {
                            c2 = 145;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2079033344:
                        if (d.equals("LEGACY_PARTNER_GL_PARAM")) {
                            c2 = 'H';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2051215490:
                        if (d.equals("DEVICE_LOCATION")) {
                            c2 = 20;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2045180744:
                        if (d.equals("JURISDICTION_COUNTRY")) {
                            c2 = 26;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2034211040:
                        if (d.equals("localUniversal")) {
                            c2 = '#';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2026431955:
                        if (d.equals("ipAddressAlternate")) {
                            c2 = 'o';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1938938700:
                        if (d.equals("defaultLocationOverrideProducer")) {
                            c2 = 'Y';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1869970538:
                        if (d.equals("RQUERY")) {
                            c2 = 12;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1856066892:
                        if (d.equals("ABLATED_PRODUCER")) {
                            c2 = 148;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1841341387:
                        if (d.equals("SQUERY")) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1834132468:
                        if (d.equals("GWS_MOBILE_HISTORY_ZWIEBACK")) {
                            c2 = '(';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1823655998:
                        if (d.equals("IGOOGLE")) {
                            c2 = '@';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1780693104:
                        if (d.equals("badDeviceLocation")) {
                            c2 = 'y';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1772671342:
                        if (d.equals("QUERY_LOCATION_OVERRIDE_PRODUCER")) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1762338012:
                        if (d.equals("BAD_DEVICE_LOCATION")) {
                            c2 = 'x';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1745024593:
                        if (d.equals("ablatedProducer")) {
                            c2 = 149;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1741506823:
                        if (d.equals("LOGGED_IN_USER_SPECIFIED")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1737901724:
                        if (d.equals("snapToRoute")) {
                            c2 = 'u';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1711173593:
                        if (d.equals("snapToPlaceImplicit")) {
                            c2 = 'c';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1667314750:
                        if (d.equals("HULK_ROUTINES")) {
                            c2 = 138;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1634561820:
                        if (d.equals("MOBILE_APP")) {
                            c2 = '8';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1607061264:
                        if (d.equals("ADS_GEO_PARAM")) {
                            c2 = 'T';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1602172551:
                        if (d.equals("DEFAULT_LOCATION_OVERRIDE_PRODUCER")) {
                            c2 = 'X';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1569657456:
                        if (d.equals("SEARCH_ALONG_ROUTE")) {
                            c2 = 'r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1545863717:
                        if (d.equals("oolongRealtimeCache")) {
                            c2 = 151;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1541319913:
                        if (d.equals("GAIA_LOCATION_HISTORY")) {
                            c2 = '\\';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1505625297:
                        if (d.equals("TRAVEL_STATE_INTENT")) {
                            c2 = 136;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1479177898:
                        if (d.equals("stickinessParams")) {
                            c2 = '_';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1478898123:
                        if (d.equals("GOOGLE_HOST_DOMAIN")) {
                            c2 = 10;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1472184075:
                        if (d.equals("directionsWaypoint")) {
                            c2 = 155;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1425864852:
                        if (d.equals("OOLONG_REALTIME_CACHE_ALTERNATE")) {
                            c2 = 152;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1404022621:
                        if (d.equals("gwsHistoryGaia")) {
                            c2 = '}';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1385958546:
                        if (d.equals("SMS_SEARCH")) {
                            c2 = 'D';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1358293158:
                        if (d.equals("SEARCH_TOOLBELT")) {
                            c2 = '$';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1298210107:
                        if (d.equals("legacyMobileFrontendNear")) {
                            c2 = 147;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1240965211:
                        if (d.equals("googleHostDomain")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1232276625:
                        if (d.equals("gwsMobileHistoryZwieback")) {
                            c2 = ')';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1202516368:
                        if (d.equals("clientSpecifiedJurisdictionCountry")) {
                            c2 = 29;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1201146372:
                        if (d.equals("unknownProducer")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1154143284:
                        if (d.equals("LEGACY_NEAR_PARAM")) {
                            c2 = 22;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1129017011:
                        if (d.equals("gaiaLocationHistory")) {
                            c2 = ']';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1114339255:
                        if (d.equals("LEGACY_GL_PARAM")) {
                            c2 = 'F';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1101226522:
                        if (d.equals("OZ_FRONTEND")) {
                            c2 = 'R';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1092412677:
                        if (d.equals("CLIENT_SPECIFIED_JURISDICTION_COUNTRY")) {
                            c2 = 28;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1088683461:
                        if (d.equals("queryLocationOverrideProducer")) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -932063139:
                        if (d.equals("CIRCULARS_FRONTEND")) {
                            c2 = 'N';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -925492243:
                        if (d.equals("GOOGLE_MY_BUSINESS")) {
                            c2 = 'v';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -923299946:
                        if (d.equals("rquery")) {
                            c2 = 13;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -894670795:
                        if (d.equals("squery")) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -887499069:
                        if (d.equals("prefLFieldAddress")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -850340154:
                        if (d.equals("mapsActivity")) {
                            c2 = 'm';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -794711141:
                        if (d.equals("SNAP_TO_PLACE_EXPLICIT")) {
                            c2 = 'd';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -792929080:
                        if (d.equals("partner")) {
                            c2 = '-';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -674662886:
                        if (d.equals("SHOPPING_SEARCH_API")) {
                            c2 = 'P';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -608973850:
                        if (d.equals("circularsFrontend")) {
                            c2 = 'O';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -544108024:
                        if (d.equals("LEGACY_GL_COOKIE")) {
                            c2 = 'J';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -497176436:
                        if (d.equals("adsGeoParam")) {
                            c2 = 'U';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -444576691:
                        if (d.equals("HULK_USER_PLACES_CONFIRMED")) {
                            c2 = 'f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -437161527:
                        if (d.equals("mapsFrontend")) {
                            c2 = '3';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -424047558:
                        if (d.equals("SNAP_TO_ROUTE")) {
                            c2 = 't';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -389002075:
                        if (d.equals("googleMyBusiness")) {
                            c2 = 'w';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -382316393:
                        if (d.equals("IP_ADDRESS_ALTERNATE")) {
                            c2 = 'n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -368361191:
                        if (d.equals("ADS_PARTNER_GEO_PARAM")) {
                            c2 = 'V';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -343845356:
                        if (d.equals("GWS_JURISDICTION_COUNTRY")) {
                            c2 = 'L';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -330639492:
                        if (d.equals("legacyNearParam")) {
                            c2 = 23;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -311025223:
                        if (d.equals("GWS_HISTORY_GAIA")) {
                            c2 = '|';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -270872847:
                        if (d.equals("turnByTurnNavigationReroute")) {
                            c2 = 'a';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -257841768:
                        if (d.equals("MOBILE_SELECTED")) {
                            c2 = '*';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -234025519:
                        if (d.equals("OOLONG_REALTIME_CACHE")) {
                            c2 = 150;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -178324674:
                        if (d.equals("calendar")) {
                            c2 = 'C';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -166985095:
                        if (d.equals("deviceContext")) {
                            c2 = 135;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -120266081:
                        if (d.equals("legacyGlParam")) {
                            c2 = 'G';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -112175040:
                        if (d.equals("QUERY_HISTORY_INFERRED_ALTERNATE")) {
                            c2 = '<';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -99184557:
                        if (d.equals("mobileFeHistory")) {
                            c2 = '\'';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -74946392:
                        if (d.equals("PARTNER")) {
                            c2 = ',';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2392787:
                        if (d.equals("NEWS")) {
                            c2 = 130;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2494082:
                        if (d.equals("QREF")) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3377875:
                        if (d.equals("news")) {
                            c2 = 131;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3479170:
                        if (d.equals("qref")) {
                            c2 = 19;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 51562878:
                        if (d.equals("carrierCountry")) {
                            c2 = 25;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 131303637:
                        if (d.equals("jurisdictionCountry")) {
                            c2 = 27;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 173862796:
                        if (d.equals("wildcardProducer")) {
                            c2 = 141;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 207389330:
                        if (d.equals("legacyGlCookie")) {
                            c2 = 'K';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 273457551:
                        if (d.equals("showtimeOnebox")) {
                            c2 = '!';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 320148503:
                        if (d.equals("gmmQuantizedDeviceLocation")) {
                            c2 = '{';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 390565082:
                        if (d.equals("DECODED_FROM_UNKNOWN_ROLE_PRODUCER")) {
                            c2 = 30;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 396678580:
                        if (d.equals("searchAlongRoute")) {
                            c2 = 's';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 398233148:
                        if (d.equals("hulkUserPlacesConfirmed")) {
                            c2 = 'g';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 420815246:
                        if (d.equals("IP_ADDRESS_REALTIME")) {
                            c2 = 8;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 436079379:
                        if (d.equals("travelStateIntent")) {
                            c2 = 137;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 452009390:
                        if (d.equals("webSearchResultsPageShared")) {
                            c2 = '/';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 485576949:
                        if (d.equals("STICKINESS_PARAMS")) {
                            c2 = '^';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 525178789:
                        if (d.equals("QUERY_HISTORY_INFERRED")) {
                            c2 = ':';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 567560652:
                        if (d.equals("viewportParams")) {
                            c2 = '[';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 598709098:
                        if (d.equals("tactileNearbyParam")) {
                            c2 = 'k';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 604302142:
                        if (d.equals("CALENDAR")) {
                            c2 = 'B';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 613022879:
                        if (d.equals("legacyToolbarHeader")) {
                            c2 = 143;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 622552078:
                        if (d.equals("LEGACY_MOBILE_FRONTEND_NEAR")) {
                            c2 = 146;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 624301599:
                        if (d.equals("mobileApp")) {
                            c2 = '9';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 685491366:
                        if (d.equals("DEVICE_CONTEXT")) {
                            c2 = 134;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 692002874:
                        if (d.equals("SHOWTIME_ONEBOX")) {
                            c2 = ' ';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 699380736:
                        if (d.equals("WEB_SEARCH_RESULTS_PAGE_SHARED")) {
                            c2 = '.';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 701468215:
                        if (d.equals("LOCAL_UNIVERSAL")) {
                            c2 = '\"';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 708957004:
                        if (d.equals("SNAP_TO_PLACE_IMPLICIT")) {
                            c2 = 'b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 708975423:
                        if (d.equals("VIEWPORT_PARAMS")) {
                            c2 = 'Z';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 745138273:
                        if (d.equals("smsSearch")) {
                            c2 = 'E';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 854366441:
                        if (d.equals("legacyPartnerGlParam")) {
                            c2 = 'I';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 900319455:
                        if (d.equals("oolongRealtimeCacheAlternate")) {
                            c2 = 153;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 909774403:
                        if (d.equals("SHIPPING_ADDRESS")) {
                            c2 = 132;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 915144139:
                        if (d.equals("gmailTheme")) {
                            c2 = '?';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 947264411:
                        if (d.equals("hulkRoutines")) {
                            c2 = 139;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 951444313:
                        if (d.equals("PRODUCT_SEARCH_FRONTEND")) {
                            c2 = '4';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 970379033:
                        if (d.equals("contextManagerForecast")) {
                            c2 = 127;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1015685304:
                        if (d.equals("GMM_HEATMAP_AREA")) {
                            c2 = 128;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1042452407:
                        if (d.equals("MAPS_ACTIVITY")) {
                            c2 = 'l';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1080125558:
                        if (d.equals("snapToPlaceExplicit")) {
                            c2 = 'e';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1153387098:
                        if (d.equals("GMM_QUANTIZED_DEVICE_LOCATION")) {
                            c2 = 'z';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1161921292:
                        if (d.equals("DIRECTIONS_WAYPOINT")) {
                            c2 = 154;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1169352881:
                        if (d.equals("MOBILE_FE_HISTORY")) {
                            c2 = '&';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1173263467:
                        if (d.equals("searchToolbelt")) {
                            c2 = '%';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1193227878:
                        if (d.equals("shippingAddress")) {
                            c2 = 133;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1208903752:
                        if (d.equals("DIRECTIONS_START_POINT")) {
                            c2 = 'p';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1294737098:
                        if (d.equals("shoppingSearchApi")) {
                            c2 = 'Q';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1312548125:
                        if (d.equals("ozFrontend")) {
                            c2 = 'S';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1337610584:
                        if (d.equals("ipAddressRealtime")) {
                            c2 = 9;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1367255847:
                        if (d.equals("LEGACY_TOOLBAR_HEADER")) {
                            c2 = 142;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1371629547:
                        if (d.equals("webSearchPreferencesPage")) {
                            c2 = '1';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1399077490:
                        if (d.equals("decodedFromUnknownRoleProducer")) {
                            c2 = 31;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1438629975:
                        if (d.equals("WILDCARD_PRODUCER")) {
                            c2 = 140;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1455317766:
                        if (d.equals("hulkUserPlacesInferred")) {
                            c2 = 'i';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1455631034:
                        if (d.equals("MAPS_FRONTEND")) {
                            c2 = '2';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1467697128:
                        if (d.equals("TACTILE_NEARBY_PARAM")) {
                            c2 = 'j';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1482124487:
                        if (d.equals("TURN_BY_TURN_NAVIGATION_REROUTE")) {
                            c2 = '`';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1504208975:
                        if (d.equals("queryHistoryInferred")) {
                            c2 = ';';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1529008722:
                        if (d.equals("gwsJurisdictionCountry")) {
                            c2 = 'M';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1566677685:
                        if (d.equals("HULK_USER_PLACES_INFERRED")) {
                            c2 = 'h';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1586785323:
                        if (d.equals("deviceLocation")) {
                            c2 = 21;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1601954027:
                        if (d.equals("queryHistoryInferredAlternate")) {
                            c2 = '=';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1634032845:
                        if (d.equals("ipAddress")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1682643809:
                        if (d.equals("LEGACY_MOBILE_FRONTEND_GLL")) {
                            c2 = 144;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1699876008:
                        if (d.equals("GMAIL_THEME")) {
                            c2 = '>';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1710059724:
                        if (d.equals("ADS_CRITERIA_ID")) {
                            c2 = '6';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1719144221:
                        if (d.equals("CONTEXT_MANAGER_FORECAST")) {
                            c2 = '~';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1720427680:
                        if (d.equals("PREF_L_FIELD_ADDRESS")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1740797266:
                        if (d.equals("gmmHeatmapArea")) {
                            c2 = 129;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1753328610:
                        if (d.equals("igoogle")) {
                            c2 = 'A';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1779235497:
                        if (d.equals("productSearchFrontend")) {
                            c2 = '5';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1900462268:
                        if (d.equals("IP_ADDRESS")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1920842526:
                        if (d.equals("loggedInUserSpecified")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1927882077:
                        if (d.equals("mobileSelected")) {
                            c2 = '+';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1979489551:
                        if (d.equals("CARRIER_COUNTRY")) {
                            c2 = 24;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2096814658:
                        if (d.equals("directionsStartPoint")) {
                            c2 = 'q';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2119256071:
                        if (d.equals("UNKNOWN_PRODUCER")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2145201474:
                        if (d.equals("WEB_SEARCH_PREFERENCES_PAGE")) {
                            c2 = '0';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2146944426:
                        if (d.equals("adsCriteriaId")) {
                            c2 = '7';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                        byew.mo74349G(2);
                        break;
                    case 2:
                    case 3:
                        byew.mo74349G(3);
                        break;
                    case 4:
                    case 5:
                        byew.mo74349G(4);
                        break;
                    case 6:
                    case 7:
                        byew.mo74349G(5);
                        break;
                    case 8:
                    case 9:
                        byew.mo74349G(44);
                        break;
                    case 10:
                    case 11:
                        byew.mo74349G(6);
                        break;
                    case 12:
                    case 13:
                        byew.mo74349G(7);
                        break;
                    case 14:
                    case 15:
                        byew.mo74349G(8);
                        break;
                    case 16:
                    case 17:
                        byew.mo74349G(43);
                        break;
                    case 18:
                    case 19:
                        byew.mo74349G(46);
                        break;
                    case 20:
                    case 21:
                        byew.mo74349G(14);
                        break;
                    case 22:
                    case 23:
                        byew.mo74349G(13);
                        break;
                    case 24:
                    case 25:
                        byew.mo74349G(19);
                        break;
                    case 26:
                    case 27:
                        byew.mo74349G(53);
                        break;
                    case 28:
                    case 29:
                        byew.mo74349G(56);
                        break;
                    case 30:
                    case 31:
                        byew.mo74349G(70);
                        break;
                    case ' ':
                    case '!':
                        byew.mo74349G(9);
                        break;
                    case '\"':
                    case '#':
                        byew.mo74349G(10);
                        break;
                    case '$':
                    case FelicaException.TYPE_NOT_CLOSED:
                        byew.mo74349G(15);
                        break;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        byew.mo74349G(16);
                        break;
                    case FelicaException.TYPE_PUSH_FAILED:
                    case ')':
                        byew.mo74349G(36);
                        break;
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                        byew.mo74349G(17);
                        break;
                    case FelicaException.TYPE_RESET_FAILED:
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        byew.mo74349G(18);
                        break;
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    case '/':
                        byew.mo74349G(20);
                        break;
                    case '0':
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        byew.mo74349G(22);
                        break;
                    case '2':
                    case '3':
                        byew.mo74349G(23);
                        break;
                    case '4':
                    case '5':
                        byew.mo74349G(24);
                        break;
                    case '6':
                    case '7':
                        byew.mo74349G(25);
                        break;
                    case FelicaException.TYPE_ACTIVATE_FAILED:
                    case '9':
                        byew.mo74349G(26);
                        break;
                    case FelicaException.TYPE_OFFLINE_CANCELED:
                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        byew.mo74349G(27);
                        break;
                    case FelicaException.TYPE_MFC_NOT_FOUND:
                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                        byew.mo74349G(61);
                        break;
                    case '>':
                    case '?':
                        byew.mo74349G(28);
                        break;
                    case '@':
                    case KeyInformation.AES128_DES56:
                        byew.mo74349G(29);
                        break;
                    case 'B':
                    case KeyInformation.AES128_DES112:
                        byew.mo74349G(30);
                        break;
                    case 'D':
                    case 'E':
                        byew.mo74349G(31);
                        break;
                    case 'F':
                    case 'G':
                        byew.mo74349G(32);
                        break;
                    case 'H':
                    case 'I':
                        byew.mo74349G(33);
                        break;
                    case 'J':
                    case 'K':
                        byew.mo74349G(37);
                        break;
                    case 'L':
                    case 'M':
                        byew.mo74349G(66);
                        break;
                    case 'N':
                    case KeyInformation.AES128:
                        byew.mo74349G(35);
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                    case 'Q':
                        byew.mo74349G(38);
                        break;
                    case 'R':
                    case 'S':
                        byew.mo74349G(39);
                        break;
                    case 'T':
                    case 'U':
                        byew.mo74349G(40);
                        break;
                    case 'V':
                    case 'W':
                        byew.mo74349G(41);
                        break;
                    case 'X':
                    case 'Y':
                        byew.mo74349G(34);
                        break;
                    case 'Z':
                    case '[':
                        byew.mo74349G(42);
                        break;
                    case '\\':
                    case ']':
                        byew.mo74349G(45);
                        break;
                    case '^':
                    case '_':
                        byew.mo74349G(47);
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                    case 'a':
                        byew.mo74349G(48);
                        break;
                    case 'b':
                    case 'c':
                        byew.mo74349G(49);
                        break;
                    case 'd':
                    case 'e':
                        byew.mo74349G(50);
                        break;
                    case 'f':
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        byew.mo74349G(51);
                        break;
                    case ErrorInfo.TYPE_SDU_FAILED:
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        byew.mo74349G(52);
                        break;
                    case 'j':
                    case 'k':
                        byew.mo74349G(54);
                        break;
                    case 'l':
                    case 'm':
                        byew.mo74349G(57);
                        break;
                    case 'n':
                    case 'o':
                        byew.mo74349G(55);
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                    case 'q':
                        byew.mo74349G(58);
                        break;
                    case 'r':
                    case 's':
                        byew.mo74349G(59);
                        break;
                    case 't':
                    case 'u':
                        byew.mo74349G(60);
                        break;
                    case 'v':
                    case 'w':
                        byew.mo74349G(62);
                        break;
                    case 'x':
                    case 'y':
                        byew.mo74349G(63);
                        break;
                    case 'z':
                    case '{':
                        byew.mo74349G(64);
                        break;
                    case '|':
                    case '}':
                        byew.mo74349G(65);
                        break;
                    case '~':
                    case 127:
                        byew.mo74349G(67);
                        break;
                    case 128:
                    case 129:
                        byew.mo74349G(68);
                        break;
                    case 130:
                    case 131:
                        byew.mo74349G(69);
                        break;
                    case 132:
                    case 133:
                        byew.mo74349G(71);
                        break;
                    case 134:
                    case 135:
                        byew.mo74349G(72);
                        break;
                    case 136:
                    case 137:
                        byew.mo74349G(73);
                        break;
                    case 138:
                    case 139:
                        byew.mo74349G(74);
                        break;
                    case 140:
                    case 141:
                        byew.mo74349G(1);
                        break;
                    case 142:
                    case 143:
                        byew.mo74349G(11);
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                    case 145:
                        byew.mo74349G(12);
                        break;
                    case 146:
                    case 147:
                        byew.mo74349G(21);
                        break;
                    case 148:
                    case 149:
                        byew.mo74349G(75);
                        break;
                    case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                    case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                        byew.mo74349G(76);
                        break;
                    case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                    case MfiClientException.TYPE_MFICLIENT_STARTED:
                        byew.mo74349G(78);
                        break;
                    case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                    case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                        byew.mo74349G(77);
                        break;
                    default:
                        String valueOf5 = String.valueOf(locationDescriptor.mo71665d());
                        if (valueOf5.length() == 0) {
                            str2 = new String("Json2LiteBadEnum location.unified.LocationDescriptor.historical_producer ");
                        } else {
                            str2 = "Json2LiteBadEnum location.unified.LocationDescriptor.historical_producer ".concat(valueOf5);
                        }
                        throw new IllegalArgumentException(str2);
                }
            }
            if (locationDescriptor.mo71666e() != null) {
                byew.mo74366b(locationDescriptor.mo71666e().intValue());
            }
            if (locationDescriptor.getAttributes() != null) {
                byew.mo74359a(bjcs.m103202a(locationDescriptor.getAttributes()));
            }
            if (locationDescriptor.mo71664c() != null) {
                byew.mo74364a(locationDescriptor.mo71664c());
            }
            if (locationDescriptor.mo71685o() != null) {
                ArrayList o = locationDescriptor.mo71685o();
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    String str7 = (String) o.get(i);
                    if (str7 != null) {
                        switch (str7.hashCode()) {
                            case -2045110907:
                                if (str7.equals("semanticMapsSearch")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1987493937:
                                if (str7.equals("SEMANTIC_FREQUENT_PLACE")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1665164990:
                                if (str7.equals("SEMANTIC_ONBOARD_TRANSIT")) {
                                    c = 12;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1486390605:
                                if (str7.equals("semanticFrequentPlace")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1320041403:
                                if (str7.equals("SEMANTIC_REROUTE_TAKEN")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1206811707:
                                if (str7.equals("semanticHome")) {
                                    c = 9;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1206364681:
                                if (str7.equals("semanticWork")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1048294698:
                                if (str7.equals("semanticRerouteProposed")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -981700856:
                                if (str7.equals("SEMANTIC_REROUTE_PROPOSED")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -710780105:
                                if (str7.equals("SEMANTIC_OTHER")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -333780060:
                                if (str7.equals("semanticUnknown")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 115405752:
                                if (str7.equals("SEMANTIC_HOME")) {
                                    c = 8;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 115852778:
                                if (str7.equals("SEMANTIC_WORK")) {
                                    c = 10;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 253645655:
                                if (str7.equals("SEMANTIC_MAPS_SEARCH")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 471032715:
                                if (str7.equals("semanticRerouteSource")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 701437617:
                                if (str7.equals("SEMANTIC_UNKNOWN")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 990056146:
                                if (str7.equals("semanticOnboardTransit")) {
                                    c = 13;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1250151658:
                                if (str7.equals("semanticOther")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1678259031:
                                if (str7.equals("semanticRerouteTaken")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2012999741:
                                if (str7.equals("SEMANTIC_REROUTE_SOURCE")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                byew.mo74360a(byfc.SEMANTIC_UNKNOWN);
                                continue;
                            case 2:
                            case 3:
                                byew.mo74360a(byfc.SEMANTIC_REROUTE_SOURCE);
                                continue;
                            case 4:
                            case 5:
                                byew.mo74360a(byfc.SEMANTIC_REROUTE_PROPOSED);
                                continue;
                            case 6:
                            case 7:
                                byew.mo74360a(byfc.SEMANTIC_REROUTE_TAKEN);
                                continue;
                            case 8:
                            case 9:
                                byew.mo74360a(byfc.SEMANTIC_HOME);
                                continue;
                            case 10:
                            case 11:
                                byew.mo74360a(byfc.SEMANTIC_WORK);
                                continue;
                            case 12:
                            case 13:
                                byew.mo74360a(byfc.SEMANTIC_ONBOARD_TRANSIT);
                                continue;
                            case 14:
                            case 15:
                                byew.mo74360a(byfc.SEMANTIC_MAPS_SEARCH);
                                continue;
                            case 16:
                            case 17:
                                byew.mo74360a(byfc.SEMANTIC_FREQUENT_PLACE);
                                continue;
                            case 18:
                            case 19:
                                byew.mo74360a(byfc.SEMANTIC_OTHER);
                                continue;
                            default:
                                if (str7.length() == 0) {
                                    str = new String("Json2LiteBadEnum location.unified.LocationDescriptor.semantic ");
                                } else {
                                    str = "Json2LiteBadEnum location.unified.LocationDescriptor.semantic ".concat(str7);
                                }
                                throw new IllegalArgumentException(str);
                        }
                    }
                }
            }
            if (locationDescriptor.getSemanticPlaces() != null) {
                ArrayList semanticPlaces = locationDescriptor.getSemanticPlaces();
                int size2 = semanticPlaces.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SemanticPlace semanticPlace = (SemanticPlace) semanticPlaces.get(i2);
                    if (semanticPlace != null) {
                        byew.mo74362a(bjcw.m103205a(semanticPlace));
                    }
                }
            }
            if (locationDescriptor.getVisibleNetworks() != null) {
                ArrayList visibleNetworks = locationDescriptor.getVisibleNetworks();
                int size3 = visibleNetworks.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    VisibleNetwork visibleNetwork = (VisibleNetwork) visibleNetworks.get(i3);
                    if (visibleNetwork != null) {
                        byew.mo74363a(bjcz.m103206a(visibleNetwork));
                    }
                }
            }
            if (locationDescriptor.getPresenceIntervals() != null) {
                ArrayList presenceIntervals = locationDescriptor.getPresenceIntervals();
                int size4 = presenceIntervals.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    PresenceInterval presenceInterval = (PresenceInterval) presenceIntervals.get(i4);
                    if (presenceInterval != null) {
                        byew.mo74361a(bjcu.m103204a(presenceInterval));
                    }
                }
            }
            return (byex) byew.mo74062i();
        }
        throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.LocationDescriptor.mid");
    }
}
