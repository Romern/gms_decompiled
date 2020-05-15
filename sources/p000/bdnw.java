package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

/* renamed from: bdnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdnw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f106098a;

    /* renamed from: b */
    final /* synthetic */ bdny f106099b;

    public bdnw(bdny bdny, Application application) {
        this.f106099b = bdny;
        this.f106098a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        bdnt bdnt;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f106099b.f106113i.f106092b != null) {
            bdnt = this.f106099b.f106114j;
        } else {
            bdnt = this.f106099b.f106113i;
        }
        bdnt.f106091a = activity.getClass().getSimpleName();
        bdnt.f106092b = Long.valueOf(elapsedRealtime);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        bdnt bdnt = this.f106099b.f106114j.f106092b != null ? this.f106099b.f106114j : this.f106099b.f106113i;
        if (bdnt.f106094d == null) {
            bdnt.f106094d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new bdnv(this, findViewById));
        } catch (RuntimeException e) {
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        bdnt bdnt = this.f106099b.f106114j.f106092b != null ? this.f106099b.f106114j : this.f106099b.f106113i;
        if (bdnt.f106093c == null) {
            bdnt.f106093c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
