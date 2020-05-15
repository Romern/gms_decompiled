package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ayjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjl {

    /* renamed from: a */
    private static final SimpleDateFormat f97761a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final SimpleDateFormat f97762b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* renamed from: a */
    public static String m84111a() {
        return m84112a(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static String m84113b(long j) {
        String format;
        if (j < 0) {
            return Long.toString(j);
        }
        synchronized (f97762b) {
            format = f97762b.format(new Date(j));
        }
        return format;
    }

    /* renamed from: a */
    public static String m84112a(long j) {
        String format;
        if (j < 0) {
            return Long.toString(j);
        }
        synchronized (f97761a) {
            format = f97761a.format(new Date(j));
        }
        return format;
    }
}
