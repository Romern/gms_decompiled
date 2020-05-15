package p000;

import android.os.Looper;

/* renamed from: ascu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascu {
    /* renamed from: a */
    public static void m73796a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Must be called from UI thread");
        }
    }
}
