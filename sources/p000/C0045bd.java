package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: bd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0045bd implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        C0046be.m2752a(activity, C0005ad.ON_CREATE);
    }

    public final void onActivityPostResumed(Activity activity) {
        C0046be.m2752a(activity, C0005ad.ON_RESUME);
    }

    public final void onActivityPostStarted(Activity activity) {
        C0046be.m2752a(activity, C0005ad.ON_START);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        C0046be.m2752a(activity, C0005ad.ON_DESTROY);
    }

    public final void onActivityPrePaused(Activity activity) {
        C0046be.m2752a(activity, C0005ad.ON_PAUSE);
    }

    public final void onActivityPreStopped(Activity activity) {
        C0046be.m2752a(activity, C0005ad.ON_STOP);
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
