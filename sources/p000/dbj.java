package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: dbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbj implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12736a;

    /* renamed from: b */
    final /* synthetic */ Bundle f12737b;

    public dbj(Activity activity, Bundle bundle) {
        this.f12736a = activity;
        this.f12737b = bundle;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12736a, this.f12737b);
    }
}
