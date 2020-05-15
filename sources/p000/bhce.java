package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: bhce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhce {

    /* renamed from: a */
    private static final SimpleDateFormat f118289a = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);

    /* renamed from: a */
    public static String m100624a(long j) {
        return f118289a.format(new Date(j));
    }

    /* renamed from: b */
    public static String m100625b(long j) {
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append("-");
            j = -j;
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
        return sb.toString();
    }
}
