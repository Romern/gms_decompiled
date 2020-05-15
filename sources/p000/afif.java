package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: afif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afif extends dck implements afig {
    public afif() {
        super("com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: a */
    public final void mo34887a() {
    }

    /* renamed from: a */
    public final boolean mo34888a(afig afig) {
        return false;
    }

    /* renamed from: c */
    public final String mo34889c() {
        return "";
    }

    /* renamed from: d */
    public final int mo34890d() {
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
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 9:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                return true;
            case 13:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 14:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof afig) {
                        afig afig = (afig) queryLocalInterface;
                    } else {
                        new afie(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 17:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
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
            case 19:
                parcel.readFloat();
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 20:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 22:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                parcel.readFloat();
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 27:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 28:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 29:
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
            case 30:
                parcel2.writeNoException();
                dcl.m8164a(parcel2, (IInterface) null);
                return true;
            default:
                return false;
        }
    }
}
