package p000;

import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ActivityRecord;
import com.google.android.ulr.FieldOfView;
import com.google.android.ulr.LocationAttributesProto;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: bjcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcs {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a5e, code lost:
        if (r1.equals("manualEntryInsufficientLocations") != false) goto L_0x0ab5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0d06, code lost:
        if (r1.equals("viewportSearchOptionsFilterOnly") != false) goto L_0x0d3c;
     */
    /* renamed from: a */
    public static byev m103202a(LocationAttributesProto locationAttributesProto) {
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
        byem byem;
        if (locationAttributesProto == null) {
            return null;
        }
        byep byep = (byep) byev.f165940w.mo74144da();
        if (locationAttributesProto.mo71651i() != null) {
            int intValue = locationAttributesProto.mo71651i().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev = (byev) byep.f164949b;
            byev.f165942a |= 1;
            byev.f165943b = intValue;
        }
        if (locationAttributesProto.mo71645e() != null) {
            int intValue2 = locationAttributesProto.mo71645e().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev2 = (byev) byep.f164949b;
            byev2.f165942a |= 2;
            byev2.f165944c = intValue2;
        }
        if (locationAttributesProto.mo71644d() != null) {
            int intValue3 = locationAttributesProto.mo71644d().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev3 = (byev) byep.f164949b;
            byev3.f165942a |= 4;
            byev3.f165945d = intValue3;
        }
        if (locationAttributesProto.mo71659q() != null) {
            int intValue4 = locationAttributesProto.mo71659q().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev4 = (byev) byep.f164949b;
            byev4.f165942a |= 8;
            byev4.f165946e = intValue4;
        }
        int i = 16;
        if (locationAttributesProto.mo71658p() != null) {
            int intValue5 = locationAttributesProto.mo71658p().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev5 = (byev) byep.f164949b;
            byev5.f165942a |= 16;
            byev5.f165947f = intValue5;
        }
        if (locationAttributesProto.mo71660r() != null) {
            int intValue6 = locationAttributesProto.mo71660r().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev6 = (byev) byep.f164949b;
            byev6.f165942a |= 32;
            byev6.f165948g = intValue6;
        }
        if (locationAttributesProto.mo71657o() != null) {
            int intValue7 = locationAttributesProto.mo71657o().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev7 = (byev) byep.f164949b;
            byev7.f165942a |= 64;
            byev7.f165949h = intValue7;
        }
        if (locationAttributesProto.mo71643c() != null) {
            double doubleValue = locationAttributesProto.mo71643c().doubleValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev8 = (byev) byep.f164949b;
            byev8.f165942a |= 128;
            byev8.f165950i = doubleValue;
        }
        if (locationAttributesProto.getFieldOfView() != null) {
            FieldOfView fieldOfView = locationAttributesProto.getFieldOfView();
            if (fieldOfView != null) {
                bxvd da = byem.f165919e.mo74144da();
                if (fieldOfView.mo71615b() != null) {
                    float floatValue = fieldOfView.mo71615b().floatValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byem byem2 = (byem) da.f164949b;
                    byem2.f165921a |= 1;
                    byem2.f165922b = floatValue;
                }
                if (fieldOfView.mo71616c() != null) {
                    float floatValue2 = fieldOfView.mo71616c().floatValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byem byem3 = (byem) da.f164949b;
                    byem3.f165921a |= 2;
                    byem3.f165923c = floatValue2;
                }
                if (fieldOfView.mo71617d() != null) {
                    int intValue8 = fieldOfView.mo71617d().intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byem byem4 = (byem) da.f164949b;
                    byem4.f165921a |= 4;
                    byem4.f165924d = intValue8;
                }
                byem = (byem) da.mo74062i();
            } else {
                byem = null;
            }
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev9 = (byev) byep.f164949b;
            byem.getClass();
            byev9.f165951j = byem;
            byev9.f165942a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (locationAttributesProto.mo71646f() != null) {
            String f = locationAttributesProto.mo71646f();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev10 = (byev) byep.f164949b;
            f.getClass();
            byev10.f165942a |= 512;
            byev10.f165952k = f;
        }
        char c6 = 13;
        if (locationAttributesProto.getActivityRecords() != null) {
            ArrayList activityRecords = locationAttributesProto.getActivityRecords();
            int size = activityRecords.size();
            int i2 = 0;
            while (i2 < size) {
                ActivityRecord activityRecord = (ActivityRecord) activityRecords.get(i2);
                if (activityRecord != null) {
                    bxvd da2 = byek.f165909d.mo74144da();
                    if (activityRecord.mo71461c() != null) {
                        String c7 = activityRecord.mo71461c();
                        switch (c7.hashCode()) {
                            case -2130108346:
                                if (c7.equals("IN_BUS")) {
                                    c5 = '*';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -2130108006:
                                if (c7.equals("IN_CAR")) {
                                    c5 = '(';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -2026200673:
                                if (c7.equals("RUNNING")) {
                                    c5 = 16;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1848623673:
                                if (c7.equals("IN_ROAD_VEHICLE")) {
                                    c5 = ' ';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1685420886:
                                if (c7.equals("ON_STAIRS")) {
                                    c5 = 24;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1584802318:
                                if (c7.equals("IN_VEHICLE")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1549857871:
                                if (c7.equals("offBody")) {
                                    c5 = 19;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1385863765:
                                if (c7.equals("sleeping")) {
                                    c5 = 31;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1314394107:
                                if (c7.equals("tilting")) {
                                    c5 = 11;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1312982983:
                                if (c7.equals("IN_RAIL_VEHICLE")) {
                                    c5 = '\"';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1272596344:
                                if (c7.equals("exitingVehicle")) {
                                    c5 = 13;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1121195300:
                                if (c7.equals("floorChange")) {
                                    c5 = 23;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1013348627:
                                if (c7.equals("onFoot")) {
                                    c5 = 5;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -866953016:
                                if (c7.equals("IN_TWO_WHEELER_VEHICLE")) {
                                    c5 = '$';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -801450141:
                                if (c7.equals("FLOOR_CHANGE")) {
                                    c5 = 22;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -788012149:
                                if (c7.equals("inTwoWheelerVehicle")) {
                                    c5 = '%';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -603236949:
                                if (c7.equals("SLEEPING")) {
                                    c5 = 30;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -596411419:
                                if (c7.equals("TILTING")) {
                                    c5 = 10;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -578681138:
                                if (c7.equals("ON_FOOT")) {
                                    c5 = 4;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -361826745:
                                if (c7.equals("inVehicle")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -346073805:
                                if (c7.equals("inElevator")) {
                                    c5 = 29;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -330673777:
                                if (c7.equals("inFourWheelerVehicle")) {
                                    c5 = '\'';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -284840886:
                                if (c7.equals("unknown")) {
                                    c5 = 9;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -122960505:
                                if (c7.equals("inRoadVehicle")) {
                                    c5 = '!';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 37630610:
                                if (c7.equals("OFF_BODY")) {
                                    c5 = 18;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 79227272:
                                if (c7.equals("STILL")) {
                                    c5 = 6;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 100313883:
                                if (c7.equals("inBus")) {
                                    c5 = '+';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 100314223:
                                if (c7.equals("inCar")) {
                                    c5 = ')';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 109765032:
                                if (c7.equals("still")) {
                                    c5 = 7;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 396389064:
                                if (c7.equals("IN_ELEVATOR")) {
                                    c5 = 28;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 433141802:
                                if (c7.equals("UNKNOWN")) {
                                    c5 = 8;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 678791076:
                                if (c7.equals("experimentalExtraPersonalVehicle")) {
                                    c5 = '-';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 821361846:
                                if (c7.equals("IN_FOUR_WHEELER_VEHICLE")) {
                                    c5 = '&';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 878250929:
                                if (c7.equals("EXITING_VEHICLE")) {
                                    c5 = 12;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 930367981:
                                if (c7.equals("TRUSTED_GAIT")) {
                                    c5 = 20;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1071255167:
                                if (c7.equals("ON_BICYCLE")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1072222643:
                                if (c7.equals("EXPERIMENTAL_EXTRA_PERSONAL_VEHICLE")) {
                                    c5 = ',';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1118815609:
                                if (c7.equals("walking")) {
                                    c5 = 15;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1207956119:
                                if (c7.equals("onEscalator")) {
                                    c5 = 27;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1218519584:
                                if (c7.equals("onBicycle")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1420771126:
                                if (c7.equals("ON_ESCALATOR")) {
                                    c5 = 26;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1477607708:
                                if (c7.equals("trustedGait")) {
                                    c5 = 21;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1505918217:
                                if (c7.equals("onStairs")) {
                                    c5 = 25;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1550783935:
                                if (c7.equals("running")) {
                                    c5 = 17;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1836798297:
                                if (c7.equals("WALKING")) {
                                    c5 = 14;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 2111075541:
                                if (c7.equals("inRailVehicle")) {
                                    c5 = '#';
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
                                byek byek = (byek) da2.f164949b;
                                byek.f165912b = 0;
                                byek.f165911a |= 1;
                                break;
                            case 2:
                            case 3:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek2 = (byek) da2.f164949b;
                                byek2.f165912b = 1;
                                byek2.f165911a |= 1;
                                break;
                            case 4:
                            case 5:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek3 = (byek) da2.f164949b;
                                byek3.f165912b = 2;
                                byek3.f165911a |= 1;
                                break;
                            case 6:
                            case 7:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek4 = (byek) da2.f164949b;
                                byek4.f165912b = 3;
                                byek4.f165911a |= 1;
                                break;
                            case 8:
                            case 9:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek5 = (byek) da2.f164949b;
                                byek5.f165912b = 4;
                                byek5.f165911a |= 1;
                                break;
                            case 10:
                            case 11:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek6 = (byek) da2.f164949b;
                                byek6.f165912b = 5;
                                byek6.f165911a |= 1;
                                break;
                            case 12:
                            case 13:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek7 = (byek) da2.f164949b;
                                byek7.f165912b = 6;
                                byek7.f165911a |= 1;
                                break;
                            case 14:
                            case 15:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek8 = (byek) da2.f164949b;
                                byek8.f165912b = 7;
                                byek8.f165911a |= 1;
                                break;
                            case 16:
                            case 17:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek9 = (byek) da2.f164949b;
                                byek9.f165912b = 8;
                                byek9.f165911a |= 1;
                                break;
                            case 18:
                            case 19:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek10 = (byek) da2.f164949b;
                                byek10.f165912b = 9;
                                byek10.f165911a |= 1;
                                break;
                            case 20:
                            case 21:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek11 = (byek) da2.f164949b;
                                byek11.f165912b = 10;
                                byek11.f165911a |= 1;
                                break;
                            case 22:
                            case 23:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek12 = (byek) da2.f164949b;
                                byek12.f165912b = 11;
                                byek12.f165911a |= 1;
                                break;
                            case 24:
                            case 25:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek13 = (byek) da2.f164949b;
                                byek13.f165912b = 12;
                                byek13.f165911a |= 1;
                                break;
                            case 26:
                            case 27:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek14 = (byek) da2.f164949b;
                                byek14.f165912b = 13;
                                byek14.f165911a |= 1;
                                break;
                            case 28:
                            case 29:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek15 = (byek) da2.f164949b;
                                byek15.f165912b = 14;
                                byek15.f165911a |= 1;
                                break;
                            case 30:
                            case 31:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek16 = (byek) da2.f164949b;
                                byek16.f165912b = 15;
                                byek16.f165911a |= 1;
                                break;
                            case ' ':
                            case '!':
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek17 = (byek) da2.f164949b;
                                byek17.f165912b = i;
                                byek17.f165911a |= 1;
                                break;
                            case '\"':
                            case '#':
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek18 = (byek) da2.f164949b;
                                byek18.f165912b = 17;
                                byek18.f165911a |= 1;
                                break;
                            case '$':
                            case FelicaException.TYPE_NOT_CLOSED:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek19 = (byek) da2.f164949b;
                                byek19.f165912b = 18;
                                byek19.f165911a |= 1;
                                break;
                            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                            case FelicaException.TYPE_USED_BY_OTHER_APP:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek20 = (byek) da2.f164949b;
                                byek20.f165912b = 19;
                                byek20.f165911a |= 1;
                                break;
                            case FelicaException.TYPE_PUSH_FAILED:
                            case ')':
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek21 = (byek) da2.f164949b;
                                byek21.f165912b = 20;
                                byek21.f165911a |= 1;
                                break;
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek22 = (byek) da2.f164949b;
                                byek22.f165912b = 21;
                                byek22.f165911a |= 1;
                                break;
                            case FelicaException.TYPE_RESET_FAILED:
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byek byek23 = (byek) da2.f164949b;
                                byek23.f165912b = -1000;
                                byek23.f165911a |= 1;
                                break;
                            default:
                                String valueOf = String.valueOf(activityRecord.mo71461c());
                                if (valueOf.length() == 0) {
                                    str5 = new String("Json2LiteBadEnum location.unified.ActivityRecord.type ");
                                } else {
                                    str5 = "Json2LiteBadEnum location.unified.ActivityRecord.type ".concat(valueOf);
                                }
                                throw new IllegalArgumentException(str5);
                        }
                    }
                    if (activityRecord.mo71460b() != null) {
                        int intValue9 = activityRecord.mo71460b().intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byek byek24 = (byek) da2.f164949b;
                        byek24.f165911a |= 2;
                        byek24.f165913c = intValue9;
                    }
                    byep.mo74348a((byek) da2.mo74062i());
                }
                i2++;
                i = 16;
            }
        }
        if (locationAttributesProto.mo71656n() != null) {
            String n = locationAttributesProto.mo71656n();
            switch (n.hashCode()) {
                case -1873550780:
                    if (n.equals("plmtypeEighth")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1838953819:
                    if (n.equals("plmtypeFourth")) {
                        c4 = 9;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1529650323:
                    if (n.equals("PLMTYPE_SEVENTH")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1476549377:
                    if (n.equals("plmtypeSecond")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1394497309:
                    if (n.equals("PLMTYPE_FIFTH")) {
                        c4 = 10;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1394485796:
                    if (n.equals("PLMTYPE_FIRST")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1387101453:
                    if (n.equals("PLMTYPE_NINTH")) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1382474238:
                    if (n.equals("PLMTYPE_SIXTH")) {
                        c4 = 12;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1381594989:
                    if (n.equals("PLMTYPE_THIRD")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -783327969:
                    if (n.equals("plmtypeUnknown")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -308354067:
                    if (n.equals("PLMTYPE_EIGHTH")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -273757106:
                    if (n.equals("PLMTYPE_FOURTH")) {
                        c4 = 8;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 88647336:
                    if (n.equals("PLMTYPE_SECOND")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 493129846:
                    if (n.equals("PLMTYPE_UNKNOWN")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1325959116:
                    if (n.equals("plmtypeFifth")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1325970629:
                    if (n.equals("plmtypeFirst")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1333354972:
                    if (n.equals("plmtypeNinth")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1337982187:
                    if (n.equals("plmtypeSixth")) {
                        c4 = 13;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1338861436:
                    if (n.equals("plmtypeThird")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1488859158:
                    if (n.equals("plmtypeSeventh")) {
                        c4 = 15;
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
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev11 = (byev) byep.f164949b;
                    byev11.f165954m = 0;
                    byev11.f165942a |= 1024;
                    break;
                case 2:
                case 3:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev12 = (byev) byep.f164949b;
                    byev12.f165954m = 1;
                    byev12.f165942a |= 1024;
                    break;
                case 4:
                case 5:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev13 = (byev) byep.f164949b;
                    byev13.f165954m = 2;
                    byev13.f165942a |= 1024;
                    break;
                case 6:
                case 7:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev14 = (byev) byep.f164949b;
                    byev14.f165954m = 3;
                    byev14.f165942a |= 1024;
                    break;
                case 8:
                case 9:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev15 = (byev) byep.f164949b;
                    byev15.f165954m = 4;
                    byev15.f165942a |= 1024;
                    break;
                case 10:
                case 11:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev16 = (byev) byep.f164949b;
                    byev16.f165954m = 5;
                    byev16.f165942a |= 1024;
                    break;
                case 12:
                case 13:
                    c = 7;
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev17 = (byev) byep.f164949b;
                    byev17.f165954m = 6;
                    byev17.f165942a |= 1024;
                    break;
                case 14:
                case 15:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev18 = (byev) byep.f164949b;
                    c = 7;
                    byev18.f165954m = 7;
                    byev18.f165942a |= 1024;
                    break;
                case 16:
                case 17:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev19 = (byev) byep.f164949b;
                    byev19.f165954m = 8;
                    byev19.f165942a |= 1024;
                    c = 7;
                    break;
                case 18:
                case 19:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev20 = (byev) byep.f164949b;
                    byev20.f165954m = 9;
                    byev20.f165942a |= 1024;
                    c = 7;
                    break;
                default:
                    String valueOf2 = String.valueOf(locationAttributesProto.mo71656n());
                    if (valueOf2.length() == 0) {
                        str4 = new String("Json2LiteBadEnum location.unified.LocationAttributesProto.plm_type ");
                    } else {
                        str4 = "Json2LiteBadEnum location.unified.LocationAttributesProto.plm_type ".concat(valueOf2);
                    }
                    throw new IllegalArgumentException(str4);
            }
        } else {
            c = 7;
        }
        if (locationAttributesProto.mo71652j() != null) {
            String j = locationAttributesProto.mo71652j();
            switch (j.hashCode()) {
                case -2141915202:
                    if (j.equals("INFERENCE_NONE")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -2066530115:
                    if (j.equals("INFERENCE_HULK_UNKNOWN")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -2044902723:
                    if (j.equals("INFERENCE_HULK_HEURISTIC")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -2016122120:
                    if (j.equals("inferenceHulkClassified")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1888645755:
                    if (j.equals("inferenceHulkUnknown")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1379479392:
                    if (j.equals("INFERENCE_HULK_CLASSIFIED")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -656987368:
                    if (j.equals("inferencePlm")) {
                        c3 = 9;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -69092213:
                    if (j.equals("INFERENCE_PLM")) {
                        c3 = 8;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1108171505:
                    if (j.equals("inferenceNone")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1398243717:
                    if (j.equals("inferenceHulkHeuristic")) {
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
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev21 = (byev) byep.f164949b;
                    byev21.f165955n = 0;
                    byev21.f165942a |= 2048;
                    break;
                case 2:
                case 3:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev22 = (byev) byep.f164949b;
                    byev22.f165955n = 1;
                    byev22.f165942a |= 2048;
                    break;
                case 4:
                case 5:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev23 = (byev) byep.f164949b;
                    byev23.f165955n = 2;
                    byev23.f165942a |= 2048;
                    break;
                case 6:
                case 7:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev24 = (byev) byep.f164949b;
                    byev24.f165955n = 3;
                    byev24.f165942a |= 2048;
                    break;
                case 8:
                case 9:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev25 = (byev) byep.f164949b;
                    byev25.f165955n = 4;
                    byev25.f165942a |= 2048;
                    break;
                default:
                    String valueOf3 = String.valueOf(locationAttributesProto.mo71652j());
                    if (valueOf3.length() == 0) {
                        str3 = new String("Json2LiteBadEnum location.unified.LocationAttributesProto.inference ");
                    } else {
                        str3 = "Json2LiteBadEnum location.unified.LocationAttributesProto.inference ".concat(valueOf3);
                    }
                    throw new IllegalArgumentException(str3);
            }
        }
        if (locationAttributesProto.mo71654l() != null) {
            String l = locationAttributesProto.mo71654l();
            switch (l.hashCode()) {
                case -2110987623:
                    if (l.equals("MANUAL_ENTRY")) {
                        c6 = 4;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1521288610:
                    if (l.equals("manualEntryUnknown")) {
                        c6 = 3;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1425722082:
                    if (l.equals("MANUAL_ENTRY_NONE")) {
                        c6 = 0;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1423465491:
                    if (l.equals("MANUAL_ENTRY_HIGH_LEVEL")) {
                        c6 = 8;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1401734748:
                    if (l.equals("manualEntryNone")) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1242957229:
                    if (l.equals("MANUAL_ENTRY_STALE")) {
                        c6 = 10;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1199395920:
                    if (l.equals("MANUAL_ENTRY_DROPPED_PIN")) {
                        c6 = 6;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -499349843:
                    if (l.equals("manualEntryStale")) {
                        c6 = 11;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -409664081:
                    break;
                case -334685108:
                    if (l.equals("manualEntry")) {
                        c6 = 5;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 359908129:
                    if (l.equals("manualEntryDroppedPin")) {
                        c6 = 7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 768810006:
                    if (l.equals("manualEntryHighLevel")) {
                        c6 = 9;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1131550852:
                    if (l.equals("MANUAL_ENTRY_UNKNOWN")) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 2007392872:
                    if (l.equals("MANUAL_ENTRY_INSUFFICIENT_LOCATIONS")) {
                        c6 = 12;
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
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev26 = (byev) byep.f164949b;
                    byev26.f165956o = 0;
                    byev26.f165942a |= 4096;
                    break;
                case 2:
                case 3:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev27 = (byev) byep.f164949b;
                    byev27.f165956o = 1;
                    byev27.f165942a |= 4096;
                    break;
                case 4:
                case 5:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev28 = (byev) byep.f164949b;
                    byev28.f165956o = 2;
                    byev28.f165942a |= 4096;
                    break;
                case 6:
                case 7:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev29 = (byev) byep.f164949b;
                    byev29.f165956o = 3;
                    byev29.f165942a |= 4096;
                    break;
                case 8:
                case 9:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev30 = (byev) byep.f164949b;
                    byev30.f165956o = 4;
                    byev30.f165942a |= 4096;
                    break;
                case 10:
                case 11:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev31 = (byev) byep.f164949b;
                    byev31.f165956o = 5;
                    byev31.f165942a |= 4096;
                    break;
                case 12:
                case 13:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev32 = (byev) byep.f164949b;
                    byev32.f165956o = 6;
                    byev32.f165942a |= 4096;
                    break;
                default:
                    String valueOf4 = String.valueOf(locationAttributesProto.mo71654l());
                    if (valueOf4.length() == 0) {
                        str2 = new String("Json2LiteBadEnum location.unified.LocationAttributesProto.manual_entry ");
                    } else {
                        str2 = "Json2LiteBadEnum location.unified.LocationAttributesProto.manual_entry ".concat(valueOf4);
                    }
                    throw new IllegalArgumentException(str2);
            }
        }
        if (locationAttributesProto.mo71662t() != null) {
            float floatValue3 = locationAttributesProto.mo71662t().floatValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev33 = (byev) byep.f164949b;
            byev33.f165942a |= 8192;
            byev33.f165957p = floatValue3;
        }
        if (locationAttributesProto.mo71653k() != null) {
            float floatValue4 = locationAttributesProto.mo71653k().floatValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev34 = (byev) byep.f164949b;
            byev34.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            byev34.f165958q = floatValue4;
        }
        if (locationAttributesProto.mo71647g() != null) {
            String g = locationAttributesProto.mo71647g();
            switch (g.hashCode()) {
                case -1086874687:
                    if (g.equals("carrierIpMobile")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -843447029:
                    if (g.equals("carrierIpUnknown")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -641669613:
                    if (g.equals("CARRIER_IP_MOBILE")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -367543685:
                    if (g.equals("CARRIER_IP_NOT_CARRIER")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 73008345:
                    if (g.equals("CARRIER_IP_UNKNOWN")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 883616836:
                    if (g.equals("carrierIpNotCarrier")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0 || c2 == 1) {
                if (byep.f164950c) {
                    byep.mo74035c();
                    byep.f164950c = false;
                }
                byev byev35 = (byev) byep.f164949b;
                byev35.f165959r = 0;
                byev35.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            } else if (c2 == 2 || c2 == 3) {
                if (byep.f164950c) {
                    byep.mo74035c();
                    byep.f164950c = false;
                }
                byev byev36 = (byev) byep.f164949b;
                byev36.f165959r = 1;
                byev36.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            } else {
                if (c2 != 4) {
                    if (c2 != 5) {
                        String valueOf5 = String.valueOf(locationAttributesProto.mo71647g());
                        throw new IllegalArgumentException(valueOf5.length() == 0 ? new String("Json2LiteBadEnum location.unified.LocationAttributesProto.carrier_ip_type ") : "Json2LiteBadEnum location.unified.LocationAttributesProto.carrier_ip_type ".concat(valueOf5));
                    }
                }
                if (byep.f164950c) {
                    byep.mo74035c();
                    byep.f164950c = false;
                }
                byev byev37 = (byev) byep.f164949b;
                byev37.f165959r = 2;
                byev37.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            }
        }
        if (locationAttributesProto.mo71642b() != null) {
            float floatValue5 = locationAttributesProto.mo71642b().floatValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev38 = (byev) byep.f164949b;
            byev38.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            byev38.f165960s = floatValue5;
        }
        if (locationAttributesProto.mo71661s() != null) {
            String s = locationAttributesProto.mo71661s();
            switch (s.hashCode()) {
                case -1407034120:
                    if (s.equals("VIEWPORT_SEARCH_OPTIONS_UNSPECIFIED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -641385996:
                    if (s.equals("VIEWPORT_SEARCH_OPTIONS_FILTER_ONLY")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -479292596:
                    if (s.equals("VIEWPORT_SEARCH_OPTIONS_AROUND")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -30224468:
                    if (s.equals("viewportSearchOptionsRestrict")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -14606213:
                    if (s.equals("VIEWPORT_SEARCH_OPTIONS_RESTRICT")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 763132980:
                    break;
                case 974518272:
                    if (s.equals("VIEWPORT_SEARCH_OPTIONS_FORCE_AROUND")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 1460998215:
                    if (s.equals("viewportSearchOptionsUnspecified")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1554208445:
                    if (s.equals("viewportSearchOptionsAround")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2109908392:
                    if (s.equals("viewportSearchOptionsForceAround")) {
                        c = 9;
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
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev39 = (byev) byep.f164949b;
                    byev39.f165961t = 0;
                    byev39.f165942a = 131072 | byev39.f165942a;
                    break;
                case 2:
                case 3:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev40 = (byev) byep.f164949b;
                    byev40.f165961t = 1;
                    byev40.f165942a = 131072 | byev40.f165942a;
                    break;
                case 4:
                case 5:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev41 = (byev) byep.f164949b;
                    byev41.f165961t = 2;
                    byev41.f165942a = 131072 | byev41.f165942a;
                    break;
                case 6:
                case 7:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev42 = (byev) byep.f164949b;
                    byev42.f165961t = 3;
                    byev42.f165942a = 131072 | byev42.f165942a;
                    break;
                case 8:
                case 9:
                    if (byep.f164950c) {
                        byep.mo74035c();
                        byep.f164950c = false;
                    }
                    byev byev43 = (byev) byep.f164949b;
                    byev43.f165961t = 4;
                    byev43.f165942a = 131072 | byev43.f165942a;
                    break;
                default:
                    String valueOf6 = String.valueOf(locationAttributesProto.mo71661s());
                    if (valueOf6.length() == 0) {
                        str = new String("Json2LiteBadEnum location.unified.LocationAttributesProto.viewport_search_options ");
                    } else {
                        str = "Json2LiteBadEnum location.unified.LocationAttributesProto.viewport_search_options ".concat(valueOf6);
                    }
                    throw new IllegalArgumentException(str);
            }
        }
        if (locationAttributesProto.mo71650h() != null) {
            float floatValue6 = locationAttributesProto.mo71650h().floatValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev44 = (byev) byep.f164949b;
            byev44.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            byev44.f165962u = floatValue6;
        }
        if (locationAttributesProto.mo71655m() != null) {
            int intValue10 = locationAttributesProto.mo71655m().intValue();
            if (byep.f164950c) {
                byep.mo74035c();
                byep.f164950c = false;
            }
            byev byev45 = (byev) byep.f164949b;
            byev45.f165942a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            byev45.f165963v = intValue10;
        }
        return (byev) byep.mo74062i();
    }
}
