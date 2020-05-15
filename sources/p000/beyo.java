package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: beyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beyo implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ beyv f113021a;

    public beyo(beyv beyv) {
        this.f113021a = beyv;
    }

    public final void onLocationChanged(Location location) {
        if (location != null && location.getProvider().equals("gps")) {
            this.f113021a.f113038a.execute(new beyn(this, location));
        }
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
