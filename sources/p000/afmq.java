package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: afmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmq extends dcj implements IInterface {
    public afmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IByteArrayCallback");
    }

    /* renamed from: a */
    public final void mo34967a(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
