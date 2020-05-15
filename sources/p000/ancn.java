package p000;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: ancn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancn {

    /* renamed from: a */
    private static final Pattern f76636a = Pattern.compile("[^0-9#*+]");

    /* renamed from: a */
    public static String m64025a(String str) {
        String country = Locale.getDefault().getCountry();
        if (country.equalsIgnoreCase(Locale.US.getCountry()) || country.equalsIgnoreCase(Locale.CANADA.getCountry())) {
            str = f76636a.matcher(str).replaceAll("");
        }
        return PhoneNumberUtils.formatNumber(str);
    }
}
