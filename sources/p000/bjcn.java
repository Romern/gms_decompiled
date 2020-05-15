package p000;

import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ApiBleRate;
import com.google.android.ulr.ApiRate;

/* renamed from: bjcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcn {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0afa, code lost:
        if (r10.equals("LOCATION_AWARE_BATCH_BACKOFF_DEFAULT") != false) goto L_0x0c03;
     */
    /* renamed from: a */
    public static bvxc m103197a(ApiRate apiRate) {
        bvvx bvvx;
        String str;
        char c;
        char c2;
        String str2;
        char c3;
        char c4;
        String str3;
        if (apiRate == null) {
            return null;
        }
        bxvd da = bvxc.f158036l.mo74144da();
        if (apiRate.mo71580g() != null) {
            long longValue = apiRate.mo71580g().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc = (bvxc) da.f164949b;
            bvxc.f158038a |= 1;
            bvxc.f158039b = longValue;
        }
        if (apiRate.mo71577d() != null) {
            long longValue2 = apiRate.mo71577d().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc2 = (bvxc) da.f164949b;
            bvxc2.f158038a |= 2;
            bvxc2.f158040c = longValue2;
        }
        char c5 = 18;
        if (apiRate.mo71578e() != null) {
            String e = apiRate.mo71578e();
            switch (e.hashCode()) {
                case -2137942761:
                    if (e.equals("lowBatteryUnfamiliar")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -2102236543:
                    if (e.equals("MODEL_TRIGGERED")) {
                        c4 = '(';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -2076224911:
                    if (e.equals("CHARGING")) {
                        c4 = 8;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -2032180703:
                    if (e.equals("DEFAULT")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1752517260:
                    if (e.equals("HOME_DEPARTURE")) {
                        c4 = '\"';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1653763102:
                    if (e.equals("LOW_BATTERY")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1340613956:
                    if (e.equals("homeEnteredWifiConnected")) {
                        c4 = 25;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1247774930:
                    if (e.equals("modelTriggered")) {
                        c4 = ')';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1097441770:
                    if (e.equals("OVERSAMPLING_ENDED")) {
                        c4 = ',';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1045973227:
                    if (e.equals("WORK_ENTERED_WIFI_CONNECTED")) {
                        c4 = 28;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -979695407:
                    if (e.equals("firstUpload")) {
                        c4 = 23;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -868629277:
                    if (e.equals("workDeparture")) {
                        c4 = '\'';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -613349876:
                    if (e.equals("nonPrimaryDefault")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -590713662:
                    if (e.equals("wifiTriggered")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -584345472:
                    if (e.equals("CHARGING_IN_VEHICLE")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -486630755:
                    if (e.equals("homeExit")) {
                        c4 = '!';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -422568257:
                    if (e.equals("oversamplingEnded")) {
                        c4 = '-';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -388731508:
                    if (e.equals("WORK_EXIT")) {
                        c4 = '$';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -387128953:
                    if (e.equals("HOME_ENTERED_WIFI_CONNECTED")) {
                        c4 = 24;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -238158823:
                    if (e.equals("lowBattery")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -98468684:
                    if (e.equals("stationary")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 23120605:
                    if (e.equals("HOME_ENTERED_WIFI_DISCONNECTED")) {
                        c4 = 26;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 34407375:
                    if (e.equals("workExit")) {
                        c4 = '%';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 79227272:
                    if (e.equals("STILL")) {
                        c4 = 10;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109765032:
                    if (e.equals("still")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 168438578:
                    if (e.equals("NON_PRIMARY_DEFAULT")) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 339510046:
                    if (e.equals("walkingFamiliar")) {
                        c4 = 13;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 386623668:
                    if (e.equals("STATIONARY")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 393896591:
                    if (e.equals("WORK_ENTERED_WIFI_DISCONNECTED")) {
                        c4 = 30;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 439494315:
                    if (e.equals("WALKING_FAMILIAR")) {
                        c4 = 12;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 638955646:
                    if (e.equals("HOME_EXIT")) {
                        c4 = ' ';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 654817795:
                    if (e.equals("NON_PRIMARY_STATIONARY")) {
                        c4 = 20;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 778707600:
                    if (e.equals("FIRST_UPLOAD")) {
                        c4 = 22;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 811351765:
                    if (e.equals("homeDeparture")) {
                        c4 = '#';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 975233750:
                    if (e.equals("chargingInVehicle")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1006279478:
                    if (e.equals("workEnteredWifiDisconnected")) {
                        c4 = 31;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1436115569:
                    if (e.equals("charging")) {
                        c4 = 9;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1544803905:
                    if (e.equals("default")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1617010670:
                    if (e.equals("workEnteredWifiConnected")) {
                        c4 = 29;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1626084507:
                    if (e.equals("LOW_BATTERY_UNFAMILIAR")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1629972701:
                    if (e.equals("OVERSAMPLING_STARTED")) {
                        c4 = '*';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1643358022:
                    if (e.equals("oversamplingStarted")) {
                        c4 = '+';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1665123752:
                    if (e.equals("homeEnteredWifiDisconnected")) {
                        c4 = 27;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2002645286:
                    if (e.equals("WORK_DEPARTURE")) {
                        c4 = '&';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2002662665:
                    if (e.equals("nonPrimaryStationary")) {
                        c4 = 21;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2083811213:
                    if (e.equals("WIFI_TRIGGERED")) {
                        c4 = 6;
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
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc3 = (bvxc) da.f164949b;
                    bvxc3.f158041d = 0;
                    bvxc3.f158038a |= 4;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc4 = (bvxc) da.f164949b;
                    bvxc4.f158041d = 1;
                    bvxc4.f158038a |= 4;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc5 = (bvxc) da.f164949b;
                    bvxc5.f158041d = 2;
                    bvxc5.f158038a |= 4;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc6 = (bvxc) da.f164949b;
                    bvxc6.f158041d = 3;
                    bvxc6.f158038a |= 4;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc7 = (bvxc) da.f164949b;
                    bvxc7.f158041d = 4;
                    bvxc7.f158038a |= 4;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc8 = (bvxc) da.f164949b;
                    bvxc8.f158041d = 5;
                    bvxc8.f158038a |= 4;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc9 = (bvxc) da.f164949b;
                    bvxc9.f158041d = 6;
                    bvxc9.f158038a |= 4;
                    break;
                case 14:
                case 15:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc10 = (bvxc) da.f164949b;
                    bvxc10.f158041d = 7;
                    bvxc10.f158038a |= 4;
                    break;
                case 16:
                case 17:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc11 = (bvxc) da.f164949b;
                    bvxc11.f158041d = 8;
                    bvxc11.f158038a |= 4;
                    break;
                case 18:
                case 19:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc12 = (bvxc) da.f164949b;
                    bvxc12.f158041d = 9;
                    bvxc12.f158038a |= 4;
                    break;
                case 20:
                case 21:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc13 = (bvxc) da.f164949b;
                    bvxc13.f158041d = 10;
                    bvxc13.f158038a |= 4;
                    break;
                case 22:
                case 23:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc14 = (bvxc) da.f164949b;
                    bvxc14.f158041d = 11;
                    bvxc14.f158038a |= 4;
                    break;
                case 24:
                case 25:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc15 = (bvxc) da.f164949b;
                    bvxc15.f158041d = 12;
                    bvxc15.f158038a |= 4;
                    break;
                case 26:
                case 27:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc16 = (bvxc) da.f164949b;
                    bvxc16.f158041d = 13;
                    bvxc16.f158038a |= 4;
                    break;
                case 28:
                case 29:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc17 = (bvxc) da.f164949b;
                    bvxc17.f158041d = 14;
                    bvxc17.f158038a |= 4;
                    break;
                case 30:
                case 31:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc18 = (bvxc) da.f164949b;
                    bvxc18.f158041d = 15;
                    bvxc18.f158038a |= 4;
                    break;
                case ' ':
                case '!':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc19 = (bvxc) da.f164949b;
                    bvxc19.f158041d = 16;
                    bvxc19.f158038a |= 4;
                    break;
                case '\"':
                case '#':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc20 = (bvxc) da.f164949b;
                    bvxc20.f158041d = 18;
                    bvxc20.f158038a |= 4;
                    break;
                case '$':
                case FelicaException.TYPE_NOT_CLOSED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc21 = (bvxc) da.f164949b;
                    bvxc21.f158041d = 17;
                    bvxc21.f158038a |= 4;
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc22 = (bvxc) da.f164949b;
                    bvxc22.f158041d = 19;
                    bvxc22.f158038a |= 4;
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                case ')':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc23 = (bvxc) da.f164949b;
                    bvxc23.f158041d = 20;
                    bvxc23.f158038a |= 4;
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc24 = (bvxc) da.f164949b;
                    bvxc24.f158041d = 21;
                    bvxc24.f158038a |= 4;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc25 = (bvxc) da.f164949b;
                    bvxc25.f158041d = 22;
                    bvxc25.f158038a |= 4;
                    break;
                default:
                    String valueOf = String.valueOf(apiRate.mo71578e());
                    if (valueOf.length() == 0) {
                        str3 = new String("Json2LiteBadEnum userlocation.ApiRate.sample_reason ");
                    } else {
                        str3 = "Json2LiteBadEnum userlocation.ApiRate.sample_reason ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str3);
            }
        }
        if (apiRate.mo71579f() != null) {
            String f = apiRate.mo71579f();
            switch (f.hashCode()) {
                case 63566080:
                    if (f.equals("BURST")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 94103840:
                    if (f.equals("burst")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 570410685:
                    if (f.equals("internal")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1353037501:
                    if (f.equals("INTERNAL")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0 || c3 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxc bvxc26 = (bvxc) da.f164949b;
                bvxc26.f158042e = 0;
                bvxc26.f158038a |= 8;
            } else if (c3 == 2 || c3 == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxc bvxc27 = (bvxc) da.f164949b;
                bvxc27.f158042e = 1;
                bvxc27.f158038a |= 8;
            } else {
                String valueOf2 = String.valueOf(apiRate.mo71579f());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiRate.sample_source ") : "Json2LiteBadEnum userlocation.ApiRate.sample_source ".concat(valueOf2));
            }
        }
        if (apiRate.mo71582h() != null) {
            long longValue3 = apiRate.mo71582h().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc28 = (bvxc) da.f164949b;
            bvxc28.f158038a |= 16;
            bvxc28.f158043f = longValue3;
        }
        if (apiRate.mo71583i() != null) {
            String i = apiRate.mo71583i();
            switch (i.hashCode()) {
                case -2137942761:
                    if (i.equals("lowBatteryUnfamiliar")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2102236543:
                    if (i.equals("MODEL_TRIGGERED")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2076224911:
                    if (i.equals("CHARGING")) {
                        c2 = 8;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2032180703:
                    if (i.equals("DEFAULT")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1752517260:
                    if (i.equals("HOME_DEPARTURE")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1653763102:
                    if (i.equals("LOW_BATTERY")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1340613956:
                    if (i.equals("homeEnteredWifiConnected")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1247774930:
                    if (i.equals("modelTriggered")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1097441770:
                    if (i.equals("OVERSAMPLING_ENDED")) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1045973227:
                    if (i.equals("WORK_ENTERED_WIFI_CONNECTED")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -979695407:
                    if (i.equals("firstUpload")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -868629277:
                    if (i.equals("workDeparture")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -613349876:
                    if (i.equals("nonPrimaryDefault")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -590713662:
                    if (i.equals("wifiTriggered")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -584345472:
                    if (i.equals("CHARGING_IN_VEHICLE")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -486630755:
                    if (i.equals("homeExit")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -422568257:
                    if (i.equals("oversamplingEnded")) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -388731508:
                    if (i.equals("WORK_EXIT")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -387128953:
                    if (i.equals("HOME_ENTERED_WIFI_CONNECTED")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -238158823:
                    if (i.equals("lowBattery")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -98468684:
                    if (i.equals("stationary")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 23120605:
                    if (i.equals("HOME_ENTERED_WIFI_DISCONNECTED")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 34407375:
                    if (i.equals("workExit")) {
                        c2 = '%';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 79227272:
                    if (i.equals("STILL")) {
                        c2 = 10;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109765032:
                    if (i.equals("still")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 168438578:
                    if (i.equals("NON_PRIMARY_DEFAULT")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 339510046:
                    if (i.equals("walkingFamiliar")) {
                        c2 = 13;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 386623668:
                    if (i.equals("STATIONARY")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 393896591:
                    if (i.equals("WORK_ENTERED_WIFI_DISCONNECTED")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 439494315:
                    if (i.equals("WALKING_FAMILIAR")) {
                        c2 = 12;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 638955646:
                    if (i.equals("HOME_EXIT")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 654817795:
                    if (i.equals("NON_PRIMARY_STATIONARY")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 778707600:
                    if (i.equals("FIRST_UPLOAD")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 811351765:
                    if (i.equals("homeDeparture")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 975233750:
                    if (i.equals("chargingInVehicle")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1006279478:
                    if (i.equals("workEnteredWifiDisconnected")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1436115569:
                    if (i.equals("charging")) {
                        c2 = 9;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1544803905:
                    if (i.equals("default")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1617010670:
                    if (i.equals("workEnteredWifiConnected")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1626084507:
                    if (i.equals("LOW_BATTERY_UNFAMILIAR")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1629972701:
                    if (i.equals("OVERSAMPLING_STARTED")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1643358022:
                    if (i.equals("oversamplingStarted")) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1665123752:
                    if (i.equals("homeEnteredWifiDisconnected")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2002645286:
                    if (i.equals("WORK_DEPARTURE")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2002662665:
                    if (i.equals("nonPrimaryStationary")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2083811213:
                    if (i.equals("WIFI_TRIGGERED")) {
                        c2 = 6;
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
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc29 = (bvxc) da.f164949b;
                    bvxc29.f158044g = 0;
                    bvxc29.f158038a |= 32;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc30 = (bvxc) da.f164949b;
                    bvxc30.f158044g = 1;
                    bvxc30.f158038a |= 32;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc31 = (bvxc) da.f164949b;
                    bvxc31.f158044g = 2;
                    bvxc31.f158038a |= 32;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc32 = (bvxc) da.f164949b;
                    bvxc32.f158044g = 3;
                    bvxc32.f158038a |= 32;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc33 = (bvxc) da.f164949b;
                    bvxc33.f158044g = 4;
                    bvxc33.f158038a |= 32;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc34 = (bvxc) da.f164949b;
                    bvxc34.f158044g = 5;
                    bvxc34.f158038a |= 32;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc35 = (bvxc) da.f164949b;
                    bvxc35.f158044g = 6;
                    bvxc35.f158038a |= 32;
                    break;
                case 14:
                case 15:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc36 = (bvxc) da.f164949b;
                    bvxc36.f158044g = 7;
                    bvxc36.f158038a |= 32;
                    break;
                case 16:
                case 17:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc37 = (bvxc) da.f164949b;
                    bvxc37.f158044g = 8;
                    bvxc37.f158038a |= 32;
                    break;
                case 18:
                case 19:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc38 = (bvxc) da.f164949b;
                    bvxc38.f158044g = 9;
                    bvxc38.f158038a |= 32;
                    break;
                case 20:
                case 21:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc39 = (bvxc) da.f164949b;
                    bvxc39.f158044g = 10;
                    bvxc39.f158038a |= 32;
                    break;
                case 22:
                case 23:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc40 = (bvxc) da.f164949b;
                    bvxc40.f158044g = 11;
                    bvxc40.f158038a |= 32;
                    break;
                case 24:
                case 25:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc41 = (bvxc) da.f164949b;
                    bvxc41.f158044g = 12;
                    bvxc41.f158038a |= 32;
                    break;
                case 26:
                case 27:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc42 = (bvxc) da.f164949b;
                    bvxc42.f158044g = 13;
                    bvxc42.f158038a |= 32;
                    break;
                case 28:
                case 29:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc43 = (bvxc) da.f164949b;
                    bvxc43.f158044g = 14;
                    bvxc43.f158038a |= 32;
                    break;
                case 30:
                case 31:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc44 = (bvxc) da.f164949b;
                    bvxc44.f158044g = 15;
                    bvxc44.f158038a |= 32;
                    break;
                case ' ':
                case '!':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc45 = (bvxc) da.f164949b;
                    bvxc45.f158044g = 16;
                    bvxc45.f158038a |= 32;
                    break;
                case '\"':
                case '#':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc46 = (bvxc) da.f164949b;
                    bvxc46.f158044g = 18;
                    bvxc46.f158038a |= 32;
                    break;
                case '$':
                case FelicaException.TYPE_NOT_CLOSED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc47 = (bvxc) da.f164949b;
                    bvxc47.f158044g = 17;
                    bvxc47.f158038a |= 32;
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc48 = (bvxc) da.f164949b;
                    bvxc48.f158044g = 19;
                    bvxc48.f158038a |= 32;
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                case ')':
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc49 = (bvxc) da.f164949b;
                    bvxc49.f158044g = 20;
                    bvxc49.f158038a |= 32;
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc50 = (bvxc) da.f164949b;
                    bvxc50.f158044g = 21;
                    bvxc50.f158038a |= 32;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxc bvxc51 = (bvxc) da.f164949b;
                    bvxc51.f158044g = 22;
                    bvxc51.f158038a |= 32;
                    break;
                default:
                    String valueOf3 = String.valueOf(apiRate.mo71583i());
                    if (valueOf3.length() == 0) {
                        str2 = new String("Json2LiteBadEnum userlocation.ApiRate.upload_reason ");
                    } else {
                        str2 = "Json2LiteBadEnum userlocation.ApiRate.upload_reason ".concat(valueOf3);
                    }
                    throw new IllegalArgumentException(str2);
            }
        }
        if (apiRate.mo71584j() != null) {
            String j = apiRate.mo71584j();
            switch (j.hashCode()) {
                case 63566080:
                    if (j.equals("BURST")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 94103840:
                    if (j.equals("burst")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 570410685:
                    if (j.equals("internal")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1353037501:
                    if (j.equals("INTERNAL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxc bvxc52 = (bvxc) da.f164949b;
                bvxc52.f158045h = 0;
                bvxc52.f158038a |= 64;
            } else if (c == 2 || c == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxc bvxc53 = (bvxc) da.f164949b;
                bvxc53.f158045h = 1;
                bvxc53.f158038a |= 64;
            } else {
                String valueOf4 = String.valueOf(apiRate.mo71584j());
                throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiRate.upload_source ") : "Json2LiteBadEnum userlocation.ApiRate.upload_source ".concat(valueOf4));
            }
        }
        if (apiRate.getBleRate() != null) {
            ApiBleRate bleRate = apiRate.getBleRate();
            if (bleRate != null) {
                bxvd da2 = bvvx.f157863g.mo74144da();
                if (bleRate.mo71499f() != null) {
                    String f2 = bleRate.mo71499f();
                    switch (f2.hashCode()) {
                        case -2042815662:
                            if (f2.equals("activityBasedMoving")) {
                                c5 = 11;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1656155988:
                            if (f2.equals("ACTIVITY_BASED_STILL")) {
                                c5 = 8;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1484923863:
                            if (f2.equals("LOW_POWER_OS")) {
                                c5 = 24;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1385659058:
                            if (f2.equals("ACTIVITY_BASED_IN_VEHICLE")) {
                                c5 = 12;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1330467450:
                            if (f2.equals("LOCATION_AWARE_BATCH_BACKOFF_NEARBY")) {
                                c5 = 20;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -891393195:
                            if (f2.equals("opportunisticOnly")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -871495985:
                            if (f2.equals("LOCATION_AWARE_LOW_POWER")) {
                                c5 = 22;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -863034019:
                            if (f2.equals("IMPORTANT_BEACON_NEARBY")) {
                                c5 = 14;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -665496214:
                            if (f2.equals("locationAwareBatchBackoffDefault")) {
                                c5 = 19;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -337314268:
                            if (f2.equals("activityBasedStill")) {
                                c5 = 9;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -294865963:
                            if (f2.equals("lowPowerOs")) {
                                c5 = 25;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -206149752:
                            if (f2.equals("locationAwareNearby")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -84479774:
                            if (f2.equals("locationAwareBatchScanning")) {
                                c5 = 17;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -59261374:
                            if (f2.equals("OPPORTUNISTIC_ONLY")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 22763946:
                            if (f2.equals("ACTIVITY_BASED_MOVING")) {
                                c5 = 10;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 180682730:
                            if (f2.equals("LOCATION_AWARE_NEARBY")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 193003762:
                            if (f2.equals("LOW_POWER_OS_BACKOFF")) {
                                c5 = 26;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 433919643:
                            if (f2.equals("periodic")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 607024323:
                            if (f2.equals("activityBasedInVehicle")) {
                                c5 = 13;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1025224214:
                            if (f2.equals("LOCATION_AWARE_DEFAULT")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1068890405:
                            if (f2.equals("importantBeaconNearby")) {
                                c5 = 15;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1151863002:
                            if (f2.equals("locationAwareLowPower")) {
                                c5 = 23;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1216546459:
                            if (f2.equals("PERIODIC")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1424208890:
                            break;
                        case 1831583393:
                            if (f2.equals("LOCATION_AWARE_BATCH_SCANNING")) {
                                c5 = 16;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1867842963:
                            if (f2.equals("lowPowerOsBackoff")) {
                                c5 = 27;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1918319192:
                            if (f2.equals("locationAwareDefault")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1927258678:
                            if (f2.equals("locationAwareBatchBackoffNearby")) {
                                c5 = 21;
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
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx2 = (bvvx) da2.f164949b;
                            bvvx2.f157866b = 0;
                            bvvx2.f157865a |= 1;
                            break;
                        case 2:
                        case 3:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx3 = (bvvx) da2.f164949b;
                            bvvx3.f157866b = 1;
                            bvvx3.f157865a = 1 | bvvx3.f157865a;
                            break;
                        case 4:
                        case 5:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx4 = (bvvx) da2.f164949b;
                            bvvx4.f157866b = 2;
                            bvvx4.f157865a |= 1;
                            break;
                        case 6:
                        case 7:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx5 = (bvvx) da2.f164949b;
                            bvvx5.f157866b = 3;
                            bvvx5.f157865a |= 1;
                            break;
                        case 8:
                        case 9:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx6 = (bvvx) da2.f164949b;
                            bvvx6.f157866b = 4;
                            bvvx6.f157865a |= 1;
                            break;
                        case 10:
                        case 11:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx7 = (bvvx) da2.f164949b;
                            bvvx7.f157866b = 5;
                            bvvx7.f157865a |= 1;
                            break;
                        case 12:
                        case 13:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx8 = (bvvx) da2.f164949b;
                            bvvx8.f157866b = 6;
                            bvvx8.f157865a |= 1;
                            break;
                        case 14:
                        case 15:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx9 = (bvvx) da2.f164949b;
                            bvvx9.f157866b = 7;
                            bvvx9.f157865a |= 1;
                            break;
                        case 16:
                        case 17:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx10 = (bvvx) da2.f164949b;
                            bvvx10.f157866b = 8;
                            bvvx10.f157865a |= 1;
                            break;
                        case 18:
                        case 19:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx11 = (bvvx) da2.f164949b;
                            bvvx11.f157866b = 9;
                            bvvx11.f157865a |= 1;
                            break;
                        case 20:
                        case 21:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx12 = (bvvx) da2.f164949b;
                            bvvx12.f157866b = 10;
                            bvvx12.f157865a |= 1;
                            break;
                        case 22:
                        case 23:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx13 = (bvvx) da2.f164949b;
                            bvvx13.f157866b = 11;
                            bvvx13.f157865a |= 1;
                            break;
                        case 24:
                        case 25:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx14 = (bvvx) da2.f164949b;
                            bvvx14.f157866b = 12;
                            bvvx14.f157865a |= 1;
                            break;
                        case 26:
                        case 27:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvx bvvx15 = (bvvx) da2.f164949b;
                            bvvx15.f157866b = 13;
                            bvvx15.f157865a |= 1;
                            break;
                        default:
                            String valueOf5 = String.valueOf(bleRate.mo71499f());
                            if (valueOf5.length() == 0) {
                                str = new String("Json2LiteBadEnum userlocation.ApiBleRate.strategy ");
                            } else {
                                str = "Json2LiteBadEnum userlocation.ApiBleRate.strategy ".concat(valueOf5);
                            }
                            throw new IllegalArgumentException(str);
                    }
                }
                if (bleRate.mo71495b() != null) {
                    long longValue4 = bleRate.mo71495b().longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvx bvvx16 = (bvvx) da2.f164949b;
                    bvvx16.f157865a |= 2;
                    bvvx16.f157867c = longValue4;
                }
                if (bleRate.mo71498e() != null) {
                    long longValue5 = bleRate.mo71498e().longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvx bvvx17 = (bvvx) da2.f164949b;
                    bvvx17.f157865a |= 4;
                    bvvx17.f157868d = longValue5;
                }
                if (bleRate.mo71497d() != null) {
                    long longValue6 = bleRate.mo71497d().longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvx bvvx18 = (bvvx) da2.f164949b;
                    bvvx18.f157865a |= 8;
                    bvvx18.f157869e = longValue6;
                }
                if (bleRate.mo71496c() != null) {
                    boolean booleanValue = bleRate.mo71496c().booleanValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvx bvvx19 = (bvvx) da2.f164949b;
                    bvvx19.f157865a |= 16;
                    bvvx19.f157870f = booleanValue;
                }
                bvvx = (bvvx) da2.mo74062i();
            } else {
                bvvx = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc54 = (bvxc) da.f164949b;
            bvvx.getClass();
            bvxc54.f158046i = bvvx;
            bvxc54.f158038a |= 128;
        }
        if (apiRate.mo71575b() != null) {
            String b = apiRate.mo71575b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc55 = (bvxc) da.f164949b;
            b.getClass();
            bvxc55.f158038a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bvxc55.f158047j = b;
        }
        if (apiRate.mo71576c() != null) {
            boolean booleanValue2 = apiRate.mo71576c().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxc bvxc56 = (bvxc) da.f164949b;
            bvxc56.f158038a |= 512;
            bvxc56.f158048k = booleanValue2;
        }
        return (bvxc) da.mo74062i();
    }
}
