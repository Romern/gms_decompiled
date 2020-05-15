package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: afms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afms extends dcj implements afmu {
    public afms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.ILatestFootprintListener");
    }

    /* renamed from: a */
    public final void mo32719a(rnt rnt, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, latestFootprintFilter);
        dcl.m8165a(bj, mdhFootprintListSafeParcelable);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo32720a(rnt rnt, SyncStatus syncStatus) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, syncStatus);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo32721a(rnt rnt, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, mdhFootprintListSafeParcelable);
        mo8530c(2, bj);
    }
}
