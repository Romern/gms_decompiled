package p000;

import android.location.GnssStatus;

/* renamed from: beyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beyu extends GnssStatus.Callback {

    /* renamed from: a */
    final /* synthetic */ beyv f113028a;

    public beyu(beyv beyv) {
        this.f113028a = beyv;
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        if (gnssStatus != null) {
            beyv beyv = this.f113028a;
            int i = beyv.f113032z;
            beyv.f113038a.execute(new beyt(this, gnssStatus));
        }
    }
}
