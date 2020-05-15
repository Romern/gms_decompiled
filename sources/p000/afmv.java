package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: afmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmv extends dcj implements afmx {
    public afmv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
    }

    /* renamed from: a */
    public final void mo34968a(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, mdhFootprintListSafeParcelable);
        mo8530c(1, bj);
    }
}
