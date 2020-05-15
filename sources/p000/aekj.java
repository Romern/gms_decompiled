package p000;

import android.app.PendingIntent;
import android.util.Log;

/* renamed from: aekj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aekj extends aejx {

    /* renamed from: a */
    private rlf f63469a;

    public aekj(rlf rlf) {
        this.f63469a = rlf;
    }

    /* renamed from: a */
    public final void mo34203a(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }

    /* renamed from: b */
    public final void mo34205b(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    /* renamed from: a */
    public final void mo34204a(int i, String[] strArr) {
        if (this.f63469a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.f63469a.mo9482a((Object) aeil.m51882b(aeil.m51881a(i)));
        this.f63469a = null;
    }
}
