package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ses */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ses extends dcj implements seu {
    public ses(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
    }

    public final vzr newSocketFactory(vzr vzr, vzr vzr2, vzr vzr3, boolean z) {
        vzr vzr4;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8164a(bj, vzr3);
        dcl.m8166a(bj, z);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr4 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr4 = null;
        }
        a.recycle();
        return vzr4;
    }

    public final vzr newSocketFactoryWithCacheDir(vzr vzr, vzr vzr2, vzr vzr3, String str) {
        vzr vzr4;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8164a(bj, vzr3);
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr4 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr4 = null;
        }
        a.recycle();
        return vzr4;
    }
}
