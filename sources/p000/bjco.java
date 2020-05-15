package p000;

import com.google.android.ulr.ApiBatteryCondition;
import com.google.android.ulr.ApiReadingInfo;
import com.google.android.ulr.WifiStrengthProto;
import java.util.ArrayList;

/* renamed from: bjco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjco {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvxf m103198a(ApiReadingInfo apiReadingInfo) {
        char c;
        String str;
        char c2;
        String str2;
        bvvv bvvv = null;
        if (apiReadingInfo == null) {
            return null;
        }
        bxvd da = bvxf.f158050g.mo74144da();
        if (apiReadingInfo.mo71587d() != null) {
            String d = apiReadingInfo.mo71587d();
            switch (d.hashCode()) {
                case -2028086330:
                    if (d.equals("MANUAL")) {
                        c2 = 8;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081415738:
                    if (d.equals("manual")) {
                        c2 = 9;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -284840886:
                    if (d.equals("unknown")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -37081408:
                    if (d.equals("VISIT_DEPARTURE")) {
                        c2 = 12;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70794:
                    if (d.equals("GPS")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 102570:
                    if (d.equals("gps")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2064738:
                    if (d.equals("CELL")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2664213:
                    if (d.equals("WIFI")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3049826:
                    if (d.equals("cell")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3649301:
                    if (d.equals("wifi")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 433141802:
                    if (d.equals("UNKNOWN")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1453039593:
                    if (d.equals("visitDeparture")) {
                        c2 = 13;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1926238405:
                    if (d.equals("VISIT_ARRIVAL")) {
                        c2 = 10;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1950135342:
                    if (d.equals("visitArrival")) {
                        c2 = 11;
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
                    bvxf bvxf = (bvxf) da.f164949b;
                    bvxf.f158053b = 0;
                    bvxf.f158052a |= 1;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf2 = (bvxf) da.f164949b;
                    bvxf2.f158053b = 1;
                    bvxf2.f158052a |= 1;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf3 = (bvxf) da.f164949b;
                    bvxf3.f158053b = 2;
                    bvxf3.f158052a |= 1;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf4 = (bvxf) da.f164949b;
                    bvxf4.f158053b = 3;
                    bvxf4.f158052a |= 1;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf5 = (bvxf) da.f164949b;
                    bvxf5.f158053b = 4;
                    bvxf5.f158052a |= 1;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf6 = (bvxf) da.f164949b;
                    bvxf6.f158053b = 5;
                    bvxf6.f158052a |= 1;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf7 = (bvxf) da.f164949b;
                    bvxf7.f158053b = 6;
                    bvxf7.f158052a |= 1;
                    break;
                default:
                    String valueOf = String.valueOf(apiReadingInfo.mo71587d());
                    if (valueOf.length() == 0) {
                        str2 = new String("Json2LiteBadEnum userlocation.ApiReadingInfo.source ");
                    } else {
                        str2 = "Json2LiteBadEnum userlocation.ApiReadingInfo.source ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str2);
            }
        }
        if (apiReadingInfo.mo71586c() != null) {
            int intValue = apiReadingInfo.mo71586c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxf bvxf8 = (bvxf) da.f164949b;
            bvxf8.f158052a |= 2;
            bvxf8.f158054c = intValue;
        }
        if (apiReadingInfo.mo71585b() != null) {
            boolean booleanValue = apiReadingInfo.mo71585b().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxf bvxf9 = (bvxf) da.f164949b;
            bvxf9.f158052a |= 4;
            bvxf9.f158055d = booleanValue;
        }
        if (apiReadingInfo.getBatteryCondition() != null) {
            ApiBatteryCondition batteryCondition = apiReadingInfo.getBatteryCondition();
            if (batteryCondition != null) {
                bxvd da2 = bvvv.f157855f.mo74144da();
                if (batteryCondition.mo71493d() != null) {
                    int intValue2 = batteryCondition.mo71493d().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvv bvvv2 = (bvvv) da2.f164949b;
                    bvvv2.f157857a |= 1;
                    bvvv2.f157858b = intValue2;
                }
                if (batteryCondition.mo71492c() != null) {
                    int intValue3 = batteryCondition.mo71492c().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvv bvvv3 = (bvvv) da2.f164949b;
                    bvvv3.f157857a |= 2;
                    bvvv3.f157859c = intValue3;
                }
                if (batteryCondition.mo71494e() != null) {
                    int intValue4 = batteryCondition.mo71494e().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvvv bvvv4 = (bvvv) da2.f164949b;
                    bvvv4.f157857a |= 4;
                    bvvv4.f157860d = intValue4;
                }
                if (batteryCondition.mo71491b() != null) {
                    String b = batteryCondition.mo71491b();
                    switch (b.hashCode()) {
                        case -1000044642:
                            if (b.equals("wireless")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -217417826:
                            if (b.equals("WIRELESS")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -59691395:
                            if (b.equals("NOT_CHARGING")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2082:
                            if (b.equals("AC")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3106:
                            if (b.equals("ac")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 84324:
                            if (b.equals("USB")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 116100:
                            if (b.equals("usb")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 264166118:
                            if (b.equals("UNKNOWN_CHARGING")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1238730971:
                            if (b.equals("unknownCharging")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1855123044:
                            if (b.equals("notCharging")) {
                                c = 1;
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
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvv bvvv5 = (bvvv) da2.f164949b;
                            bvvv5.f157861e = 0;
                            bvvv5.f157857a |= 8;
                            break;
                        case 2:
                        case 3:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvv bvvv6 = (bvvv) da2.f164949b;
                            bvvv6.f157861e = 1;
                            bvvv6.f157857a |= 8;
                            break;
                        case 4:
                        case 5:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvv bvvv7 = (bvvv) da2.f164949b;
                            bvvv7.f157861e = 2;
                            bvvv7.f157857a |= 8;
                            break;
                        case 6:
                        case 7:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvv bvvv8 = (bvvv) da2.f164949b;
                            bvvv8.f157861e = 3;
                            bvvv8.f157857a |= 8;
                            break;
                        case 8:
                        case 9:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvv bvvv9 = (bvvv) da2.f164949b;
                            bvvv9.f157861e = 4;
                            bvvv9.f157857a |= 8;
                            break;
                        default:
                            String valueOf2 = String.valueOf(batteryCondition.mo71491b());
                            if (valueOf2.length() == 0) {
                                str = new String("Json2LiteBadEnum userlocation.ApiBatteryCondition.charging ");
                            } else {
                                str = "Json2LiteBadEnum userlocation.ApiBatteryCondition.charging ".concat(valueOf2);
                            }
                            throw new IllegalArgumentException(str);
                    }
                }
                bvvv = (bvvv) da2.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvxf bvxf10 = (bvxf) da.f164949b;
            bvvv.getClass();
            bvxf10.f158056e = bvvv;
            bvxf10.f158052a |= 8;
        }
        if (apiReadingInfo.getWifiScans() != null) {
            ArrayList wifiScans = apiReadingInfo.getWifiScans();
            int size = wifiScans.size();
            for (int i = 0; i < size; i++) {
                WifiStrengthProto wifiStrengthProto = (WifiStrengthProto) wifiScans.get(i);
                if (wifiStrengthProto != null) {
                    bvyq a = bjda.m103207a(wifiStrengthProto);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxf bvxf11 = (bvxf) da.f164949b;
                    a.getClass();
                    bvxf11.mo73396a();
                    bvxf11.f158057f.add(a);
                }
            }
        }
        return (bvxf) da.mo74062i();
    }
}
