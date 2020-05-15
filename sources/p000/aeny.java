package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: aeny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeny {
    /* renamed from: a */
    public static final rke m52273a(rkb rkb, PendingIntent pendingIntent) {
        sdo.checkIfNull(pendingIntent, "callbackIntent == null");
        return rkb.mo24795b(new aenu(aema.f63502b, rkb, pendingIntent));
    }

    /* renamed from: a */
    public static final rke m52274a(rkb rkb, NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        sdo.checkIfNull(nearbyAlertRequest, "request == null");
        sdo.checkIfNull(pendingIntent, "callbackIntent == null");
        return rkb.mo24795b(new aenw(aema.f63502b, rkb, nearbyAlertRequest, pendingIntent));
    }
}
