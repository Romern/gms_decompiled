package p000;

import android.app.Activity;
import android.app.Application;

/* renamed from: dbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbn implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12741a;

    public dbn(Activity activity) {
        this.f12741a = activity;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f12741a);
    }
}
