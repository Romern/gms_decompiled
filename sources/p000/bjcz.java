package p000;

import com.google.android.ulr.VisibleNetwork;
import com.google.android.ulr.VisibleNetworkCell;
import com.google.android.ulr.VisibleNetworkWiFi;

/* renamed from: bjcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcz {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static byfm m103206a(VisibleNetwork visibleNetwork) {
        char c;
        String str;
        byfl byfl;
        bxvd da = byfm.f166043f.mo74144da();
        byfk byfk = null;
        if (visibleNetwork.getWifi() != null) {
            VisibleNetworkWiFi wifi = visibleNetwork.getWifi();
            if (wifi != null) {
                bxvd da2 = byfl.f166038d.mo74144da();
                if (wifi.mo71721b() != null) {
                    String b = wifi.mo71721b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byfl byfl2 = (byfl) da2.f164949b;
                    b.getClass();
                    byfl2.f166040a |= 1;
                    byfl2.f166041b = b;
                }
                if (wifi.mo71722c() != null) {
                    int intValue = wifi.mo71722c().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byfl byfl3 = (byfl) da2.f164949b;
                    byfl3.f166040a |= 2;
                    byfl3.f166042c = intValue;
                }
                byfl = (byfl) da2.mo74062i();
            } else {
                byfl = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfm byfm = (byfm) da.f164949b;
            byfl.getClass();
            byfm.f166047c = byfl;
            byfm.f166046b = 1;
        }
        if (visibleNetwork.getCell() != null) {
            VisibleNetworkCell cell = visibleNetwork.getCell();
            if (cell != null) {
                bxvd da3 = byfk.f166027j.mo74144da();
                if (cell.mo71720i() != null) {
                    String i = cell.mo71720i();
                    switch (i.hashCode()) {
                        case -284840886:
                            if (i.equals("unknown")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 70881:
                            if (i.equals("GSM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 75709:
                            if (i.equals("LTE")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102657:
                            if (i.equals("gsm")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 107485:
                            if (i.equals("lte")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2063797:
                            if (i.equals("CDMA")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3048885:
                            if (i.equals("cdma")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 82410124:
                            if (i.equals("WCDMA")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case 112947884:
                            if (i.equals("wcdma")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case 433141802:
                            if (i.equals("UNKNOWN")) {
                                c = 0;
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
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byfk byfk2 = (byfk) da3.f164949b;
                            byfk2.f166030b = 0;
                            byfk2.f166029a = 1 | byfk2.f166029a;
                            break;
                        case 2:
                        case 3:
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byfk byfk3 = (byfk) da3.f164949b;
                            byfk3.f166030b = 1;
                            byfk3.f166029a = 1 | byfk3.f166029a;
                            break;
                        case 4:
                        case 5:
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byfk byfk4 = (byfk) da3.f164949b;
                            byfk4.f166030b = 2;
                            byfk4.f166029a = 1 | byfk4.f166029a;
                            break;
                        case 6:
                        case 7:
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byfk byfk5 = (byfk) da3.f164949b;
                            byfk5.f166030b = 3;
                            byfk5.f166029a = 1 | byfk5.f166029a;
                            break;
                        case 8:
                        case 9:
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byfk byfk6 = (byfk) da3.f164949b;
                            byfk6.f166030b = 4;
                            byfk6.f166029a = 1 | byfk6.f166029a;
                            break;
                        default:
                            String valueOf = String.valueOf(cell.mo71720i());
                            if (valueOf.length() == 0) {
                                str = new String("Json2LiteBadEnum location.unified.VisibleNetwork.Cell.type ");
                            } else {
                                str = "Json2LiteBadEnum location.unified.VisibleNetwork.Cell.type ".concat(valueOf);
                            }
                            throw new IllegalArgumentException(str);
                    }
                }
                if (cell.mo71713b() != null) {
                    int intValue2 = cell.mo71713b().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk7 = (byfk) da3.f164949b;
                    byfk7.f166029a |= 2;
                    byfk7.f166031c = intValue2;
                }
                if (cell.mo71714c() != null) {
                    int intValue3 = cell.mo71714c().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk8 = (byfk) da3.f164949b;
                    byfk8.f166029a |= 4;
                    byfk8.f166032d = intValue3;
                }
                if (cell.mo71715d() != null) {
                    int intValue4 = cell.mo71715d().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk9 = (byfk) da3.f164949b;
                    byfk9.f166029a |= 8;
                    byfk9.f166033e = intValue4;
                }
                if (cell.mo71716e() != null) {
                    int intValue5 = cell.mo71716e().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk10 = (byfk) da3.f164949b;
                    byfk10.f166029a |= 16;
                    byfk10.f166034f = intValue5;
                }
                if (cell.mo71718g() != null) {
                    int intValue6 = cell.mo71718g().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk11 = (byfk) da3.f164949b;
                    byfk11.f166029a |= 32;
                    byfk11.f166035g = intValue6;
                }
                if (cell.mo71717f() != null) {
                    int intValue7 = cell.mo71717f().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk12 = (byfk) da3.f164949b;
                    byfk12.f166029a |= 64;
                    byfk12.f166036h = intValue7;
                }
                if (cell.mo71719h() != null) {
                    int intValue8 = cell.mo71719h().intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byfk byfk13 = (byfk) da3.f164949b;
                    byfk13.f166029a |= 128;
                    byfk13.f166037i = intValue8;
                }
                byfk = (byfk) da3.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfm byfm2 = (byfm) da.f164949b;
            byfk.getClass();
            byfm2.f166047c = byfk;
            byfm2.f166046b = 2;
        }
        if (visibleNetwork.mo71709b() != null) {
            boolean booleanValue = visibleNetwork.mo71709b().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfm byfm3 = (byfm) da.f164949b;
            byfm3.f166045a |= 4;
            byfm3.f166048d = booleanValue;
        }
        if (visibleNetwork.mo71710c() != null) {
            long longValue = visibleNetwork.mo71710c().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfm byfm4 = (byfm) da.f164949b;
            byfm4.f166045a |= 8;
            byfm4.f166049e = longValue;
        }
        return (byfm) da.mo74062i();
    }
}
