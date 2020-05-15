package p000;

import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* renamed from: bfpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfpn extends aehy {

    /* renamed from: a */
    final /* synthetic */ bfpq f114799a;

    public bfpn(bfpq bfpq) {
        this.f114799a = bfpq;
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        this.f114799a.f114807d.mo63540a();
        Location a = locationResult.mo43561a();
        if (a != null) {
            a.setExtras(null);
            this.f114799a.reportLocation(a);
        }
    }
}
