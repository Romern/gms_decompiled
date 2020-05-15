package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: afee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afee extends dck implements afef {
    public afee() {
        super("com.google.android.gms.maps.internal.ICreator");
    }

    public static afef asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (queryLocalInterface instanceof afef) {
            return (afef) queryLocalInterface;
        }
        return new afed(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof vzr) {
                        vzr = (vzr) queryLocalInterface;
                    } else {
                        vzr = new vzp(readStrongBinder);
                    }
                }
                init(vzr);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
                }
                afep newMapFragmentDelegate = newMapFragmentDelegate(vzr);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newMapFragmentDelegate);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface3;
                    } else {
                        vzr = new vzp(readStrongBinder3);
                    }
                }
                afes newMapViewDelegate = newMapViewDelegate(vzr, (GoogleMapOptions) dcl.m8163a(parcel, GoogleMapOptions.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newMapViewDelegate);
                return true;
            case 4:
                afeb newCameraUpdateFactoryDelegate = newCameraUpdateFactoryDelegate();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newCameraUpdateFactoryDelegate);
                return true;
            case 5:
                afhu newBitmapDescriptorFactoryDelegate = newBitmapDescriptorFactoryDelegate();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newBitmapDescriptorFactoryDelegate);
                return true;
            case 6:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface4;
                    } else {
                        vzr = new vzp(readStrongBinder4);
                    }
                }
                initV2(vzr, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface5;
                    } else {
                        vzr = new vzp(readStrongBinder5);
                    }
                }
                afgp newStreetViewPanoramaViewDelegate = newStreetViewPanoramaViewDelegate(vzr, (StreetViewPanoramaOptions) dcl.m8163a(parcel, StreetViewPanoramaOptions.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newStreetViewPanoramaViewDelegate);
                return true;
            case 8:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface6 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface6;
                    } else {
                        vzr = new vzp(readStrongBinder6);
                    }
                }
                afgm newStreetViewPanoramaFragmentDelegate = newStreetViewPanoramaFragmentDelegate(vzr);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, newStreetViewPanoramaFragmentDelegate);
                return true;
            default:
                return false;
        }
    }
}
