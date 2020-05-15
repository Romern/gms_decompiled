package p000;

import com.google.android.gms.location.LocationResult;

/* renamed from: eam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eam implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LocationResult f14554a;

    /* renamed from: b */
    final /* synthetic */ ean f14555b;

    public eam(ean ean, LocationResult locationResult) {
        this.f14555b = ean;
        this.f14554a = locationResult;
    }

    public final void run() {
        new Object[1][0] = this.f14554a.mo43561a();
        this.f14555b.mo9909a(this.f14554a.mo43561a());
    }
}
