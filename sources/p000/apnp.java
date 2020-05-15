package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: apnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface apnp extends IInterface {
    /* renamed from: a */
    void mo47451a(Status status);

    /* renamed from: a */
    void mo47452a(BundleResponse bundleResponse);

    /* renamed from: a */
    void mo47453a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response);

    /* renamed from: a */
    void mo47454a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response);

    /* renamed from: a */
    void mo47455a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response);

    /* renamed from: a */
    void mo47456a(GetStorageStatsCall$Response getStorageStatsCall$Response);

    /* renamed from: a */
    void mo47457a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response);
}
