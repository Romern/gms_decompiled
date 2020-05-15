package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aigp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigp extends dcj implements aigr {
    public aigp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    /* renamed from: a */
    public final void mo36548a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(2, bj);
    }
}
