package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: aata */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aata {
    /* renamed from: a */
    static double m46956a(double d, long j) {
        if (j == 0) {
            return 1.0d;
        }
        if (j == 1) {
            return d;
        }
        if (j % 2 != 0) {
            return d * m46956a(d * d, j / 2);
        }
        return m46956a(d * d, j / 2);
    }

    /* renamed from: a */
    public static long m46957a(long j, long j2, float f) {
        if (f == 0.0f) {
            return j2 * j;
        }
        double d = (double) (((float) j) / f);
        Double.isNaN(d);
        return (long) Math.ceil(d * (m46956a((double) (f + 1.0f), j2) - 4.0d));
    }

    /* renamed from: a */
    public static String m46958a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), (List) entry.getValue());
        }
        List list = (List) hashMap.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list == null) {
            return "ISO-8859-1";
        }
        String[] split = ((String) list.get(0)).split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }
}
