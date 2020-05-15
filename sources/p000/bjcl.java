package p000;

import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.ulr.ApiLocationStatus;

/* renamed from: bjcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcl {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvwp m103195a(ApiLocationStatus apiLocationStatus) {
        char c;
        String str;
        char c2;
        String str2;
        if (apiLocationStatus == null) {
            return null;
        }
        bxvd da = bvwp.f157977e.mo74144da();
        if (apiLocationStatus.mo71541b() != null) {
            String b = apiLocationStatus.mo71541b();
            switch (b.hashCode()) {
                case -1826628860:
                    if (b.equals("LOCATION_DISABLED_IN_SETTINGS")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1420949531:
                    if (b.equals("INVALID_SCAN")) {
                        c2 = 8;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1347010958:
                    if (b.equals("inProgress")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1346978814:
                    if (b.equals("NO_INFO_IN_DATABASE")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1200738246:
                    if (b.equals("scansDisabledInSettings")) {
                        c2 = 13;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -953198316:
                    if (b.equals("invalidScan")) {
                        c2 = 9;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -819942429:
                    if (b.equals("SCANS_DISABLED_IN_SETTINGS")) {
                        c2 = 12;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -733631846:
                    if (b.equals(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -604548089:
                    if (b.equals("IN_PROGRESS")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -545586021:
                    if (b.equals("INDETERMINATE")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -307635275:
                    if (b.equals("unableToQueryDatabase")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -284840886:
                    if (b.equals("unknown")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -248539494:
                    if (b.equals("SUCCESSFUL")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 72103296:
                    if (b.equals("FAIL_TO_COMPUTE_LOCATION")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 123146148:
                    if (b.equals("TIMED_OUT_ON_SCAN")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 433141802:
                    if (b.equals("UNKNOWN")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 633138363:
                    if (b.equals("indeterminate")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 875135279:
                    if (b.equals("noInfoInDatabase")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 962184106:
                    if (b.equals("UNABLE_TO_QUERY_DATABASE")) {
                        c2 = 10;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1159928985:
                    if (b.equals("locationDisabledInSettings")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1579806835:
                    if (b.equals("timedOutOnScan")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1757262227:
                    if (b.equals("failToComputeLocation")) {
                        c2 = 19;
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
                    bvwp bvwp = (bvwp) da.f164949b;
                    bvwp.f157980b = 0;
                    bvwp.f157979a |= 1;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp2 = (bvwp) da.f164949b;
                    bvwp2.f157980b = 1;
                    bvwp2.f157979a |= 1;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp3 = (bvwp) da.f164949b;
                    bvwp3.f157980b = 2;
                    bvwp3.f157979a |= 1;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp4 = (bvwp) da.f164949b;
                    bvwp4.f157980b = 3;
                    bvwp4.f157979a |= 1;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp5 = (bvwp) da.f164949b;
                    bvwp5.f157980b = 4;
                    bvwp5.f157979a |= 1;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp6 = (bvwp) da.f164949b;
                    bvwp6.f157980b = 5;
                    bvwp6.f157979a |= 1;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp7 = (bvwp) da.f164949b;
                    bvwp7.f157980b = 6;
                    bvwp7.f157979a |= 1;
                    break;
                case 14:
                case 15:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp8 = (bvwp) da.f164949b;
                    bvwp8.f157980b = 7;
                    bvwp8.f157979a |= 1;
                    break;
                case 16:
                case 17:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp9 = (bvwp) da.f164949b;
                    bvwp9.f157980b = 8;
                    bvwp9.f157979a |= 1;
                    break;
                case 18:
                case 19:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp10 = (bvwp) da.f164949b;
                    bvwp10.f157980b = 9;
                    bvwp10.f157979a |= 1;
                    break;
                case 20:
                case 21:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp11 = (bvwp) da.f164949b;
                    bvwp11.f157980b = 99;
                    bvwp11.f157979a |= 1;
                    break;
                default:
                    String valueOf = String.valueOf(apiLocationStatus.mo71541b());
                    if (valueOf.length() == 0) {
                        str2 = new String("Json2LiteBadEnum userlocation.ApiLocationStatus.cell_status ");
                    } else {
                        str2 = "Json2LiteBadEnum userlocation.ApiLocationStatus.cell_status ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str2);
            }
        }
        if (apiLocationStatus.mo71543d() != null) {
            String d = apiLocationStatus.mo71543d();
            switch (d.hashCode()) {
                case -1826628860:
                    if (d.equals("LOCATION_DISABLED_IN_SETTINGS")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1420949531:
                    if (d.equals("INVALID_SCAN")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -1347010958:
                    if (d.equals("inProgress")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1346978814:
                    if (d.equals("NO_INFO_IN_DATABASE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1200738246:
                    if (d.equals("scansDisabledInSettings")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case -953198316:
                    if (d.equals("invalidScan")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case -819942429:
                    if (d.equals("SCANS_DISABLED_IN_SETTINGS")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case -733631846:
                    if (d.equals(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -604548089:
                    if (d.equals("IN_PROGRESS")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -545586021:
                    if (d.equals("INDETERMINATE")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -307635275:
                    if (d.equals("unableToQueryDatabase")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -284840886:
                    if (d.equals("unknown")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -248539494:
                    if (d.equals("SUCCESSFUL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 72103296:
                    if (d.equals("FAIL_TO_COMPUTE_LOCATION")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 123146148:
                    if (d.equals("TIMED_OUT_ON_SCAN")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 433141802:
                    if (d.equals("UNKNOWN")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 633138363:
                    if (d.equals("indeterminate")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 875135279:
                    if (d.equals("noInfoInDatabase")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 962184106:
                    if (d.equals("UNABLE_TO_QUERY_DATABASE")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 1159928985:
                    if (d.equals("locationDisabledInSettings")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1579806835:
                    if (d.equals("timedOutOnScan")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1757262227:
                    if (d.equals("failToComputeLocation")) {
                        c = 19;
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
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp12 = (bvwp) da.f164949b;
                    bvwp12.f157981c = 0;
                    bvwp12.f157979a |= 2;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp13 = (bvwp) da.f164949b;
                    bvwp13.f157981c = 1;
                    bvwp13.f157979a |= 2;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp14 = (bvwp) da.f164949b;
                    bvwp14.f157981c = 2;
                    bvwp14.f157979a = 2 | bvwp14.f157979a;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp15 = (bvwp) da.f164949b;
                    bvwp15.f157981c = 3;
                    bvwp15.f157979a |= 2;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp16 = (bvwp) da.f164949b;
                    bvwp16.f157981c = 4;
                    bvwp16.f157979a |= 2;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp17 = (bvwp) da.f164949b;
                    bvwp17.f157981c = 5;
                    bvwp17.f157979a |= 2;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp18 = (bvwp) da.f164949b;
                    bvwp18.f157981c = 6;
                    bvwp18.f157979a |= 2;
                    break;
                case 14:
                case 15:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp19 = (bvwp) da.f164949b;
                    bvwp19.f157981c = 7;
                    bvwp19.f157979a |= 2;
                    break;
                case 16:
                case 17:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp20 = (bvwp) da.f164949b;
                    bvwp20.f157981c = 8;
                    bvwp20.f157979a |= 2;
                    break;
                case 18:
                case 19:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp21 = (bvwp) da.f164949b;
                    bvwp21.f157981c = 9;
                    bvwp21.f157979a |= 2;
                    break;
                case 20:
                case 21:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp22 = (bvwp) da.f164949b;
                    bvwp22.f157981c = 99;
                    bvwp22.f157979a |= 2;
                    break;
                default:
                    String valueOf2 = String.valueOf(apiLocationStatus.mo71543d());
                    if (valueOf2.length() == 0) {
                        str = new String("Json2LiteBadEnum userlocation.ApiLocationStatus.wifi_status ");
                    } else {
                        str = "Json2LiteBadEnum userlocation.ApiLocationStatus.wifi_status ".concat(valueOf2);
                    }
                    throw new IllegalArgumentException(str);
            }
        }
        if (apiLocationStatus.mo71542c() != null) {
            boolean booleanValue = apiLocationStatus.mo71542c().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwp bvwp23 = (bvwp) da.f164949b;
            bvwp23.f157979a |= 4;
            bvwp23.f157982d = booleanValue;
        }
        return (bvwp) da.mo74062i();
    }
}
