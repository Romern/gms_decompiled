package p000;

import android.location.GnssStatus;

/* renamed from: bhbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhbt extends GnssStatus.Callback {

    /* renamed from: a */
    final /* synthetic */ bhbu f118275a;

    public bhbt(bhbu bhbu) {
        this.f118275a = bhbu;
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        this.f118275a.mo63530a(new bfkl(gnssStatus));
    }
}
