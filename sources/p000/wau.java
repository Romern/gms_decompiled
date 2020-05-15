package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: wau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wau extends dcj implements waw {
    public wau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final vzr loadModule(vzr vzr, String str, byte[] bArr) {
        throw null;
    }

    public final vzr loadModule2(vzr vzr, String str, int i, vzr vzr2) {
        vzr vzr3;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        bj.writeInt(i);
        dcl.m8164a(bj, vzr2);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr3 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr3 = null;
        }
        a.recycle();
        return vzr3;
    }

    public final vzr loadModule2NoCrashUtils(vzr vzr, String str, int i, vzr vzr2) {
        vzr vzr3;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeString(str);
        bj.writeInt(i);
        dcl.m8164a(bj, vzr2);
        Parcel a = mo8526a(3, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr3 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr3 = null;
        }
        a.recycle();
        return vzr3;
    }
}
