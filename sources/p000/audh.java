package p000;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: audh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audh {
    static {
        audg.m76790a("PhoneNumberFormatter");
    }

    /* renamed from: a */
    public static String m76796a(TelephonyManager telephonyManager, String str) {
        String str2;
        if (telephonyManager != null) {
            beao a = beao.m91670a();
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = Locale.getDefault().getCountry();
            }
            beat beat = null;
            if (!TextUtils.isEmpty(simCountryIso)) {
                str2 = simCountryIso.toUpperCase(Locale.ENGLISH);
            } else {
                str2 = null;
            }
            try {
                beat = a.mo58483a(str, str2);
            } catch (bean e) {
                new Object[1][0] = str;
            }
            if (beat != null && a.mo58492b(beat)) {
                return a.mo58486a(beat, 1);
            }
        }
        return str;
    }
}
