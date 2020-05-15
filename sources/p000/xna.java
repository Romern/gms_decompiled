package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xna extends dcj implements xnc {
    public xna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
    }

    /* renamed from: a */
    public final void mo29957a(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(1, bj);
    }
}
