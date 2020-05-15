package p000;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: afgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgh extends dck implements afgi {
    public afgh() {
        super("com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: a */
    public final LatLng mo34824a(vzr vzr) {
        return new LatLng(0.0d, 0.0d);
    }

    /* renamed from: a */
    public final VisibleRegion mo34825a() {
        return new VisibleRegion(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)));
    }

    /* renamed from: a */
    public final vzr mo34826a(LatLng latLng) {
        return vzs.m41642a(new Point(0, 0));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
            } else {
                vzr = null;
            }
            LatLng a = mo34824a(vzr);
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            vzr a2 = mo34826a((LatLng) dcl.m8163a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            dcl.m8164a(parcel2, a2);
        } else if (i != 3) {
            return false;
        } else {
            VisibleRegion a3 = mo34825a();
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a3);
        }
        return true;
    }
}
