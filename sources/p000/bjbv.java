package p000;

import android.os.Looper;

/* renamed from: bjbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbv {
    /* renamed from: a */
    public static void m103172a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("This method cannot be called from the UI thread.");
        }
    }
}
