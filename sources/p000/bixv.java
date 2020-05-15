package p000;

import android.os.Looper;

/* renamed from: bixv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixv {
    /* renamed from: a */
    public static void m102956a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static void m102957a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str.concat(" must be called from the UI thread."));
        }
    }

    /* renamed from: a */
    public static void m102958a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
