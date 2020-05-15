package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhz extends dck implements afia {
    public afhz() {
        super("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: a */
    public final void mo34882a() {
    }

    /* renamed from: a */
    public final void mo34883a(LatLng latLng) {
    }

    /* renamed from: a */
    public final void mo34884a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo34885a(afia afia) {
        return false;
    }

    /* renamed from: c */
    public final int mo34886c() {
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 3:
                LatLng latLng = (LatLng) dcl.m8163a(parcel, LatLng.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                LatLng latLng2 = new LatLng(0.0d, 0.0d);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, latLng2);
                return true;
            case 5:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readFloat();
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 8:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 9:
                LatLngBounds latLngBounds = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                parcel2.writeNoException();
                return true;
            case 10:
                LatLngBounds latLngBounds2 = new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, latLngBounds2);
                return true;
            case 11:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 13:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 15:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 17:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 19:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if (queryLocalInterface instanceof afia) {
                        afia afia = (afia) queryLocalInterface;
                    } else {
                        new afhy(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 20:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 21:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof vzr) {
                        vzr vzr = (vzr) queryLocalInterface2;
                    } else {
                        new vzp(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 22:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 24:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr vzr2 = (vzr) queryLocalInterface3;
                    } else {
                        new vzp(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 25:
                parcel2.writeNoException();
                dcl.m8164a(parcel2, (IInterface) null);
                return true;
            default:
                return false;
        }
    }
}
