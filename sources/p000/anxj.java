package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: anxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxj {
    /* renamed from: a */
    public static String m65495a(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        Locale locale = configuration.locale;
        String country = locale.getCountry();
        String language = locale.getLanguage();
        String str = !TextUtils.isEmpty(country) ? "-" : "";
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + str.length() + String.valueOf(country).length());
        sb.append(language);
        sb.append(str);
        sb.append(country);
        return sb.toString();
    }
}
