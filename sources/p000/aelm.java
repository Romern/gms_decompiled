package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceRequest;

@Deprecated
/* renamed from: aelm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelm extends rjx {
    public aelm(Context context, rjo rjo, aemi aemi) {
        super(context, rjo, aemi, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo34299a(NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        rjo rjo = aema.f63501a;
        return sdl.m34954a(aeny.m52274a(this.f43165D, nearbyAlertRequest, pendingIntent));
    }

    /* renamed from: e */
    public final aucb mo34301e(PendingIntent pendingIntent) {
        rjo rjo = aema.f63501a;
        return sdl.m34954a(aeny.m52273a(this.f43165D, pendingIntent));
    }

    /* renamed from: f */
    public final aucb mo34302f(PendingIntent pendingIntent) {
        rjo rjo = aema.f63501a;
        rkb rkb = this.f43165D;
        sdo.checkIfNull(pendingIntent, "callbackIntent == null");
        aenv aenv = new aenv(aema.f63502b, rkb, pendingIntent);
        rkb.mo24795b(aenv);
        return sdl.m34954a(aenv);
    }

    /* renamed from: a */
    public final aucb mo34300a(PlaceRequest placeRequest, PendingIntent pendingIntent) {
        rjo rjo = aema.f63501a;
        rkb rkb = this.f43165D;
        sdo.checkIfNull(placeRequest, "request == null");
        sdo.checkIfNull(pendingIntent, "callbackIntent == null");
        aenx aenx = new aenx(aema.f63502b, rkb, placeRequest, pendingIntent);
        rkb.mo24795b(aenx);
        return sdl.m34954a(aenx);
    }
}
