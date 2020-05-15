package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;
import com.google.android.gms.fitness.request.GetStoredDataSourcesRequest;
import com.google.android.gms.fitness.request.PurgeDataSourcesRequest;

/* renamed from: zbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbr extends dcj implements zbt {
    public zbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
    }

    /* renamed from: a */
    public final void mo30914a(DeleteAllUserDataRequest deleteAllUserDataRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deleteAllUserDataRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30915a(GetStoredDataSourcesRequest getStoredDataSourcesRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getStoredDataSourcesRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30916a(PurgeDataSourcesRequest purgeDataSourcesRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, purgeDataSourcesRequest);
        mo8528b(2, bj);
    }
}
