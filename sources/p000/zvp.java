package p000;

import java.util.Calendar;
import java.util.Date;

/* renamed from: zvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvp {
    /* renamed from: a */
    public static long m46576a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }
}
