package p000;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.trustlet.place.internal.GeofenceLogsChimeraService;

/* renamed from: auwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auwr implements rjz {

    /* renamed from: a */
    final /* synthetic */ GeofenceLogsChimeraService f92667a;

    public auwr(GeofenceLogsChimeraService geofenceLogsChimeraService) {
        this.f92667a = geofenceLogsChimeraService;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f92667a.mo59578a();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        LocationRequest a = LocationRequest.m66854a();
        a.mo43553c(100);
        a.mo43551b(1);
        a.mo43549a(15000L);
        a.mo43554c(0L);
        LocationRequestInternal a2 = LocationRequestInternal.m66889a("Coffee-GeofenceService", a);
        auwq auwq = new auwq(this);
        rjo rjo = aeie.f63411a;
        aejn.m51937a(this.f92667a.f109268a, a2, auwq, Looper.myLooper());
    }
}
