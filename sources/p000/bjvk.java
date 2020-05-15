package p000;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: bjvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvk {

    /* renamed from: a */
    private static final HashMap f123386a = new HashMap();

    /* renamed from: b */
    private final bjvj f123387b;

    public bjvk(bjvj bjvj) {
        this.f123387b = bjvj;
    }

    /* renamed from: a */
    public static bjvi m104704a() {
        return new bjvi();
    }

    /* renamed from: a */
    public final String mo65566a(BigDecimal bigDecimal, String str) {
        bjvj bjvj = new bjvj(this.f123387b.f123384a, str);
        NumberFormat numberFormat = (NumberFormat) f123386a.get(bjvj);
        if (numberFormat == null) {
            Currency instance = Currency.getInstance(str);
            Locale locale = this.f123387b.f123384a;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setGroupingUsed(true);
            currencyInstance.setCurrency(instance);
            int defaultFractionDigits = instance.getDefaultFractionDigits();
            if (defaultFractionDigits != -1) {
                currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
                currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
            }
            if (currencyInstance instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(instance.getSymbol(locale));
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                if (locale.getLanguage().equalsIgnoreCase("en")) {
                    String str2 = decimalFormat.toPattern().split(";", 2)[0];
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str2).length());
                    sb.append(str2);
                    sb.append(";-");
                    sb.append(str2);
                    decimalFormat.applyPattern(sb.toString());
                }
            }
            f123386a.put(bjvj, currencyInstance);
            numberFormat = currencyInstance;
        }
        return numberFormat.format(bigDecimal);
    }
}
