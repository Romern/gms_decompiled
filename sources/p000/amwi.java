package p000;

import android.content.ContentValues;
import android.telephony.PhoneNumberUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: amwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amwi {

    /* renamed from: a */
    private static final Pattern f76180a = Pattern.compile("[^0-9#*+]");

    /* renamed from: a */
    public static String m63527a(String str) {
        String country = Locale.getDefault().getCountry();
        if (bmwb.m108443a(country, Locale.US.getCountry()) || bmwb.m108443a(country, Locale.CANADA.getCountry())) {
            str = f76180a.matcher(str).replaceAll("");
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    /* renamed from: a */
    public static boolean m63528a(Collection collection) {
        return !ancm.m64008a(collection);
    }

    /* renamed from: a */
    public static boolean m63529a(List list, List list2) {
        if (ancm.m64008a((Collection) list)) {
            return true;
        }
        if (ancm.m64008a((Collection) list2)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((ContentValues) list.get(i)).get("data1").toString());
        }
        HashSet hashSet2 = new HashSet();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hashSet2.add(((ContentValues) list2.get(i2)).get("data1").toString());
        }
        return hashSet2.containsAll(hashSet);
    }
}
