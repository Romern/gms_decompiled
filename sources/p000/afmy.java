package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: afmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmy extends dcj implements afna {
    public afmy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
    }

    /* renamed from: a */
    public final void mo34969a(Status status, MdhFootprintsReadResult mdhFootprintsReadResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdhFootprintsReadResult);
        mo8530c(1, bj);
    }
}
