package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ahdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdk extends dcj implements ahdm {
    public ahdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IDataListener");
    }

    /* renamed from: a */
    public final void mo36349a(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
