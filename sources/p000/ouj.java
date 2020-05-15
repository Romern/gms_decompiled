package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ouj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ouj extends dcj implements oul {
    public ouj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ILocalBinderTransport");
    }

    /* renamed from: a */
    public final IBinder mo22655a() {
        Parcel a = mo8526a(1, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
