package p000;

import android.location.Location;
import com.google.android.gms.trustlet.place.internal.GeofenceLogsChimeraService;

/* renamed from: auwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwq implements aehz {

    /* renamed from: a */
    final /* synthetic */ auwr f92666a;

    public auwq(auwr auwr) {
        this.f92666a = auwr;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        if (location == null || this.f92666a.f92667a.f109269b.isEmpty()) {
            this.f92666a.f92667a.mo59578a();
            return;
        }
        GeofenceLogsChimeraService geofenceLogsChimeraService = this.f92666a.f92667a;
        new auww(geofenceLogsChimeraService, location, geofenceLogsChimeraService.f109269b).start();
    }
}
