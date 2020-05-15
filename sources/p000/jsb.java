package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsb extends dcj implements jsd {
    public jsb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
    }

    /* renamed from: a */
    public final void mo14031a(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
