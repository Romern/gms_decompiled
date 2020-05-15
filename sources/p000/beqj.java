package p000;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: beqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqj {

    /* renamed from: a */
    public static final BigDecimal f112049a = new BigDecimal(1000000L);

    static {
        new BigDecimal(1000000000L);
    }

    @Deprecated
    /* renamed from: a */
    public static long m95435a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.getDefault());
        decimalFormat.setParseBigDecimal(true);
        return ((BigDecimal) decimalFormat.parse(str)).multiply(f112049a).longValue();
    }
}
