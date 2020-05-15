package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rld implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public static final rld f43214a = new rld();

    /* renamed from: b */
    public final AtomicBoolean f43215b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f43216c = new AtomicBoolean();

    /* renamed from: d */
    public final ArrayList f43217d = new ArrayList();

    /* renamed from: e */
    public boolean f43218e = false;

    private rld() {
    }

    /* renamed from: a */
    private final void m33915a(boolean z) {
        synchronized (f43214a) {
            Iterator it = this.f43217d.iterator();
            while (it.hasNext()) {
                Handler handler = ((rnd) it.next()).f43363a.f43405o;
                handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f43215b.compareAndSet(true, false);
        this.f43216c.set(true);
        if (compareAndSet) {
            m33915a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f43215b.compareAndSet(true, false);
        this.f43216c.set(true);
        if (compareAndSet) {
            m33915a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f43215b.compareAndSet(false, true)) {
            this.f43216c.set(true);
            m33915a(true);
        }
    }
}
