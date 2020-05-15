package p000;

import java.text.SimpleDateFormat;

/* renamed from: egc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egc {

    /* renamed from: a */
    private static SimpleDateFormat f14854a;

    /* renamed from: a */
    public static String m10349a(long j) {
        if (f14854a == null) {
            f14854a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
        }
        return f14854a.format(Long.valueOf(j));
    }
}
