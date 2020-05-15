package p000;

import com.felicanetworks.mfc.Felica;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: awt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awt {
    /* renamed from: a */
    public static String m2286a(awz awz) {
        TimeZone timeZone;
        StringBuffer stringBuffer = new StringBuffer();
        DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
        stringBuffer.append(decimalFormat.format((long) awz.f2461a));
        if (awz.f2462b == 0) {
            return stringBuffer.toString();
        }
        decimalFormat.applyPattern("'-'00");
        stringBuffer.append(decimalFormat.format((long) awz.f2462b));
        int i = awz.f2463c;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(decimalFormat.format((long) i));
        if (!(awz.f2464d == 0 && awz.f2465e == 0 && awz.f2466f == 0 && awz.f2468h == 0 && ((timeZone = awz.f2467g) == null || timeZone.getRawOffset() == 0))) {
            stringBuffer.append('T');
            decimalFormat.applyPattern("00");
            stringBuffer.append(decimalFormat.format((long) awz.f2464d));
            stringBuffer.append(':');
            stringBuffer.append(decimalFormat.format((long) awz.f2465e));
            int i2 = awz.f2466f;
            if (!(i2 == 0 && awz.f2468h == 0)) {
                int i3 = awz.f2468h;
                decimalFormat.applyPattern(":00.#########");
                double d = (double) i2;
                double d2 = (double) i3;
                Double.isNaN(d2);
                Double.isNaN(d);
                stringBuffer.append(decimalFormat.format(d + (d2 / 1.0E9d)));
            }
            if (awz.f2467g != null) {
                int offset = awz.f2467g.getOffset(awz.mo2781a().getTimeInMillis());
                if (offset == 0) {
                    stringBuffer.append('Z');
                } else {
                    int abs = Math.abs((offset % 3600000) / Felica.MAX_TIMEOUT);
                    decimalFormat.applyPattern("+00;-00");
                    stringBuffer.append(decimalFormat.format((long) (offset / 3600000)));
                    decimalFormat.applyPattern(":00");
                    stringBuffer.append(decimalFormat.format((long) abs));
                }
            }
        }
        return stringBuffer.toString();
    }
}
