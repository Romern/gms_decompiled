package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: was */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class was extends dck implements wat {
    public was() {
        super("com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public static wat asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
        if (queryLocalInterface instanceof wat) {
            return (wat) queryLocalInterface;
        }
        return new war(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof vzr) {
                        vzr = (vzr) queryLocalInterface;
                    } else {
                        vzr = new vzp(readStrongBinder);
                    }
                }
                int moduleVersion = getModuleVersion(vzr, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(moduleVersion);
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
                }
                vzr createModuleContext = createModuleContext(vzr, parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, createModuleContext);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface3;
                    } else {
                        vzr = new vzp(readStrongBinder3);
                    }
                }
                int moduleVersion2 = getModuleVersion2(vzr, parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                parcel2.writeInt(moduleVersion2);
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface4;
                    } else {
                        vzr = new vzp(readStrongBinder4);
                    }
                }
                vzr createModuleContextNoCrashUtils = createModuleContextNoCrashUtils(vzr, parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, createModuleContextNoCrashUtils);
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface5;
                    } else {
                        vzr = new vzp(readStrongBinder5);
                    }
                }
                int moduleVersion2NoCrashUtils = getModuleVersion2NoCrashUtils(vzr, parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                parcel2.writeInt(moduleVersion2NoCrashUtils);
                return true;
            case 6:
                int iDynamiteLoaderVersion = getIDynamiteLoaderVersion();
                parcel2.writeNoException();
                parcel2.writeInt(iDynamiteLoaderVersion);
                return true;
            default:
                return false;
        }
    }
}
