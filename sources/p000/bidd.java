package p000;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.userlocation.PlaceEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: bidd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidd {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0388 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x038b A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x038f A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0392 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0396 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0399 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x039d A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03a1 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03a5 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03a9 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03ad A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03b1 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03b5 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03b9 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03bd A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03c1 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03c5 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03c9 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03cc A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03cf A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03d2 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03d5 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03d8 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03db A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x03de A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03e1 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03e4 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03e7 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03ea A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03ed A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x03f0 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x03f2 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03f5 A[Catch:{ IllegalArgumentException -> 0x03fb }] */
    /* renamed from: a */
    public static aela m101995a(avwf avwf, boolean z) {
        Bundle bundle;
        int i;
        char c;
        List list = avwf.f94014a.f109577f;
        HashMap hashMap = new HashMap();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlaceEstimate placeEstimate = (PlaceEstimate) list.get(i2);
            String str = placeEstimate.f109563b;
            String str2 = placeEstimate.f109565d;
            if (str2 != null) {
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str2)).add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PlaceEstimate placeEstimate2 = (PlaceEstimate) list.get(i3);
            String str3 = placeEstimate2.f109563b;
            String str4 = placeEstimate2.f109567f;
            int i4 = 5;
            try {
                String upperCase = str4.toUpperCase(Locale.US);
                switch (upperCase.hashCode()) {
                    case -2133131170:
                        if (upperCase.equals("SERVICES")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2070287508:
                        if (upperCase.equals("EMERGENCY_SERVICES")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2056856391:
                        if (upperCase.equals("PRODUCTION")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2009481710:
                        if (upperCase.equals("MUSEUM")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1874876554:
                        if (upperCase.equals("PROFESSIONAL_SERVICES")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1799129208:
                        if (upperCase.equals("EDUCATION")) {
                            c = 13;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1740549496:
                        if (upperCase.equals("TRANSIT_STATION")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1433764466:
                        if (upperCase.equals("GAS_STATION")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1287375043:
                        if (upperCase.equals("RESTAURANT")) {
                            c = 9;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1179629603:
                        if (upperCase.equals("STADIUM")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1105543472:
                        if (upperCase.equals("INDOOR_LODGING")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1065450959:
                        if (upperCase.equals("ASSOCIATION_OR_ORGANIZATION")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -999706252:
                        if (upperCase.equals("PUBLIC_SERVICES")) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case -894356301:
                        if (upperCase.equals("PHARMACY")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -833971400:
                        if (upperCase.equals("LANDMARK")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case -773714870:
                        if (upperCase.equals("EVENT_VENUE")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -385085615:
                        if (upperCase.equals("ENTERTAINMENT_AND_RECREATION")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -343723391:
                        if (upperCase.equals("BUS_STOP")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -287115508:
                        if (upperCase.equals("SHOPPING_CENTER")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -273684309:
                        if (upperCase.equals("AIRPORT")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -208715283:
                        if (upperCase.equals("WHOLESALE_GROCER")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -141928716:
                        if (upperCase.equals("NIGHTLIFE")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case -64738588:
                        if (upperCase.equals("NATURE_PRESERVE")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 65146:
                        if (upperCase.equals("ATM")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 65523:
                        if (upperCase.equals("BAR")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 71067:
                        if (upperCase.equals("GYM")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2031164:
                        if (upperCase.equals("BANK")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2060701:
                        if (upperCase.equals("CAFE")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2448362:
                        if (upperCase.equals("PARK")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62540519:
                        if (upperCase.equals("ARENA")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 75532016:
                        if (upperCase.equals("OTHER")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 79233217:
                        if (upperCase.equals("STORE")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 201865848:
                        if (upperCase.equals("CAR_REPAIR")) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case 231355088:
                        if (upperCase.equals("AMUSEMENT_PARK")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 464692167:
                        if (upperCase.equals("MONUMENT")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 474306890:
                        if (upperCase.equals("CLOTHING_STORE")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 478998074:
                        if (upperCase.equals("HOSPITAL")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case 556625165:
                        if (upperCase.equals("REAL_ESTATE")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 662588263:
                        if (upperCase.equals("ATTRACTION")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 676684226:
                        if (upperCase.equals("MOVIE_THEATER")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1136324006:
                        if (upperCase.equals("PLACE_OF_WORSHIP")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1230821159:
                        if (upperCase.equals("HISTORIC_SITE")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1263663902:
                        if (upperCase.equals("FORTRESS")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1336748448:
                        if (upperCase.equals("FOOD_STORE")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1386153741:
                        if (upperCase.equals("HISTORICAL_LANDMARK")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1440722907:
                        if (upperCase.equals("FAST_FOOD_RESTAURANT")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1661418246:
                        if (upperCase.equals("OUTLET_MALL")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1839456654:
                        if (upperCase.equals("CULTURE")) {
                            c = 12;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951856096:
                        if (upperCase.equals("BAKERY")) {
                            c = 10;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1955267708:
                        if (upperCase.equals("BEAUTY")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2127033948:
                        if (upperCase.equals("HEALTH")) {
                            c = '\"';
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
                        i4 = 1;
                        switch (i4 - 1) {
                            case 1:
                                i = 2;
                                break;
                            case 2:
                            case 4:
                            case 11:
                            case 12:
                            case 14:
                            case 28:
                            case 29:
                            case 32:
                            case FelicaException.TYPE_RESET_FAILED:
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                i = 34;
                                break;
                            case 3:
                                i = 6;
                                break;
                            case 5:
                                i = 8;
                                break;
                            case 6:
                                i = 9;
                                break;
                            case 7:
                                i = 10;
                                break;
                            case 8:
                                i = 14;
                                break;
                            case 9:
                                i = 15;
                                break;
                            case 10:
                                i = 25;
                                break;
                            case 13:
                            case 20:
                                i = 50;
                                break;
                            case 15:
                            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                            case 47:
                                i = 86;
                                break;
                            case 16:
                            case 27:
                                i = 43;
                                break;
                            case 17:
                                i = 41;
                                break;
                            case 18:
                                i = 44;
                                break;
                            case 19:
                                i = 47;
                                break;
                            case 21:
                                i = 59;
                                break;
                            case 22:
                                i = 64;
                                break;
                            case 23:
                                i = 67;
                                break;
                            case 24:
                                i = 69;
                                break;
                            case 25:
                                i = 72;
                                break;
                            case 26:
                                i = 74;
                                break;
                            case 30:
                                i = 78;
                                break;
                            case 31:
                            case 50:
                                i = 79;
                                break;
                            case 33:
                            case FelicaException.TYPE_USED_BY_OTHER_APP:
                                i = 84;
                                break;
                            case 34:
                                i = 88;
                                break;
                            case 35:
                                i = 1030;
                                break;
                            case 36:
                                i = 19;
                                break;
                            case FelicaException.TYPE_NOT_CLOSED:
                                i = 38;
                                break;
                            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                i = 7;
                                break;
                            case FelicaException.TYPE_PUSH_FAILED:
                            case 41:
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                i = 1013;
                                break;
                            case 48:
                                i = 3;
                                break;
                            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                i = 66;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    case 1:
                        i4 = 2;
                        switch (i4 - 1) {
                        }
                    case 2:
                        i4 = 9;
                        switch (i4 - 1) {
                        }
                    case 3:
                        i4 = 36;
                        switch (i4 - 1) {
                        }
                    case 4:
                        i4 = 3;
                        switch (i4 - 1) {
                        }
                    case 5:
                        i4 = 4;
                        switch (i4 - 1) {
                        }
                    case 6:
                        i4 = 6;
                        switch (i4 - 1) {
                        }
                    case 7:
                        i4 = 7;
                        switch (i4 - 1) {
                        }
                    case 8:
                        i4 = 10;
                        switch (i4 - 1) {
                        }
                    case 9:
                        i4 = 32;
                        switch (i4 - 1) {
                        }
                    case 10:
                        i4 = 39;
                        switch (i4 - 1) {
                        }
                    case 11:
                        i4 = 51;
                        switch (i4 - 1) {
                        }
                    case 12:
                        i4 = 12;
                        switch (i4 - 1) {
                        }
                    case 13:
                        i4 = 13;
                        switch (i4 - 1) {
                        }
                    case 14:
                        i4 = 45;
                        switch (i4 - 1) {
                        }
                    case 15:
                        i4 = 46;
                        switch (i4 - 1) {
                        }
                    case 16:
                        i4 = 50;
                        switch (i4 - 1) {
                        }
                    case 17:
                        switch (i4 - 1) {
                        }
                    case 18:
                        i4 = 23;
                        switch (i4 - 1) {
                        }
                    case 19:
                        i4 = 25;
                        switch (i4 - 1) {
                        }
                    case 20:
                        i4 = 27;
                        switch (i4 - 1) {
                        }
                    case 21:
                        i4 = 15;
                        switch (i4 - 1) {
                        }
                    case 22:
                        i4 = 24;
                        switch (i4 - 1) {
                        }
                    case 23:
                        i4 = 49;
                        switch (i4 - 1) {
                        }
                    case 24:
                        i4 = 16;
                        switch (i4 - 1) {
                        }
                    case 25:
                        i4 = 47;
                        switch (i4 - 1) {
                        }
                    case 26:
                        i4 = 48;
                        switch (i4 - 1) {
                        }
                    case 27:
                        i4 = 11;
                        switch (i4 - 1) {
                        }
                    case 28:
                        i4 = 17;
                        switch (i4 - 1) {
                        }
                    case 29:
                        i4 = 35;
                        switch (i4 - 1) {
                        }
                    case 30:
                        i4 = 34;
                        switch (i4 - 1) {
                        }
                    case 31:
                        i4 = 38;
                        switch (i4 - 1) {
                        }
                    case ' ':
                        i4 = 40;
                        switch (i4 - 1) {
                        }
                    case '!':
                        i4 = 8;
                        switch (i4 - 1) {
                        }
                    case '\"':
                        i4 = 20;
                        switch (i4 - 1) {
                        }
                    case '#':
                        i4 = 19;
                        switch (i4 - 1) {
                        }
                    case '$':
                        i4 = 26;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_NOT_CLOSED:
                        i4 = 14;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        i4 = 21;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        i4 = 18;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_PUSH_FAILED:
                        i4 = 22;
                        switch (i4 - 1) {
                        }
                    case ')':
                        i4 = 28;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                        i4 = 33;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                        i4 = 29;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_RESET_FAILED:
                        i4 = 30;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        i4 = 31;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                        i4 = 37;
                        switch (i4 - 1) {
                        }
                    case '/':
                        i4 = 41;
                        switch (i4 - 1) {
                        }
                    case '0':
                        i4 = 42;
                        switch (i4 - 1) {
                        }
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        i4 = 43;
                        switch (i4 - 1) {
                        }
                    case '2':
                        i4 = 44;
                        switch (i4 - 1) {
                        }
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                if (Log.isLoggable("Places", 5)) {
                    String valueOf = String.valueOf(str4);
                    Log.w("Places", valueOf.length() == 0 ? new String("Unable to find category ID for category ") : "Unable to find category ID for category ".concat(valueOf));
                }
                i = 0;
            }
            PlaceEntity a = bhpz.m101304a(str3, 0.0d, 0.0d, Collections.singletonList(Integer.valueOf(i)));
            List arrayList2 = new ArrayList();
            if (hashMap.containsKey(placeEstimate2.f109563b)) {
                arrayList2 = (List) hashMap.get(placeEstimate2.f109563b);
            }
            arrayList.add(HierarchicalPlaceLikelihoodEntity.m66931a(a, placeEstimate2.f109568g, placeEstimate2.f109564c, placeEstimate2.f109566e, arrayList2));
        }
        if (!z) {
            Collections.sort(arrayList, bidc.f120287a);
        }
        rtu a2 = DataHolder.m22537a(aeok.f63573b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size3 = arrayList.size();
        for (int i5 = 0; i5 < size3; i5++) {
            HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) arrayList.get(i5);
            ContentValues s = hierarchicalPlaceLikelihoodEntity.f79528b.mo43688s();
            s.put("place_likelihood", Float.valueOf(hierarchicalPlaceLikelihoodEntity.f79529c));
            s.put("place_hierarchy_likelihood", Float.valueOf(hierarchicalPlaceLikelihoodEntity.f79530d));
            s.put("place_hierarchy_level", Integer.valueOf(hierarchicalPlaceLikelihoodEntity.f79531e));
            s.put("place_contained_place_ids", rtr.m34418c(hierarchicalPlaceLikelihoodEntity.f79532f));
            s.put("data", sef.m35074a(hierarchicalPlaceLikelihoodEntity));
            a2.mo25160a(s);
            linkedHashSet.addAll(hierarchicalPlaceLikelihoodEntity.f79528b.f79548n);
        }
        String a3 = aemu.m52174a(linkedHashSet);
        if (!TextUtils.isEmpty(a3)) {
            bundle = new Bundle();
            aelr.m52132a(bundle, a3);
        } else {
            bundle = null;
        }
        return new aela(a2.mo25164a(0, bundle), false, ErrorInfo.TYPE_SDU_MEMORY_FULL);
    }
}
