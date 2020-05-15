package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ohw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohw extends dcj implements ohy {
    public ohw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
    }

    /* renamed from: a */
    public final void mo22175a(long j, int i) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeInt(i);
        mo8528b(1, bj);
    }
}
