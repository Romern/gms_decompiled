package p000;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: afct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afct {

    /* renamed from: a */
    public final afgi f64187a;

    public afct(afgi afgi) {
        this.f64187a = afgi;
    }

    /* renamed from: a */
    public final Point mo34764a(LatLng latLng) {
        try {
            return (Point) vzs.m41641a(this.f64187a.mo34826a(latLng));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final LatLng mo34765a(Point point) {
        try {
            return this.f64187a.mo34824a(vzs.m41642a(point));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
