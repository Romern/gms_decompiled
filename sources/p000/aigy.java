package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: aigy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aigy implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ aigz f68883a;

    /* renamed from: b */
    private final WeakReference f68884b;

    public aigy(aigz aigz, WeakReference weakReference) {
        this.f68883a = aigz;
        this.f68884b = weakReference;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (activity == this.f68884b.get()) {
            aigz aigz = this.f68883a;
            aigz.f68887b = true;
            aigz.mo37477a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f68884b.get()) {
            aigz aigz = this.f68883a;
            aigz.f68887b = false;
            aigz.mo37477a();
        }
    }
}
