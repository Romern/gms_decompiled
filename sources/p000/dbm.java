package p000;

import android.app.Activity;
import android.app.Application;

/* renamed from: dbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbm implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12740a;

    public dbm(Activity activity) {
        this.f12740a = activity;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f12740a);
    }
}
