package p000;

import android.content.Context;

/* renamed from: bhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhd {

    /* renamed from: a */
    private static bhd f3222a;

    private bhd() {
    }

    /* renamed from: a */
    public static synchronized void m3026a(Context context) {
        synchronized (bhd.class) {
            if (f3222a == null && context != null) {
                f3222a = new bhd(null);
            }
        }
    }

    private bhd(byte[] bArr) {
    }
}
