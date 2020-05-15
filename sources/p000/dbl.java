package p000;

import android.app.Activity;
import android.app.Application;

/* renamed from: dbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbl implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12739a;

    public dbl(Activity activity) {
        this.f12739a = activity;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f12739a);
    }
}
