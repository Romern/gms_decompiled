package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: adnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnu {
    /* renamed from: a */
    public static TelephonyManager m50877a(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public static String m50878a(Context context, String str) {
        String stripSeparators;
        String str2;
        String str3;
        String str4 = null;
        if (str == null || (stripSeparators = PhoneNumberUtils.stripSeparators(str)) == null) {
            return null;
        }
        TelephonyManager a = m50877a(context);
        if (a != null) {
            str2 = a.getSimCountryIso();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            Locale locale = Locale.getDefault();
            if (locale != null) {
                str4 = locale.getCountry();
            }
        } else {
            str4 = str2;
        }
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4.toUpperCase(Locale.US);
        } else {
            str3 = "US";
        }
        int i = Build.VERSION.SDK_INT;
        String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, str3);
        return TextUtils.isEmpty(formatNumberToE164) ? stripSeparators : formatNumberToE164;
    }
}
