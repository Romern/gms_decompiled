package p000;

import com.google.android.ulr.RttRangingProto;
import com.google.android.ulr.WifiStrengthProto;

/* renamed from: bjda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjda {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvyq m103207a(WifiStrengthProto wifiStrengthProto) {
        bvyr bvyr;
        char c;
        String str;
        bxvd da = bvyq.f158199j.mo74144da();
        if (wifiStrengthProto.mo71734e() != null) {
            long longValue = wifiStrengthProto.mo71734e().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq = (bvyq) da.f164949b;
            bvyq.f158201a |= 1;
            bvyq.f158202b = longValue;
        }
        if (wifiStrengthProto.mo71736g() != null) {
            int intValue = wifiStrengthProto.mo71736g().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq2 = (bvyq) da.f164949b;
            bvyq2.f158201a |= 2;
            bvyq2.f158203c = intValue;
        }
        char c2 = 65535;
        if (wifiStrengthProto.mo71738h() != null) {
            String h = wifiStrengthProto.mo71738h();
            switch (h.hashCode()) {
                case -2038298883:
                    if (h.equals("WPA_EAP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2038287759:
                    if (h.equals("WPA_PSK")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -2021675505:
                    if (h.equals("WPS_EAP")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -1392815138:
                    if (h.equals("SECURED_OTHER")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case -781704820:
                    if (h.equals("wpaEap")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -781693696:
                    if (h.equals("wpaPsk")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -781168582:
                    if (h.equals("wpsEap")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case -284840886:
                    if (h.equals("unknown")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2402104:
                    if (h.equals("NONE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3387192:
                    if (h.equals("none")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 433141802:
                    if (h.equals("UNKNOWN")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1057280835:
                    if (h.equals("securedOther")) {
                        c = 11;
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
                    bvyq bvyq3 = (bvyq) da.f164949b;
                    bvyq3.f158204d = 0;
                    bvyq3.f158201a |= 4;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvyq bvyq4 = (bvyq) da.f164949b;
                    bvyq4.f158204d = 1;
                    bvyq4.f158201a |= 4;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvyq bvyq5 = (bvyq) da.f164949b;
                    bvyq5.f158204d = 2;
                    bvyq5.f158201a |= 4;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvyq bvyq6 = (bvyq) da.f164949b;
                    bvyq6.f158204d = 3;
                    bvyq6.f158201a |= 4;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvyq bvyq7 = (bvyq) da.f164949b;
                    bvyq7.f158204d = 3;
                    bvyq7.f158201a |= 4;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvyq bvyq8 = (bvyq) da.f164949b;
                    bvyq8.f158204d = 4;
                    bvyq8.f158201a |= 4;
                    break;
                default:
                    String valueOf = String.valueOf(wifiStrengthProto.mo71738h());
                    if (valueOf.length() == 0) {
                        str = new String("Json2LiteBadEnum userlocation.WifiStrengthProto.wifi_auth_type ");
                    } else {
                        str = "Json2LiteBadEnum userlocation.WifiStrengthProto.wifi_auth_type ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str);
            }
        }
        if (wifiStrengthProto.mo71733d() != null) {
            boolean booleanValue = wifiStrengthProto.mo71733d().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq9 = (bvyq) da.f164949b;
            bvyq9.f158201a |= 8;
            bvyq9.f158205e = booleanValue;
        }
        if (wifiStrengthProto.mo71732c() != null) {
            int intValue2 = wifiStrengthProto.mo71732c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq10 = (bvyq) da.f164949b;
            bvyq10.f158201a |= 16;
            bvyq10.f158206f = intValue2;
        }
        if (wifiStrengthProto.getRttRanging() != null) {
            RttRangingProto rttRanging = wifiStrengthProto.getRttRanging();
            if (rttRanging != null) {
                bxvd da2 = bvyr.f158210g.mo74144da();
                if (rttRanging.mo71695b() != null) {
                    int intValue3 = rttRanging.mo71695b().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvyr bvyr2 = (bvyr) da2.f164949b;
                    bvyr2.f158212a |= 1;
                    bvyr2.f158213b = intValue3;
                }
                if (rttRanging.mo71699f() != null) {
                    int intValue4 = rttRanging.mo71699f().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvyr bvyr3 = (bvyr) da2.f164949b;
                    bvyr3.f158212a |= 2;
                    bvyr3.f158214c = intValue4;
                }
                if (rttRanging.mo71698e() != null) {
                    int intValue5 = rttRanging.mo71698e().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvyr bvyr4 = (bvyr) da2.f164949b;
                    bvyr4.f158212a |= 4;
                    bvyr4.f158215d = intValue5;
                }
                if (rttRanging.mo71697d() != null) {
                    int intValue6 = rttRanging.mo71697d().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvyr bvyr5 = (bvyr) da2.f164949b;
                    bvyr5.f158212a = 8 | bvyr5.f158212a;
                    bvyr5.f158216e = intValue6;
                }
                if (rttRanging.mo71696c() != null) {
                    int intValue7 = rttRanging.mo71696c().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvyr bvyr6 = (bvyr) da2.f164949b;
                    bvyr6.f158212a |= 16;
                    bvyr6.f158217f = intValue7;
                }
                bvyr = (bvyr) da2.mo74062i();
            } else {
                bvyr = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq11 = (bvyq) da.f164949b;
            bvyr.getClass();
            bvyq11.f158207g = bvyr;
            bvyq11.f158201a |= 32;
        }
        if (wifiStrengthProto.mo71735f() != null) {
            String f = wifiStrengthProto.mo71735f();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvyq bvyq12 = (bvyq) da.f164949b;
            f.getClass();
            bvyq12.f158201a |= 64;
            bvyq12.f158208h = f;
        }
        if (wifiStrengthProto.mo71731b() != null) {
            String b = wifiStrengthProto.mo71731b();
            switch (b.hashCode()) {
                case -2032180703:
                    if (b.equals("DEFAULT")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1643146279:
                    if (b.equals("SMARTBATCHING_PASSIVE")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1469529418:
                    if (b.equals("smartbatchingPassive")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 489256948:
                    if (b.equals("SMARTBATCHING_ACTIVE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 633404823:
                    if (b.equals("smartbatchingActive")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1544803905:
                    if (b.equals("default")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0 || c2 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyq bvyq13 = (bvyq) da.f164949b;
                bvyq13.f158209i = 0;
                bvyq13.f158201a |= 128;
            } else if (c2 == 2 || c2 == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyq bvyq14 = (bvyq) da.f164949b;
                bvyq14.f158209i = 1;
                bvyq14.f158201a |= 128;
            } else if (c2 == 4 || c2 == 5) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyq bvyq15 = (bvyq) da.f164949b;
                bvyq15.f158209i = 2;
                bvyq15.f158201a |= 128;
            } else {
                String valueOf2 = String.valueOf(wifiStrengthProto.mo71731b());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.WifiStrengthProto.collection_point ") : "Json2LiteBadEnum userlocation.WifiStrengthProto.collection_point ".concat(valueOf2));
            }
        }
        return (bvyq) da.mo74062i();
    }
}
