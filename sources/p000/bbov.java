package p000;

import android.os.Looper;

/* renamed from: bbov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbov {
    /* renamed from: a */
    public static void m88299a() {
        m88300a(Looper.getMainLooper() != Looper.myLooper(), "checkWorkerThread failed");
    }

    /* renamed from: a */
    public static void m88300a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
