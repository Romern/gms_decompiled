package p000;

import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ApiActivity;
import com.google.android.ulr.ApiActivityExtraRow;
import com.google.android.ulr.ApiActivityReading;
import com.google.android.ulr.ApiBurstRequest;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiExperiment;
import com.google.android.ulr.ApiExperimentTokens;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocation;
import com.google.android.ulr.ApiLocationReading;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiModelState;
import com.google.android.ulr.ApiPlaceInference;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiStepCountsEntry;
import com.google.android.ulr.ApiUserData;
import com.google.android.ulr.ApiWifiConnectivityStatus;
import com.google.android.ulr.LocationHistorianBatchData;
import com.google.android.ulr.WifiStrengthProto;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Random;

/* renamed from: bgzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzi {

    /* renamed from: a */
    private static final Random f118158a = new Random();

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvvp m100443a(ApiActivityReading apiActivityReading) {
        char c;
        char c2;
        bguv.m100042a("UlrApiActivityReadingConvertTriggered");
        if (apiActivityReading == null) {
            return null;
        }
        try {
            bxvd da = bvvp.f157827f.mo74144da();
            if (apiActivityReading.mo71475b() != null) {
                long longValue = apiActivityReading.mo71475b().longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvvp bvvp = (bvvp) da.f164949b;
                bvvp.f157829a |= 1;
                bvvp.f157830b = longValue;
            }
            if (apiActivityReading.getReadingInfo() != null) {
                bvxf a = bjco.m103198a(apiActivityReading.getReadingInfo());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvvp bvvp2 = (bvvp) da.f164949b;
                a.getClass();
                bvvp2.f157831c = a;
                bvvp2.f157829a |= 2;
            }
            if (apiActivityReading.getActivities() != null) {
                Iterator it = apiActivityReading.getActivities().iterator();
                while (it.hasNext()) {
                    ApiActivity apiActivity = (ApiActivity) it.next();
                    if (apiActivity != null) {
                        bxvd da2 = bvvm.f157814d.mo74144da();
                        if (apiActivity.mo71466c() != null) {
                            String c3 = apiActivity.mo71466c();
                            switch (c3.hashCode()) {
                                case -2130108346:
                                    if (c3.equals("IN_BUS")) {
                                        c2 = 28;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -2130108006:
                                    if (c3.equals("IN_CAR")) {
                                        c2 = 26;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -2026200673:
                                    if (c3.equals("RUNNING")) {
                                        c2 = 16;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1848623673:
                                    if (c3.equals("IN_ROAD_VEHICLE")) {
                                        c2 = 18;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1584802318:
                                    if (c3.equals("IN_VEHICLE")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1314394107:
                                    if (c3.equals("tilting")) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1312982983:
                                    if (c3.equals("IN_RAIL_VEHICLE")) {
                                        c2 = 20;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1272596344:
                                    if (c3.equals("exitingVehicle")) {
                                        c2 = 13;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1013348627:
                                    if (c3.equals("onFoot")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -866953016:
                                    if (c3.equals("IN_TWO_WHEELER_VEHICLE")) {
                                        c2 = 22;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -788012149:
                                    if (c3.equals("inTwoWheelerVehicle")) {
                                        c2 = 23;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -596411419:
                                    if (c3.equals("TILTING")) {
                                        c2 = 10;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -578681138:
                                    if (c3.equals("ON_FOOT")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -361826745:
                                    if (c3.equals("inVehicle")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -330673777:
                                    if (c3.equals("inFourWheelerVehicle")) {
                                        c2 = 25;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -284840886:
                                    if (c3.equals("unknown")) {
                                        c2 = 9;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -122960505:
                                    if (c3.equals("inRoadVehicle")) {
                                        c2 = 19;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 79227272:
                                    if (c3.equals("STILL")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100313883:
                                    if (c3.equals("inBus")) {
                                        c2 = 29;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100314223:
                                    if (c3.equals("inCar")) {
                                        c2 = 27;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109765032:
                                    if (c3.equals("still")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 433141802:
                                    if (c3.equals("UNKNOWN")) {
                                        c2 = 8;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 821361846:
                                    if (c3.equals("IN_FOUR_WHEELER_VEHICLE")) {
                                        c2 = 24;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 878250929:
                                    if (c3.equals("EXITING_VEHICLE")) {
                                        c2 = 12;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1071255167:
                                    if (c3.equals("ON_BICYCLE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1118815609:
                                    if (c3.equals("walking")) {
                                        c2 = 15;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1218519584:
                                    if (c3.equals("onBicycle")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1550783935:
                                    if (c3.equals("running")) {
                                        c2 = 17;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1836798297:
                                    if (c3.equals("WALKING")) {
                                        c2 = 14;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2111075541:
                                    if (c3.equals("inRailVehicle")) {
                                        c2 = 21;
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
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm = (bvvm) da2.f164949b;
                                    bvvm.f157817b = 0;
                                    bvvm.f157816a |= 1;
                                    break;
                                case 2:
                                case 3:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm2 = (bvvm) da2.f164949b;
                                    bvvm2.f157817b = 1;
                                    bvvm2.f157816a |= 1;
                                    break;
                                case 4:
                                case 5:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm3 = (bvvm) da2.f164949b;
                                    bvvm3.f157817b = 2;
                                    bvvm3.f157816a |= 1;
                                    break;
                                case 6:
                                case 7:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm4 = (bvvm) da2.f164949b;
                                    bvvm4.f157817b = 3;
                                    bvvm4.f157816a |= 1;
                                    break;
                                case 8:
                                case 9:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm5 = (bvvm) da2.f164949b;
                                    bvvm5.f157817b = 4;
                                    bvvm5.f157816a |= 1;
                                    break;
                                case 10:
                                case 11:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm6 = (bvvm) da2.f164949b;
                                    bvvm6.f157817b = 5;
                                    bvvm6.f157816a |= 1;
                                    break;
                                case 12:
                                case 13:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm7 = (bvvm) da2.f164949b;
                                    bvvm7.f157817b = 6;
                                    bvvm7.f157816a |= 1;
                                    break;
                                case 14:
                                case 15:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm8 = (bvvm) da2.f164949b;
                                    bvvm8.f157817b = 7;
                                    bvvm8.f157816a |= 1;
                                    break;
                                case 16:
                                case 17:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm9 = (bvvm) da2.f164949b;
                                    bvvm9.f157817b = 8;
                                    bvvm9.f157816a |= 1;
                                    break;
                                case 18:
                                case 19:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm10 = (bvvm) da2.f164949b;
                                    bvvm10.f157817b = 9;
                                    bvvm10.f157816a |= 1;
                                    break;
                                case 20:
                                case 21:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm11 = (bvvm) da2.f164949b;
                                    bvvm11.f157817b = 10;
                                    bvvm11.f157816a |= 1;
                                    break;
                                case 22:
                                case 23:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm12 = (bvvm) da2.f164949b;
                                    bvvm12.f157817b = 11;
                                    bvvm12.f157816a |= 1;
                                    break;
                                case 24:
                                case 25:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm13 = (bvvm) da2.f164949b;
                                    bvvm13.f157817b = 12;
                                    bvvm13.f157816a |= 1;
                                    break;
                                case 26:
                                case 27:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm14 = (bvvm) da2.f164949b;
                                    bvvm14.f157817b = 13;
                                    bvvm14.f157816a |= 1;
                                    break;
                                case 28:
                                case 29:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvvm bvvm15 = (bvvm) da2.f164949b;
                                    bvvm15.f157817b = 14;
                                    bvvm15.f157816a |= 1;
                                    break;
                                default:
                                    String valueOf = String.valueOf(apiActivity.mo71466c());
                                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiActivity.type ") : "Json2LiteBadEnum userlocation.ApiActivity.type ".concat(valueOf));
                            }
                        }
                        if (apiActivity.mo71465b() != null) {
                            int intValue = apiActivity.mo71465b().intValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvvm bvvm16 = (bvvm) da2.f164949b;
                            bvvm16.f157816a |= 2;
                            bvvm16.f157818c = intValue;
                        }
                        bvvm bvvm17 = (bvvm) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvvp bvvp3 = (bvvp) da.f164949b;
                        bvvm17.getClass();
                        bvvp3.mo73391a();
                        bvvp3.f157832d.add(bvvm17);
                    }
                }
            }
            if (apiActivityReading.getExtras() != null) {
                Iterator it2 = apiActivityReading.getExtras().iterator();
                while (it2.hasNext()) {
                    ApiActivityExtraRow apiActivityExtraRow = (ApiActivityExtraRow) it2.next();
                    if (apiActivityExtraRow != null) {
                        bxvd da3 = bvvo.f157820f.mo74144da();
                        if (apiActivityExtraRow.mo71474i() != null) {
                            String i = apiActivityExtraRow.mo71474i();
                            switch (i.hashCode()) {
                                case -284840886:
                                    if (i.equals("unknown")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 81434961:
                                    if (i.equals("VALUE")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 111972721:
                                    if (i.equals("value")) {
                                        c = 3;
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
                            if (c == 0 || c == 1) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvvo bvvo = (bvvo) da3.f164949b;
                                bvvo.f157825d = 0;
                                bvvo.f157822a |= 1;
                            } else if (c == 2 || c == 3) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvvo bvvo2 = (bvvo) da3.f164949b;
                                bvvo2.f157825d = 1;
                                bvvo2.f157822a |= 1;
                            } else {
                                String valueOf2 = String.valueOf(apiActivityExtraRow.mo71474i());
                                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiActivityExtraRow.type ") : "Json2LiteBadEnum userlocation.ApiActivityExtraRow.type ".concat(valueOf2));
                            }
                        }
                        if (apiActivityExtraRow.mo71472g() != null) {
                            String g = apiActivityExtraRow.mo71472g();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo3 = (bvvo) da3.f164949b;
                            g.getClass();
                            bvvo3.f157822a |= 2;
                            bvvo3.f157826e = g;
                        }
                        if (apiActivityExtraRow.mo71470e() != null) {
                            int intValue2 = apiActivityExtraRow.mo71470e().intValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo4 = (bvvo) da3.f164949b;
                            bvvo4.f157823b = 3;
                            bvvo4.f157824c = Integer.valueOf(intValue2);
                        }
                        if (apiActivityExtraRow.mo71471f() != null) {
                            long longValue2 = apiActivityExtraRow.mo71471f().longValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo5 = (bvvo) da3.f164949b;
                            bvvo5.f157823b = 4;
                            bvvo5.f157824c = Long.valueOf(longValue2);
                        }
                        if (apiActivityExtraRow.mo71469d() != null) {
                            float floatValue = apiActivityExtraRow.mo71469d().floatValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo6 = (bvvo) da3.f164949b;
                            bvvo6.f157823b = 5;
                            bvvo6.f157824c = Float.valueOf(floatValue);
                        }
                        if (apiActivityExtraRow.mo71468c() != null) {
                            double doubleValue = apiActivityExtraRow.mo71468c().doubleValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo7 = (bvvo) da3.f164949b;
                            bvvo7.f157823b = 6;
                            bvvo7.f157824c = Double.valueOf(doubleValue);
                        }
                        if (apiActivityExtraRow.mo71473h() != null) {
                            String h = apiActivityExtraRow.mo71473h();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo8 = (bvvo) da3.f164949b;
                            h.getClass();
                            bvvo8.f157823b = 7;
                            bvvo8.f157824c = h;
                        }
                        if (apiActivityExtraRow.mo71467b() != null) {
                            boolean booleanValue = apiActivityExtraRow.mo71467b().booleanValue();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvvo bvvo9 = (bvvo) da3.f164949b;
                            bvvo9.f157823b = 8;
                            bvvo9.f157824c = Boolean.valueOf(booleanValue);
                        }
                        bvvo bvvo10 = (bvvo) da3.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvvp bvvp4 = (bvvp) da.f164949b;
                        bvvo10.getClass();
                        bvvp4.mo73392b();
                        bvvp4.f157833e.add(bvvo10);
                    }
                }
            }
            return (bvvp) da.mo74062i();
        } catch (IllegalArgumentException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            bgur.m100025c("GCoreUlr", valueOf3.length() == 0 ? new String("Convert ApiActivityReadingConvert Exception: ") : "Convert ApiActivityReadingConvert Exception: ".concat(valueOf3));
            bguv.m100040a(57);
            m100450a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static bvwi m100444a(ApiExperiment apiExperiment) {
        bguv.m100042a("UlrApiExperimentConvertTriggered");
        try {
            return bjck.m103194a(apiExperiment);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiExperimentConverter Exception: ") : "Convert ApiExperimentConverter Exception: ".concat(valueOf));
            bguv.m100040a(62);
            m100450a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static bvwj m100445a(ApiExperimentTokens apiExperimentTokens) {
        bguv.m100042a("UlrApiExperimentTokensConvertTriggered");
        if (apiExperimentTokens == null) {
            return null;
        }
        try {
            bxvd da = bvwj.f157938h.mo74144da();
            if (apiExperimentTokens.mo71517d() != null) {
                ByteString a = ByteString.m123261a(Base64.decode(apiExperimentTokens.mo71517d(), 10));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwj bvwj = (bvwj) da.f164949b;
                a.getClass();
                bvwj.f157940a |= 1;
                bvwj.f157941b = a;
            }
            if (apiExperimentTokens.mo71518e() != null) {
                Iterator it = apiExperimentTokens.mo71518e().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        ByteString a2 = ByteString.m123261a(Base64.decode(str, 10));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwj bvwj2 = (bvwj) da.f164949b;
                        a2.getClass();
                        if (!bvwj2.f157942c.mo73666a()) {
                            bvwj2.f157942c = GeneratedMessageLite.m124021a(bvwj2.f157942c);
                        }
                        bvwj2.f157942c.add(a2);
                    }
                }
            }
            if (apiExperimentTokens.mo71520g() != null) {
                Iterator it2 = apiExperimentTokens.mo71520g().iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (str2 != null) {
                        ByteString a3 = ByteString.m123261a(Base64.decode(str2, 10));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwj bvwj3 = (bvwj) da.f164949b;
                        a3.getClass();
                        if (!bvwj3.f157943d.mo73666a()) {
                            bvwj3.f157943d = GeneratedMessageLite.m124021a(bvwj3.f157943d);
                        }
                        bvwj3.f157943d.add(a3);
                    }
                }
            }
            if (apiExperimentTokens.mo71516c() != null) {
                Iterator it3 = apiExperimentTokens.mo71516c().iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (str3 != null) {
                        ByteString a4 = ByteString.m123261a(Base64.decode(str3, 10));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwj bvwj4 = (bvwj) da.f164949b;
                        a4.getClass();
                        if (!bvwj4.f157944e.mo73666a()) {
                            bvwj4.f157944e = GeneratedMessageLite.m124021a(bvwj4.f157944e);
                        }
                        bvwj4.f157944e.add(a4);
                    }
                }
            }
            if (apiExperimentTokens.mo71519f() != null) {
                Iterator it4 = apiExperimentTokens.mo71519f().iterator();
                while (it4.hasNext()) {
                    String str4 = (String) it4.next();
                    if (str4 != null) {
                        ByteString a5 = ByteString.m123261a(Base64.decode(str4, 10));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwj bvwj5 = (bvwj) da.f164949b;
                        a5.getClass();
                        if (!bvwj5.f157945f.mo73666a()) {
                            bvwj5.f157945f = GeneratedMessageLite.m124021a(bvwj5.f157945f);
                        }
                        bvwj5.f157945f.add(a5);
                    }
                }
            }
            if (apiExperimentTokens.mo71515b() != null) {
                Iterator it5 = apiExperimentTokens.mo71515b().iterator();
                while (it5.hasNext()) {
                    String str5 = (String) it5.next();
                    if (str5 != null) {
                        ByteString a6 = ByteString.m123261a(Base64.decode(str5, 10));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwj bvwj6 = (bvwj) da.f164949b;
                        a6.getClass();
                        if (!bvwj6.f157946g.mo73666a()) {
                            bvwj6.f157946g = GeneratedMessageLite.m124021a(bvwj6.f157946g);
                        }
                        bvwj6.f157946g.add(a6);
                    }
                }
            }
            return (bvwj) da.mo74062i();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.additional_direct_experiment_tokens", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.other_cross_experiment_tokens", e2);
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.always_cross_experiment_tokens", e3);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.pseudonymous_cross_experiment_tokens", e4);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.gaia_cross_experiment_tokens", e5);
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.direct_experiment_token", e6);
        } catch (IllegalArgumentException e7) {
            String valueOf = String.valueOf(e7.getMessage());
            bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiExperimentTokensConverter Exception: ") : "Convert ApiExperimentTokensConverter Exception: ".concat(valueOf));
            bguv.m100040a(59);
            m100450a(e7);
            return null;
        }
    }

    /* renamed from: a */
    public static bvwm m100446a(ApiLocationReading apiLocationReading) {
        bvwl bvwl;
        bguv.m100042a("UlrApiLocationReadingConvertTriggered");
        if (apiLocationReading == null) {
            return null;
        }
        try {
            bxvd da = bvwm.f157965j.mo74144da();
            if (apiLocationReading.mo71537f() != null) {
                long longValue = apiLocationReading.mo71537f().longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm = (bvwm) da.f164949b;
                bvwm.f157967a |= 1;
                bvwm.f157968b = longValue;
            }
            if (apiLocationReading.getReadingInfo() != null) {
                bvxf a = bjco.m103198a(apiLocationReading.getReadingInfo());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm2 = (bvwm) da.f164949b;
                a.getClass();
                bvwm2.f157969c = a;
                bvwm2.f157967a |= 2;
            }
            if (apiLocationReading.getLocation() != null) {
                ApiLocation location = apiLocationReading.getLocation();
                if (location != null) {
                    bxvd da2 = bvwl.f157951m.mo74144da();
                    if (location.mo71529i() != null) {
                        int intValue = location.mo71529i().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl2 = (bvwl) da2.f164949b;
                        bvwl2.f157953a |= 1;
                        bvwl2.f157954b = intValue;
                    }
                    if (location.mo71530j() != null) {
                        int intValue2 = location.mo71530j().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl3 = (bvwl) da2.f164949b;
                        bvwl3.f157953a |= 2;
                        bvwl3.f157955c = intValue2;
                    }
                    if (location.mo71531k() != null) {
                        int intValue3 = location.mo71531k().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl4 = (bvwl) da2.f164949b;
                        bvwl4.f157953a |= 4;
                        bvwl4.f157956d = intValue3;
                    }
                    if (location.mo71525e() != null) {
                        int intValue4 = location.mo71525e().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl5 = (bvwl) da2.f164949b;
                        bvwl5.f157953a |= 8;
                        bvwl5.f157957e = intValue4;
                    }
                    if (location.mo71522b() != null) {
                        int intValue5 = location.mo71522b().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl6 = (bvwl) da2.f164949b;
                        bvwl6.f157953a |= 16;
                        bvwl6.f157958f = intValue5;
                    }
                    if (location.mo71527g() != null) {
                        int intValue6 = location.mo71527g().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl7 = (bvwl) da2.f164949b;
                        bvwl7.f157953a |= 32;
                        bvwl7.f157959g = intValue6;
                    }
                    if (location.mo71528h() != null) {
                        String h = location.mo71528h();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl8 = (bvwl) da2.f164949b;
                        h.getClass();
                        bvwl8.f157953a |= 64;
                        bvwl8.f157960h = h;
                    }
                    if (location.mo71526f() != null) {
                        int intValue7 = location.mo71526f().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl9 = (bvwl) da2.f164949b;
                        bvwl9.f157953a |= 128;
                        bvwl9.f157961i = intValue7;
                    }
                    if (location.mo71532l() != null) {
                        int intValue8 = location.mo71532l().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl10 = (bvwl) da2.f164949b;
                        bvwl10.f157953a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bvwl10.f157962j = intValue8;
                    }
                    if (location.mo71524d() != null) {
                        int intValue9 = location.mo71524d().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl11 = (bvwl) da2.f164949b;
                        bvwl11.f157953a |= 512;
                        bvwl11.f157963k = intValue9;
                    }
                    if (location.mo71523c() != null) {
                        boolean booleanValue = location.mo71523c().booleanValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwl bvwl12 = (bvwl) da2.f164949b;
                        bvwl12.f157953a |= 1024;
                        bvwl12.f157964l = booleanValue;
                    }
                    bvwl = (bvwl) da2.mo74062i();
                } else {
                    bvwl = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm3 = (bvwm) da.f164949b;
                bvwl.getClass();
                bvwm3.f157970d = bvwl;
                bvwm3.f157967a |= 4;
            }
            if (apiLocationReading.getExperiments() != null) {
                Iterator it = apiLocationReading.getExperiments().iterator();
                while (it.hasNext()) {
                    ApiExperiment apiExperiment = (ApiExperiment) it.next();
                    if (apiExperiment != null) {
                        bvwi a2 = bjck.m103194a(apiExperiment);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwm bvwm4 = (bvwm) da.f164949b;
                        a2.getClass();
                        bvwm4.mo73393a();
                        bvwm4.f157971e.add(a2);
                    }
                }
            }
            if (apiLocationReading.mo71535d() != null) {
                int intValue10 = apiLocationReading.mo71535d().intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm5 = (bvwm) da.f164949b;
                bvwm5.f157967a |= 8;
                bvwm5.f157972f = intValue10;
            }
            if (apiLocationReading.mo71536e() != null) {
                int intValue11 = apiLocationReading.mo71536e().intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm6 = (bvwm) da.f164949b;
                bvwm6.f157967a |= 16;
                bvwm6.f157973g = intValue11;
            }
            if (apiLocationReading.mo71533b() != null) {
                long longValue2 = apiLocationReading.mo71533b().longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm7 = (bvwm) da.f164949b;
                bvwm7.f157967a |= 32;
                bvwm7.f157974h = longValue2;
            }
            if (apiLocationReading.mo71534c() != null) {
                boolean booleanValue2 = apiLocationReading.mo71534c().booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwm bvwm8 = (bvwm) da.f164949b;
                bvwm8.f157967a |= 64;
                bvwm8.f157975i = booleanValue2;
            }
            return (bvwm) da.mo74062i();
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiLocationReadingConverter Exception: ") : "Convert ApiLocationReadingConverter Exception: ".concat(valueOf));
            bguv.m100040a(58);
            m100450a(e);
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x028d, code lost:
        if (r8.equals("INFERRED_REVERSE_GEOCODING") != false) goto L_0x02ee;
     */
    /* renamed from: a */
    public static bvwq m100447a(ApiMetadata apiMetadata) {
        bvxq bvxq;
        char c;
        bvwk bvwk;
        bvwr bvwr;
        bvxv bvxv;
        char c2;
        bvwd bvwd;
        bvwt bvwt;
        char c3;
        bvva bvva;
        bvvz bvvz;
        bvww bvww;
        char c4;
        bguv.m100042a("UlrApiMetadataConvertTriggered");
        if (apiMetadata == null) {
            return null;
        }
        try {
            bxvd da = bvwq.f157983r.mo74144da();
            if (apiMetadata.mo71544b() != null) {
                long longValue = apiMetadata.mo71544b().longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq = (bvwq) da.f164949b;
                bvwq.f157985a |= 1;
                bvwq.f157986b = longValue;
            }
            if (apiMetadata.getRate() != null) {
                bvxc a = bjcn.m103197a(apiMetadata.getRate());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq2 = (bvwq) da.f164949b;
                a.getClass();
                bvwq2.f157987c = a;
                bvwq2.f157985a |= 2;
            }
            if (apiMetadata.getPlaceReport() != null) {
                ApiPlaceReport placeReport = apiMetadata.getPlaceReport();
                if (placeReport != null) {
                    bxvd da2 = bvww.f158020h.mo74144da();
                    if (placeReport.mo71569d() != null) {
                        String d = placeReport.mo71569d();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvww bvww2 = (bvww) da2.f164949b;
                        d.getClass();
                        bvww2.f158022a |= 1;
                        bvww2.f158023b = d;
                    }
                    if (placeReport.mo71568c() != null) {
                        String c5 = placeReport.mo71568c();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvww bvww3 = (bvww) da2.f164949b;
                        c5.getClass();
                        bvww3.f158022a |= 2;
                        bvww3.f158024c = c5;
                    }
                    if (placeReport.mo71567b() != null) {
                        String b = placeReport.mo71567b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvww bvww4 = (bvww) da2.f164949b;
                        b.getClass();
                        bvww4.f158022a |= 4;
                        bvww4.f158025d = b;
                    }
                    if (placeReport.getPayload() != null) {
                        bvwx a2 = bjcm.m103196a(placeReport.getPayload());
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvww bvww5 = (bvww) da2.f164949b;
                        a2.getClass();
                        bvww5.f158026e = a2;
                        bvww5.f158022a |= 8;
                    }
                    char c6 = 10;
                    if (placeReport.mo71571f() != null) {
                        String f = placeReport.mo71571f();
                        switch (f.hashCode()) {
                            case -894448902:
                                if (f.equals("PLACE_ENTRY")) {
                                    c4 = 6;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -797215086:
                                if (f.equals("NEARBY_ENTRY")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -708279148:
                                if (f.equals("atPlace")) {
                                    c4 = 11;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -569400013:
                                if (f.equals("nearbyEntry")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -290141269:
                                if (f.equals("placeEntry")) {
                                    c4 = 7;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 248250742:
                                if (f.equals("PLACE_EXIT")) {
                                    c4 = 8;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 258736189:
                                if (f.equals("nearbyExit")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1027576367:
                                if (f.equals("UNKNOWN_TYPE")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1619688100:
                                if (f.equals("unknownType")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1636860638:
                                if (f.equals("NEARBY_EXIT")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1650399707:
                                if (f.equals("AT_PLACE")) {
                                    c4 = 10;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1791765189:
                                if (f.equals("placeExit")) {
                                    c4 = 9;
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
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww6 = (bvww) da2.f164949b;
                                bvww6.f158027f = 0;
                                bvww6.f158022a |= 16;
                                break;
                            case 2:
                            case 3:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww7 = (bvww) da2.f164949b;
                                bvww7.f158027f = 1;
                                bvww7.f158022a |= 16;
                                break;
                            case 4:
                            case 5:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww8 = (bvww) da2.f164949b;
                                bvww8.f158027f = 2;
                                bvww8.f158022a |= 16;
                                break;
                            case 6:
                            case 7:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww9 = (bvww) da2.f164949b;
                                bvww9.f158027f = 3;
                                bvww9.f158022a |= 16;
                                break;
                            case 8:
                            case 9:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww10 = (bvww) da2.f164949b;
                                bvww10.f158027f = 4;
                                bvww10.f158022a |= 16;
                                break;
                            case 10:
                            case 11:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww11 = (bvww) da2.f164949b;
                                bvww11.f158027f = 5;
                                bvww11.f158022a |= 16;
                                break;
                            default:
                                String valueOf = String.valueOf(placeReport.mo71571f());
                                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiPlaceReport.type ") : "Json2LiteBadEnum userlocation.ApiPlaceReport.type ".concat(valueOf));
                        }
                    }
                    if (placeReport.mo71570e() != null) {
                        String e = placeReport.mo71570e();
                        switch (e.hashCode()) {
                            case -1436706272:
                                if (e.equals("inferredGeofencing")) {
                                    c6 = 7;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1194968642:
                                if (e.equals("userReported")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -978712437:
                                if (e.equals("INFERRED_RADIO_SIGNALS")) {
                                    c6 = 8;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -773301127:
                                if (e.equals("INFERRED_GEOFENCING")) {
                                    c6 = 6;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -284840886:
                                if (e.equals("unknown")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -262743844:
                                if (e.equals("inferredReverseGeocoding")) {
                                    c6 = 11;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -175044018:
                                if (e.equals("INFERRED_SNAPPED_TO_ROAD")) {
                                    c6 = 12;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 169606531:
                                if (e.equals("inferred")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 433141802:
                                if (e.equals("UNKNOWN")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 545688802:
                                break;
                            case 735786695:
                                if (e.equals("USER_REPORTED")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 952233347:
                                if (e.equals("INFERRED")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1164924125:
                                if (e.equals("inferredSnappedToRoad")) {
                                    c6 = 13;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1287171955:
                                if (e.equals("inferredRadioSignals")) {
                                    c6 = 9;
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
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww12 = (bvww) da2.f164949b;
                                bvww12.f158028g = 0;
                                bvww12.f158022a |= 32;
                                break;
                            case 2:
                            case 3:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww13 = (bvww) da2.f164949b;
                                bvww13.f158028g = 1;
                                bvww13.f158022a |= 32;
                                break;
                            case 4:
                            case 5:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww14 = (bvww) da2.f164949b;
                                bvww14.f158028g = 2;
                                bvww14.f158022a |= 32;
                                break;
                            case 6:
                            case 7:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww15 = (bvww) da2.f164949b;
                                bvww15.f158028g = 33;
                                bvww15.f158022a |= 32;
                                break;
                            case 8:
                            case 9:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww16 = (bvww) da2.f164949b;
                                bvww16.f158028g = 34;
                                bvww16.f158022a |= 32;
                                break;
                            case 10:
                            case 11:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww17 = (bvww) da2.f164949b;
                                bvww17.f158028g = 35;
                                bvww17.f158022a |= 32;
                                break;
                            case 12:
                            case 13:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvww bvww18 = (bvww) da2.f164949b;
                                bvww18.f158028g = 36;
                                bvww18.f158022a |= 32;
                                break;
                            default:
                                String valueOf2 = String.valueOf(placeReport.mo71570e());
                                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiPlaceReport.source ") : "Json2LiteBadEnum userlocation.ApiPlaceReport.source ".concat(valueOf2));
                        }
                    }
                    bvww = (bvww) da2.mo74062i();
                } else {
                    bvww = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq3 = (bvwq) da.f164949b;
                bvww.getClass();
                bvwq3.f157988d = bvww;
                bvwq3.f157985a |= 4;
            }
            if (apiMetadata.getBurstRequest() != null) {
                ApiBurstRequest burstRequest = apiMetadata.getBurstRequest();
                if (burstRequest != null) {
                    bxvd da3 = bvvz.f157875h.mo74144da();
                    if (burstRequest.mo71505e() != null) {
                        String e2 = burstRequest.mo71505e();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz2 = (bvvz) da3.f164949b;
                        e2.getClass();
                        bvvz2.f157877a |= 1;
                        bvvz2.f157878b = e2;
                    }
                    if (burstRequest.mo71507g() != null) {
                        long longValue2 = burstRequest.mo71507g().longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz3 = (bvvz) da3.f164949b;
                        bvvz3.f157877a |= 2;
                        bvvz3.f157879c = longValue2;
                    }
                    if (burstRequest.mo71503c() != null) {
                        long longValue3 = burstRequest.mo71503c().longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz4 = (bvvz) da3.f164949b;
                        bvvz4.f157877a |= 4;
                        bvvz4.f157880d = longValue3;
                    }
                    if (burstRequest.mo71504d() != null) {
                        long longValue4 = burstRequest.mo71504d().longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz5 = (bvvz) da3.f164949b;
                        bvvz5.f157877a |= 8;
                        bvvz5.f157881e = longValue4;
                    }
                    if (burstRequest.mo71506f() != null) {
                        long longValue5 = burstRequest.mo71506f().longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz6 = (bvvz) da3.f164949b;
                        bvvz6.f157877a |= 16;
                        bvvz6.f157882f = longValue5;
                    }
                    if (burstRequest.mo71502b() != null) {
                        String b2 = burstRequest.mo71502b();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvvz bvvz7 = (bvvz) da3.f164949b;
                        b2.getClass();
                        bvvz7.f157877a |= 32;
                        bvvz7.f157883g = b2;
                    }
                    bvvz = (bvvz) da3.mo74062i();
                } else {
                    bvvz = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq4 = (bvwq) da.f164949b;
                bvvz.getClass();
                bvwq4.f157989e = bvvz;
                bvwq4.f157985a |= 8;
            }
            if (apiMetadata.getLocationStatus() != null) {
                bvwp a3 = bjcl.m103195a(apiMetadata.getLocationStatus());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq5 = (bvwq) da.f164949b;
                a3.getClass();
                bvwq5.f157990f = a3;
                bvwq5.f157985a |= 16;
            }
            if (apiMetadata.getActivationChange() != null) {
                bvvl a4 = bjch.m103191a(apiMetadata.getActivationChange());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq6 = (bvwq) da.f164949b;
                a4.getClass();
                bvwq6.f157991g = a4;
                bvwq6.f157985a |= 32;
            }
            if (apiMetadata.getBleScanReport() != null) {
                bvvy a5 = bjcj.m103193a(apiMetadata.getBleScanReport());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq7 = (bvwq) da.f164949b;
                a5.getClass();
                bvwq7.f157992h = a5;
                bvwq7.f157985a |= 64;
            }
            if (apiMetadata.getWifiScans() != null) {
                Iterator it = apiMetadata.getWifiScans().iterator();
                while (it.hasNext()) {
                    WifiStrengthProto wifiStrengthProto = (WifiStrengthProto) it.next();
                    if (wifiStrengthProto != null) {
                        bvyq a6 = bjda.m103207a(wifiStrengthProto);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvwq bvwq8 = (bvwq) da.f164949b;
                        a6.getClass();
                        bvwq8.mo73394a();
                        bvwq8.f157993i.add(a6);
                    }
                }
            }
            if (apiMetadata.getLocationHistorianBatchData() != null) {
                LocationHistorianBatchData locationHistorianBatchData = apiMetadata.getLocationHistorianBatchData();
                if (locationHistorianBatchData != null) {
                    bxvd da4 = bvva.f157773e.mo74144da();
                    if (locationHistorianBatchData.mo71689d() != null) {
                        int intValue = locationHistorianBatchData.mo71689d().intValue();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bvva bvva2 = (bvva) da4.f164949b;
                        bvva2.f157775a |= 1;
                        bvva2.f157776b = intValue;
                    }
                    if (locationHistorianBatchData.mo71688c() != null) {
                        String c7 = locationHistorianBatchData.mo71688c();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bvva bvva3 = (bvva) da4.f164949b;
                        c7.getClass();
                        bvva3.f157775a |= 2;
                        bvva3.f157777c = c7;
                    }
                    if (locationHistorianBatchData.mo71687b() != null) {
                        ByteString a7 = ByteString.m123261a(Base64.decode(locationHistorianBatchData.mo71687b(), 11));
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bvva bvva4 = (bvva) da4.f164949b;
                        a7.getClass();
                        bvva4.f157775a |= 4;
                        bvva4.f157778d = a7;
                    }
                    bvva = (bvva) da4.mo74062i();
                } else {
                    bvva = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq9 = (bvwq) da.f164949b;
                bvva.getClass();
                bvwq9.f157994j = bvva;
                bvwq9.f157985a |= 128;
            }
            if (apiMetadata.getPlaceInferenceResult() != null) {
                ApiPlaceInferenceResult placeInferenceResult = apiMetadata.getPlaceInferenceResult();
                if (placeInferenceResult != null) {
                    bxvd da5 = bvwt.f158012e.mo74144da();
                    if (placeInferenceResult.getInferences() != null) {
                        Iterator it2 = placeInferenceResult.getInferences().iterator();
                        while (it2.hasNext()) {
                            ApiPlaceInference apiPlaceInference = (ApiPlaceInference) it2.next();
                            if (apiPlaceInference != null) {
                                bxvd da6 = bvws.f158007d.mo74144da();
                                if (apiPlaceInference.mo71563c() != null) {
                                    String c8 = apiPlaceInference.mo71563c();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bvws bvws = (bvws) da6.f164949b;
                                    c8.getClass();
                                    bvws.f158009a |= 1;
                                    bvws.f158010b = c8;
                                }
                                if (apiPlaceInference.mo71562b() != null) {
                                    int intValue2 = apiPlaceInference.mo71562b().intValue();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bvws bvws2 = (bvws) da6.f164949b;
                                    bvws2.f158009a |= 2;
                                    bvws2.f158011c = intValue2;
                                }
                                bvws bvws3 = (bvws) da6.mo74062i();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt2 = (bvwt) da5.f164949b;
                                bvws3.getClass();
                                bvwt2.mo73395a();
                                bvwt2.f158015b.add(bvws3);
                            }
                        }
                    }
                    if (placeInferenceResult.mo71565c() != null) {
                        String c9 = placeInferenceResult.mo71565c();
                        switch (c9.hashCode()) {
                            case -1837176303:
                                if (c9.equals("lowPower")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1605310233:
                                if (c9.equals("NO_POWER")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1279990758:
                                if (c9.equals("LOW_POWER")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -787715346:
                                if (c9.equals("BALANCED_POWER")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -706875261:
                                if (c9.equals("highPower")) {
                                    c3 = 9;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 140054749:
                                if (c9.equals("balancedPower")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1027357848:
                                if (c9.equals("UNKNOWN_MODE")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1393068040:
                                if (c9.equals("HIGH_POWER")) {
                                    c3 = 8;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1619469581:
                                if (c9.equals("unknownMode")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2096298948:
                                if (c9.equals("noPower")) {
                                    c3 = 3;
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
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt3 = (bvwt) da5.f164949b;
                                bvwt3.f158016c = 0;
                                bvwt3.f158014a |= 1;
                                break;
                            case 2:
                            case 3:
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt4 = (bvwt) da5.f164949b;
                                bvwt4.f158016c = 1;
                                bvwt4.f158014a |= 1;
                                break;
                            case 4:
                            case 5:
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt5 = (bvwt) da5.f164949b;
                                bvwt5.f158016c = 2;
                                bvwt5.f158014a |= 1;
                                break;
                            case 6:
                            case 7:
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt6 = (bvwt) da5.f164949b;
                                bvwt6.f158016c = 3;
                                bvwt6.f158014a |= 1;
                                break;
                            case 8:
                            case 9:
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvwt bvwt7 = (bvwt) da5.f164949b;
                                bvwt7.f158016c = 4;
                                bvwt7.f158014a |= 1;
                                break;
                            default:
                                String valueOf3 = String.valueOf(placeInferenceResult.mo71565c());
                                throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiPlaceInferenceResult.power_mode ") : "Json2LiteBadEnum userlocation.ApiPlaceInferenceResult.power_mode ".concat(valueOf3));
                        }
                    }
                    if (placeInferenceResult.mo71564b() != null) {
                        boolean booleanValue = placeInferenceResult.mo71564b().booleanValue();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bvwt bvwt8 = (bvwt) da5.f164949b;
                        bvwt8.f158014a |= 2;
                        bvwt8.f158017d = booleanValue;
                    }
                    bvwt = (bvwt) da5.mo74062i();
                } else {
                    bvwt = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq10 = (bvwq) da.f164949b;
                bvwt.getClass();
                bvwq10.f157995k = bvwt;
                bvwq10.f157985a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (apiMetadata.getDeviceConnectivitySetting() != null) {
                ApiDeviceConnectivitySetting deviceConnectivitySetting = apiMetadata.getDeviceConnectivitySetting();
                if (deviceConnectivitySetting != null) {
                    bxvd da7 = bvwd.f157910e.mo74144da();
                    if (deviceConnectivitySetting.mo71510d() != null) {
                        boolean booleanValue2 = deviceConnectivitySetting.mo71510d().booleanValue();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvwd bvwd2 = (bvwd) da7.f164949b;
                        bvwd2.f157912a |= 1;
                        bvwd2.f157913b = booleanValue2;
                    }
                    if (deviceConnectivitySetting.mo71508b() != null) {
                        boolean booleanValue3 = deviceConnectivitySetting.mo71508b().booleanValue();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvwd bvwd3 = (bvwd) da7.f164949b;
                        bvwd3.f157912a |= 2;
                        bvwd3.f157914c = booleanValue3;
                    }
                    if (deviceConnectivitySetting.mo71509c() != null) {
                        boolean booleanValue4 = deviceConnectivitySetting.mo71509c().booleanValue();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvwd bvwd4 = (bvwd) da7.f164949b;
                        bvwd4.f157912a |= 4;
                        bvwd4.f157915d = booleanValue4;
                    }
                    bvwd = (bvwd) da7.mo74062i();
                } else {
                    bvwd = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq11 = (bvwq) da.f164949b;
                bvwd.getClass();
                bvwq11.f157996l = bvwd;
                bvwq11.f157985a |= 512;
            }
            if (apiMetadata.getWifiConnectivityStatus() != null) {
                ApiWifiConnectivityStatus wifiConnectivityStatus = apiMetadata.getWifiConnectivityStatus();
                if (wifiConnectivityStatus != null) {
                    bxvd da8 = bvxv.f158104d.mo74144da();
                    if (wifiConnectivityStatus.mo71604c() != null) {
                        String c10 = wifiConnectivityStatus.mo71604c();
                        switch (c10.hashCode()) {
                            case -2087582999:
                                if (c10.equals("CONNECTED")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1381388741:
                                if (c10.equals("disconnected")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -579210487:
                                if (c10.equals("connected")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 935892539:
                                if (c10.equals("DISCONNECTED")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            bvxu bvxu = bvxu.CONNECTED;
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bvxv bvxv2 = (bvxv) da8.f164949b;
                            bvxv2.f158107b = bvxu.f158103c;
                            bvxv2.f158106a |= 1;
                        } else if (c2 == 2 || c2 == 3) {
                            bvxu bvxu2 = bvxu.DISCONNECTED;
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bvxv bvxv3 = (bvxv) da8.f164949b;
                            bvxv3.f158107b = bvxu2.f158103c;
                            bvxv3.f158106a |= 1;
                        } else {
                            String valueOf4 = String.valueOf(wifiConnectivityStatus.mo71604c());
                            throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiWifiConnectivityStatus.wifi_connection_status ") : "Json2LiteBadEnum userlocation.ApiWifiConnectivityStatus.wifi_connection_status ".concat(valueOf4));
                        }
                    }
                    if (wifiConnectivityStatus.mo71603b() != null) {
                        long longValue6 = wifiConnectivityStatus.mo71603b().longValue();
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        bvxv bvxv4 = (bvxv) da8.f164949b;
                        bvxv4.f158106a |= 2;
                        bvxv4.f158108c = longValue6;
                    }
                    bvxv = (bvxv) da8.mo74062i();
                } else {
                    bvxv = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq12 = (bvwq) da.f164949b;
                bvxv.getClass();
                bvwq12.f157997m = bvxv;
                bvwq12.f157985a |= 1024;
            }
            if (apiMetadata.getModelState() != null) {
                ApiModelState modelState = apiMetadata.getModelState();
                if (modelState != null) {
                    bxvd da9 = bvwr.f158002d.mo74144da();
                    if (modelState.mo71561c() != null) {
                        int intValue3 = modelState.mo71561c().intValue();
                        if (da9.f164950c) {
                            da9.mo74035c();
                            da9.f164950c = false;
                        }
                        bvwr bvwr2 = (bvwr) da9.f164949b;
                        bvwr2.f158004a |= 1;
                        bvwr2.f158005b = intValue3;
                    }
                    if (modelState.mo71560b() != null) {
                        int intValue4 = modelState.mo71560b().intValue();
                        if (da9.f164950c) {
                            da9.mo74035c();
                            da9.f164950c = false;
                        }
                        bvwr bvwr3 = (bvwr) da9.f164949b;
                        bvwr3.f158004a |= 2;
                        bvwr3.f158006c = intValue4;
                    }
                    bvwr = (bvwr) da9.mo74062i();
                } else {
                    bvwr = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq13 = (bvwq) da.f164949b;
                bvwr.getClass();
                bvwq13.f157998n = bvwr;
                bvwq13.f157985a |= 2048;
            }
            if (apiMetadata.getInternalState() != null) {
                ApiInternalState internalState = apiMetadata.getInternalState();
                if (internalState != null) {
                    bxvd da10 = bvwk.f157947c.mo74144da();
                    if (internalState.mo71521b() != null) {
                        int intValue5 = internalState.mo71521b().intValue();
                        if (da10.f164950c) {
                            da10.mo74035c();
                            da10.f164950c = false;
                        }
                        bvwk bvwk2 = (bvwk) da10.f164949b;
                        bvwk2.f157949a |= 1;
                        bvwk2.f157950b = intValue5;
                    }
                    bvwk = (bvwk) da10.mo74062i();
                } else {
                    bvwk = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq14 = (bvwq) da.f164949b;
                bvwk.getClass();
                bvwq14.f157999o = bvwk;
                bvwq14.f157985a |= 4096;
            }
            if (apiMetadata.getActivityTransitionEventRecord() != null) {
                bvvr a8 = bjci.m103192a(apiMetadata.getActivityTransitionEventRecord());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq15 = (bvwq) da.f164949b;
                a8.getClass();
                bvwq15.f158000p = a8;
                bvwq15.f157985a |= 8192;
            }
            if (apiMetadata.getStepCountsEntry() != null) {
                ApiStepCountsEntry stepCountsEntry = apiMetadata.getStepCountsEntry();
                if (stepCountsEntry != null) {
                    bxvd da11 = bvxq.f158082d.mo74144da();
                    if (stepCountsEntry.mo71594b() != null) {
                        String b3 = stepCountsEntry.mo71594b();
                        switch (b3.hashCode()) {
                            case -2103891200:
                                if (b3.equals("SENSOR_STATUS_ACCURACY_HIGH")) {
                                    c = 8;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1910307673:
                                if (b3.equals("sensorStatusAccuracyHigh")) {
                                    c = 9;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1715271366:
                                if (b3.equals("sensorStatusAccuracyMedium")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 311961423:
                                if (b3.equals("sensorStatusUnreliable")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 347778582:
                                if (b3.equals("SENSOR_STATUS_ACCURACY_LOW")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 413219891:
                                if (b3.equals("sensorStatusNoContact")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 492570543:
                                if (b3.equals("sensorStatusAccuracyLow")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1020431530:
                                if (b3.equals("SENSOR_STATUS_NO_CONTACT")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1229519187:
                                if (b3.equals("SENSOR_STATUS_ACCURACY_MEDIUM")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1954531083:
                                if (b3.equals("SENSOR_STATUS_UNRELIABLE")) {
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
                                if (da11.f164950c) {
                                    da11.mo74035c();
                                    da11.f164950c = false;
                                }
                                bvxq bvxq2 = (bvxq) da11.f164949b;
                                bvxq2.f158085b = -1;
                                bvxq2.f158084a = 1 | bvxq2.f158084a;
                                break;
                            case 2:
                            case 3:
                                if (da11.f164950c) {
                                    da11.mo74035c();
                                    da11.f164950c = false;
                                }
                                bvxq bvxq3 = (bvxq) da11.f164949b;
                                bvxq3.f158085b = 0;
                                bvxq3.f158084a = 1 | bvxq3.f158084a;
                                break;
                            case 4:
                            case 5:
                                if (da11.f164950c) {
                                    da11.mo74035c();
                                    da11.f164950c = false;
                                }
                                bvxq bvxq4 = (bvxq) da11.f164949b;
                                bvxq4.f158085b = 1;
                                bvxq4.f158084a = 1 | bvxq4.f158084a;
                                break;
                            case 6:
                            case 7:
                                if (da11.f164950c) {
                                    da11.mo74035c();
                                    da11.f164950c = false;
                                }
                                bvxq bvxq5 = (bvxq) da11.f164949b;
                                bvxq5.f158085b = 2;
                                bvxq5.f158084a = 1 | bvxq5.f158084a;
                                break;
                            case 8:
                            case 9:
                                if (da11.f164950c) {
                                    da11.mo74035c();
                                    da11.f164950c = false;
                                }
                                bvxq bvxq6 = (bvxq) da11.f164949b;
                                bvxq6.f158085b = 3;
                                bvxq6.f158084a = 1 | bvxq6.f158084a;
                                break;
                            default:
                                String valueOf5 = String.valueOf(stepCountsEntry.mo71594b());
                                throw new IllegalArgumentException(valueOf5.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiStepCountsEntry.step_count_status ") : "Json2LiteBadEnum userlocation.ApiStepCountsEntry.step_count_status ".concat(valueOf5));
                        }
                    }
                    if (stepCountsEntry.mo71595c() != null) {
                        int intValue6 = stepCountsEntry.mo71595c().intValue();
                        if (da11.f164950c) {
                            da11.mo74035c();
                            da11.f164950c = false;
                        }
                        bvxq bvxq7 = (bvxq) da11.f164949b;
                        bvxq7.f158084a = 2 | bvxq7.f158084a;
                        bvxq7.f158086c = intValue6;
                    }
                    bvxq = (bvxq) da11.mo74062i();
                } else {
                    bvxq = null;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq16 = (bvwq) da.f164949b;
                bvxq.getClass();
                bvwq16.f158001q = bvxq;
                bvwq16.f157985a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            }
            return (bvwq) da.mo74062i();
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.LocationHistorianBatchData.data", e3);
        } catch (IllegalArgumentException e4) {
            IllegalArgumentException illegalArgumentException = e4;
            String valueOf6 = String.valueOf(illegalArgumentException.getMessage());
            bgur.m100025c("GCoreUlr", valueOf6.length() == 0 ? new String("Convert ApiMetaDataException: ") : "Convert ApiMetaDataException: ".concat(valueOf6));
            bguv.m100040a(54);
            m100450a(illegalArgumentException);
            return null;
        }
    }

    /* renamed from: a */
    public static bvxc m100448a(ApiRate apiRate) {
        bguv.m100042a("UlrApiRateConvertTriggered");
        try {
            return bjcn.m103197a(apiRate);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiRateConverter Exception: ") : "Convert ApiRateConverter Exception: ".concat(valueOf));
            bguv.m100040a(60);
            m100450a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static bvxr m100449a(ApiUserData apiUserData) {
        bguv.m100042a("UlrApiUserDataConvertTriggered");
        if (apiUserData == null) {
            return null;
        }
        try {
            bxvd da = bvxr.f158087f.mo74144da();
            if (apiUserData.mo71600e() != null) {
                long longValue = apiUserData.mo71600e().longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxr bvxr = (bvxr) da.f164949b;
                bvxr.f158089a |= 1;
                bvxr.f158090b = longValue;
            }
            if (apiUserData.mo71599d() != null) {
                String d = apiUserData.mo71599d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxr bvxr2 = (bvxr) da.f164949b;
                d.getClass();
                bvxr2.f158089a |= 2;
                bvxr2.f158091c = d;
            }
            if (apiUserData.mo71598c() != null) {
                String c = apiUserData.mo71598c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxr bvxr3 = (bvxr) da.f164949b;
                c.getClass();
                bvxr3.f158089a |= 4;
                bvxr3.f158092d = c;
            }
            if (apiUserData.mo71597b() != null) {
                ByteString a = ByteString.m123261a(Base64.decode(apiUserData.mo71597b(), 11));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxr bvxr4 = (bvxr) da.f164949b;
                a.getClass();
                bvxr4.f158089a |= 8;
                bvxr4.f158093e = a;
            }
            return (bvxr) da.mo74062i();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiUserData.data_binary", e);
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiUserDataException: ") : "Convert ApiUserDataException: ".concat(valueOf));
            bguv.m100040a(56);
            m100450a(e2);
            return null;
        }
    }

    /* renamed from: a */
    private static void m100450a(IllegalArgumentException illegalArgumentException) {
        if (f118158a.nextDouble() <= chcp.f188340a.mo6606a().mo85008j()) {
            bguz.m100120a(illegalArgumentException);
        }
    }
}
