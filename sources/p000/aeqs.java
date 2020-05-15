package p000;

import com.google.android.gms.location.settings.LocationAccuracyChimeraActivity;

/* renamed from: aeqs */
final /* synthetic */ class aeqs implements Runnable {

    /* renamed from: a */
    private final LocationAccuracyChimeraActivity f63638a;

    /* renamed from: b */
    private final boolean f63639b;

    public aeqs(LocationAccuracyChimeraActivity locationAccuracyChimeraActivity, boolean z) {
        this.f63638a = locationAccuracyChimeraActivity;
        this.f63639b = z;
    }

    public final void run() {
        this.f63638a.mo26140c(this.f63639b);
    }
}
