package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: oic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oic extends dcj implements oie {
    public oic(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.senderprotocol.IReader");
    }

    /* renamed from: a */
    public final void mo22176a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: c */
    public final oib mo22179c() {
        oib oib;
        Parcel a = mo8526a(3, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
            oib = queryLocalInterface instanceof oib ? (oib) queryLocalInterface : new ohz(readStrongBinder);
        } else {
            oib = null;
        }
        a.recycle();
        return oib;
    }

    /* renamed from: a */
    public final void mo22177a(ohy ohy) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ohy);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final boolean mo22178a(oib oib) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oib);
        Parcel a = mo8526a(1, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
