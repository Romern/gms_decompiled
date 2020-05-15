package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: afio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afio extends dck implements afip {
    public afio() {
        super("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
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
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 4:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 6:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (queryLocalInterface instanceof afip) {
                        afip afip = (afip) queryLocalInterface;
                    } else {
                        new afin(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 9:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 10:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 12:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
