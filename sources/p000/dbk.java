package p000;

import android.app.Activity;
import android.app.Application;

/* renamed from: dbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbk implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12738a;

    public dbk(Activity activity) {
        this.f12738a = activity;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f12738a);
    }
}
