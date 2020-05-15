package p000;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: bebw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebw {

    /* renamed from: a */
    public static final bebw f106888a = new bebw();

    private bebw() {
    }

    /* renamed from: b */
    public static final long m91749b() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }

    /* renamed from: a */
    public final long mo58543a() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }
}
