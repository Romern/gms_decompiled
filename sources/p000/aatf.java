package p000;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: aatf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatf {

    /* renamed from: a */
    private static final String[] f56537a = {"&", "?"};

    /* renamed from: a */
    public static String m46975a(String str) {
        String aA = ceeg.f182447a.mo6606a().mo78960aA();
        if (TextUtils.isEmpty(aA)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return Uri.parse(aA).buildUpon().encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build().toString();
    }

    /* renamed from: a */
    public static String m46976a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String queryParameter = Uri.parse(str).getQueryParameter(str2);
        if (!TextUtils.isEmpty(queryParameter)) {
            for (String str4 : queryParameter.split(",")) {
                if (TextUtils.equals(str3, str4)) {
                    return str;
                }
            }
        }
        String[] strArr = f56537a;
        for (String str5 : strArr) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + str2.length());
            sb.append(str5);
            sb.append(str2);
            sb.append("=");
            String sb2 = sb.toString();
            if (str.contains(sb2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str3).length());
                sb3.append(sb2);
                sb3.append(str3);
                sb3.append(",");
                return str.replace(sb2, sb3.toString());
            }
        }
        String str6 = "?";
        if (str.contains(str6)) {
            str6 = "&";
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 1 + str6.length() + str2.length() + String.valueOf(str3).length());
        sb4.append(str);
        sb4.append(str6);
        sb4.append(str2);
        sb4.append("=");
        sb4.append(str3);
        return sb4.toString();
    }
}
