package p000;

import android.os.IInterface;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: afmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface afmu extends IInterface {
    /* renamed from: a */
    void mo32719a(rnt rnt, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    /* renamed from: a */
    void mo32720a(rnt rnt, SyncStatus syncStatus);

    /* renamed from: a */
    void mo32721a(rnt rnt, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);
}
