package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: lub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lub extends dcj implements lud {
    public lub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.IBackUpNowClientCallbacks");
    }

    /* renamed from: a */
    public final void mo19602a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo19603a(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8530c(2, bj);
    }
}
