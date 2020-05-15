package p000;

import android.content.Context;
import android.os.Handler;

/* renamed from: icv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icv {

    /* renamed from: a */
    public static final Logger f20750a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static void m15248a(Context context) {
        icx.m15249a(context).mo12927a();
        for (rkb rkb : rkb.m33818a()) {
            rkb.mo24800d();
        }
        synchronized (rnm.f43393f) {
            if (rnm.f43394g != null) {
                rnm rnm = rnm.f43394g;
                rnm.f43401k.incrementAndGet();
                Handler handler = rnm.f43405o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
