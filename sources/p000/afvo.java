package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;

/* renamed from: afvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvo extends dcj implements IInterface {
    public afvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    /* renamed from: a */
    public final void mo35036a(Status status, SyncResult syncResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, syncResult);
        mo8530c(1, bj);
    }
}
