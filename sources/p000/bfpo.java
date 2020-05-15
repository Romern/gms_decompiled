package p000;

import com.google.android.gms.location.LocationResult;

/* renamed from: bfpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfpo extends aehy {

    /* renamed from: a */
    final /* synthetic */ bfpq f114800a;

    public bfpo(bfpq bfpq) {
        this.f114800a = bfpq;
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        this.f114800a.f114807d.mo63540a();
        locationResult.mo43561a().setExtras(null);
        this.f114800a.reportLocation(locationResult.mo43561a());
    }
}
