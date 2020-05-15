package p000;

import java.util.Calendar;

/* renamed from: smh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smh {
    /* renamed from: a */
    public static long m35656a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.add(5, -30);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public static Long m35657b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.add(5, -1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return Long.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: c */
    public static Long m35658c(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return Long.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: d */
    public static long m35659d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.add(6, 1);
        return instance.getTimeInMillis();
    }
}
