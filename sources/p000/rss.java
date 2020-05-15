package p000;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rss {

    /* renamed from: a */
    private static final AtomicReference f43605a = new AtomicReference(null);

    private rss() {
    }

    /* renamed from: a */
    public static void m34362a(Context context) {
        if (f43605a.compareAndSet(null, new rss())) {
            try {
                bntq bntq = new bntq();
                bntq.f132139a = new brza(new rsm(context), new bnua());
                if (bntr.f132140a.compareAndSet(false, true)) {
                    Object obj = bntq.f132139a;
                    if (obj == null) {
                        obj = new bnua();
                    }
                    if (bnty.f132147a.compareAndSet(null, obj)) {
                        bnty.m110420b();
                        return;
                    }
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            } catch (IllegalStateException e) {
                Log.w("FloggerConfig", "Attempted to configure logger more than once.");
            } catch (NoSuchMethodError e2) {
                Log.w("FloggerConfig", "Flogger not available in this version of GMS Core.");
            }
        } else {
            Log.w("FloggerConfig", "Logger already initialized.");
        }
    }
}
