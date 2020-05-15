package p000;

import android.os.Looper;

/* renamed from: boh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boh {
    /* renamed from: a */
    public static void m3401a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
