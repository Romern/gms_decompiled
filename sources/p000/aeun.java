package p000;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeun */
final /* synthetic */ class aeun implements aehz {

    /* renamed from: a */
    private final long f63849a;

    public aeun(long j) {
        this.f63849a = j;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        long j = this.f63849a;
        GcmReceiverChimeraService.m67041a(false, System.currentTimeMillis() - location.getTime(), SystemClock.elapsedRealtime(), j, location.getAccuracy());
    }
}
