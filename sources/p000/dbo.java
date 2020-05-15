package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: dbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbo implements dbq {

    /* renamed from: a */
    final /* synthetic */ Activity f12742a;

    /* renamed from: b */
    final /* synthetic */ Bundle f12743b;

    public dbo(Activity activity, Bundle bundle) {
        this.f12742a = activity;
        this.f12743b = bundle;
    }

    /* renamed from: a */
    public final void mo8487a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f12742a, this.f12743b);
    }
}
