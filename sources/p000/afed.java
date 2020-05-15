package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: afed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afed extends dcj implements afef {
    public afed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final void init(vzr vzr) {
        throw null;
    }

    public final void initV2(vzr vzr, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeInt(i);
        mo8528b(6, bj);
    }

    public final afhu newBitmapDescriptorFactoryDelegate() {
        afhu afhu;
        Parcel a = mo8526a(5, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            afhu = queryLocalInterface instanceof afhu ? (afhu) queryLocalInterface : new afhs(readStrongBinder);
        } else {
            afhu = null;
        }
        a.recycle();
        return afhu;
    }

    public final afeb newCameraUpdateFactoryDelegate() {
        afeb afeb;
        Parcel a = mo8526a(4, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            afeb = queryLocalInterface instanceof afeb ? (afeb) queryLocalInterface : new afdz(readStrongBinder);
        } else {
            afeb = null;
        }
        a.recycle();
        return afeb;
    }

    public final afep newMapFragmentDelegate(vzr vzr) {
        afep afep;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            afep = queryLocalInterface instanceof afep ? (afep) queryLocalInterface : new afen(readStrongBinder);
        } else {
            afep = null;
        }
        a.recycle();
        return afep;
    }

    public final afes newMapViewDelegate(vzr vzr, GoogleMapOptions googleMapOptions) {
        afes afes;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, googleMapOptions);
        Parcel a = mo8526a(3, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            afes = queryLocalInterface instanceof afes ? (afes) queryLocalInterface : new afeq(readStrongBinder);
        } else {
            afes = null;
        }
        a.recycle();
        return afes;
    }

    public final afgm newStreetViewPanoramaFragmentDelegate(vzr vzr) {
        afgm afgm;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(8, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            afgm = queryLocalInterface instanceof afgm ? (afgm) queryLocalInterface : new afgk(readStrongBinder);
        } else {
            afgm = null;
        }
        a.recycle();
        return afgm;
    }

    public final afgp newStreetViewPanoramaViewDelegate(vzr vzr, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        afgp afgp;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, streetViewPanoramaOptions);
        Parcel a = mo8526a(7, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            afgp = queryLocalInterface instanceof afgp ? (afgp) queryLocalInterface : new afgn(readStrongBinder);
        } else {
            afgp = null;
        }
        a.recycle();
        return afgp;
    }
}
