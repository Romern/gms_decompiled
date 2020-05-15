package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.SignInButtonConfig;

/* renamed from: scy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class scy extends dck implements scz {
    public scy() {
        super("com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public static scz asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof scz) {
            return (scz) queryLocalInterface;
        }
        return new scx(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof vzr) {
                    vzr = (vzr) queryLocalInterface;
                } else {
                    vzr = new vzp(readStrongBinder);
                }
            }
            vzr newSignInButton = newSignInButton(vzr, parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newSignInButton);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof vzr) {
                    vzr = (vzr) queryLocalInterface2;
                } else {
                    vzr = new vzp(readStrongBinder2);
                }
            }
            vzr newSignInButtonFromConfig = newSignInButtonFromConfig(vzr, (SignInButtonConfig) dcl.m8163a(parcel, SignInButtonConfig.CREATOR));
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newSignInButtonFromConfig);
        }
        return true;
    }
}
