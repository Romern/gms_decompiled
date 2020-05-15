package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: set */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class set extends dck implements seu {
    public set() {
        super("com.google.android.gms.common.net.ISocketFactoryCreator");
    }

    public static seu asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
        if (queryLocalInterface instanceof seu) {
            return (seu) queryLocalInterface;
        }
        return new ses(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        vzr vzr3;
        vzr vzr4;
        vzr vzr5 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
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
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface3 instanceof vzr) {
                    vzr5 = (vzr) queryLocalInterface3;
                } else {
                    vzr5 = new vzp(readStrongBinder3);
                }
            }
            vzr newSocketFactory = newSocketFactory(vzr, vzr2, vzr5, dcl.m8167a(parcel));
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newSocketFactory);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzr3 = queryLocalInterface4 instanceof vzr ? (vzr) queryLocalInterface4 : new vzp(readStrongBinder4);
            } else {
                vzr3 = null;
            }
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzr4 = queryLocalInterface5 instanceof vzr ? (vzr) queryLocalInterface5 : new vzp(readStrongBinder5);
            } else {
                vzr4 = null;
            }
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 != null) {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface6 instanceof vzr) {
                    vzr5 = (vzr) queryLocalInterface6;
                } else {
                    vzr5 = new vzp(readStrongBinder6);
                }
            }
            vzr newSocketFactoryWithCacheDir = newSocketFactoryWithCacheDir(vzr3, vzr4, vzr5, parcel.readString());
            parcel2.writeNoException();
            dcl.m8164a(parcel2, newSocketFactoryWithCacheDir);
        }
        return true;
    }
}
