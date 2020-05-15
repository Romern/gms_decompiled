package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: dbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbr implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f12745a;

    /* renamed from: b */
    private final WeakReference f12746b;

    /* renamed from: c */
    private boolean f12747c = false;

    public dbr(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f12746b = new WeakReference(activityLifecycleCallbacks);
        this.f12745a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8488a(dbq dbq) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12746b.get();
            if (activityLifecycleCallbacks != null) {
                dbq.mo8487a(activityLifecycleCallbacks);
            } else if (!this.f12747c) {
                this.f12745a.unregisterActivityLifecycleCallbacks(this);
                this.f12747c = true;
            }
        } catch (Exception e) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo8488a(new dbj(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo8488a(new dbp(activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo8488a(new dbm(activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo8488a(new dbl(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo8488a(new dbo(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo8488a(new dbk(activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo8488a(new dbn(activity));
    }
}
