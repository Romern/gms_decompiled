package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: omn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class omn extends dck implements omo {
    public omn() {
        super("com.google.android.gms.car.startup.IStartupServiceCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo22309a(dcl.m8167a(parcel));
                break;
            case 2:
                mo22306a(parcel.readInt(), parcel.readInt(), parcel.readString());
                break;
            case 3:
                mo22305a();
                break;
            case 4:
                break;
            case 5:
                mo22307a(dcl.m8168b(parcel), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                break;
            case 6:
                mo22310a(dcl.m8167a(parcel), dcl.m8168b(parcel), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                break;
            case 7:
                mo22308a(dcl.m8168b(parcel), parcel.createByteArray(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
