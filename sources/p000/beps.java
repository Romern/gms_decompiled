package p000;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: beps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beps {

    /* renamed from: a */
    public static final BigDecimal f112011a = new BigDecimal(1000000);

    static {
        new BigDecimal(1000);
        Currency.getInstance("USD");
    }

    /* renamed from: a */
    public static String m95416a(long j, String str) {
        if (j == 0 && bmxx.m108577a(str)) {
            return "";
        }
        return m95417a(j, str, Locale.getDefault());
    }

    /* renamed from: a */
    private static String m95417a(long j, String str, Locale locale) {
        try {
            Currency instance = Currency.getInstance(str);
            NumberFormat decimalFormat = "KRW".equals(str) ? new DecimalFormat("#,### 원") : NumberFormat.getCurrencyInstance(locale);
            decimalFormat.setCurrency(instance);
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setMinimumFractionDigits(instance.getDefaultFractionDigits());
            decimalFormat.setMaximumFractionDigits(instance.getDefaultFractionDigits());
            return decimalFormat.format(new BigDecimal(j).divide(f112011a).setScale(instance.getDefaultFractionDigits(), 4));
        } catch (IllegalArgumentException e) {
            if (str.equals("BYN")) {
                return m95417a(j, "BYR", locale).replaceAll("(?i)BYR", "BYN");
            }
            NumberFormat instance2 = NumberFormat.getInstance();
            instance2.setMinimumFractionDigits(2);
            instance2.setMaximumFractionDigits(2);
            String format = instance2.format(new BigDecimal(j).divide(f112011a).setScale(2, 4));
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(format);
            return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
    }

    /* renamed from: a */
    public static String m95418a(btnd btnd) {
        if (btnd.f149599b.isEmpty() && btnd.f149598a == 0) {
            return "";
        }
        return m95417a(btnd.f149598a, btnd.f149599b, Locale.getDefault());
    }
}
