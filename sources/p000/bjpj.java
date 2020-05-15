package p000;

import android.text.TextUtils;
import java.util.List;

/* renamed from: bjpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpj {
    /* renamed from: a */
    public static int m104220a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Integer.parseInt(bjzi.m104971a((CharSequence) str));
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m104225b(List list) {
        return list.contains(bwvc.DATE_COMPONENT_DAY);
    }

    /* renamed from: a */
    public static String m104221a(int i) {
        return i != 0 ? String.valueOf(i) : "";
    }

    /* renamed from: a */
    static String m104222a(String str, List list, String str2, String str3, String str4) {
        String str5;
        StringBuilder sb = new StringBuilder(10);
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bwvc bwvc = bwvc.DATE_COMPONENT_UNKNOWN;
            int ordinal = ((bwvc) list.get(i2)).ordinal();
            if (ordinal == 1) {
                str5 = str3;
            } else if (ordinal == 2 || ordinal == 3) {
                str5 = str2;
            } else if (ordinal == 4) {
                str5 = str4;
            } else {
                throw new IllegalArgumentException("Cannot parse unknown date component.");
            }
            if (TextUtils.isEmpty(str5)) {
                i++;
            } else {
                while (i > 0) {
                    sb.append(str);
                    i--;
                }
                sb.append(str5);
                if (i2 < size - 1) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m104223a(bwvc bwvc, String str, String str2, String str3) {
        bwvc bwvc2 = bwvc.DATE_COMPONENT_UNKNOWN;
        int ordinal = bwvc.ordinal();
        if (ordinal == 0) {
            throw new IllegalStateException("Date format template contains unknown date component.");
        } else if (ordinal == 1) {
            return bjyx.m104947a(str2);
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return false;
                    }
                    return bjyx.m104948b(str3);
                } else if (str.length() != 4) {
                    return false;
                } else {
                    return true;
                }
            } else if (str.length() == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m104224a(List list) {
        return list.contains(bwvc.DATE_COMPONENT_MONTH);
    }
}
