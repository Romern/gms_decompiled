package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aalm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalm extends dcj implements aalo {
    public aalm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    /* renamed from: a */
    public final void mo16975a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}
