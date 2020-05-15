package p000;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: bfla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfla {

    /* renamed from: c */
    public static final Comparator f114326c = new bfkz();

    /* renamed from: a */
    public final long f114327a;

    /* renamed from: b */
    public final long f114328b;

    public bfla(int i, int i2, int i3) {
        this(m97163a(i, i2, 0, 0), m97163a(i3, 0, 0, 0));
    }

    /* renamed from: a */
    public static long m97163a(int i, int i2, int i3, int i4) {
        return (((long) i) * 3600000) + (((long) i2) * 60000) + (((long) i3) * 1000) + ((long) i4);
    }

    /* renamed from: b */
    public static long m97166b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return m97167c(instance);
    }

    /* renamed from: c */
    public static long m97167c(Calendar calendar) {
        return m97163a(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    /* renamed from: a */
    public final long mo61866a() {
        return this.f114328b - this.f114327a;
    }

    /* renamed from: a */
    public final boolean mo61867a(long j) {
        return this.f114327a <= j && j < this.f114328b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bfla)) {
            bfla bfla = (bfla) obj;
            if (this.f114327a == bfla.f114327a && this.f114328b == bfla.f114328b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) (this.f114328b - this.f114327a);
    }

    public final String toString() {
        return String.format(Locale.US, "TimeSpan: [%s, %s)", m97168c(this.f114327a), m97168c(this.f114328b));
    }

    /* renamed from: a */
    public static void m97164a(Calendar calendar, long j) {
        calendar.set(11, (int) (j / 3600000));
        long j2 = j % 3600000;
        calendar.set(12, (int) (j2 / 60000));
        long j3 = j2 % 60000;
        calendar.set(13, (int) (j3 / 1000));
        calendar.set(14, (int) (j3 % 1000));
    }

    /* renamed from: b */
    public final boolean mo61869b(Calendar calendar) {
        return mo61867a(m97167c(calendar));
    }

    public bfla(long j, long j2) {
        this.f114327a = j;
        this.f114328b = j2;
        if (j2 <= j) {
            throw new IllegalArgumentException("Invalid time span.");
        }
    }

    /* renamed from: c */
    public static String m97168c(long j) {
        long j2 = j % 3600000;
        long j3 = j2 % 60000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j / 3600000), Long.valueOf(j2 / 60000), Long.valueOf(j3 / 1000), Long.valueOf(j3 % 1000));
    }

    /* renamed from: a */
    public static boolean m97165a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    /* renamed from: a */
    public final boolean mo61868a(Calendar calendar) {
        return this.f114328b <= m97166b(calendar.getTimeInMillis());
    }
}
