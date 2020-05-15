package p000;

import android.util.Log;

/* renamed from: sqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqz {
    /* renamed from: a */
    public static boolean m36058a(String str, String str2) {
        int indexOf;
        if (str2.indexOf(44) >= 0) {
            String valueOf = String.valueOf(str2);
            Log.w("CsvUtil", valueOf.length() == 0 ? new String("Search entry has a comma: ") : "Search entry has a comma: ".concat(valueOf));
            return false;
        } else if ("*".equals(str)) {
            return true;
        } else {
            if (str2.length() != 0) {
                int i = 0;
                while (i < str.length() && (indexOf = str.indexOf(str2, i)) != -1) {
                    int length = str2.length() + indexOf;
                    if ((indexOf != i && str.charAt(indexOf - 1) != ',') || (length != str.length() && str.charAt(length) != ',')) {
                        i = str.indexOf(44, length) + 1;
                        if (i == 0) {
                            break;
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            } else if (str.length() == 0 || str.charAt(0) == ',' || str.charAt(str.length() - 1) == ',' || str.indexOf(",,", 1) >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
