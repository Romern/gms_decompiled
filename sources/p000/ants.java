package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ants */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ants extends dck implements antt {
    public ants() {
        super("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    public static antt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (queryLocalInterface instanceof antt) {
            return (antt) queryLocalInterface;
        }
        return new antr(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        vzp vzp = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof vzr) {
                    vzr = (vzr) queryLocalInterface;
                    vzr newPlusOneButton = newPlusOneButton(vzr, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, newPlusOneButton);
                } else {
                    vzp = new vzp(readStrongBinder);
                }
            }
            vzr = vzp;
            vzr newPlusOneButton2 = newPlusOneButton(vzr, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newPlusOneButton2);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof vzr) {
                    vzr2 = (vzr) queryLocalInterface2;
                    vzr newPlusOneButtonWithPopup = newPlusOneButtonWithPopup(vzr2, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    dcl.m8164a(parcel2, newPlusOneButtonWithPopup);
                } else {
                    vzp = new vzp(readStrongBinder2);
                }
            }
            vzr2 = vzp;
            vzr newPlusOneButtonWithPopup2 = newPlusOneButtonWithPopup(vzr2, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newPlusOneButtonWithPopup2);
        }
        return true;
    }
}
