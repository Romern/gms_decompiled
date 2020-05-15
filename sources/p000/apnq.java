package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: apnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apnq extends dcj implements apns {
    public apnq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationService");
    }

    /* renamed from: a */
    public final void mo47444a(Bundle bundle, apnp apnp) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47445a(apnp apnp) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47446a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, apnp apnp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, clearDebugUiCacheCall$Request);
        dcl.m8164a(bj, apnp);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo47447a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, apnp apnp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAppIndexingPackageDetailsCall$Request);
        dcl.m8164a(bj, apnp);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo47448a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, apnp apnp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAppIndexingPackagesCall$Request);
        dcl.m8164a(bj, apnp);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo47449a(GetStorageStatsCall$Request getStorageStatsCall$Request, apnp apnp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getStorageStatsCall$Request);
        dcl.m8164a(bj, apnp);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo47450a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, apnp apnp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, requestAppIndexingUpdateIndexCall$Request);
        dcl.m8164a(bj, apnp);
        mo8528b(7, bj);
    }
}
