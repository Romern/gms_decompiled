package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: scf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scf extends dcj implements sch {
    public scf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final vzr mo24595b() {
        vzr vzr;
        Parcel a = mo8526a(1, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        a.recycle();
        return vzr;
    }

    /* renamed from: c */
    public final int mo24596c() {
        Parcel a = mo8526a(2, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
