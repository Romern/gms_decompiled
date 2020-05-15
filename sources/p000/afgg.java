package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: afgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgg extends dcj implements afgi {
    public afgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: a */
    public final LatLng mo34824a(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(1, bj);
        LatLng latLng = (LatLng) dcl.m8163a(a, LatLng.CREATOR);
        a.recycle();
        return latLng;
    }

    /* renamed from: a */
    public final VisibleRegion mo34825a() {
        Parcel a = mo8526a(3, mo8529bj());
        VisibleRegion visibleRegion = (VisibleRegion) dcl.m8163a(a, VisibleRegion.CREATOR);
        a.recycle();
        return visibleRegion;
    }

    /* renamed from: a */
    public final vzr mo34826a(LatLng latLng) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLng);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        a.recycle();
        return vzr;
    }
}
