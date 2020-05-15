package p000;

import com.google.android.gms.car.CarInfo;
import java.util.Locale;

/* renamed from: oem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oem {
    /* renamed from: a */
    private static boolean m28581a(int i, String str, CarInfo carInfo) {
        String str2;
        String str3;
        int i2 = i - 1;
        switch (i2) {
            case 0:
                str2 = carInfo.f29332a;
                break;
            case 1:
            case 2:
                str2 = carInfo.f29333b;
                break;
            case 3:
            case 4:
                str2 = carInfo.f29334c;
                break;
            case 5:
            case 6:
            default:
                int i3 = carInfo.f29336e;
                int i4 = carInfo.f29337f;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i3);
                sb.append(".");
                sb.append(i4);
                str2 = sb.toString();
                break;
            case 7:
                str2 = carInfo.f29340i;
                break;
            case 8:
                str2 = carInfo.f29341j;
                break;
            case 9:
                str2 = carInfo.f29342k;
                break;
            case 10:
                str2 = carInfo.f29343l;
                break;
        }
        if (str2 == null) {
            bnsi d = oen.f37371a.mo68390d();
            d.mo68432a("oem", "a", 1189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            switch (i) {
                case 1:
                    str3 = "MANUFACTURER";
                    break;
                case 2:
                    str3 = "MODEL";
                    break;
                case 3:
                    str3 = "MODEL_CONTAINS";
                    break;
                case 4:
                    str3 = "MODEL_YEAR";
                    break;
                case 5:
                    str3 = "MIN_MODEL_YEAR";
                    break;
                case 6:
                    str3 = "PROTOCOL_VERSION";
                    break;
                case 7:
                    str3 = "MIN_PROTOCOL_VERSION";
                    break;
                case 8:
                    str3 = "HEAD_UNIT_MAKE";
                    break;
                case 9:
                    str3 = "HEAD_UNIT_MODEL";
                    break;
                case 10:
                    str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                    break;
                default:
                    str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                    break;
            }
            d.mo68424a("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, str);
            return false;
        }
        switch (i2) {
            case 0:
            case 1:
            case 7:
            case 8:
            case 9:
            case 10:
                return str2.equalsIgnoreCase(str);
            case 2:
                return str2.toLowerCase(Locale.US).contains(str.toLowerCase(Locale.US));
            case 3:
            case 5:
                try {
                    if (Float.compare(Float.valueOf(str2).floatValue(), Float.valueOf(str).floatValue()) == 0) {
                        return true;
                    }
                    return false;
                } catch (NumberFormatException e) {
                    bnsi b = oen.f37371a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("oem", "a", 1216, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("NumberFormatException while matching attribute.");
                    return false;
                }
            case 4:
            case 6:
            default:
                try {
                    if (Float.compare(Float.valueOf(str2).floatValue(), Float.valueOf(str).floatValue()) >= 0) {
                        return true;
                    }
                    return false;
                } catch (NumberFormatException e2) {
                    bnsi b2 = oen.f37371a.mo68387b();
                    b2.mo68437a(e2);
                    b2.mo68432a("oem", "a", 1225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("NumberFormatException while matching attribute.");
                    return false;
                }
        }
    }
}
