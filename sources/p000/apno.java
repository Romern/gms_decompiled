package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: apno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apno extends dck implements apnp {

    /* renamed from: a */
    private final aucf f84748a;

    public apno() {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
    }

    /* renamed from: a */
    public final void mo47451a(Status status) {
        rpc.m34202a(status, null, this.f84748a);
    }

    /* renamed from: a */
    public final void mo47452a(BundleResponse bundleResponse) {
        rpc.m34202a(bundleResponse.f107355a, bundleResponse.f107356b, this.f84748a);
    }

    public apno(aucf aucf) {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
        this.f84748a = aucf;
    }

    /* renamed from: a */
    public final void mo47453a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
        rpc.m34202a(clearDebugUiCacheCall$Response.f107358a, null, this.f84748a);
    }

    /* renamed from: a */
    public final void mo47454a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
        rpc.m34202a(getAppIndexingPackageDetailsCall$Response.f107363a, new rkj(getAppIndexingPackageDetailsCall$Response), this.f84748a);
    }

    /* renamed from: a */
    public final void mo47455a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
        rpc.m34202a(getAppIndexingPackagesCall$Response.f107370a, new rkj(getAppIndexingPackagesCall$Response), this.f84748a);
    }

    /* renamed from: a */
    public final void mo47456a(GetStorageStatsCall$Response getStorageStatsCall$Response) {
        rpc.m34202a(getStorageStatsCall$Response.f107377a, new rkj(getStorageStatsCall$Response), this.f84748a);
    }

    /* renamed from: a */
    public final void mo47457a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
        rpc.m34202a(requestAppIndexingUpdateIndexCall$Response.f107383a, Long.valueOf(requestAppIndexingUpdateIndexCall$Response.f107384b), this.f84748a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo47456a((GetStorageStatsCall$Response) dcl.m8163a(parcel, GetStorageStatsCall$Response.CREATOR));
                return true;
            case 3:
                mo47452a((BundleResponse) dcl.m8163a(parcel, BundleResponse.CREATOR));
                return true;
            case 4:
                mo47451a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo47455a((GetAppIndexingPackagesCall$Response) dcl.m8163a(parcel, GetAppIndexingPackagesCall$Response.CREATOR));
                return true;
            case 6:
                mo47454a((GetAppIndexingPackageDetailsCall$Response) dcl.m8163a(parcel, GetAppIndexingPackageDetailsCall$Response.CREATOR));
                return true;
            case 7:
                mo47457a((RequestAppIndexingUpdateIndexCall$Response) dcl.m8163a(parcel, RequestAppIndexingUpdateIndexCall$Response.CREATOR));
                return true;
            case 8:
                mo47453a((ClearDebugUiCacheCall$Response) dcl.m8163a(parcel, ClearDebugUiCacheCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
