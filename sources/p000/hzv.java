package p000;

import android.content.Context;

/* renamed from: hzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzv {

    /* renamed from: a */
    private static volatile hzw f20608a;

    private hzv() {
    }

    /* renamed from: a */
    public static synchronized hzw m15096a(Context context) {
        hzw hzw;
        synchronized (hzv.class) {
            if (f20608a == null) {
                hzw.f20609a.mo25412b("Instantiate SmsRetrieverCore.", new Object[0]);
                f20608a = new hzw(context);
            }
            hzw = f20608a;
        }
        return hzw;
    }

    /* renamed from: a */
    static synchronized boolean m15097a() {
        boolean z;
        synchronized (hzv.class) {
            z = f20608a != null;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m15098b() {
        synchronized (hzv.class) {
            hzw.f20609a.mo25412b("Release SmsRetrieverCore instance.", new Object[0]);
            f20608a = null;
        }
    }
}
