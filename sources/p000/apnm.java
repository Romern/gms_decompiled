package p000;

import android.os.Bundle;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: apnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apnm extends apnr implements sjr {

    /* renamed from: a */
    private final abrv f84746a;

    /* renamed from: b */
    private final abyy f84747b;

    public apnm(abrv abrv, abyy abyy) {
        sdo.m34959a(abrv);
        this.f84746a = abrv;
        this.f84747b = abyy;
    }

    /* renamed from: a */
    public final void mo47444a(Bundle bundle, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apng(abrv, bundle, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47445a(apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apnh(abrv, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47446a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apnl(abrv, clearDebugUiCacheCall$Request, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47447a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apnj(abrv, getAppIndexingPackageDetailsCall$Request, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47448a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apni(abrv, getAppIndexingPackagesCall$Request, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47449a(GetStorageStatsCall$Request getStorageStatsCall$Request, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apnf(abrv, getStorageStatsCall$Request, this.f84747b, apnp));
    }

    /* renamed from: a */
    public final void mo47450a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, apnp apnp) {
        abrv abrv = this.f84746a;
        abrv.f58067c.mo32995d(new apnk(abrv, requestAppIndexingUpdateIndexCall$Request, this.f84747b, apnp));
    }
}
