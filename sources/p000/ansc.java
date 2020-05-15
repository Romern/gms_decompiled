package p000;

import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: ansc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ansc {
    /* renamed from: a */
    static String m65095a(Resources resources, Locale locale, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        rzz.m34730a(z, "Count must be non-negative.");
        NumberFormat instance = NumberFormat.getInstance(locale);
        if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
            double d = (double) i;
            if (d < 1000.0d) {
                return instance.format((long) i);
            }
            int intValue = new BigDecimal(i).round(new MathContext(2)).intValue();
            if (d < 1000000.0d) {
                double d2 = (double) intValue;
                Double.isNaN(d2);
                return resources.getString(C0126R.string.plus_one_count_in_the_thousands, instance.format(d2 / 1000.0d));
            } else if (d >= 1.0E9d) {
                return resources.getString(C0126R.string.plus_one_count_more_than_a_billion);
            } else {
                double d3 = (double) intValue;
                Double.isNaN(d3);
                return resources.getString(C0126R.string.plus_one_count_in_the_millions, instance.format(d3 / 1000000.0d));
            }
        } else if (i >= 9999) {
            return resources.getString(C0126R.string.plus_one_count_many);
        } else {
            return instance.format((long) i);
        }
    }
}
