package p000;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: bhhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhv {
    /* renamed from: a */
    static long m100901a(long j) {
        Calendar c = m100907c();
        c.setTimeInMillis(j);
        return m100906b(c).getTimeInMillis();
    }

    /* renamed from: b */
    public static Calendar m100905b() {
        return m100906b(Calendar.getInstance());
    }

    /* renamed from: c */
    public static Calendar m100907c() {
        return m100903a((Calendar) null);
    }

    /* renamed from: a */
    public static DateFormat m100902a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: b */
    public static Calendar m100906b(Calendar calendar) {
        Calendar a = m100903a(calendar);
        Calendar c = m100907c();
        c.set(a.get(1), a.get(2), a.get(5));
        return c;
    }

    /* renamed from: a */
    static Calendar m100903a(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m100904a());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: a */
    public static java.util.TimeZone m100904a() {
        return java.util.TimeZone.getTimeZone("UTC");
    }
}
