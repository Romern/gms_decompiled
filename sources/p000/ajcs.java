package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ajcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajcs implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f70356a;

    /* renamed from: b */
    private final ajct f70357b;

    public ajcs(Activity activity, ajct ajct) {
        this.f70356a = activity;
        this.f70357b = ajct;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f70356a) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f70356a) {
            try {
                this.f70357b.mo38503c(1);
            } catch (RemoteException e) {
            }
        }
    }
}
