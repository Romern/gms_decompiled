package p000;

import java.io.File;
import java.util.Locale;

/* renamed from: mac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mac {
    /* renamed from: a */
    public static String m24749a(String str, int i) {
        String str2;
        if (bmxx.m108577a(str)) {
            return String.valueOf(i);
        }
        bmxy.m108581a(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str2 = name.substring(lastIndexOf + 1);
        } else {
            str2 = "";
        }
        bmxy.m108581a(str);
        String name2 = new File(str).getName();
        int lastIndexOf2 = name2.lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            name2 = name2.substring(0, lastIndexOf2);
        }
        if (str2.length() > 8) {
            str2 = str2.substring(0, 8);
        }
        int length = str2.length();
        if (!str2.isEmpty()) {
            length++;
        }
        Locale locale = Locale.ROOT;
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(locale, "%s_%d", name2, valueOf);
        if (format.length() + length > 25) {
            int length2 = String.valueOf(i).length();
            format = String.format(Locale.ROOT, "%s_%d", format.substring(0, 25 - ((length2 + 1) + length)), valueOf);
        }
        if (str2.isEmpty()) {
            return format;
        }
        return String.format(Locale.ROOT, "%s.%s", format, str2);
    }
}
