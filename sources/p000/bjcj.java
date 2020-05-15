package p000;

import android.util.Base64;
import com.google.android.ulr.ApiBleScanReport;
import com.google.android.ulr.BleSensorData;
import com.google.android.ulr.BleStrengthProto;
import java.util.ArrayList;

/* renamed from: bjcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcj {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvvy m103193a(ApiBleScanReport apiBleScanReport) {
        int i;
        char c;
        String str;
        if (apiBleScanReport == null) {
            return null;
        }
        bxvd da = bvvy.f157871c.mo74144da();
        int i2 = 3;
        int i3 = 5;
        int i4 = 4;
        int i5 = 1;
        if (apiBleScanReport.getBleScans() != null) {
            ArrayList bleScans = apiBleScanReport.getBleScans();
            int size = bleScans.size();
            int i6 = 0;
            while (i6 < size) {
                BleStrengthProto bleStrengthProto = (BleStrengthProto) bleScans.get(i6);
                if (bleStrengthProto != null) {
                    bxvd da2 = bvxz.f158117g.mo74144da();
                    if (bleStrengthProto.mo71612f() != null) {
                        String f = bleStrengthProto.mo71612f();
                        int hashCode = f.hashCode();
                        switch (hashCode) {
                            case -2138866993:
                                if (f.equals("GBEACON_V3_EPHEMERAL")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1976457779:
                                if (f.equals("IBEACON")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1506303187:
                                if (f.equals("altbeacon")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -553912305:
                                if (f.equals("GBEACON_V1")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -553912303:
                                if (f.equals("GBEACON_V3")) {
                                    c = 10;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -284840886:
                                if (f.equals("unknown")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -172064954:
                                if (f.equals("gbeaconV1")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -172064952:
                                if (f.equals("gbeaconV3")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 433141802:
                                if (f.equals("UNKNOWN")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1280291597:
                                if (f.equals("ALTBEACON")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1557064501:
                                if (f.equals("gbeaconV3Ephemeral")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1600526829:
                                if (f.equals("ibeacon")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                switch (hashCode) {
                                    case -1805472660:
                                        if (f.equals("TYPE_1")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1805472659:
                                        if (f.equals("TYPE_2")) {
                                            c = 8;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1805472658:
                                        if (f.equals("TYPE_3")) {
                                            c = 12;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1805472657:
                                        if (f.equals("TYPE_4")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1805472656:
                                        if (f.equals("TYPE_5")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 110843959:
                                                if (f.equals("type1")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 110843960:
                                                if (f.equals("type2")) {
                                                    c = 9;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 110843961:
                                                if (f.equals("type3")) {
                                                    c = 13;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 110843962:
                                                if (f.equals("type4")) {
                                                    c = 17;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 110843963:
                                                if (f.equals("type5")) {
                                                    c = 21;
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
                            case 0:
                            case 1:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz = (bvxz) da2.f164949b;
                                bvxz.f158120b = 0;
                                bvxz.f158119a |= 1;
                                break;
                            case 2:
                            case 3:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz2 = (bvxz) da2.f164949b;
                                bvxz2.f158120b = 1;
                                bvxz2.f158119a |= 1;
                                break;
                            case 4:
                            case 5:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz3 = (bvxz) da2.f164949b;
                                bvxz3.f158120b = 1;
                                bvxz3.f158119a |= 1;
                                break;
                            case 6:
                            case 7:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz4 = (bvxz) da2.f164949b;
                                bvxz4.f158120b = 2;
                                bvxz4.f158119a |= 1;
                                break;
                            case 8:
                            case 9:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz5 = (bvxz) da2.f164949b;
                                bvxz5.f158120b = 2;
                                bvxz5.f158119a |= 1;
                                break;
                            case 10:
                            case 11:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz6 = (bvxz) da2.f164949b;
                                bvxz6.f158120b = i2;
                                bvxz6.f158119a |= 1;
                                break;
                            case 12:
                            case 13:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz7 = (bvxz) da2.f164949b;
                                bvxz7.f158120b = i2;
                                bvxz7.f158119a |= 1;
                                break;
                            case 14:
                            case 15:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz8 = (bvxz) da2.f164949b;
                                bvxz8.f158120b = 4;
                                bvxz8.f158119a |= 1;
                                break;
                            case 16:
                            case 17:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz9 = (bvxz) da2.f164949b;
                                bvxz9.f158120b = 4;
                                bvxz9.f158119a |= 1;
                                break;
                            case 18:
                            case 19:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz10 = (bvxz) da2.f164949b;
                                bvxz10.f158120b = i3;
                                bvxz10.f158119a |= 1;
                                break;
                            case 20:
                            case 21:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvxz bvxz11 = (bvxz) da2.f164949b;
                                bvxz11.f158120b = i3;
                                bvxz11.f158119a |= 1;
                                break;
                            default:
                                String valueOf = String.valueOf(bleStrengthProto.mo71612f());
                                if (valueOf.length() == 0) {
                                    str = new String("Json2LiteBadEnum userlocation.BleStrengthProto.type ");
                                } else {
                                    str = "Json2LiteBadEnum userlocation.BleStrengthProto.type ".concat(valueOf);
                                }
                                throw new IllegalArgumentException(str);
                        }
                    }
                    if (bleStrengthProto.mo71608b() != null) {
                        try {
                            bxtx a = bxtx.m123261a(Base64.decode(bleStrengthProto.mo71608b(), 10));
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvxz bvxz12 = (bvxz) da2.f164949b;
                            a.getClass();
                            bvxz12.f158119a |= 2;
                            bvxz12.f158121c = a;
                        } catch (IllegalArgumentException e) {
                            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.BleStrengthProto.id", e);
                        }
                    }
                    if (bleStrengthProto.mo71609c() != null) {
                        long longValue = bleStrengthProto.mo71609c().longValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvxz bvxz13 = (bvxz) da2.f164949b;
                        bvxz13.f158119a |= 4;
                        bvxz13.f158122d = longValue;
                    }
                    if (bleStrengthProto.mo71610d() != null) {
                        int intValue = bleStrengthProto.mo71610d().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvxz bvxz14 = (bvxz) da2.f164949b;
                        bvxz14.f158119a |= 8;
                        bvxz14.f158123e = intValue;
                    }
                    if (bleStrengthProto.mo71611e() != null) {
                        int intValue2 = bleStrengthProto.mo71611e().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvxz bvxz15 = (bvxz) da2.f164949b;
                        bvxz15.f158119a |= 16;
                        bvxz15.f158124f = intValue2;
                    }
                    bvxz bvxz16 = (bvxz) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvy bvvy = (bvvy) da.f164949b;
                    bvxz16.getClass();
                    if (!bvvy.f157873a.mo73666a()) {
                        bvvy.f157873a = bxvk.m124021a(bvvy.f157873a);
                    }
                    bvvy.f157873a.add(bvxz16);
                }
                i6++;
                i2 = 3;
                i3 = 5;
            }
        }
        if (apiBleScanReport.getBleSensorDatas() != null) {
            ArrayList bleSensorDatas = apiBleScanReport.getBleSensorDatas();
            int size2 = bleSensorDatas.size();
            int i7 = 0;
            while (i7 < size2) {
                BleSensorData bleSensorData = (BleSensorData) bleSensorDatas.get(i7);
                if (bleSensorData != null) {
                    bxvd da3 = bvxx.f158110e.mo74144da();
                    if (bleSensorData.mo71607d() != null) {
                        String d = bleSensorData.mo71607d();
                        switch (d.hashCode()) {
                            case -1805472660:
                                if (d.equals("TYPE_1")) {
                                    i = 4;
                                    break;
                                }
                                i = -1;
                                break;
                            case -755349785:
                                if (d.equals("EDDYSTONE_TLM")) {
                                    i = 2;
                                    break;
                                }
                                i = -1;
                                break;
                            case -284840886:
                                if (d.equals("unknown")) {
                                    i = 1;
                                    break;
                                }
                                i = -1;
                                break;
                            case 110843959:
                                if (d.equals("type1")) {
                                    i = 5;
                                    break;
                                }
                                i = -1;
                                break;
                            case 429257668:
                                if (d.equals("eddystoneTlm")) {
                                    i = 3;
                                    break;
                                }
                                i = -1;
                                break;
                            case 433141802:
                                if (d.equals("UNKNOWN")) {
                                    i = 0;
                                    break;
                                }
                                i = -1;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        if (i == 0 || i == i5) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvxx bvxx = (bvxx) da3.f164949b;
                            bvxx.f158113b = 0;
                            bvxx.f158112a |= i5;
                        } else if (i == 2 || i == 3) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvxx bvxx2 = (bvxx) da3.f164949b;
                            bvxx2.f158113b = i5;
                            bvxx2.f158112a |= i5;
                        } else if (i == i4 || i == 5) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvxx bvxx3 = (bvxx) da3.f164949b;
                            bvxx3.f158113b = i5;
                            bvxx3.f158112a |= i5;
                        } else {
                            String valueOf2 = String.valueOf(bleSensorData.mo71607d());
                            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.BleSensorData.type ") : "Json2LiteBadEnum userlocation.BleSensorData.type ".concat(valueOf2));
                        }
                    }
                    if (bleSensorData.mo71606c() != null) {
                        long longValue2 = bleSensorData.mo71606c().longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvxx bvxx4 = (bvxx) da3.f164949b;
                        bvxx4.f158112a |= 2;
                        bvxx4.f158114c = longValue2;
                    }
                    if (bleSensorData.mo71605b() != null) {
                        try {
                            bxtx a2 = bxtx.m123261a(Base64.decode(bleSensorData.mo71605b(), 10));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvxx bvxx5 = (bvxx) da3.f164949b;
                            a2.getClass();
                            bvxx5.f158112a |= 4;
                            bvxx5.f158115d = a2;
                        } catch (IllegalArgumentException e2) {
                            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.BleSensorData.data", e2);
                        }
                    }
                    bvxx bvxx6 = (bvxx) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvy bvvy2 = (bvvy) da.f164949b;
                    bvxx6.getClass();
                    if (!bvvy2.f157874b.mo73666a()) {
                        bvvy2.f157874b = bxvk.m124021a(bvvy2.f157874b);
                    }
                    bvvy2.f157874b.add(bvxx6);
                }
                i7++;
                i4 = 4;
                i5 = 1;
            }
        }
        return (bvvy) da.mo74062i();
    }
}
