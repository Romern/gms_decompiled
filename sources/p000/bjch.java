package p000;

import com.google.android.ulr.ApiActivationChange;
import java.util.ArrayList;

/* renamed from: bjch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjch {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvvl m103191a(ApiActivationChange apiActivationChange) {
        Object obj;
        bvvg bvvg;
        bvvg bvvg2;
        char c;
        int i;
        int i2;
        String str;
        Object obj2;
        bvvg bvvg3;
        char c2;
        Object obj3;
        String str2;
        ArrayList arrayList;
        bvvg bvvg4;
        char c3;
        Object obj4;
        String str3;
        if (apiActivationChange == null) {
            return null;
        }
        ArrayList d = apiActivationChange.mo71464d();
        String str4 = "UNSUPPORTED_GEO";
        bvvg bvvg5 = (bvvg) bvvl.f157808e.mo74144da();
        Object obj5 = "restrictedProfile";
        Object obj6 = "invalidAccount";
        Object obj7 = "LOCATION_DISABLED";
        if (d != null) {
            ArrayList d2 = apiActivationChange.mo71464d();
            int size = d2.size();
            obj = "UNSUPPORTED_OS";
            int i3 = 0;
            while (i3 < size) {
                int i4 = size;
                String str5 = (String) d2.get(i3);
                if (str5 == null) {
                    arrayList = d2;
                    bvvg4 = bvvg5;
                } else {
                    switch (str5.hashCode()) {
                        case -2047236154:
                            arrayList = d2;
                            obj4 = obj7;
                            if (str5.equals(obj4)) {
                                c3 = 20;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1495442378:
                            arrayList = d2;
                            Object obj8 = obj6;
                            if (!str5.equals(obj8)) {
                                obj6 = obj8;
                                obj4 = obj7;
                                c3 = 65535;
                                break;
                            } else {
                                obj6 = obj8;
                                obj4 = obj7;
                                c3 = 11;
                                break;
                            }
                        case -1477702450:
                            arrayList = d2;
                            Object obj9 = obj5;
                            if (!str5.equals(obj9)) {
                                obj5 = obj9;
                                obj4 = obj7;
                                c3 = 65535;
                                break;
                            } else {
                                obj5 = obj9;
                                obj4 = obj7;
                                c3 = 19;
                                break;
                            }
                        case -655522738:
                            arrayList = d2;
                            Object obj10 = obj;
                            if (!str5.equals(obj10)) {
                                obj = obj10;
                                obj4 = obj7;
                                c3 = 65535;
                                break;
                            } else {
                                obj = obj10;
                                obj4 = obj7;
                                c3 = 2;
                                break;
                            }
                        case -635929565:
                            arrayList = d2;
                            if (str5.equals("locationDisabledForGoogleApps")) {
                                obj4 = obj7;
                                c3 = 9;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case -569297775:
                            arrayList = d2;
                            if (str5.equals("AUTH_ERROR")) {
                                obj4 = obj7;
                                c3 = 16;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case -545586021:
                            arrayList = d2;
                            if (str5.equals("INDETERMINATE")) {
                                obj4 = obj7;
                                c3 = 22;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case -504990983:
                            arrayList = d2;
                            if (str5.equals("unsupportedOs")) {
                                obj4 = obj7;
                                c3 = 3;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case -284840886:
                            arrayList = d2;
                            if (str5.equals("unknown")) {
                                obj4 = obj7;
                                c3 = 1;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case -43789238:
                            arrayList = d2;
                            if (str5.equals("deferringToGmm")) {
                                obj4 = obj7;
                                c3 = 5;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 403309407:
                            arrayList = d2;
                            if (str5.equals("accountRestriction")) {
                                obj4 = obj7;
                                c3 = 15;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 433141802:
                            arrayList = d2;
                            if (str5.equals("UNKNOWN")) {
                                obj4 = obj7;
                                c3 = 0;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 463714641:
                            arrayList = d2;
                            if (str5.equals("locationDisabled")) {
                                obj4 = obj7;
                                c3 = 21;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 633138363:
                            arrayList = d2;
                            if (str5.equals("indeterminate")) {
                                obj4 = obj7;
                                c3 = 23;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 831244992:
                            arrayList = d2;
                            if (str5.equals("DEFERRING_TO_GMM")) {
                                obj4 = obj7;
                                c3 = 4;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 896955301:
                            arrayList = d2;
                            if (str5.equals("INVALID_ACCOUNT")) {
                                obj4 = obj7;
                                c3 = 10;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1153623559:
                            arrayList = d2;
                            if (str5.equals(str4)) {
                                obj4 = obj7;
                                c3 = 6;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1267298426:
                            arrayList = d2;
                            if (str5.equals("ACCOUNT_RESTRICTION")) {
                                obj4 = obj7;
                                c3 = 14;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1354633129:
                            arrayList = d2;
                            if (str5.equals("LOCATION_DISABLED_FOR_GOOGLE_APPS")) {
                                obj4 = obj7;
                                c3 = 8;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1436831040:
                            arrayList = d2;
                            if (str5.equals("authError")) {
                                obj4 = obj7;
                                c3 = 17;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1525140700:
                            arrayList = d2;
                            if (str5.equals("unsupportedGeo")) {
                                obj4 = obj7;
                                c3 = 7;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1822434725:
                            arrayList = d2;
                            if (str5.equals("RESTRICTED_PROFILE")) {
                                obj4 = obj7;
                                c3 = 18;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1873180092:
                            arrayList = d2;
                            if (str5.equals("reportingNotEnabled")) {
                                obj4 = obj7;
                                c3 = 13;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        case 1892030692:
                            arrayList = d2;
                            if (str5.equals("REPORTING_NOT_ENABLED")) {
                                obj4 = obj7;
                                c3 = 12;
                                break;
                            }
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                        default:
                            arrayList = d2;
                            obj4 = obj7;
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 1:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.UNKNOWN);
                            continue;
                        case 2:
                        case 3:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.UNSUPPORTED_OS);
                            continue;
                        case 4:
                        case 5:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.DEFERRING_TO_GMM);
                            continue;
                        case 6:
                        case 7:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.UNSUPPORTED_GEO);
                            continue;
                        case 8:
                        case 9:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.LOCATION_DISABLED_FOR_GOOGLE_APPS);
                            continue;
                        case 10:
                        case 11:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.INVALID_ACCOUNT);
                            continue;
                        case 12:
                        case 13:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.REPORTING_NOT_ENABLED);
                            continue;
                        case 14:
                        case 15:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.ACCOUNT_RESTRICTION);
                            continue;
                        case 16:
                        case 17:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.AUTH_ERROR);
                            continue;
                        case 18:
                        case 19:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.RESTRICTED_PROFILE);
                            continue;
                        case 20:
                        case 21:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.LOCATION_DISABLED);
                            continue;
                        case 22:
                        case 23:
                            obj7 = obj4;
                            bvvg4 = bvvg5;
                            bvvg4.mo73389b(bvvk.INDETERMINATE);
                            continue;
                        default:
                            if (str5.length() == 0) {
                                str3 = new String("Json2LiteBadEnum userlocation.ApiActivationChange.old_reason ");
                            } else {
                                str3 = "Json2LiteBadEnum userlocation.ApiActivationChange.old_reason ".concat(str5);
                            }
                            throw new IllegalArgumentException(str3);
                    }
                }
                i3++;
                bvvg5 = bvvg4;
                d2 = arrayList;
                size = i4;
            }
            bvvg = bvvg5;
        } else {
            obj = "UNSUPPORTED_OS";
            bvvg = bvvg5;
        }
        if (apiActivationChange.mo71463c() != null) {
            ArrayList c4 = apiActivationChange.mo71463c();
            int size2 = c4.size();
            bvvg bvvg6 = bvvg;
            int i5 = 0;
            while (i5 < size2) {
                ArrayList arrayList2 = c4;
                String str6 = (String) c4.get(i5);
                if (str6 == null) {
                    i2 = size2;
                    obj2 = obj;
                    str = str4;
                    bvvg3 = bvvg6;
                } else {
                    switch (str6.hashCode()) {
                        case -2047236154:
                            i2 = size2;
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            if (str6.equals(obj3)) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1495442378:
                            i2 = size2;
                            obj2 = obj;
                            str = str4;
                            Object obj11 = obj6;
                            if (!str6.equals(obj11)) {
                                obj6 = obj11;
                                obj3 = obj7;
                                c2 = 65535;
                                break;
                            } else {
                                obj6 = obj11;
                                obj3 = obj7;
                                c2 = 11;
                                break;
                            }
                        case -1477702450:
                            i2 = size2;
                            obj2 = obj;
                            str = str4;
                            Object obj12 = obj5;
                            if (!str6.equals(obj12)) {
                                obj5 = obj12;
                                obj3 = obj7;
                                c2 = 65535;
                                break;
                            } else {
                                obj5 = obj12;
                                obj3 = obj7;
                                c2 = 19;
                                break;
                            }
                        case -655522738:
                            i2 = size2;
                            obj2 = obj;
                            if (str6.equals(obj2)) {
                                str = str4;
                                obj3 = obj7;
                                c2 = 2;
                                break;
                            }
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -635929565:
                            i2 = size2;
                            if (str6.equals("locationDisabledForGoogleApps")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 9;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -569297775:
                            i2 = size2;
                            if (str6.equals("AUTH_ERROR")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 16;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -545586021:
                            i2 = size2;
                            if (str6.equals("INDETERMINATE")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 22;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -504990983:
                            i2 = size2;
                            if (str6.equals("unsupportedOs")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 3;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -284840886:
                            i2 = size2;
                            if (str6.equals("unknown")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 1;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case -43789238:
                            i2 = size2;
                            if (str6.equals("deferringToGmm")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 5;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 403309407:
                            i2 = size2;
                            if (str6.equals("accountRestriction")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 15;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 433141802:
                            i2 = size2;
                            if (str6.equals("UNKNOWN")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 0;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 463714641:
                            i2 = size2;
                            if (str6.equals("locationDisabled")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 21;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 633138363:
                            i2 = size2;
                            if (str6.equals("indeterminate")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 23;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 831244992:
                            i2 = size2;
                            if (str6.equals("DEFERRING_TO_GMM")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 4;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 896955301:
                            i2 = size2;
                            if (str6.equals("INVALID_ACCOUNT")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 10;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1153623559:
                            i2 = size2;
                            if (str6.equals(str4)) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 6;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1267298426:
                            i2 = size2;
                            if (str6.equals("ACCOUNT_RESTRICTION")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 14;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1354633129:
                            i2 = size2;
                            if (str6.equals("LOCATION_DISABLED_FOR_GOOGLE_APPS")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 8;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1436831040:
                            i2 = size2;
                            if (str6.equals("authError")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 17;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1525140700:
                            i2 = size2;
                            if (str6.equals("unsupportedGeo")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 7;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1822434725:
                            i2 = size2;
                            if (str6.equals("RESTRICTED_PROFILE")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 18;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1873180092:
                            i2 = size2;
                            if (str6.equals("reportingNotEnabled")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 13;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        case 1892030692:
                            i2 = size2;
                            if (str6.equals("REPORTING_NOT_ENABLED")) {
                                obj2 = obj;
                                str = str4;
                                obj3 = obj7;
                                c2 = 12;
                                break;
                            }
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                        default:
                            i2 = size2;
                            obj2 = obj;
                            str = str4;
                            obj3 = obj7;
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.UNKNOWN);
                            continue;
                        case 2:
                        case 3:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.UNSUPPORTED_OS);
                            continue;
                        case 4:
                        case 5:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.DEFERRING_TO_GMM);
                            continue;
                        case 6:
                        case 7:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.UNSUPPORTED_GEO);
                            continue;
                        case 8:
                        case 9:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.LOCATION_DISABLED_FOR_GOOGLE_APPS);
                            continue;
                        case 10:
                        case 11:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.INVALID_ACCOUNT);
                            continue;
                        case 12:
                        case 13:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.REPORTING_NOT_ENABLED);
                            continue;
                        case 14:
                        case 15:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.ACCOUNT_RESTRICTION);
                            continue;
                        case 16:
                        case 17:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.AUTH_ERROR);
                            continue;
                        case 18:
                        case 19:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.RESTRICTED_PROFILE);
                            continue;
                        case 20:
                        case 21:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.LOCATION_DISABLED);
                            continue;
                        case 22:
                        case 23:
                            obj7 = obj3;
                            bvvg3 = bvvg6;
                            bvvg3.mo73388a(bvvk.INDETERMINATE);
                            continue;
                        default:
                            if (str6.length() == 0) {
                                str2 = new String("Json2LiteBadEnum userlocation.ApiActivationChange.new_reason ");
                            } else {
                                str2 = "Json2LiteBadEnum userlocation.ApiActivationChange.new_reason ".concat(str6);
                            }
                            throw new IllegalArgumentException(str2);
                    }
                }
                i5++;
                bvvg6 = bvvg3;
                str4 = str;
                c4 = arrayList2;
                obj = obj2;
                size2 = i2;
            }
            bvvg2 = bvvg6;
        } else {
            bvvg2 = bvvg;
        }
        if (apiActivationChange.mo71462b() != null) {
            String b = apiActivationChange.mo71462b();
            switch (b.hashCode()) {
                case -1780594132:
                    if (b.equals("INACTIVATED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303979599:
                    if (b.equals("ACTIVATED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 204392913:
                    if (b.equals("activated")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 361412172:
                    if (b.equals("inactivated")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                if (!bvvg2.f164950c) {
                    i = 0;
                } else {
                    bvvg2.mo74035c();
                    i = 0;
                    bvvg2.f164950c = false;
                }
                bvvl bvvl = (bvvl) bvvg2.f164949b;
                bvvl.f157813d = i;
                bvvl.f157810a |= 1;
            } else if (c == 2 || c == 3) {
                if (bvvg2.f164950c) {
                    bvvg2.mo74035c();
                    bvvg2.f164950c = false;
                }
                bvvl bvvl2 = (bvvl) bvvg2.f164949b;
                bvvl2.f157813d = 1;
                bvvl2.f157810a = 1 | bvvl2.f157810a;
            } else {
                String valueOf = String.valueOf(apiActivationChange.mo71462b());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiActivationChange.change ") : "Json2LiteBadEnum userlocation.ApiActivationChange.change ".concat(valueOf));
            }
        }
        return (bvvl) bvvg2.mo74062i();
    }
}
