package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: auqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqc extends dcj implements auqe {
    public auqc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.trustagent.internal.IBridgeCallbacks");
    }

    /* renamed from: a */
    public final void mo50793a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }
}
