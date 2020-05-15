package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: war */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class war extends dcj implements wat {
    public war(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final vzr createModuleContext(vzr vzr, String str, int i) {
        vzr vzr2;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        bj.writeInt(i);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr2 = null;
        }
        a.recycle();
        return vzr2;
    }

    public final vzr createModuleContextNoCrashUtils(vzr vzr, String str, int i) {
        vzr vzr2;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        bj.writeInt(i);
        Parcel a = mo8526a(4, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr2 = null;
        }
        a.recycle();
        return vzr2;
    }

    public final int getIDynamiteLoaderVersion() {
        Parcel a = mo8526a(6, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getModuleVersion(vzr vzr, String str) {
        throw null;
    }

    public final int getModuleVersion2(vzr vzr, String str, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        Parcel a = mo8526a(3, bj);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getModuleVersion2NoCrashUtils(vzr vzr, String str, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        Parcel a = mo8526a(5, bj);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
