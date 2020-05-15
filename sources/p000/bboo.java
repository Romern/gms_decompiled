package p000;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: bboo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bboo {
    /* renamed from: a */
    public static String m88285a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        String[] split = lowerCase.split("@", 2);
        if (split.length != 2) {
            return lowerCase;
        }
        String str2 = split[0];
        String str3 = split[1];
        return (TextUtils.equals(str3, "gmail.com") || TextUtils.equals(str3, "googlemail.com")) ? str2.replace(".", "").concat("@gmail.com") : lowerCase;
    }
}
