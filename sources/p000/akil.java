package p000;

import android.telephony.PhoneNumberUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: akil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akil {
    /* renamed from: a */
    public static final String m59826a(String str, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, ((Locale) list.get(i)).getCountry());
            i++;
            if (formatNumberToE164 != null) {
                return formatNumberToE164;
            }
        }
        return null;
    }
}
