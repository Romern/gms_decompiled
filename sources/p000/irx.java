package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: irx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irx extends dcj implements irz {
    public irx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
    }

    /* renamed from: a */
    public final void mo13307a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo13308a(List list) {
        Parcel bj = mo8529bj();
        bj.writeList(list);
        mo8530c(1, bj);
    }
}
