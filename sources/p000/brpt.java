package p000;

import java.util.Locale;

/* renamed from: brpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpt {
    /* renamed from: a */
    public static void m114441a(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
