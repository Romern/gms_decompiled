package p000;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: apns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface apns extends IInterface {
    /* renamed from: a */
    void mo47444a(Bundle bundle, apnp apnp);

    /* renamed from: a */
    void mo47445a(apnp apnp);

    /* renamed from: a */
    void mo47446a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, apnp apnp);

    /* renamed from: a */
    void mo47447a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, apnp apnp);

    /* renamed from: a */
    void mo47448a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, apnp apnp);

    /* renamed from: a */
    void mo47449a(GetStorageStatsCall$Request getStorageStatsCall$Request, apnp apnp);

    /* renamed from: a */
    void mo47450a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, apnp apnp);
}
