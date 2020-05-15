package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;

/* renamed from: bepd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepd {
    /* renamed from: a */
    public static void m95382a(StrictMode.ThreadPolicy threadPolicy) {
        StrictMode.setThreadPolicy(threadPolicy);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Handler(Looper.myLooper()).postAtFrontOfQueue(new bepb(threadPolicy));
        }
    }

    /* renamed from: b */
    public static StrictMode.ThreadPolicy m95383b(StrictMode.ThreadPolicy threadPolicy) {
        return new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build();
    }
}
