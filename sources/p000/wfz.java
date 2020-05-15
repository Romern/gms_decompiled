package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: wfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfz extends dcj implements wgb {
    public wfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsInternalSyncService");
    }

    /* renamed from: a */
    public final void mo29094a(wfy wfy, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfy);
        dcl.m8165a(bj, facsInternalSyncCallOptions);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo29095a(wfy wfy, byte[] bArr, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfy);
        bj.writeByteArray(bArr);
        dcl.m8165a(bj, facsInternalSyncCallOptions);
        mo8528b(2, bj);
    }
}
