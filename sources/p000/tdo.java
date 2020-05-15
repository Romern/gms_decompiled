package p000;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: tdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdo {
    /* renamed from: a */
    public static long m36763a(bxyk bxyk) {
        return bqbs.m112525a(bqbs.m112527c(bxyk.f165097a, 1000), ((long) bxyk.f165098b) / 1000000);
    }

    /* renamed from: b */
    public static String m36765b(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return new SimpleDateFormat("MMM dd yyyy - hh:mm:ss aa", Locale.getDefault()).format(gregorianCalendar.getTime());
    }

    /* renamed from: a */
    public static bxyk m36764a(long j) {
        long j2 = j / 1000;
        int i = (int) ((j % 1000) * 1000000);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = bqbs.m112525a(j2, (long) (i / 1000000000));
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j2 = bqbs.m112526b(j2, 1);
        }
        bxvd da = bxyk.f165095c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxyk bxyk = (bxyk) da.f164949b;
        bxyk.f165097a = j2;
        bxyk.f165098b = i;
        return (bxyk) da.mo74062i();
    }
}
