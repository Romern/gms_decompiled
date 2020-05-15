package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: apnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apnn extends dcj implements apnp {
    public apnn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
    }

    /* renamed from: a */
    public final void mo47451a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo47452a(BundleResponse bundleResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundleResponse);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo47453a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, clearDebugUiCacheCall$Response);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo47454a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAppIndexingPackageDetailsCall$Response);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo47455a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAppIndexingPackagesCall$Response);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo47456a(GetStorageStatsCall$Response getStorageStatsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getStorageStatsCall$Response);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo47457a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, requestAppIndexingUpdateIndexCall$Response);
        mo8530c(7, bj);
    }
}
