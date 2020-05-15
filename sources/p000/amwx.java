package p000;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: amwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwx {
    /* renamed from: a */
    public static String m63589a(String str, String str2) {
        return m63590a(str2, m63593c(str));
    }

    /* renamed from: b */
    public static String m63592b(String str) {
        return m63591a(str)[0];
    }

    /* renamed from: c */
    public static boolean m63593c(String str) {
        return !TextUtils.isEmpty(m63591a(str)[2]);
    }

    /* renamed from: a */
    public static String m63590a(String str, boolean z) {
        if (str == null) {
            Log.e("PhotoUrlUtil", "Photo url is null");
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str);
        if (z) {
            sb.append(" Sync_High_Res");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m63591a(String str) {
        String str2;
        int i = 0;
        String[] strArr = {"", "", ""};
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(" ");
            if (split.length <= 3) {
                while (i < 3 && i < split.length) {
                    strArr[i] = split[i];
                    i++;
                }
                return strArr;
            }
            str2 = "Photo cell has more than 3 parts.";
        } else {
            str2 = "Photo cell is empty.";
        }
        Log.e("PhotoUrlUtil", str2);
        return strArr;
    }
}
