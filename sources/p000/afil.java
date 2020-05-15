package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* renamed from: afil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afil extends dck implements afim {
    public afil() {
        super("com.google.android.gms.maps.model.internal.IPolylineDelegate");
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
                parcel.createTypedArrayList(LatLng.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                ArrayList arrayList = new ArrayList();
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 5:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 7:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 9:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 11:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 13:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 15:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                    if (queryLocalInterface instanceof afim) {
                        afim afim = (afim) queryLocalInterface;
                    } else {
                        new afik(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 16:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 17:
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 19:
                Cap cap = (Cap) dcl.m8163a(parcel, Cap.CREATOR);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel2.writeNoException();
                dcl.m8169b(parcel2, null);
                return true;
            case 21:
                Cap cap2 = (Cap) dcl.m8163a(parcel, Cap.CREATOR);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                dcl.m8169b(parcel2, null);
                return true;
            case 23:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 25:
                parcel.createTypedArrayList(PatternItem.CREATOR);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 27:
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
            case 28:
                parcel2.writeNoException();
                dcl.m8164a(parcel2, (IInterface) null);
                return true;
            default:
                return false;
        }
    }
}
