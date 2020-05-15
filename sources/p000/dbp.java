package p000;

import android.app.Activity;
import android.app.Application;

/* renamed from: dbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbp implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12744a;

    public dbp(Activity activity) {
        this.f12744a = activity;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f12744a);
    }
}
