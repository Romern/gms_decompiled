package p000;

import com.google.android.ulr.ApiActivityTransitionEventRecord;

/* renamed from: bjci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjci {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvvr m103192a(ApiActivityTransitionEventRecord apiActivityTransitionEventRecord) {
        char c;
        char c2;
        String str;
        if (apiActivityTransitionEventRecord == null) {
            return null;
        }
        bxvd da = bvvr.f157835e.mo74144da();
        if (apiActivityTransitionEventRecord.mo71479b() != null) {
            String b = apiActivityTransitionEventRecord.mo71479b();
            switch (b.hashCode()) {
                case -2130108346:
                    if (b.equals("IN_BUS")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2130108006:
                    if (b.equals("IN_CAR")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2026200673:
                    if (b.equals("RUNNING")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1848623673:
                    if (b.equals("IN_ROAD_VEHICLE")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1584802318:
                    if (b.equals("IN_VEHICLE")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1314394107:
                    if (b.equals("tilting")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1312982983:
                    if (b.equals("IN_RAIL_VEHICLE")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1272596344:
                    if (b.equals("exitingVehicle")) {
                        c2 = 13;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1013348627:
                    if (b.equals("onFoot")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -866953016:
                    if (b.equals("IN_TWO_WHEELER_VEHICLE")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -788012149:
                    if (b.equals("inTwoWheelerVehicle")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -596411419:
                    if (b.equals("TILTING")) {
                        c2 = 10;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -578681138:
                    if (b.equals("ON_FOOT")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -361826745:
                    if (b.equals("inVehicle")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -330673777:
                    if (b.equals("inFourWheelerVehicle")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -284840886:
                    if (b.equals("unknown")) {
                        c2 = 9;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -122960505:
                    if (b.equals("inRoadVehicle")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 79227272:
                    if (b.equals("STILL")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100313883:
                    if (b.equals("inBus")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100314223:
                    if (b.equals("inCar")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109765032:
                    if (b.equals("still")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 433141802:
                    if (b.equals("UNKNOWN")) {
                        c2 = 8;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 821361846:
                    if (b.equals("IN_FOUR_WHEELER_VEHICLE")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 878250929:
                    if (b.equals("EXITING_VEHICLE")) {
                        c2 = 12;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1071255167:
                    if (b.equals("ON_BICYCLE")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1118815609:
                    if (b.equals("walking")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1218519584:
                    if (b.equals("onBicycle")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1550783935:
                    if (b.equals("running")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1836798297:
                    if (b.equals("WALKING")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2111075541:
                    if (b.equals("inRailVehicle")) {
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
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr = (bvvr) da.f164949b;
                    bvvr.f157838b = 0;
                    bvvr.f157837a |= 1;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr2 = (bvvr) da.f164949b;
                    bvvr2.f157838b = 1;
                    bvvr2.f157837a |= 1;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr3 = (bvvr) da.f164949b;
                    bvvr3.f157838b = 2;
                    bvvr3.f157837a |= 1;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr4 = (bvvr) da.f164949b;
                    bvvr4.f157838b = 3;
                    bvvr4.f157837a |= 1;
                    break;
                case 8:
                case 9:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr5 = (bvvr) da.f164949b;
                    bvvr5.f157838b = 4;
                    bvvr5.f157837a |= 1;
                    break;
                case 10:
                case 11:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr6 = (bvvr) da.f164949b;
                    bvvr6.f157838b = 5;
                    bvvr6.f157837a |= 1;
                    break;
                case 12:
                case 13:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr7 = (bvvr) da.f164949b;
                    bvvr7.f157838b = 6;
                    bvvr7.f157837a |= 1;
                    break;
                case 14:
                case 15:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr8 = (bvvr) da.f164949b;
                    bvvr8.f157838b = 7;
                    bvvr8.f157837a |= 1;
                    break;
                case 16:
                case 17:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr9 = (bvvr) da.f164949b;
                    bvvr9.f157838b = 8;
                    bvvr9.f157837a |= 1;
                    break;
                case 18:
                case 19:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr10 = (bvvr) da.f164949b;
                    bvvr10.f157838b = 9;
                    bvvr10.f157837a |= 1;
                    break;
                case 20:
                case 21:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr11 = (bvvr) da.f164949b;
                    bvvr11.f157838b = 10;
                    bvvr11.f157837a |= 1;
                    break;
                case 22:
                case 23:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr12 = (bvvr) da.f164949b;
                    bvvr12.f157838b = 11;
                    bvvr12.f157837a |= 1;
                    break;
                case 24:
                case 25:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr13 = (bvvr) da.f164949b;
                    bvvr13.f157838b = 12;
                    bvvr13.f157837a |= 1;
                    break;
                case 26:
                case 27:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr14 = (bvvr) da.f164949b;
                    bvvr14.f157838b = 13;
                    bvvr14.f157837a |= 1;
                    break;
                case 28:
                case 29:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvvr bvvr15 = (bvvr) da.f164949b;
                    bvvr15.f157838b = 14;
                    bvvr15.f157837a |= 1;
                    break;
                default:
                    String valueOf = String.valueOf(apiActivityTransitionEventRecord.mo71479b());
                    if (valueOf.length() == 0) {
                        str = new String("Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.activity_type ");
                    } else {
                        str = "Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.activity_type ".concat(valueOf);
                    }
                    throw new IllegalArgumentException(str);
            }
        }
        if (apiActivityTransitionEventRecord.mo71481d() != null) {
            String d = apiActivityTransitionEventRecord.mo71481d();
            switch (d.hashCode()) {
                case -1483548520:
                    if (d.equals("ACTIVITY_TRANSITION_EXIT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1107616908:
                    if (d.equals("activityTransitionEnter")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -728456958:
                    if (d.equals("activityTransitionExit")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1254348414:
                    if (d.equals("ACTIVITY_TRANSITION_ENTER")) {
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
                bvvr bvvr16 = (bvvr) da.f164949b;
                bvvr16.f157839c = 0;
                bvvr16.f157837a |= 2;
            } else if (c == 2 || c == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvvr bvvr17 = (bvvr) da.f164949b;
                bvvr17.f157839c = 1;
                bvvr17.f157837a |= 2;
            } else {
                String valueOf2 = String.valueOf(apiActivityTransitionEventRecord.mo71481d());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.type ") : "Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.type ".concat(valueOf2));
            }
        }
        if (apiActivityTransitionEventRecord.mo71480c() != null) {
            long longValue = apiActivityTransitionEventRecord.mo71480c().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvvr bvvr18 = (bvvr) da.f164949b;
            bvvr18.f157837a = 4 | bvvr18.f157837a;
            bvvr18.f157840d = longValue;
        }
        return (bvvr) da.mo74062i();
    }
}
