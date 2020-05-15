package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: asca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asca {
    /* renamed from: a */
    public static void m73765a(Handler handler) {
        Looper looper = handler.getLooper();
        int i = Build.VERSION.SDK_INT;
        looper.quitSafely();
    }
}
