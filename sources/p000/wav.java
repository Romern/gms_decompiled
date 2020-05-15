package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: wav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class wav extends dck implements waw {
    public wav() {
        super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public static waw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (queryLocalInterface instanceof waw) {
            return (waw) queryLocalInterface;
        }
        return new wau(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        vzr vzr3 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof vzr) {
                    vzr3 = (vzr) queryLocalInterface;
                } else {
                    vzr3 = new vzp(readStrongBinder);
                }
            }
            vzr loadModule = loadModule(vzr3, parcel.readString(), parcel.createByteArray());
            parcel2.writeNoException();
            dcl.m8164a(parcel2, loadModule);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzr = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
            } else {
                vzr = null;
            }
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface3 instanceof vzr) {
                    vzr3 = (vzr) queryLocalInterface3;
                } else {
                    vzr3 = new vzp(readStrongBinder3);
                }
            }
            vzr loadModule2 = loadModule2(vzr, readString, readInt, vzr3);
            parcel2.writeNoException();
            dcl.m8164a(parcel2, loadModule2);
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzr2 = queryLocalInterface4 instanceof vzr ? (vzr) queryLocalInterface4 : new vzp(readStrongBinder4);
            } else {
                vzr2 = null;
            }
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface5 instanceof vzr) {
                    vzr3 = (vzr) queryLocalInterface5;
                } else {
                    vzr3 = new vzp(readStrongBinder5);
                }
            }
            vzr loadModule2NoCrashUtils = loadModule2NoCrashUtils(vzr2, readString2, readInt2, vzr3);
            parcel2.writeNoException();
            dcl.m8164a(parcel2, loadModule2NoCrashUtils);
        }
        return true;
    }
}
