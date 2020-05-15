package p000;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: aozb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aozb {

    /* renamed from: a */
    private static final Pattern f83920a = Pattern.compile("[^0-9#*+]");

    /* renamed from: a */
    public static String m69888a(String str) {
        String country = Locale.getDefault().getCountry();
        if (bmwb.m108443a(country, Locale.US.getCountry()) || bmwb.m108443a(country, Locale.CANADA.getCountry())) {
            str = f83920a.matcher(str).replaceAll("");
        }
        return PhoneNumberUtils.formatNumber(str);
    }
}
