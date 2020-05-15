package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: afic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afic extends dck implements afid {
    public afic() {
        super("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
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
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 3:
                ArrayList arrayList = new ArrayList();
                parcel2.writeNoException();
                parcel2.writeBinderList(arrayList);
                return true;
            case 4:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    if (queryLocalInterface instanceof afid) {
                        afid afid = (afid) queryLocalInterface;
                    } else {
                        new afib(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }
}
