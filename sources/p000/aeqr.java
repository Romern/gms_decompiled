package p000;

import com.google.android.gms.location.settings.LocationAccuracyChimeraActivity;

/* renamed from: aeqr */
public final /* synthetic */ class aeqr implements Runnable {

    /* renamed from: a */
    private final LocationAccuracyChimeraActivity f63637a;

    public aeqr(LocationAccuracyChimeraActivity locationAccuracyChimeraActivity) {
        this.f63637a = locationAccuracyChimeraActivity;
    }

    public final void run() {
        LocationAccuracyChimeraActivity locationAccuracyChimeraActivity = this.f63637a;
        locationAccuracyChimeraActivity.runOnUiThread(new aeqs(locationAccuracyChimeraActivity, aeri.m52434a(locationAccuracyChimeraActivity)));
    }
}
