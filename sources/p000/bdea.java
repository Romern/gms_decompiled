package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: bdea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdea implements ComponentCallbacks2 {
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        synchronized (bdej.f105415a) {
            bdej.f105415a.clear();
        }
    }
}
