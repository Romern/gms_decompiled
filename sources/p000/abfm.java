package p000;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: abfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfm {
    /* renamed from: a */
    public static String m47619a(HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.f78830e;
        if (str2 != null && str2.contains("_")) {
            return helpConfig.f78830e;
        }
        if (helpConfig.f78829d != null) {
            str = "1";
        } else {
            str = "0";
        }
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
