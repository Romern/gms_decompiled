package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.people.data.Audience;

/* renamed from: rqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rqi extends dck implements rqj {
    public rqi() {
        super("com.google.android.gms.common.audience.dynamite.IAudienceView");
    }

    public static rqj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (queryLocalInterface instanceof rqj) {
            return (rqj) queryLocalInterface;
        }
        return new rqh(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                rqm rqm = null;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
                } else {
                    vzr = null;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr2 = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
                } else {
                    vzr2 = null;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
                    if (queryLocalInterface3 instanceof rqm) {
                        rqm = (rqm) queryLocalInterface3;
                    } else {
                        rqm = new rqk(readStrongBinder3);
                    }
                }
                initialize(vzr, vzr2, rqm);
                parcel2.writeNoException();
                return true;
            case 3:
                setEditMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                setShowEmptyText(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                setAudience((Audience) dcl.m8163a(parcel, Audience.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle onSaveInstanceState = onSaveInstanceState();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, onSaveInstanceState);
                return true;
            case 7:
                onRestoreInstanceState((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                vzr view = getView();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, view);
                return true;
            case 9:
                setIsUnderageAccount(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
