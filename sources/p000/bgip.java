package p000;

import android.os.IBinder;
import com.android.location.provider.ActivityRecognitionProvider;

/* renamed from: bgip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgip implements bgis {

    /* renamed from: a */
    public static final Object f116545a = new Object();

    /* renamed from: b */
    public static ActivityRecognitionProvider f116546b;

    /* renamed from: c */
    private static final Object f116547c = new Object();

    /* renamed from: d */
    private static IBinder f116548d;

    /* renamed from: a */
    public final IBinder mo62870a() {
        IBinder iBinder;
        synchronized (f116547c) {
            if (f116548d == null) {
                f116548d = new bgio().getBinder();
            }
            iBinder = f116548d;
        }
        return iBinder;
    }

    /* renamed from: b */
    public final ActivityRecognitionProvider mo62871b() {
        ActivityRecognitionProvider activityRecognitionProvider;
        synchronized (f116545a) {
            activityRecognitionProvider = f116546b;
        }
        return activityRecognitionProvider;
    }
}
